package org.apache.predictionio.core;
/** :: DeveloperApi ::
 * Base class of all algorithm controllers
 * <p>
 * @tparam PD Prepared data class
 * @tparam M Model class
 * @tparam Q Query class
 * @tparam P Predicted result class
 */
public abstract class BaseAlgorithm<PD extends java.lang.Object, M extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object> extends org.apache.predictionio.core.AbstractDoer implements org.apache.predictionio.core.BaseQuerySerializer {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BaseAlgorithm ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Engine developers should not use this directly. This is called by workflow
   * to train a model.
   * <p>
   * @param sc Spark context
   * @param pd Prepared data
   * @return Trained model
   */
  public abstract  M trainBase (org.apache.spark.SparkContext sc, PD pd)  ;
  /** :: DeveloperApi ::
   * Engine developers should not use this directly. This is called by
   * evaluation workflow to perform batch prediction.
   * <p>
   * @param sc Spark context
   * @param bm Model
   * @param qs Batch of queries
   * @return Batch of predicted results
   */
  public abstract  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, P>> batchPredictBase (org.apache.spark.SparkContext sc, Object bm, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, Q>> qs)  ;
  /** :: DeveloperApi ::
   * Engine developers should not use this directly. Called by serving to
   * perform a single prediction.
   * <p>
   * @param bm Model
   * @param q Query
   * @return Predicted result
   */
  public abstract  P predictBase (Object bm, Q q)  ;
  /** :: DeveloperApi ::
   * Engine developers should not use this directly. Prepare a model for
   * persistence in the downstream consumer. PredictionIO supports 3 types of
   * model persistence: automatic persistence, manual persistence, and
   * re-training on deployment. This method provides a way for downstream
   * modules to determine which mode the model should be persisted.
   * <p>
   * @param sc Spark context
   * @param modelId Model ID
   * @param algoParams Algorithm parameters that trained this model
   * @param bm Model
   * @return The model itself for automatic persistence, an instance of
   *         {@link org.apache.predictionio.workflow.PersistentModelManifest} for manual
   *         persistence, or Unit for re-training on deployment
   */
  public  Object makePersistentModel (org.apache.spark.SparkContext sc, java.lang.String modelId, org.apache.predictionio.controller.Params algoParams, Object bm)  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Obtains the type signature of query for this algorithm
   * <p>
   * @return Type signature of query
   */
  public  java.lang.Class<Q> queryClass ()  { throw new RuntimeException(); }
}
