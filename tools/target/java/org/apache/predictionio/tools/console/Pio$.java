package org.apache.predictionio.tools.console;
public  class Pio$ implements grizzled.slf4j.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Pio$ MODULE$ = null;
  public   Pio$ ()  { throw new RuntimeException(); }
  private <A extends java.lang.Object, B extends java.lang.Object> int eitherToInt (scala.util.Either<A, B> result)  { throw new RuntimeException(); }
  private <A extends java.lang.Object, B extends java.lang.Object> int doOnSuccess (scala.util.Either<A, B> result, scala.Function1<B, java.lang.Object> f)  { throw new RuntimeException(); }
  private  int processAwaitAndClean (scala.util.Either<java.lang.String, scala.Tuple2<scala.sys.process.Process, scala.Function0<scala.runtime.BoxedUnit>>> maybeProc)  { throw new RuntimeException(); }
  public  int version ()  { throw new RuntimeException(); }
  public  int build (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.commands.BuildArgs buildArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  public  int train (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.WorkflowArgs wa, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  public  int eval (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.WorkflowArgs wa, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  public  int deploy (org.apache.predictionio.tools.commands.EngineArgs ea, scala.Option<java.lang.String> engineInstanceId, org.apache.predictionio.tools.ServerArgs serverArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  public  int undeploy (org.apache.predictionio.tools.DeployArgs da)  { throw new RuntimeException(); }
  public  int batchPredict (org.apache.predictionio.tools.commands.EngineArgs ea, scala.Option<java.lang.String> engineInstanceId, org.apache.predictionio.tools.BatchPredictArgs batchPredictArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  public  int dashboard (org.apache.predictionio.tools.commands.DashboardArgs da)  { throw new RuntimeException(); }
  public  int eventserver (org.apache.predictionio.tools.EventServerArgs ea)  { throw new RuntimeException(); }
  public  int adminserver (org.apache.predictionio.tools.commands.AdminServerArgs aa)  { throw new RuntimeException(); }
  public  int run (org.apache.predictionio.tools.commands.EngineArgs ea, java.lang.String mainClass, scala.collection.Seq<java.lang.String> driverArguments, org.apache.predictionio.tools.commands.BuildArgs buildArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  public  int status (scala.Option<java.lang.String> pioHome, scala.Option<java.lang.String> sparkHome)  { throw new RuntimeException(); }
  public  int imprt (org.apache.predictionio.tools.commands.ImportArgs ia, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome)  { throw new RuntimeException(); }
  public  int export (org.apache.predictionio.tools.commands.ExportArgs ea, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome)  { throw new RuntimeException(); }
}
