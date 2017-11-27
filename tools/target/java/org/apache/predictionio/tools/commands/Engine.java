package org.apache.predictionio.tools.commands;
public  class Engine {
  static private  java.lang.String detectSbt (scala.Option<java.io.File> sbt, java.lang.String pioHome)  { throw new RuntimeException(); }
  static private  void outputSbtError (java.lang.String line)  { throw new RuntimeException(); }
  static private  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> compile (org.apache.predictionio.tools.commands.BuildArgs buildArgs, java.lang.String pioHome, java.lang.String engineDirPath, boolean verbose)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> build (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.commands.BuildArgs buildArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  /** Training an engine.
   *  The function starts a training process to bu run concurrenlty.
   * <p>
   * @param ea An instance of {@link EngineArgs}
   * @param wa An instance of {@link WorkflowArgs} for running a single training.
   * @param sa An instance of {@link SparkArgs}
   * @param pioHome {@link String} with a path to PIO installation
   * @param verbose A {@link Boolean}
   * @return An instance of {@link Expected} contaning either {@link Left}
   *         with an error message or {@link Right} with a handle to a process
   *         responsible for training and a function () =&gt; Unit,
   *         that must be called when the process is complete
   */
  static public  scala.util.Either<java.lang.String, scala.Tuple2<scala.sys.process.Process, scala.Function0<scala.runtime.BoxedUnit>>> train (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.WorkflowArgs wa, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  /** Deploying an engine.
   *  The function starts a new process to be run concerrently.
   * <p>
   * @param ea An instance of {@link EngineArgs}
   * @param engineInstanceId An instance of {@link engineInstanceId}
   * @param serverArgs An instance of {@link ServerArgs}
   * @param sparkArgs An instance of {@link SparkArgs}
   * @param pioHome {@link String} with a path to PIO installation
   * @param verbose A {@link Boolean}
   * @return An instance of {@link Expected} contaning either {@link Left}
   *         with an error message or {@link Right} with a handle to process
   *         of a running angine  and a function () =&gt; Unit,
   *         that must be called when the process is complete
   */
  static public  scala.util.Either<java.lang.String, scala.Tuple2<scala.sys.process.Process, scala.Function0<scala.runtime.BoxedUnit>>> deploy (org.apache.predictionio.tools.commands.EngineArgs ea, scala.Option<java.lang.String> engineInstanceId, org.apache.predictionio.tools.ServerArgs serverArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> undeploy (org.apache.predictionio.tools.DeployArgs da)  { throw new RuntimeException(); }
  /** Batch predict with an engine.
   * <p>
   * @param ea An instance of {@link EngineArgs}
   * @param engineInstanceId An instance of {@link engineInstanceId}
   * @param batchPredictArgs An instance of {@link BatchPredictArgs}
   * @param sparkArgs An instance of {@link SparkArgs}
   * @param pioHome {@link String} with a path to PIO installation
   * @param verbose A {@link Boolean}
   * @return An instance of {@link Expected} contaning either {@link Left}
   *         with an error message or {@link Right} with a handle to process
   *         of a running angine  and a function () =&gt; Unit,
   *         that must be called when the process is complete
   */
  static public  scala.util.Either<java.lang.String, scala.Tuple2<scala.sys.process.Process, scala.Function0<scala.runtime.BoxedUnit>>> batchPredict (org.apache.predictionio.tools.commands.EngineArgs ea, scala.Option<java.lang.String> engineInstanceId, org.apache.predictionio.tools.BatchPredictArgs batchPredictArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  /** Running a driver on spark.
   *  The function starts a process and returns immediately
   * <p>
   * @param mainClass A {@link String} with the class containing a main functionto run
   * @param driverArguments Arguments to be passed to the main function
   * @param buildArgs An instance of {@link BuildArgs}
   * @param sparkArgs an instance of {@link SparkArgs}
   * @param pioHome {@link String} with a path to PIO installation
   * @param verbose A {@link Boolean}
   * @return An instance of {@link Expected} contaning either {@link Left}
   *         with an error message or {@link Right} with a handle to a process
   *         of a running driver
   * @param ea (undocumented)
   */
  static public  scala.util.Either<java.lang.String, scala.sys.process.Process> run (org.apache.predictionio.tools.commands.EngineArgs ea, java.lang.String mainClass, scala.collection.Seq<java.lang.String> driverArguments, org.apache.predictionio.tools.commands.BuildArgs buildArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
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
  static protected <T extends java.lang.Object> scala.util.Either<java.lang.String, T> logAndFail (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected <T extends java.lang.Object> scala.util.Either<java.lang.String, T> logOnFail (scala.Function0<java.lang.String> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected <T extends java.lang.Object> scala.util.Either<java.lang.String, T> logAndReturn (T value, scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> logAndSucceed (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
}
