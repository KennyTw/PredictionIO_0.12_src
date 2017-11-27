package org.apache.predictionio.controller;
/** Base class of a parallel-to-local algorithm.
 * <p>
 * A parallel-to-local algorithm can be run in parallel on a cluster and
 * produces a model that can fit within a single machine.
 * <p>
 * If your input query class requires custom JSON4S serialization, the most
 * idiomatic way is to implement a trait that extends {@link CustomQuerySerializer},
 * and mix that into your algorithm class, instead of overriding
 * {@link querySerializer} directly.
 * <p>
 * @tparam PD Prepared data class.
 * @tparam M Trained model class.
 * @tparam Q Input query class.
 * @tparam P Output prediction class.
 * @group Algorithm
 */
public abstract class P2LAlgorithm<PD extends java.lang.Object, M extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object> extends org.apache.predictionio.core.BaseAlgorithm<PD, M, Q, P> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   P2LAlgorithm (scala.reflect.ClassTag<M> evidence$1, scala.reflect.ClassTag<Q> evidence$2)  { throw new RuntimeException(); }
  public  M trainBase (org.apache.spark.SparkContext sc, PD pd)  { throw new RuntimeException(); }
  /** Implement this method to produce a model from prepared data.
   * <p>
   * @param pd Prepared data for model training.
   * @return Trained model.
   * @param sc (undocumented)
   */
  public abstract  M train (org.apache.spark.SparkContext sc, PD pd)  ;
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, P>> batchPredictBase (org.apache.spark.SparkContext sc, Object bm, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, Q>> qs)  { throw new RuntimeException(); }
  /** This is a default implementation to perform batch prediction. Override
   * this method for a custom implementation.
   * <p>
   * @param m A model
   * @param qs An RDD of index-query tuples. The index is used to keep track of
   *           predicted results with corresponding queries.
   * @return Batch of predicted results
   */
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, P>> batchPredict (M m, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, Q>> qs)  { throw new RuntimeException(); }
  public  P predictBase (Object bm, Q q)  { throw new RuntimeException(); }
  /** Implement this method to produce a prediction from a query and trained
   * model.
   * <p>
   * @param model Trained model produced by {@link train}.
   * @param query An input query.
   * @return A prediction.
   */
  public abstract  P predict (M model, Q query)  ;
  /** :: DeveloperApi ::
   * Engine developers should not use this directly (read on to see how
   * parallel-to-local algorithm models are persisted).
   * <p>
   * Parallel-to-local algorithms produce local models. By default, models will be
   * serialized and stored automatically. Engine developers can override this behavior by
   * mixing the {@link PersistentModel} trait into the model class, and
   * PredictionIO will call {@link PersistentModel.save} instead. If it returns
   * true, a {@link org.apache.predictionio.workflow.PersistentModelManifest} will be
   * returned so that during deployment, PredictionIO will use
   * {@link PersistentModelLoader} to retrieve the model. Otherwise, Unit will be
   * returned and the model will be re-trained on-the-fly.
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
}
