package org.apache.predictionio.workflow;
public  class FakeRunner extends org.apache.predictionio.core.BaseEvaluator<org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.workflow.FakeEvalResult> {
  public   FakeRunner (scala.Function1<org.apache.spark.SparkContext, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  private  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.workflow.FakeEvalResult evaluateBase (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.Evaluation evaluation, scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EmptyParams, org.apache.spark.rdd.RDD<scala.Tuple3<org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams>>>>>> engineEvalDataSet, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
}
