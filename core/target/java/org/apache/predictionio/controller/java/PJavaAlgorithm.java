package org.apache.predictionio.controller.java;
/** Base class of a Java parallel algorithm. Refer to {@link PAlgorithm} for documentation.
 * <p>
 * @tparam PD Prepared data class.
 * @tparam M Trained model class.
 * @tparam Q Input query class.
 * @tparam P Output prediction class.
 * @group Algorithm
 */
public abstract class PJavaAlgorithm<PD extends java.lang.Object, M extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object> extends org.apache.predictionio.controller.PAlgorithm<PD, M, Q, P> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PJavaAlgorithm ()  { throw new RuntimeException(); }
}
