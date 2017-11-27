package org.apache.predictionio.controller;
/** Base class of a local preparator.
 * <p>
 * A local preparator runs locally within a single machine and produces
 * prepared data that can fit within a single machine.
 * <p>
 * @tparam TD Training data class.
 * @tparam PD Prepared data class.
 * @group Preparator
 */
public abstract class LPreparator<TD extends java.lang.Object, PD extends java.lang.Object> extends org.apache.predictionio.core.BasePreparator<org.apache.spark.rdd.RDD<TD>, org.apache.spark.rdd.RDD<PD>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LPreparator (scala.reflect.ClassTag<PD> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<PD> prepareBase (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<TD> rddTd)  { throw new RuntimeException(); }
  /** Implement this method to produce prepared data that is ready for model
   * training.
   * <p>
   * @param trainingData Training data to be prepared.
   * @return (undocumented)
   */
  public abstract  PD prepare (TD trainingData)  ;
}
