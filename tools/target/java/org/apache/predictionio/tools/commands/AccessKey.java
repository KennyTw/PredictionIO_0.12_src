package org.apache.predictionio.tools.commands;
public  class AccessKey {
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.data.storage.AccessKey> create (java.lang.String appName, java.lang.String key, scala.collection.Seq<java.lang.String> events)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey>> list (scala.Option<java.lang.String> app)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> delete (java.lang.String key)  { throw new RuntimeException(); }
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
