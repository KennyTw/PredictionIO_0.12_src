package org.apache.predictionio.workflow;
public  class CreateWorkflow {
  static public  class WorkflowConfig implements scala.Product, scala.Serializable {
    public  java.lang.String deployMode ()  { throw new RuntimeException(); }
    public  java.lang.String batch ()  { throw new RuntimeException(); }
    public  java.lang.String engineId ()  { throw new RuntimeException(); }
    public  java.lang.String engineVersion ()  { throw new RuntimeException(); }
    public  java.lang.String engineVariant ()  { throw new RuntimeException(); }
    public  java.lang.String engineFactory ()  { throw new RuntimeException(); }
    public  java.lang.String engineParamsKey ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> evaluationClass ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> engineParamsGeneratorClass ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> env ()  { throw new RuntimeException(); }
    public  boolean skipSanityCheck ()  { throw new RuntimeException(); }
    public  boolean stopAfterRead ()  { throw new RuntimeException(); }
    public  boolean stopAfterPrepare ()  { throw new RuntimeException(); }
    public  int verbosity ()  { throw new RuntimeException(); }
    public  boolean verbose ()  { throw new RuntimeException(); }
    public  boolean debug ()  { throw new RuntimeException(); }
    public  scala.Option<java.lang.String> logFile ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value jsonExtractor ()  { throw new RuntimeException(); }
    // not preceding
    public   WorkflowConfig (java.lang.String deployMode, java.lang.String batch, java.lang.String engineId, java.lang.String engineVersion, java.lang.String engineVariant, java.lang.String engineFactory, java.lang.String engineParamsKey, scala.Option<java.lang.String> evaluationClass, scala.Option<java.lang.String> engineParamsGeneratorClass, scala.Option<java.lang.String> env, boolean skipSanityCheck, boolean stopAfterRead, boolean stopAfterPrepare, int verbosity, boolean verbose, boolean debug, scala.Option<java.lang.String> logFile, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
  }
  static public  class WorkflowConfig$ extends scala.runtime.AbstractFunction18<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, scala.Option<java.lang.String>, scala.Option<java.lang.String>, scala.Option<java.lang.String>, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, scala.Option<java.lang.String>, scala.Enumeration.Value, org.apache.predictionio.workflow.CreateWorkflow.WorkflowConfig> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WorkflowConfig$ MODULE$ = null;
    public   WorkflowConfig$ ()  { throw new RuntimeException(); }
  }
  static public  class AlgorithmParams implements scala.Product, scala.Serializable {
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.json4s.JsonAST.JValue params ()  { throw new RuntimeException(); }
    // not preceding
    public   AlgorithmParams (java.lang.String name, org.json4s.JsonAST.JValue params)  { throw new RuntimeException(); }
  }
  static public  class AlgorithmParams$ extends scala.runtime.AbstractFunction2<java.lang.String, org.json4s.JsonAST.JValue, org.apache.predictionio.workflow.CreateWorkflow.AlgorithmParams> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AlgorithmParams$ MODULE$ = null;
    public   AlgorithmParams$ ()  { throw new RuntimeException(); }
  }
  static private  java.lang.String stringFromFile (java.lang.String filePath)  { throw new RuntimeException(); }
  static public  scopt.OptionParser<org.apache.predictionio.workflow.CreateWorkflow.WorkflowConfig> parser ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
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
