package org.apache.predictionio.controller.java;
/** Define an evaluation in Java.
 * <p>
 * Implementations of this abstract class can be supplied to "pio eval" as the first
 * argument.
 * <p>
 * @group Evaluation
 */
public abstract class JavaEvaluation extends org.apache.predictionio.controller.EngineFactory implements org.apache.predictionio.controller.Evaluation {
  public   JavaEvaluation ()  { throw new RuntimeException(); }
  /** Set the {@link BaseEngine} and {@link Metric} for this {@link Evaluation}
   * <p>
   * @param baseEngine {@link BaseEngine} for this {@link JavaEvaluation}
   * @param metric {@link Metric} for this {@link JavaEvaluation}
   * @tparam EI Evaluation information class
   * @tparam Q Query class
   * @tparam P Predicted result class
   * @tparam A Actual result class
   */
  public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> void setEngineMetric (org.apache.predictionio.core.BaseEngine<EI, Q, P, A> baseEngine, org.apache.predictionio.controller.Metric<EI, Q, P, A, ?> metric)  { throw new RuntimeException(); }
  /** Set the {@link BaseEngine} and {@link Metric}s for this {@link JavaEvaluation}
   * <p>
   * @param baseEngine {@link BaseEngine} for this {@link JavaEvaluation}
   * @param metric {@link Metric} for this {@link JavaEvaluation}
   * @param metrics Other {@link Metric}s for this {@link JavaEvaluation}
   * @tparam EI Evaluation information class
   * @tparam Q Query class
   * @tparam P Predicted result class
   * @tparam A Actual result class
   */
  public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> void setEngineMetrics (org.apache.predictionio.core.BaseEngine<EI, Q, P, A> baseEngine, org.apache.predictionio.controller.Metric<EI, Q, P, A, ?> metric, java.util.List<? extends org.apache.predictionio.controller.Metric<EI, Q, P, A, ?>> metrics)  { throw new RuntimeException(); }
}
