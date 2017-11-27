package org.apache.predictionio.core;
/** :: DeveloperApi ::
 * Base class of all preparator controller classes
 * <p>
 * Dev note: Probably will add an extra parameter for ad hoc JSON formatter
 * <p>
 * @tparam TD Training data class
 * @tparam PD Prepared data class
 */
public abstract class BasePreparator<TD extends java.lang.Object, PD extends java.lang.Object> extends org.apache.predictionio.core.AbstractDoer {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BasePreparator ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Engine developers should not use this directly. This is called by training
   * workflow to prepare data before handing it over to algorithm
   * <p>
   * @param sc Spark context
   * @param td Training data
   * @return Prepared data
   */
  public abstract  PD prepareBase (org.apache.spark.SparkContext sc, TD td)  ;
}
