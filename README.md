# PCM2Java4JOANA

This repository contains two eclipse plugins. One plugin is used to generate Java code with JOANA annotations from a PCM model with Confidentiality4CBSE specifications. The other plugin is used to adapt the PCM model based on the JOANA results. <br>
The plugins were developed during the bachelor's thesis of Johannes Häring. The thesis can be found in [Thesis](material/bachelorthesis_johanneshaering.pdf). <br>
The goal of the two plugins is to transfer information between Access Analysis and Java Object-sensitive ANAlysis (JOANA).

## Structure of Repository
There are four projects. The project [correspondencemodel](bundles/edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel/) contains the structural and security correspondence model. The project [joana](bundles/edu.kit.kastel.scbs.pcm2java4joana.joana/) contains the JOANA model and the JOANA results model. The project [sourcecode](bundles/edu.kit.kastel.scbs.pcm2java4joana.sourcecode/) contains the Java source code model. The project [Plugins](bundles/edu.kit.kastel.scbs.pcm2java4joana/) contains the two eclipse plugins. 
<br>
<br>
The results of the executed analyses can be found in [Analysis Results](material/analysisresults/). The Access Analysis results on the unadapted client analysis model are in [AccessAnalysisUnadapted](material/analysisResults/AccessAnalysis/queries-justify-origin.result.pretty). The Access Analysis results on the adapted client analysis model are [AccessAnalysisAdapted](material/analysisresults/AccessAnalysis/queries-justify-backprojected.result.pretty). The JOANA results, on which the back-projection is based, are in [JoanaResults](material/analysisresults/JOANA/results.joanaresults).
<br>
<br>
The models used for the evaluation are provided in [Evaluation Models](material/evaluationmodels/). <br>
The provided client analysis model is found [Provided Client Analysis Model](material/evaluationmodels/ClientAnalysisModels/edu.kit.kastel.scbs.iflowexampleUnadapted/). The provided implementation of the supplier analysis model is in [Provided Implementation](material/evaluationmodels/SupplierAnalysisModels/TravelPlannerProvidedImplementation/). <br>
The generated supplier analysis model skeleton merged with the implementation is found in [Supplier Analysis Model](material/evaluationmodels/SupplierAnalysisModels/TravelPlannerSupplierAnalysisModel/). The client analysis model that is adapted based on the supplier analysis results is in [Adapted Client Analysis Model](material/evaluationmodels/ClientAnalysisModels/edu.kit.kastel.scbs.iflowexampleAdapted/).

## Setting Up the Plugins

### Setting up Eclipse
1. Download and Install Eclipse Modelling Tools from [EMT](https://www.eclipse.org/downloads/packages/release/2020-12/r/eclipse-modeling-tools)
2. Install the Palladio Component Model Extension from [PCM](https://sdqweb.ipd.kit.edu/wiki/PCM_Installation)
2. Install the Palladio Component Extensios from [PCM Extension](https://updatesite.palladio-simulator.com/palladio-thirdparty-emfprofiles/releases/latest/)
3. Install Confidentiality4CBSE from [Conf4CBSE](https://github.com/KASTEL-SCBS/Confidentiality4CBSE)
4. Install Ecore2Log from [Ecore2Log](https://github.com/KASTEL-SCBS/Ecore2Log)
4. Install Ecore2Text from [Ecore2Text](https://github.com/kit-sdq/Ecore2Txt)
5. Install PCM2Prolog from [PCM2Prolog](https://github.com/KASTEL-SCBS/PCM2Prolog.git)
6. Install the SDQ Commons from [SDQCommons](https://github.com/kit-sdq/SDQ-Commons)
7. Install the XAnnotations from [XAnnotations](https://github.com/kit-sdq/XAnnotations)
8. Install the Xtend extension from [Xtend](https://www.eclipse.org/xtend/download.html)
9. Install the Xtext extension from [Xtext](https://www.eclipse.org/Xtext/download.html)
10. Setting text encoding of the eclipse instance to UTF-8
11. Load all four projects from [Bundles](PCM2Java4JOANA/bundles/)

### Setting up Access Analysis
1. Set up the eclipse instance as described before
2. Install Linux Subsystem for Windows. A good instruction can be found here [Instruction](https://docs.microsoft.com/en-us/windows/wsl/install).
3. In the Linux Subsystem install [Haskaladio](https://github.com/KASTEL-SCBS/haskalladio)
4. In the Linux Subsystem install [XSB](http://xsb.sourceforge.net/)

### Setting up JOANA
1. Install JOANA with instructions from [JOANA](https://github.com/joana-team/joana)

## Usage of the Plugins
Start an inner instance from the set-up eclipse instance. <br>
Select the repository, confidentiality, and adversary file, then right-click and choose "To Java For Joana" to generate the supplier analysis model skeleton. <br>
Complete the supplier analysis model skeleton. <br>
Run JOANA for every entry point and merge the results into a file with the file ending ".joanaresults". <br>
Load the file into the client analysis model.
Select the repsository, confidentiality, adversary, joana results, and model file, then right-click and choose "Backprojection JOANA Results" to backproject the JOANA results.