package org.apache.predictionio.controller;
/** Base class of serving.
 * <p>
 * @tparam Q Input query class.
 * @tparam P Output prediction class.
 * @group Serving
 */
public abstract class LServing<Q extends java.lang.Object, P extends java.lang.Object> extends org.apache.predictionio.core.BaseServing<Q, P> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LServing ()  { throw new RuntimeException(); }
  public  Q supplementBase (Q q)  { throw new RuntimeException(); }
  /** :: Experimental ::
   * Implement this method to supplement the query before sending it to
   * algorithms.
   * <p>
   * @param q Query
   * @return A supplemented Query
   */
  public  Q supplement (Q q)  { throw new RuntimeException(); }
  public  P serveBase (Q q, scala.collection.Seq<P> ps)  { throw new RuntimeException(); }
  /** Implement this method to combine multiple algorithms' predictions to
   * produce a single final prediction. The query is the original query sent to
   * the engine, not the supplemented produced by {@link LServing.supplement}.
   * <p>
   * @param query Original input query.
   * @param predictions A list of algorithms' predictions.
   * @return (undocumented)
   */
  public abstract  P serve (Q query, scala.collection.Seq<P> predictions)  ;
}
