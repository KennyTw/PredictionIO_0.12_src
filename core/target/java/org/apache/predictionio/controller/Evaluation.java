package org.apache.predictionio.controller;
/** Defines an evaluation that contains an engine and a metric.
 * <p>
 * Implementations of this trait can be supplied to "pio eval" as the first
 * argument.
 * <p>
 * @group Evaluation
 */
public  interface Evaluation extends org.apache.predictionio.controller.Deployment {
  public  boolean _evaluatorSet ()  ;
  public  org.apache.predictionio.core.BaseEvaluator<?, ?, ?, ?, ? extends org.apache.predictionio.core.BaseEvaluatorResult> _evaluator ()  ;
  public  org.apache.predictionio.core.BaseEvaluator<?, ?, ?, ?, ? extends org.apache.predictionio.core.BaseEvaluatorResult> evaluator ()  ;
  /** Gets the tuple of the {@link Engine} and the implementation of
   * {@link org.apache.predictionio.core.BaseEvaluator}
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.predictionio.core.BaseEngine<?, ?, ?, ?>, org.apache.predictionio.core.BaseEvaluator<?, ?, ?, ?, ?>> engineEvaluator ()  ;
  /** Returns both the {@link Engine} and the implementation of {@link Metric} for this
   * {@link Evaluation}
   * @return (undocumented)
   */
  public  scala.Tuple2<org.apache.predictionio.core.BaseEngine<?, ?, ?, ?>, org.apache.predictionio.controller.Metric<?, ?, ?, ?, ?>> engineMetric ()  ;
  public  scala.Tuple2<org.apache.predictionio.core.BaseEngine<?, ?, ?, ?>, org.apache.predictionio.controller.Metric<?, ?, ?, ?, ?>> engineMetrics ()  ;
}
