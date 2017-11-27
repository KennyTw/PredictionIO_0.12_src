package org.apache.predictionio.controller;
/** A concrete implementation of {@link LServing} returning the average of all
 * algorithms' predictions, where their classes are expected to be all Double.
 * <p>
 * @group Serving
 */
public  class LAverageServing<Q extends java.lang.Object> extends org.apache.predictionio.controller.LServing<Q, java.lang.Object> {
  /** Returns an instance of {@link LAverageServing}. */
  static public <Q extends java.lang.Object> java.lang.Class<org.apache.predictionio.controller.LAverageServing<Q>> apply (java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<?, ?, Q, ?>> a)  { throw new RuntimeException(); }
  static public  Q supplementBase (Q q)  { throw new RuntimeException(); }
  static public  Q supplement (Q q)  { throw new RuntimeException(); }
  static public  P serveBase (Q q, scala.collection.Seq<P> ps)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LAverageServing ()  { throw new RuntimeException(); }
  /** Returns the average of all algorithms' predictions. */
  public  double serve (Q query, scala.collection.Seq<java.lang.Object> predictions)  { throw new RuntimeException(); }
}
