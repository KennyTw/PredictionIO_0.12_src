package org.apache.predictionio.tools.console;
public  class Pio {
  static public  class App$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final App$ MODULE$ = null;
    public   App$ ()  { throw new RuntimeException(); }
    public  int create (java.lang.String name, scala.Option<java.lang.Object> id, scala.Option<java.lang.String> description, java.lang.String accessKey)  { throw new RuntimeException(); }
    public  int list ()  { throw new RuntimeException(); }
    public  int show (java.lang.String appName)  { throw new RuntimeException(); }
    public  int delete (java.lang.String name, boolean force)  { throw new RuntimeException(); }
    public  int dataDelete (java.lang.String name, scala.Option<java.lang.String> channel, boolean all, boolean force)  { throw new RuntimeException(); }
    public  int channelNew (java.lang.String appName, java.lang.String newChannel)  { throw new RuntimeException(); }
    public  int channelDelete (java.lang.String appName, java.lang.String deleteChannel, boolean force)  { throw new RuntimeException(); }
  }
  static public  class AccessKey$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AccessKey$ MODULE$ = null;
    public   AccessKey$ ()  { throw new RuntimeException(); }
    public  int create (java.lang.String appName, java.lang.String key, scala.collection.Seq<java.lang.String> events)  { throw new RuntimeException(); }
    public  int list (scala.Option<java.lang.String> app)  { throw new RuntimeException(); }
    public  int delete (java.lang.String key)  { throw new RuntimeException(); }
  }
  static private <A extends java.lang.Object, B extends java.lang.Object> int eitherToInt (scala.util.Either<A, B> result)  { throw new RuntimeException(); }
  static private <A extends java.lang.Object, B extends java.lang.Object> int doOnSuccess (scala.util.Either<A, B> result, scala.Function1<B, java.lang.Object> f)  { throw new RuntimeException(); }
  static private  int processAwaitAndClean (scala.util.Either<java.lang.String, scala.Tuple2<scala.sys.process.Process, scala.Function0<scala.runtime.BoxedUnit>>> maybeProc)  { throw new RuntimeException(); }
  static public  int version ()  { throw new RuntimeException(); }
  static public  int build (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.commands.BuildArgs buildArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  static public  int train (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.WorkflowArgs wa, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  static public  int eval (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.WorkflowArgs wa, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  static public  int deploy (org.apache.predictionio.tools.commands.EngineArgs ea, scala.Option<java.lang.String> engineInstanceId, org.apache.predictionio.tools.ServerArgs serverArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  static public  int undeploy (org.apache.predictionio.tools.DeployArgs da)  { throw new RuntimeException(); }
  static public  int batchPredict (org.apache.predictionio.tools.commands.EngineArgs ea, scala.Option<java.lang.String> engineInstanceId, org.apache.predictionio.tools.BatchPredictArgs batchPredictArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  static public  int dashboard (org.apache.predictionio.tools.commands.DashboardArgs da)  { throw new RuntimeException(); }
  static public  int eventserver (org.apache.predictionio.tools.EventServerArgs ea)  { throw new RuntimeException(); }
  static public  int adminserver (org.apache.predictionio.tools.commands.AdminServerArgs aa)  { throw new RuntimeException(); }
  static public  int run (org.apache.predictionio.tools.commands.EngineArgs ea, java.lang.String mainClass, scala.collection.Seq<java.lang.String> driverArguments, org.apache.predictionio.tools.commands.BuildArgs buildArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  static public  int status (scala.Option<java.lang.String> pioHome, scala.Option<java.lang.String> sparkHome)  { throw new RuntimeException(); }
  static public  int imprt (org.apache.predictionio.tools.commands.ImportArgs ia, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome)  { throw new RuntimeException(); }
  static public  int export (org.apache.predictionio.tools.commands.ExportArgs ea, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome)  { throw new RuntimeException(); }
  static protected  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  static protected  java.lang.String loggerName ()  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void trace (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void trace (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isDebugEnabled ()  { throw new RuntimeException(); }
  static protected  void debug (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void debug (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isErrorEnabled ()  { throw new RuntimeException(); }
  static protected  void error (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void error (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isInfoEnabled ()  { throw new RuntimeException(); }
  static protected  void info (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void info (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isWarnEnabled ()  { throw new RuntimeException(); }
  static protected  void warn (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void warn (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
}
