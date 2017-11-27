package org.apache.predictionio.controller;
/** :: DeveloperApi ::
 * Do no use this directly. Use {@link MetricEvaluator$} instead. This is an
 * implementation of {@link org.apache.predictionio.core.BaseEvaluator} that evaluates
 * prediction performance based on metric scores.
 * <p>
 * param:  metric Primary metric
 * param:  otherMetrics Other metrics
 * param:  outputPath Optional output path to save evaluation results
 * @tparam EI Evaluation information type
 * @tparam Q Query class
 * @tparam P Predicted result class
 * @tparam A Actual result class
 * @tparam R Metric result class
 * @group Evaluation
 */
public  class MetricEvaluator<EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends java.lang.Object> extends org.apache.predictionio.core.BaseEvaluator<EI, Q, P, A, org.apache.predictionio.controller.MetricEvaluatorResult<R>> {
  static public  class NameParams implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.predictionio.controller.Params params ()  { throw new RuntimeException(); }
    // not preceding
    public   NameParams (java.lang.String name, org.apache.predictionio.controller.Params params)  { throw new RuntimeException(); }
    public   NameParams (scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> np)  { throw new RuntimeException(); }
  }
  static public  class NameParams$ extends scala.runtime.AbstractFunction2<java.lang.String, org.apache.predictionio.controller.Params, org.apache.predictionio.controller.MetricEvaluator.NameParams> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NameParams$ MODULE$ = null;
    public   NameParams$ ()  { throw new RuntimeException(); }
  }
  static public  class EngineVariant implements scala.Product, scala.Serializable {
    public  java.lang.String id ()  { throw new RuntimeException(); }
    public  java.lang.String description ()  { throw new RuntimeException(); }
    public  java.lang.String engineFactory ()  { throw new RuntimeException(); }
    public  org.apache.predictionio.controller.MetricEvaluator.NameParams datasource ()  { throw new RuntimeException(); }
    public  org.apache.predictionio.controller.MetricEvaluator.NameParams preparator ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.predictionio.controller.MetricEvaluator.NameParams> algorithms ()  { throw new RuntimeException(); }
    public  org.apache.predictionio.controller.MetricEvaluator.NameParams serving ()  { throw new RuntimeException(); }
    // not preceding
    public   EngineVariant (java.lang.String id, java.lang.String description, java.lang.String engineFactory, org.apache.predictionio.controller.MetricEvaluator.NameParams datasource, org.apache.predictionio.controller.MetricEvaluator.NameParams preparator, scala.collection.Seq<org.apache.predictionio.controller.MetricEvaluator.NameParams> algorithms, org.apache.predictionio.controller.MetricEvaluator.NameParams serving)  { throw new RuntimeException(); }
    public   EngineVariant (org.apache.predictionio.controller.Evaluation evaluation, org.apache.predictionio.controller.EngineParams engineParams)  { throw new RuntimeException(); }
  }
  static public  class EngineVariant$ extends scala.runtime.AbstractFunction7<java.lang.String, java.lang.String, java.lang.String, org.apache.predictionio.controller.MetricEvaluator.NameParams, org.apache.predictionio.controller.MetricEvaluator.NameParams, scala.collection.Seq<org.apache.predictionio.controller.MetricEvaluator.NameParams>, org.apache.predictionio.controller.MetricEvaluator.NameParams, org.apache.predictionio.controller.MetricEvaluator.EngineVariant> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EngineVariant$ MODULE$ = null;
    public   EngineVariant$ ()  { throw new RuntimeException(); }
  }
  static public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends java.lang.Object> org.apache.predictionio.controller.MetricEvaluator<EI, Q, P, A, R> apply (org.apache.predictionio.controller.Metric<EI, Q, P, A, R> metric, scala.collection.Seq<org.apache.predictionio.controller.Metric<EI, Q, P, A, ?>> otherMetrics, java.lang.String outputPath)  { throw new RuntimeException(); }
  static public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends java.lang.Object> org.apache.predictionio.controller.MetricEvaluator<EI, Q, P, A, R> apply (org.apache.predictionio.controller.Metric<EI, Q, P, A, R> metric, scala.collection.Seq<org.apache.predictionio.controller.Metric<EI, Q, P, A, ?>> otherMetrics)  { throw new RuntimeException(); }
  static public <EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, R extends java.lang.Object> org.apache.predictionio.controller.MetricEvaluator<EI, Q, P, A, R> apply (org.apache.predictionio.controller.Metric<EI, Q, P, A, R> metric)  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.Metric<EI, Q, P, A, R> metric ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.controller.Metric<EI, Q, P, A, ?>> otherMetrics ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> outputPath ()  { throw new RuntimeException(); }
  // not preceding
  public   MetricEvaluator (org.apache.predictionio.controller.Metric<EI, Q, P, A, R> metric, scala.collection.Seq<org.apache.predictionio.controller.Metric<EI, Q, P, A, ?>> otherMetrics, scala.Option<java.lang.String> outputPath)  { throw new RuntimeException(); }
  public  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.EngineInstances engineInstances ()  { throw new RuntimeException(); }
  public  void saveEngineJson (org.apache.predictionio.controller.Evaluation evaluation, org.apache.predictionio.controller.EngineParams engineParams, java.lang.String outputPath)  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.MetricEvaluatorResult<R> evaluateBase (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.Evaluation evaluation, scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>>>> engineEvalDataSet, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
}
