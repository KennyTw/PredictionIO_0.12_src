package org.apache.predictionio.controller;
/** SimpleEngine has only one algorithm, and uses default preparator and serving
 * layer. Current default preparator is <code>IdentityPreparator</code> and serving is
 * <code>FirstServing</code>.
 * <p>
 * @tparam TD Training data class.
 * @tparam EI Evaluation info class.
 * @tparam Q Input query class.
 * @tparam P Output prediction class.
 * @tparam A Actual value class.
 * param:  dataSourceClass Data source class.
 * param:  algorithmClass of algorithm names to classes.
 * @group Engine
 */
public  class SimpleEngine<TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.controller.Engine<TD, EI, TD, Q, P, A> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SimpleEngine (java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>> dataSourceClass, java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<TD, ?, Q, P>> algorithmClass)  { throw new RuntimeException(); }
}
