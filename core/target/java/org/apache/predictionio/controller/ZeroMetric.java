package org.apache.predictionio.controller;
/** Returns zero. Useful as a placeholder during evaluation development when not all components are
 * implemented.
 * @tparam EI Evaluation information
 * @tparam Q Query
 * @tparam P Predicted result
 * @tparam A Actual result
 * <p>
 * @group Evaluation
 */
public  class ZeroMetric<EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.controller.Metric<EI, Q, P, A, java.lang.Object> {
  /** Returns a ZeroMetric instance using Engine's type parameters. */
  static public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> org.apache.predictionio.controller.ZeroMetric<EI, Q, P, A> apply (org.apache.predictionio.core.BaseEngine<EI, Q, P, A> engine)  { throw new RuntimeException(); }
  static public  java.lang.String header ()  { throw new RuntimeException(); }
  static public  int compare (R r0, R r1)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ZeroMetric ()  { throw new RuntimeException(); }
  public  double calculate (org.apache.spark.SparkContext sc, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> evalDataSet)  { throw new RuntimeException(); }
}
