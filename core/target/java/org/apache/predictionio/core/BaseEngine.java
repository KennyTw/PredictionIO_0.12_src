package org.apache.predictionio.core;
/** :: DeveloperApi ::
 * Base class of all engine controller classes
 * <p>
 * @tparam EI Evaluation information class
 * @tparam Q Query class
 * @tparam P Predicted result class
 * @tparam A Actual result class
 */
public abstract class BaseEngine<EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BaseEngine ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Implement this method so that training this engine would return a list of
   * models.
   * <p>
   * @param sc An instance of SparkContext.
   * @param engineParams An instance of {@link EngineParams} for running a single training.
   * @param params An instance of {@link WorkflowParams} that controls the workflow.
   * @return A list of models.
   * @param engineInstanceId (undocumented)
   */
  public abstract  scala.collection.Seq<java.lang.Object> train (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.EngineParams engineParams, java.lang.String engineInstanceId, org.apache.predictionio.workflow.WorkflowParams params)  ;
  /** :: DeveloperApi ::
   * Implement this method so that {@link org.apache.predictionio.controller.Evaluation} can
   * use this method to generate inputs for {@link org.apache.predictionio.controller.Metric}.
   * <p>
   * @param sc An instance of SparkContext.
   * @param engineParams An instance of {@link EngineParams} for running a single evaluation.
   * @param params An instance of {@link WorkflowParams} that controls the workflow.
   * @return A list of evaluation information and RDD of query, predicted
   *         result, and actual result tuple tuple.
   */
  public abstract  scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> eval (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.EngineParams engineParams, org.apache.predictionio.workflow.WorkflowParams params)  ;
  /** :: DeveloperApi ::
   * Override this method to further optimize the process that runs multiple
   * evaluations (during tuning, for example). By default, this method calls
   * {@link eval} for each element in the engine parameters list.
   * <p>
   * @param sc An instance of SparkContext.
   * @param engineParamsList A list of {@link EngineParams} for running batch evaluation.
   * @param params An instance of {@link WorkflowParams} that controls the workflow.
   * @return A list of engine parameters and evaluation result (from {@link eval}) tuples.
   */
  public  scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>>>> batchEval (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Implement this method to convert a JValue (read from an engine variant
   * JSON file) to an instance of {@link EngineParams}.
   * <p>
   * @param variantJson Content of the engine variant JSON as JValue.
   * @param jsonExtractor Content of the engine variant JSON as JValue.
   * @return An instance of {@link EngineParams} converted from JSON.
   */
  public  org.apache.predictionio.controller.EngineParams jValueToEngineParams (org.json4s.JsonAST.JValue variantJson, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
}
