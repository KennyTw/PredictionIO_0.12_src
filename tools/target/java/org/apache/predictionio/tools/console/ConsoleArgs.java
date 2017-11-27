package org.apache.predictionio.tools.console;
public  class ConsoleArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.commands.BuildArgs build ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.console.AppArgs app ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.SparkArgs spark ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.commands.EngineArgs engine ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.WorkflowArgs workflow ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.console.AccessKeyArgs accessKey ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.DeployArgs deploy ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.BatchPredictArgs batchPredict ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.EventServerArgs eventServer ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.commands.AdminServerArgs adminServer ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.commands.DashboardArgs dashboard ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.commands.ExportArgs export ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.commands.ImportArgs imprt ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> commands ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> metricsParamsJsonPath ()  { throw new RuntimeException(); }
  public  java.lang.String paramsPath ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineInstanceId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> mainClass ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> driverPassThrough ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> pioHome ()  { throw new RuntimeException(); }
  public  boolean verbose ()  { throw new RuntimeException(); }
  // not preceding
  public   ConsoleArgs (org.apache.predictionio.tools.commands.BuildArgs build, org.apache.predictionio.tools.console.AppArgs app, org.apache.predictionio.tools.SparkArgs spark, org.apache.predictionio.tools.commands.EngineArgs engine, org.apache.predictionio.tools.WorkflowArgs workflow, org.apache.predictionio.tools.console.AccessKeyArgs accessKey, org.apache.predictionio.tools.DeployArgs deploy, org.apache.predictionio.tools.BatchPredictArgs batchPredict, org.apache.predictionio.tools.EventServerArgs eventServer, org.apache.predictionio.tools.commands.AdminServerArgs adminServer, org.apache.predictionio.tools.commands.DashboardArgs dashboard, org.apache.predictionio.tools.commands.ExportArgs export, org.apache.predictionio.tools.commands.ImportArgs imprt, scala.collection.Seq<java.lang.String> commands, scala.Option<java.lang.String> metricsParamsJsonPath, java.lang.String paramsPath, scala.Option<java.lang.String> engineInstanceId, scala.Option<java.lang.String> mainClass, scala.collection.Seq<java.lang.String> driverPassThrough, scala.Option<java.lang.String> pioHome, boolean verbose)  { throw new RuntimeException(); }
}
