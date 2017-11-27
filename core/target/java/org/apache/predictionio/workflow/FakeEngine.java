package org.apache.predictionio.workflow;
public  class FakeEngine extends org.apache.predictionio.core.BaseEngine<org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams> {
  public   FakeEngine ()  { throw new RuntimeException(); }
  public  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> train (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.EngineParams engineParams, java.lang.String engineInstanceId, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EmptyParams, org.apache.spark.rdd.RDD<scala.Tuple3<org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams, org.apache.predictionio.controller.EmptyParams>>>> eval (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.EngineParams engineParams, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
}
