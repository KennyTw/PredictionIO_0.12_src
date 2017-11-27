package org.apache.predictionio.core;
/** :: DeveloperApi ::
 * Base class of all serving controller classes
 * <p>
 * @tparam Q Query class
 * @tparam P Predicted result class
 */
public abstract class BaseServing<Q extends java.lang.Object, P extends java.lang.Object> extends org.apache.predictionio.core.AbstractDoer {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   BaseServing ()  { throw new RuntimeException(); }
  /** :: Experimental ::
   * Engine developers should not use this directly. This is called by serving
   * layer to supplement process the query before sending it to algorithms.
   * <p>
   * @param q Query
   * @return A supplement Query
   */
  public abstract  Q supplementBase (Q q)  ;
  /** :: DeveloperApi ::
   * Engine developers should not use this directly. This is called by serving
   * layer to combine multiple predicted results from multiple algorithms, and
   * custom business logic before serving to the end user.
   * <p>
   * @param q Query
   * @param ps List of predicted results
   * @return A single predicted result
   */
  public abstract  P serveBase (Q q, scala.collection.Seq<P> ps)  ;
}
