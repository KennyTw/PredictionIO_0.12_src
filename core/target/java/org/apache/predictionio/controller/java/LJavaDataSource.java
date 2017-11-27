package org.apache.predictionio.controller.java;
/** Base class of a Java local data source. Refer to {@link LDataSource} for documentation.
 * <p>
 * @tparam TD Training data class.
 * @tparam EI Evaluation Info class.
 * @tparam Q Input query class.
 * @tparam A Actual value class.
 * @group Data Source
 */
public abstract class LJavaDataSource<TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.controller.LDataSource<TD, EI, Q, A> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LJavaDataSource ()  { throw new RuntimeException(); }
}
