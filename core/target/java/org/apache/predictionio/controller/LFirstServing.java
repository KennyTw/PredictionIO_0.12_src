package org.apache.predictionio.controller;
/** A concrete implementation of {@link LServing} returning the first algorithm's
 * prediction result directly without any modification.
 * <p>
 * @group Serving
 */
public  class LFirstServing<Q extends java.lang.Object, P extends java.lang.Object> extends org.apache.predictionio.controller.LServing<Q, P> {
  /** Returns an instance of {@link LFirstServing}. */
  static public <Q extends java.lang.Object, P extends java.lang.Object> java.lang.Class<org.apache.predictionio.controller.LFirstServing<Q, P>> apply (java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<?, ?, Q, P>> a)  { throw new RuntimeException(); }
  static public  Q supplementBase (Q q)  { throw new RuntimeException(); }
  static public  Q supplement (Q q)  { throw new RuntimeException(); }
  static public  P serveBase (Q q, scala.collection.Seq<P> ps)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LFirstServing ()  { throw new RuntimeException(); }
  /** Returns the first algorithm's prediction. */
  public  P serve (Q query, scala.collection.Seq<P> predictions)  { throw new RuntimeException(); }
}
