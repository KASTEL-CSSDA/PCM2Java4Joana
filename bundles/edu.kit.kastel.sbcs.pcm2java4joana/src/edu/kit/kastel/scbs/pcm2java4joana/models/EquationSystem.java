package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SetOperations;
import edu.kit.kastel.scbs.pcm2java4joana.utils.TraceStateUtils;

/**
 * This class bundles the equations created from the joana results.
 * This class provides a method to determine the security levels.
 * 
 * @author Johannes
 *
 */
public class EquationSystem {
	private final static int BATCH_SIZE = 1; 
	
	private final List<SecurityLevelEquation> equations;
	private int score;

	public EquationSystem() {
		this.equations = new ArrayList<SecurityLevelEquation>();
		this.score = -1;
	}

	public void addEquation(SecurityLevelEquation equation) {
		SecurityLevelEquation existingEquation = TraceStateUtils.getEquationByOwner(this.equations,
				equation.getOwner());
		if (existingEquation == null) {
			equations.add(equation);
		} else {
			existingEquation.addPredecessors(equation.getPredecessors());
			existingEquation.addSuccessors(equation.getSuccessors());
		}
	}

	public Collection<SecurityLevelEquation> getEquations() {
		return this.equations;
	}

	public int getScore() {
		return this.score;
	}

	public int getTotalPossibleScore() {
		int totalScore = 0;
		for (SecurityLevelEquation equation : equations) {
			totalScore += equation.getPredecessors().size();
			totalScore += equation.getSuccessors().size();
		}

		return totalScore;
	}

	/**
	 * This method determines the best solution of the equation system.
	 * The best solution is the solution with the highest number of resolved invalid traces.
	 * First, the basic cases are solved. 
	 * The basic cases are the cases in which the method has neither public successors nor predecessors.
	 * Second, a backtracking algorithm is used for the not basic cases to determine the best solution.
	 * Theoretically, all possible combinations of security levels should be tested.
	 * This is not possible in a acceptable time.
	 * Therefore, a pre-sort of the security levels are determined for each trace state.
	 * Then, only all combinations of the first eigth of the sorted security levels are tested.
	 * The determined solution is saved in the equations. 
	 * 
	 * @param securityLevels
	 */
	public void solve(List<List<SecurityLevel>> securityLevels) {
		int score = 0;
		Map<Integer, List<SecurityLevel>> solution = new HashMap<Integer, List<SecurityLevel>>();
		Map<Integer, Integer> numberOfEquationsLeft = new HashMap<Integer, Integer>();
		List<Integer> solved = new ArrayList<Integer>();
		
		int bestPossibleScore = 0;
		for (int i = 0; i < equations.size(); i++) {
			bestPossibleScore += equations.get(i).getPredecessors().size();
			bestPossibleScore += equations.get(i).getSuccessors().size(); 
		}
		int numberAtLastIndex = bestPossibleScore;
		for (int i = 0; i < equations.size(); i++) {
			numberOfEquationsLeft.put(i, numberAtLastIndex);
			numberAtLastIndex -= equations.get(i).getPredecessors().size();
			numberAtLastIndex -= equations.get(i).getSuccessors().size(); 
		}
		
		Map<Integer, List<List<SecurityLevel>>> testOrder = generateTestOrder(securityLevels);
		
		score += solveBasicCases(securityLevels, solution, solved);
		bestPossibleScore -= score;
		score += solve(securityLevels, solution, solved, 0, new HashMap<Integer, List<SecurityLevel>>(), -1, bestPossibleScore, testOrder, 0);

		for (int i = 0; i < equations.size(); i++) {
			equations.get(i).setCorrectSecurityLevel(solution.get(i));
		}
		this.score = score;
		
		System.out.print(solution);
	}

	private int solveBasicCases(List<List<SecurityLevel>> securityLevels, Map<Integer, List<SecurityLevel>> bestLevels,
			List<Integer> solved) {
		int score = 0;
		for (int i = 0; i < equations.size(); i++) {
			if (!equations.get(i).isBasicCase()) {
				continue;
			}

			int bestScore = -1;
			List<SecurityLevel> bestSecurityLevel = new ArrayList<SecurityLevel>();
			if (equations.get(i).getPredecessors().size() == 0) {
				bestSecurityLevel = equations.get(i).getSecurityLevel();
				for (AggregatedTraceState state : equations.get(i).getSuccessors()) {
					bestSecurityLevel = SetOperations.merge(bestSecurityLevel, state.getSecurityLevel());
				}
				bestScore = equations.get(i).getSuccessors().size();
			} else {
				for (List<SecurityLevel> securityLevel : securityLevels) {
					int tempScore = equations.get(i).howManySolved(securityLevel);
					if (tempScore > bestScore) {
						bestScore = tempScore;
						bestSecurityLevel = securityLevel;
					}
				}
			}
			bestLevels.put(i, bestSecurityLevel);
			score += bestScore;
			solved.add(i);
		}
		return score;
	}

	private Map<Integer, List<List<SecurityLevel>>> generateTestOrder(List<List<SecurityLevel>> levels) {
		Map<Integer, List<List<SecurityLevel>>> testOrder = new HashMap<Integer, List<List<SecurityLevel>>>();
		List<List<SecurityLevel>> sorted = levels.stream().sorted((l1, l2) -> {
			if (l1.size() > l2.size()) {
				return -1;
			} 
			if (l1.size() < l2.size()) {
				return 1;
			}
			return 0;
		}).collect(Collectors.toList());
		
		
		for (int i = 0; i < equations.size(); i++) {
			SecurityLevelEquation equation = equations.get(i);
			if (equation.getPredecessors().size() == 0) {
				testOrder.put(i, getOrderForSuccessors(sorted, equation));
				continue;
			}
			if (equation.getSuccessors().size() ==  0) {
				testOrder.put(i, getOrderForPredeccessors(sorted, equation));
				continue;
			}
			testOrder.put(i, getOrderForPredeccessorsSuccessors(sorted, equation));
		}
		
		return testOrder;
	}
	
	private List<List<SecurityLevel>> getOrderForPredeccessorsSuccessors(List<List<SecurityLevel>> levels, SecurityLevelEquation equation) {
		List<List<SecurityLevel>> order = new ArrayList<List<SecurityLevel>>();
		
		for (List<SecurityLevel> level : levels) {
			if (level.size() == 0) {
				continue;
			}
			
			boolean sucGood = true;
			boolean predGood = true;
			
			for (AggregatedTraceState state : equation.getPredecessors()) {
				if (!SetOperations.isIn(level, state.getSecurityLevel())) {
					predGood =  false;
					break;
				}
			}
			for (AggregatedTraceState state : equation.getSuccessors()) {
				if (!SetOperations.isIn(state.getSecurityLevel(), level)) {
					sucGood =  false;
					break;
				}
			}
			
			if (sucGood && predGood) {
				order.add(0, level);
				continue;
			}
			if (sucGood ^ predGood) {
				order.add(order.size() / 2, level);
				continue;
			}
			order.add(level);
		}
		
		return order;
	}
	
	private List<List<SecurityLevel>> getOrderForPredeccessors(List<List<SecurityLevel>> levels, SecurityLevelEquation equation) {
		List<List<SecurityLevel>> order = new ArrayList<List<SecurityLevel>>();
		
		for (List<SecurityLevel> level : levels) {
			if (level.size() == 0) {
				continue;
			}
			boolean leastDownerBound = true;
			
			for (AggregatedTraceState state : equation.getPredecessors()) {
				if (!SetOperations.isIn(level, state.getSecurityLevel())) {
					leastDownerBound =  false;
					break;
				}
			}
			
			if (leastDownerBound)
			{
				order.add(0, level);
			} else {
				order.add(level);
			}
		}
		
		return order;
	}
	
	private List<List<SecurityLevel>> getOrderForSuccessors(List<List<SecurityLevel>> levels, SecurityLevelEquation equation) {
		List<List<SecurityLevel>> order = new ArrayList<List<SecurityLevel>>();
		
		for (List<SecurityLevel> level : levels) {
			if (level.size() == 0) {
				continue;
			}
			boolean leastUpperBound = true;
			for (AggregatedTraceState state : equation.getSuccessors()) {
				if (!SetOperations.isIn(state.getSecurityLevel(), level)) {
					leastUpperBound =  false;
					break;
				}
			}
			
			if (leastUpperBound)
			{
				order.add(0, level);
			} else {
				order.add(level);
			}
		}
		return order;
	}
		
	private int solve(List<List<SecurityLevel>> securityLevels, Map<Integer, List<SecurityLevel>> bestLevels,
			List<Integer> alreadySolved, int index, Map<Integer, List<SecurityLevel>> currentLevels, int bestScore, int bestPossibleScore, Map<Integer, List<List<SecurityLevel>>> testOrder, int batch) {
		if (bestScore == bestPossibleScore) {
			return bestScore;
		}		
		
		if (alreadySolved.contains(index)) {
			return solve(securityLevels, bestLevels, alreadySolved, index + 1, currentLevels, bestScore, bestPossibleScore, testOrder, batch);
		}

		if (index == equations.size()) {
			int score = calculateScore(currentLevels, alreadySolved);
			if (score > bestScore) {
				changeBestLevels(bestLevels, currentLevels, alreadySolved);
				bestScore = score;
			}
			return bestScore;
		}

		List<List<SecurityLevel>> currentTestOrder = testOrder.get(index);
		for (int i = batch * BATCH_SIZE; i < Math.min((batch + 1) * BATCH_SIZE, currentTestOrder.size()); i++) {
			List<SecurityLevel> securityLevel = currentTestOrder.get(i);
			currentLevels.put(index, securityLevel);
			bestScore = solve(securityLevels, bestLevels, alreadySolved, index + 1, currentLevels, bestScore, bestPossibleScore, testOrder, batch);
		}
		
		return bestScore;
	}

	private int calculateScore(Map<Integer, List<SecurityLevel>> currentLevels, List<Integer> alreadySolved) {
		int score = 0;

		for (int i = 0; i < equations.size(); i++) {
			if (alreadySolved.contains(i)) {
				continue;
			}

			score += equations.get(i).howManySolved(currentLevels.get(i));
		}

		return score;
	}

	private void changeBestLevels(Map<Integer, List<SecurityLevel>> bestLevels,
			Map<Integer, List<SecurityLevel>> currentLevels, List<Integer> alreadySolved) {
		for (int i = 0; i < equations.size(); i++) {
			if (alreadySolved.contains(i)) {
				continue;
			}

			bestLevels.put(i, currentLevels.get(i));
		}
	}
}
