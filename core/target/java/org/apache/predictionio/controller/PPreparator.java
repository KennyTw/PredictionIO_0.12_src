package org.apache.predictionio.controller;
/** Base class of a parallel preparator.
 * <p>
 * A parallel preparator can be run in parallel on a cluster and produces a
 * prepared data that is distributed across a cluster.
 * <p>
 * @tparam TD Training data class.
 * @tparam PD Prepared data class.
 * @group Preparator
 */
public abstract class PPreparator<TD extends java.lang.Object, PD extends java.lang.Object> extends org.apache.predictionio.core.BasePreparator<TD, PD> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PPreparator ()  { throw new RuntimeException(); }
  public  PD prepareBase (org.apache.spark.SparkContext sc, TD td)  { throw new RuntimeException(); }
  /** Implement this method to produce prepared data that is ready for model
   * training.
   * <p>
   * @param sc An Apache Spark context.
   * @param trainingData Training data to be prepared.
   * @return (undocumented)
   */
  public abstract  PD prepare (org.apache.spark.SparkContext sc, TD trainingData)  ;
}
