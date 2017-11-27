package org.apache.predictionio.core;
/** :: DeveloperApi ::
 * Base class of all evaluator controller classes
 * <p>
 * @tparam EI Evaluation information class
 * @tparam Q Query class
 * @tparam P Predicted result class
 * @tparam A Actual result class
 * @tparam ER Evaluation result class
 */
public abstract class BaseEvaluator<EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, ER extends org.apache.predictionio.core.BaseEvaluatorResult> extends org.apache.predictionio.core.AbstractDoer {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Ident(org.apache.predictionio.core.BaseEvaluatorResult))))
  public   BaseEvaluator ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Engine developers should not use this directly. This is called by
   * evaluation workflow to perform evaluation.
   * <p>
   * @param sc Spark context
   * @param evaluation Evaluation to run
   * @param engineEvalDataSet Sets of engine parameters and data for evaluation
   * @param params Evaluation workflow parameters
   * @return Evaluation result
   */
  public abstract  ER evaluateBase (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.Evaluation evaluation, scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>>>> engineEvalDataSet, org.apache.predictionio.workflow.WorkflowParams params)  ;
}
