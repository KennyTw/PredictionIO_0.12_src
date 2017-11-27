package org.apache.predictionio.workflow;
/** :: DeveloperApi ::
 * Singleton object that collects anonymous functions to be
 * executed to allow the process to end gracefully.
 * <p>
 * For example, the Elasticsearch REST storage client
 * maintains an internal connection pool that must
 * be closed to allow the process to exit.
 */
public  class CleanupFunctions$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CleanupFunctions$ MODULE$ = null;
  public   CleanupFunctions$ ()  { throw new RuntimeException(); }
  private  scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>> functions ()  { throw new RuntimeException(); }
  /** Add a function to be called during cleanup.
   * <p>
   * <pre><code>
   * import org.apache.predictionio.workflow.CleanupFunctions
   *
   * CleanupFunctions.add { MyStorageClass.close }
   * </code></pre>
   * <p>
   * @param anonymous function containing cleanup code.
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>> add (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /** Call all cleanup functions in order added.
   * <p>
   * <pre><code>
   * import org.apache.predictionio.workflow.CleanupFunctions
   *
   * try {
   *   // Much code that needs cleanup
   *   // whether successful or error thrown.
   * } finally {
   *   CleanupFunctions.run()
   * }
   * </code></pre>
   * <p>
   * @param anonymous function containing cleanup code.
   */
  public  void run ()  { throw new RuntimeException(); }
}
