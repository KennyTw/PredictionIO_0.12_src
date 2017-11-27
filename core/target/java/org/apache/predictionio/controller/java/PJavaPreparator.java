package org.apache.predictionio.controller.java;
/** Base class of a Java parallel preparator. Refer to {@link PPreparator} for documentation
 * <p>
 * @tparam TD Training data class.
 * @tparam PD Prepared data class.
 * @group Preparator
 */
public abstract class PJavaPreparator<TD extends java.lang.Object, PD extends java.lang.Object> extends org.apache.predictionio.controller.PPreparator<TD, PD> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PJavaPreparator ()  { throw new RuntimeException(); }
}
