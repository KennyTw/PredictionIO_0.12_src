package org.apache.predictionio.workflow;
/** Collection of reusable workflow related utilities. */
public  class WorkflowUtils {
  static private  com.google.gson.Gson gson ()  { throw new RuntimeException(); }
  /** Obtains an Engine object in Scala, or instantiate an Engine in Java.
   * <p>
   * @param engine Engine factory name.
   * @param cl A Java ClassLoader to look for engine-related classes.
   * <p>
   * @throws ClassNotFoundException
   *         Thrown when engine factory class does not exist.
   * @throws NoSuchMethodException
   *         Thrown when engine factory's apply() method is not implemented.
   * @return (undocumented)
   */
  static public  scala.Tuple2<scala.Enumeration.Value, org.apache.predictionio.controller.EngineFactory> getEngine (java.lang.String engine, java.lang.ClassLoader cl)  { throw new RuntimeException(); }
  static public  scala.Tuple2<scala.Enumeration.Value, org.apache.predictionio.controller.EngineParamsGenerator> getEngineParamsGenerator (java.lang.String epg, java.lang.ClassLoader cl)  { throw new RuntimeException(); }
  static public  scala.Tuple2<scala.Enumeration.Value, org.apache.predictionio.controller.Evaluation> getEvaluation (java.lang.String evaluation, java.lang.ClassLoader cl)  { throw new RuntimeException(); }
  /** Converts a JSON document to an instance of Params.
   * <p>
   * @param language Engine's programming language.
   * @param json JSON document.
   * @param clazz Class of the component that is going to receive the resulting
   *              Params instance as a constructor argument.
   * @param jsonExtractor JSON extractor option.
   * @param formats JSON4S serializers for deserialization.
   * <p>
   * @throws MappingException Thrown when JSON4S fails to perform conversion.
   * @throws JsonSyntaxException Thrown when GSON fails to perform conversion.
   * @return (undocumented)
   */
  static public  org.apache.predictionio.controller.Params extractParams (scala.Enumeration.Value language, java.lang.String json, java.lang.Class<?> clazz, scala.Enumeration.Value jsonExtractor, org.json4s.Formats formats)  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> getParamsFromJsonByFieldAndClass (org.json4s.JsonAST.JValue variantJson, java.lang.String field, scala.collection.immutable.Map<java.lang.String, java.lang.Class<?>> classMap, scala.Enumeration.Value engineLanguage, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
  /** Grab environmental variables that starts with 'PIO_'. */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> pioEnvVars ()  { throw new RuntimeException(); }
  /** Converts Java (non-Scala) objects to a JSON4S JValue.
   * <p>
   * @param params The Java object to be converted.
   * @return (undocumented)
   */
  static public  org.json4s.JsonAST.JValue javaObjectToJValue (java.lang.Object params)  { throw new RuntimeException(); }
  static public <D extends java.lang.Object> java.lang.String debugString (D data)  { throw new RuntimeException(); }
  /** Detect third party software configuration files to be submitted as
   * extras to Apache Spark. This makes sure all executors receive the same
   * configuration.
   * @return (undocumented)
   */
  static public  scala.collection.Seq<java.lang.String> thirdPartyConfFiles ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.String> thirdPartyClasspaths ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.net.URI> thirdPartyJars ()  { throw new RuntimeException(); }
  static public  void modifyLogging (boolean verbose)  { throw new RuntimeException(); }
  static public  org.apache.predictionio.workflow.NameParams extractNameParams (org.json4s.JsonAST.JValue jv)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<scala.Tuple2<java.lang.String, java.lang.String>> extractSparkConf (org.json4s.JsonAST.JValue root)  { throw new RuntimeException(); }
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
