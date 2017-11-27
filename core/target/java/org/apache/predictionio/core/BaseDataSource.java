package org.apache.predictionio.core;
/** :: DeveloperApi ::
 * Base class of all data source controllers
 * <p>
 * @tparam TD Training data class
 * @tparam EI Evaluation information class
 * @tparam Q Query class
 * @tparam A Actual result class
 */
public abstract class BaseDataSource<TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.core.AbstractDoer {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BaseDataSource ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Engine developer should not use this directly. This is called by workflow
   * to read training data.
   * <p>
   * @param sc Spark context
   * @return Training data
   */
  public abstract  TD readTrainingBase (org.apache.spark.SparkContext sc)  ;
  /** :: DeveloperApi ::
   * Engine developer should not use this directly. This is called by
   * evaluation workflow to read training and validation data.
   * <p>
   * @param sc Spark context
   * @return Sets of training data, evaluation information, queries, and actual
   *         results
   */
  public abstract  scala.collection.Seq<scala.Tuple3<TD, EI, org.apache.spark.rdd.RDD<scala.Tuple2<Q, A>>>> readEvalBase (org.apache.spark.SparkContext sc)  ;
}
