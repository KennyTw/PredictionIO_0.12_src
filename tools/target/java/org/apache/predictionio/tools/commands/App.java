package org.apache.predictionio.tools.commands;
public  class App {
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.commands.AppDescription> create (java.lang.String name, scala.Option<java.lang.Object> id, scala.Option<java.lang.String> description, java.lang.String accessKey)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.predictionio.tools.commands.AppDescription> list ()  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, scala.Tuple2<org.apache.predictionio.tools.commands.AppDescription, scala.collection.Seq<org.apache.predictionio.data.storage.Channel>>> show (java.lang.String appName)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> delete (java.lang.String name)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> dataDelete (java.lang.String name, scala.Option<java.lang.String> channel, boolean all)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.data.storage.Channel> channelNew (java.lang.String appName, java.lang.String newChannel)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> channelDelete (java.lang.String appName, java.lang.String deleteChannel)  { throw new RuntimeException(); }
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
