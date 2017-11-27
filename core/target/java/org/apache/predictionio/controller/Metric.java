package org.apache.predictionio.controller;
/** Base class of a {@link Metric}.
 * <p>
 * @tparam EI Evaluation information
 * @tparam Q Query
 * @tparam P Predicted result
 * @tparam A Actual result
 * @tparam R Metric result
 * @group Evaluation
 */
public abstract class Metric<EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   Metric (scala.math.Ordering<R> rOrder)  { throw new RuntimeException(); }
  /** Java friendly constructor
   * <p>
   * @param comparator A serializable comparator for sorting the metric results.
   * <p>
   */
  public   Metric (org.apache.predictionio.controller.java.SerializableComparator<R> comparator)  { throw new RuntimeException(); }
  /** Class name of this {@link Metric}. */
  public  java.lang.String header ()  { throw new RuntimeException(); }
  /** Calculates the result of this {@link Metric}. */
  public abstract  R calculate (org.apache.spark.SparkContext sc, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> evalDataSet)  ;
  /** Comparison function for R's ordering. */
  public  int compare (R r0, R r1)  { throw new RuntimeException(); }
}
