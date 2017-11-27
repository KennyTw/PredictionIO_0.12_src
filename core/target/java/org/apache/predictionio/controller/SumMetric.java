package org.apache.predictionio.controller;
/** Returns the sum of the score returned by the calculate method.
 * <p>
 * @tparam EI Evaluation information
 * @tparam Q Query
 * @tparam P Predicted result
 * @tparam A Actual result
 * @tparam R Result, output of the function calculate, must be Numeric
 * <p>
 * @group Evaluation
 */
public abstract class SumMetric<EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends java.lang.Object> extends org.apache.predictionio.controller.Metric<EI, Q, P, A, R> implements org.apache.predictionio.controller.QPAMetric<Q, P, A, R> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SumMetric (scala.reflect.ClassTag<R> evidence$1, scala.math.Numeric<R> num)  { throw new RuntimeException(); }
  /** Implement this method to return a score that will be used for summing
   * across all QPA tuples.
   * @param q (undocumented)
   * @param p (undocumented)
   * @param a (undocumented)
   * @return (undocumented)
   */
  public abstract  R calculate (Q q, P p, A a)  ;
  public  R calculate (org.apache.spark.SparkContext sc, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> evalDataSet)  { throw new RuntimeException(); }
}
