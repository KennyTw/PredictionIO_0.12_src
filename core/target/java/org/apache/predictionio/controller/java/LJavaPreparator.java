package org.apache.predictionio.controller.java;
/** Base class of a Java local preparator. Refer to {@link LPreparator} for documentation.
 * <p>
 * @tparam TD Training data class.
 * @tparam PD Prepared data class.
 * @group Preparator
 */
public abstract class LJavaPreparator<TD extends java.lang.Object, PD extends java.lang.Object> extends org.apache.predictionio.controller.LPreparator<TD, PD> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LJavaPreparator ()  { throw new RuntimeException(); }
}
