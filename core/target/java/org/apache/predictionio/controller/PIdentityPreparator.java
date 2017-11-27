package org.apache.predictionio.controller;
/** DEPRECATED. Use {@link IdentityPreparator} instead.
 * <p>
 * @tparam TD Training data class.
 * @group Preparator
 */
public  class PIdentityPreparator<TD extends java.lang.Object> extends org.apache.predictionio.controller.IdentityPreparator<TD> {
  /** Produces an instance of the class of {@link IdentityPreparator}.
   * <p>
   * @param ds Instance of the class of the data source for this preparator.
   * @return (undocumented)
   *
   * @deprecated Use IdentityPreparator instead. Since 0.9.2. 
  */
  static public <TD extends java.lang.Object> java.lang.Class<org.apache.predictionio.controller.IdentityPreparator<TD>> apply (java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, ?, ?, ?>> ds)  { throw new RuntimeException(); }
  static public  TD prepareBase (org.apache.spark.SparkContext sc, TD td)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PIdentityPreparator ()  { throw new RuntimeException(); }
}
