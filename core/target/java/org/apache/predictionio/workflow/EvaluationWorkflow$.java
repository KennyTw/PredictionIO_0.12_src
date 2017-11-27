package org.apache.predictionio.workflow;
public  class EvaluationWorkflow$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EvaluationWorkflow$ MODULE$ = null;
  public   EvaluationWorkflow$ ()  { throw new RuntimeException(); }
  public  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends org.apache.predictionio.core.BaseEvaluatorResult> R runEvaluation (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.Evaluation evaluation, org.apache.predictionio.core.BaseEngine<EI, Q, P, A> engine, scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList, org.apache.predictionio.core.BaseEvaluator<EI, Q, P, A, R> evaluator, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
}
