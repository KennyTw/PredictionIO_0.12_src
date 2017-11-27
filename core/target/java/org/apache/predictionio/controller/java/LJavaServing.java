package org.apache.predictionio.controller.java;
/** Base class of Java local serving. Refer to {@link LServing} for documentation.
 * <p>
 * @tparam Q Input query class.
 * @tparam P Output prediction class.
 * @group Serving
 */
public abstract class LJavaServing<Q extends java.lang.Object, P extends java.lang.Object> extends org.apache.predictionio.controller.LServing<Q, P> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LJavaServing ()  { throw new RuntimeException(); }
}
