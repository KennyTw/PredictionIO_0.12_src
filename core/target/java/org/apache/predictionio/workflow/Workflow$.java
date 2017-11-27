package org.apache.predictionio.workflow;
/** Collection of workflow creation methods.
 * @group Workflow
 */
public  class Workflow$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Workflow$ MODULE$ = null;
  public   Workflow$ ()  { throw new RuntimeException(); }
  public  void runEvaluation (org.apache.predictionio.controller.Evaluation evaluation, org.apache.predictionio.controller.EngineParamsGenerator engineParamsGenerator, scala.collection.immutable.Map<java.lang.String, java.lang.String> env, org.apache.predictionio.data.storage.EvaluationInstance evaluationInstance, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, EEI extends java.lang.Object, EQ extends java.lang.Object, EP extends java.lang.Object, EA extends java.lang.Object, ER extends org.apache.predictionio.core.BaseEvaluatorResult> void runEvaluationTypeless (org.apache.predictionio.controller.Evaluation evaluation, org.apache.predictionio.core.BaseEngine<EI, Q, P, A> engine, scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList, org.apache.predictionio.data.storage.EvaluationInstance evaluationInstance, org.apache.predictionio.core.BaseEvaluator<EEI, EQ, EP, EA, ER> evaluator, scala.collection.immutable.Map<java.lang.String, java.lang.String> env, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  /** :: Experimental :: */
  public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends org.apache.predictionio.core.BaseEvaluatorResult> void runEvaluationViaCoreWorkflow (org.apache.predictionio.controller.Evaluation evaluation, org.apache.predictionio.core.BaseEngine<EI, Q, P, A> engine, scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList, org.apache.predictionio.data.storage.EvaluationInstance evaluationInstance, org.apache.predictionio.core.BaseEvaluator<EI, Q, P, A, R> evaluator, scala.collection.immutable.Map<java.lang.String, java.lang.String> env, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
}
