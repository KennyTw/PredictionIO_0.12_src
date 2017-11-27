package org.apache.predictionio.controller;
/** Trait for metric which returns a score based on Query, PredictedResult,
 * and ActualResult
 * <p>
 * @tparam Q Query class
 * @tparam P Predicted result class
 * @tparam A Actual result class
 * @tparam R Metric result class
 * @group Evaluation
 */
public  interface QPAMetric<Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends java.lang.Object> {
  /** Calculate a metric result based on query, predicted result, and actual
   * result
   * <p>
   * @param q Query
   * @param p Predicted result
   * @param a Actual result
   * @return Metric result
   */
  public  R calculate (Q q, P p, A a)  ;
}
