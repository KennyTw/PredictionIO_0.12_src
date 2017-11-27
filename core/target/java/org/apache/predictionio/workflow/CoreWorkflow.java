package org.apache.predictionio.workflow;
/** CoreWorkflow handles PredictionIO metadata and environment variables of
 * training and evaluation.
 */
public  class CoreWorkflow {
  static public  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.EngineInstances engineInstances ()  { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.EvaluationInstances evaluationInstances ()  { throw new RuntimeException(); }
  static public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> void runTrain (org.apache.predictionio.core.BaseEngine<EI, Q, P, A> engine, org.apache.predictionio.controller.EngineParams engineParams, org.apache.predictionio.data.storage.EngineInstance engineInstance, scala.collection.immutable.Map<java.lang.String, java.lang.String> env, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  static public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends org.apache.predictionio.core.BaseEvaluatorResult> void runEvaluation (org.apache.predictionio.controller.Evaluation evaluation, org.apache.predictionio.core.BaseEngine<EI, Q, P, A> engine, scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList, org.apache.predictionio.data.storage.EvaluationInstance evaluationInstance, org.apache.predictionio.core.BaseEvaluator<EI, Q, P, A, R> evaluator, scala.collection.immutable.Map<java.lang.String, java.lang.String> env, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
}
