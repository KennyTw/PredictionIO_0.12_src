package org.apache.predictionio.workflow;
/** FakeRun allows user to implement custom function under the exact enviroment
 * as other PredictionIO workflow.
 * <p>
 * Useful for developing new features. Only need to extend this trait and
 * implement a function: (SparkContext =&gt; Unit). For example, the code below
 * can be run with <code>pio eval HelloWorld</code>.
 * <p>
 * <pre><code>
 * object HelloWorld extends FakeRun {
 *   // func defines the function pio runs, must have signature (SparkContext =&gt; Unit).
 *   func = f
 *
 *   def f(sc: SparkContext): Unit {
 *     val logger = Logger[this.type]
 *     logger.info("HelloWorld")
 *   }
 * }
 * </code></pre>
 * <p>
 */
public  interface FakeRun extends org.apache.predictionio.controller.Evaluation, org.apache.predictionio.controller.EngineParamsGenerator {
  public  org.apache.predictionio.workflow.FakeRunner runner ()  ;
  public  scala.Function1<org.apache.spark.SparkContext, scala.runtime.BoxedUnit> func ()  ;
}
