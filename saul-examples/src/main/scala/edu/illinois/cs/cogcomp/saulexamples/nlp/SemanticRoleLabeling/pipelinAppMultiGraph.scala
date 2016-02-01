package edu.illinois.cs.cogcomp.saulexamples.nlp.SemanticRoleLabeling

/** Created by Parisa on 1/14/16.
  */

import edu.illinois.cs.cogcomp.saul.evaluation.evaluation
import edu.illinois.cs.cogcomp.saulexamples.nlp.SemanticRoleLabeling.srlClassifiers.{predicateClassifier, argumentXuIdentifierGivenApredicate, argumentTypeLearner}
import org.slf4j.{Logger, LoggerFactory}

object pipelineAppMultiGraph extends App {
  val logger: Logger = LoggerFactory.getLogger(this.getClass)
  if (args.length == 0){
    println("Usage parameters:\n -goldPred=true/false -goldBoundary=true/false -TrainPred=true/false" +
      " -TrainIdentifier=true/false -TrainType=true/false")
   // sys.exit()
  }
  def optArg(prefix: String) = args.find { _.startsWith(prefix) }.map { _.replaceFirst(prefix, "") }
  def optBoolean(prefix: String, default: Boolean) = optArg(prefix).map((x: String) => {
    if (x.trim == "true") true else false
  }).getOrElse(default)

  val useGoldPredicate = optBoolean("-goldPred=", false)
  val useGoldArgBoundaries = optBoolean("-goldBoundary=", false)
  val trainPredicates = optBoolean("-TrainPred=", false)
  val trainArgIdentifier = optBoolean("-TrainIdentifier=", false)
  val trainArgType = optBoolean("-TrainType=", true)

  logger.info("Using the following parameters:" +
    "\n\tgoldPred: " + useGoldPredicate +
    "\n\tgoldBoundary: " + useGoldArgBoundaries +
    "\n\tTrainPred: " + trainPredicates +
    "\n\tTrainIdentifier: " + trainArgIdentifier +
    "\n\tTrainType: " + trainArgType)

  val expName = {
    if (trainArgType && useGoldArgBoundaries) "aTr"
    else if (trainArgIdentifier && useGoldPredicate) "bTr"
    else if (trainArgType && useGoldPredicate) "cTr"
    else if (trainPredicates) "dTr"
    else if (trainArgIdentifier && !useGoldPredicate) "eTr"
    else if (trainArgType && !useGoldPredicate) "fTr"
  }
  val startTime = System.currentTimeMillis()
  logger.info("population starts.")

  val srlGraphs = populatemultiGraphwithSRLData(false, useGoldPredicate, useGoldArgBoundaries)
 import srlGraphs._
  logger.info("population finished.")
  println("sen:"+(sentences()~> sentencesToRelations).size)
  println("rel:"+relations().size)
  print("arg"+arguments().size)
  print("tok"+srlGraphs.tokens().size)
  if (trainArgType && useGoldArgBoundaries && useGoldPredicate) {
    //train and test the argClassifier Given the ground truth Boundaries (i.e. no negative class).
    argumentTypeLearner.setModelDir("models_aTr")
    argumentTypeLearner.learn(10, relations.trainingSet)
    evaluation.Test(argumentLabelGold, typeArgumentPrediction, srlGraphs.relations.testingSet)
    argumentTypeLearner.test(relations.testingSet)
    argumentTypeLearner.save()
  }

  if (trainArgIdentifier && useGoldPredicate) {
    argumentXuIdentifierGivenApredicate.setModelDir("models_bTr")
    println("Training argument identifier")
    argumentXuIdentifierGivenApredicate.learn(100)
    print("isArgument test results:")
    argumentXuIdentifierGivenApredicate.test()
    argumentXuIdentifierGivenApredicate.save()
  }

  if (trainArgType && useGoldPredicate && !useGoldArgBoundaries) {
    argumentTypeLearner.setModelDir("models_cTr")
    println("Training argument classifier")
    argumentTypeLearner.learn(100)
    print("argument classifier test results:")
    //  evaluation.Test(argumentLabelGold, typeArgumentPrediction, relations)
    println("\n =============================================================")
    argumentTypeLearner.test()
    argumentTypeLearner.save()
  }

  //println("all relations number after population:" + srlDataModel.relations().size)
  if (trainPredicates && !useGoldPredicate) {
    predicateClassifier.setModelDir("models_dTr")
    println("Training predicate identifier")
    //   predicateClassifier.learn(100, predicates.trainingSet)
    predicateClassifier.save()
    print("isPredicate test results:")
    //   predicateClassifier.test(predicates.testingSet)
  }

  if (trainArgIdentifier && !useGoldPredicate) {
    argumentXuIdentifierGivenApredicate.setModelDir("models_eTr")
    println("Training argument identifier")
    argumentXuIdentifierGivenApredicate.learn(100)
    print("isArgument test results:")
    argumentXuIdentifierGivenApredicate.test()
    argumentXuIdentifierGivenApredicate.save()
  }

  if (trainArgType && !useGoldPredicate) {
    argumentTypeLearner.setModelDir("models_fTr")
    println("Training argument classifier")
    argumentTypeLearner.learn(100, relations.trainingSet)
    print("argument classifier test results:")
    evaluation.Test(argumentLabelGold, typeArgumentPrediction, relations.testingSet)
    println("\n =============================================================")
    argumentTypeLearner.test(relations.testingSet)
    argumentTypeLearner.save()
  }
}
