package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.utils.TraceStateUtils;

public class EquationSystem {
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

	public void solve(List<List<SecurityLevel>> securityLevels) {
		int score = 0;
		Map<Integer, List<SecurityLevel>> solution = new HashMap<Integer, List<SecurityLevel>>();
		List<Integer> solved = new ArrayList<Integer>();

		score += solveBasicCases(securityLevels, solution, solved);
		score += solve(securityLevels, solution, solved, 0, new HashMap<Integer, List<SecurityLevel>>(), -1);

		for (int i = 0; i < equations.size(); i++) {
			equations.get(i).setCorrectSecurityLevel(solution.get(i));
		}
		this.score = score;
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
			for (List<SecurityLevel> securityLevel : securityLevels) {
				int tempScore = equations.get(i).howManySolved(securityLevel);
				if (tempScore > bestScore) {
					bestScore = tempScore;
					bestSecurityLevel = securityLevel;
				}
			}
			bestLevels.put(i, bestSecurityLevel);
			score += bestScore;
			solved.add(i);
		}
		return score;
	}

	private int solve(List<List<SecurityLevel>> securityLevels, Map<Integer, List<SecurityLevel>> bestLevels,
			List<Integer> alreadySolved, int index, Map<Integer, List<SecurityLevel>> currentLevels, int bestScore) {

		if (alreadySolved.contains(index)) {
			return solve(securityLevels, bestLevels, alreadySolved, index + 1, currentLevels, bestScore);
		}

		if (index > equations.size()) {
			int score = calculateScore(currentLevels, alreadySolved);
			if (score > bestScore) {
				changeBestLevels(bestLevels, currentLevels, alreadySolved);
				bestScore = score;
			}
			return bestScore;
		}

		for (List<SecurityLevel> securityLevel : securityLevels) {
			currentLevels.put(index, securityLevel);
			bestScore = solve(securityLevels, bestLevels, alreadySolved, index + 1, currentLevels, bestScore);
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
