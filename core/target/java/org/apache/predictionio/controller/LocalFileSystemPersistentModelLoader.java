package org.apache.predictionio.controller;
/** Implement an object that extends this trait for PredictionIO to support
 * loading a persisted model from local filesystem during serving deployment.
 * <p>
 * The underlying implementation is {@link Utils.load}.
 * <p>
 * @tparam AP Algorithm parameters class.
 * @tparam M Model class.
 * @see LocalFileSystemPersistentModel
 * @group Algorithm
 */
public  interface LocalFileSystemPersistentModelLoader<AP extends org.apache.predictionio.controller.Params, M extends java.lang.Object> extends org.apache.predictionio.controller.PersistentModelLoader<AP, M> {
  public  M apply (java.lang.String id, AP params, scala.Option<org.apache.spark.SparkContext> sc)  ;
}
