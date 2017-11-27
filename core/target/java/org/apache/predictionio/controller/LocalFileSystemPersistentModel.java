package org.apache.predictionio.controller;
/** This trait is a convenience helper for persisting your model to the local
 * filesystem. This trait and {@link LocalFileSystemPersistentModelLoader} contain
 * concrete implementation and need not be implemented.
 * <p>
 * The underlying implementation is {@link Utils.save}.
 * <p>
 * <pre><code>
 * class MyModel extends LocalFileSystemPersistentModel[MyParams] {
 *   ...
 * }
 *
 * object MyModel extends LocalFileSystemPersistentModelLoader[MyParams, MyModel] {
 *   ...
 * }
 * </code></pre>
 * <p>
 * @tparam AP Algorithm parameters class.
 * @see LocalFileSystemPersistentModelLoader
 * @group Algorithm
 */
public  interface LocalFileSystemPersistentModel<AP extends org.apache.predictionio.controller.Params> extends org.apache.predictionio.controller.PersistentModel<AP> {
  public  boolean save (java.lang.String id, AP params, org.apache.spark.SparkContext sc)  ;
}
