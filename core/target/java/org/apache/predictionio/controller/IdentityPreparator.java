package org.apache.predictionio.controller;
/** A helper concrete implementation of {@link org.apache.predictionio.core.BasePreparator}
 * that passes training data through without any special preparation. This can
 * be used in place for both {@link PPreparator} and {@link LPreparator}.
 * <p>
 * @tparam TD Training data class.
 * @group Preparator
 */
public  class IdentityPreparator<TD extends java.lang.Object> extends org.apache.predictionio.core.BasePreparator<TD, TD> {
  /** Produces an instance of the class of {@link IdentityPreparator}.
   * <p>
   * @param ds Instance of the class of the data source for this preparator.
   * @return (undocumented)
   */
  static public <TD extends java.lang.Object> java.lang.Class<org.apache.predictionio.controller.IdentityPreparator<TD>> apply (java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, ?, ?, ?>> ds)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   IdentityPreparator ()  { throw new RuntimeException(); }
  public  TD prepareBase (org.apache.spark.SparkContext sc, TD td)  { throw new RuntimeException(); }
}
