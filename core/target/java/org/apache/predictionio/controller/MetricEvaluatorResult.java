package org.apache.predictionio.controller;
/** Contains all results of a {@link MetricEvaluator}
 * <p>
 * param:  bestScore The best score among all iterations
 * param:  bestEngineParams The set of engine parameters that yielded the best score
 * param:  bestIdx The index of iteration that yielded the best score
 * param:  metricHeader Brief description of the primary metric score
 * param:  otherMetricHeaders Brief descriptions of other metric scores
 * param:  engineParamsScores All sets of engine parameters and corresponding metric scores
 * param:  outputPath An optional output path where scores are saved
 * @tparam R Type of the primary metric score
 * @group Evaluation
 */
public  class MetricEvaluatorResult<R extends java.lang.Object> implements org.apache.predictionio.core.BaseEvaluatorResult, scala.Product, scala.Serializable {
  static public  boolean noSave ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.MetricScores<R> bestScore ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.EngineParams bestEngineParams ()  { throw new RuntimeException(); }
  public  int bestIdx ()  { throw new RuntimeException(); }
  public  java.lang.String metricHeader ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> otherMetricHeaders ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, org.apache.predictionio.controller.MetricScores<R>>> engineParamsScores ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputPath ()  { throw new RuntimeException(); }
  // not preceding
  public   MetricEvaluatorResult (org.apache.predictionio.controller.MetricScores<R> bestScore, org.apache.predictionio.controller.EngineParams bestEngineParams, int bestIdx, java.lang.String metricHeader, scala.collection.Seq<java.lang.String> otherMetricHeaders, scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, org.apache.predictionio.controller.MetricScores<R>>> engineParamsScores, scala.Option<java.lang.String> outputPath)  { throw new RuntimeException(); }
  public  java.lang.String toOneLiner ()  { throw new RuntimeException(); }
  public  java.lang.String toJSON ()  { throw new RuntimeException(); }
  public  java.lang.String toHTML ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
