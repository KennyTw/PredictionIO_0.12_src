package org.apache.predictionio.controller.java;
/** Base class of a Java parallel-to-local algorithm. Refer to {@link P2LAlgorithm} for documentation.
 * <p>
 * @tparam PD Prepared data class.
 * @tparam M Trained model class.
 * @tparam Q Input query class.
 * @tparam P Output prediction class.
 * @group Algorithm
 */
public abstract class P2LJavaAlgorithm<PD extends java.lang.Object, M extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object> extends org.apache.predictionio.controller.P2LAlgorithm<PD, M, Q, P> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   P2LJavaAlgorithm ()  { throw new RuntimeException(); }
}
