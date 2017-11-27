package org.apache.predictionio.controller;
/** Returns the global standard deviation of the non-None score returned by the calculate method
 * <p>
 * This method uses org.apache.spark.util.StatCounter library, a one pass
 * method is used for calculation
 * <p>
 * @tparam EI Evaluation information
 * @tparam Q Query
 * @tparam P Predicted result
 * @tparam A Actual result
 * <p>
 * @group Evaluation
 */
public abstract class OptionStdevMetric<EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.controller.Metric<EI, Q, P, A, java.lang.Object> implements org.apache.predictionio.controller.StatsOptionMetricHelper<EI, Q, P, A>, org.apache.predictionio.controller.QPAMetric<Q, P, A, scala.Option<java.lang.Object>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   OptionStdevMetric ()  { throw new RuntimeException(); }
  /** Implement this method to return a score that will be used for calculating
   * the stdev
   * across all QPA tuples.
   * @param q (undocumented)
   * @param p (undocumented)
   * @param a (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.Option<java.lang.Object> calculate (Q q, P p, A a)  ;
  public  double calculate (org.apache.spark.SparkContext sc, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> evalDataSet)  { throw new RuntimeException(); }
}
