package org.apache.predictionio.controller.java;
/** Base class of a Java parallel data source. Refer to {@link PDataSource} for documentation.
 * <p>
 * @tparam TD Training data class.
 * @tparam EI Evaluation Info class.
 * @tparam Q Input query class.
 * @tparam A Actual value class.
 * @group Data Source
 */
public abstract class PJavaDataSource<TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.controller.PDataSource<TD, EI, Q, A> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PJavaDataSource ()  { throw new RuntimeException(); }
}
