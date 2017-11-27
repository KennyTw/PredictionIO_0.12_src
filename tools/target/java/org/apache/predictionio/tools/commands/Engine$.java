package org.apache.predictionio.tools.commands;
public  class Engine$ implements org.apache.predictionio.tools.EitherLogging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Engine$ MODULE$ = null;
  public   Engine$ ()  { throw new RuntimeException(); }
  private  java.lang.String detectSbt (scala.Option<java.io.File> sbt, java.lang.String pioHome)  { throw new RuntimeException(); }
  private  void outputSbtError (java.lang.String line)  { throw new RuntimeException(); }
  private  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> compile (org.apache.predictionio.tools.commands.BuildArgs buildArgs, java.lang.String pioHome, java.lang.String engineDirPath, boolean verbose)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> build (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.commands.BuildArgs buildArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
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
  public  scala.util.Either<java.lang.String, scala.Tuple2<scala.sys.process.Process, scala.Function0<scala.runtime.BoxedUnit>>> train (org.apache.predictionio.tools.commands.EngineArgs ea, org.apache.predictionio.tools.WorkflowArgs wa, org.apache.predictionio.tools.SparkArgs sa, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
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
  public  scala.util.Either<java.lang.String, scala.Tuple2<scala.sys.process.Process, scala.Function0<scala.runtime.BoxedUnit>>> deploy (org.apache.predictionio.tools.commands.EngineArgs ea, scala.Option<java.lang.String> engineInstanceId, org.apache.predictionio.tools.ServerArgs serverArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> undeploy (org.apache.predictionio.tools.DeployArgs da)  { throw new RuntimeException(); }
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
  public  scala.util.Either<java.lang.String, scala.Tuple2<scala.sys.process.Process, scala.Function0<scala.runtime.BoxedUnit>>> batchPredict (org.apache.predictionio.tools.commands.EngineArgs ea, scala.Option<java.lang.String> engineInstanceId, org.apache.predictionio.tools.BatchPredictArgs batchPredictArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
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
  public  scala.util.Either<java.lang.String, scala.sys.process.Process> run (org.apache.predictionio.tools.commands.EngineArgs ea, java.lang.String mainClass, scala.collection.Seq<java.lang.String> driverArguments, org.apache.predictionio.tools.commands.BuildArgs buildArgs, org.apache.predictionio.tools.SparkArgs sparkArgs, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
}
