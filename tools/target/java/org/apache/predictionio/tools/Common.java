package org.apache.predictionio.tools;
public  class Common {
  static public  java.lang.String getSparkHome (scala.Option<java.lang.String> sparkHome)  { throw new RuntimeException(); }
  static public  java.lang.String getCoreDir (java.lang.String pioHome)  { throw new RuntimeException(); }
  static public  java.lang.String getEngineDirPath (scala.Option<java.lang.String> directory)  { throw new RuntimeException(); }
  static public  java.io.File[] jarFilesForScala (java.lang.String directory)  { throw new RuntimeException(); }
  static public  java.io.File[] jarFilesForSpark (java.lang.String pioHome)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, java.io.File> coreAssembly (java.lang.String pioHome)  { throw new RuntimeException(); }
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
