package org.apache.predictionio.tools.commands;
public  class Management {
  static public  java.lang.String version ()  { throw new RuntimeException(); }
  /** Starts a dashboard server and returns immediately
   * <p>
   * @param da An instance of {@link DashboardArgs}
   * @return An instance of {@link ActorSystem} in which the server is being executed
   */
  static public  akka.actor.ActorSystem dashboard (org.apache.predictionio.tools.commands.DashboardArgs da)  { throw new RuntimeException(); }
  /** Starts an eventserver server and returns immediately
   * <p>
   * @param ea An instance of {@link EventServerArgs}
   * @return An instance of {@link ActorSystem} in which the server is being executed
   */
  static public  akka.actor.ActorSystem eventserver (org.apache.predictionio.tools.EventServerArgs ea)  { throw new RuntimeException(); }
  /** Starts an adminserver server and returns immediately
   * <p>
   * @param aa An instance of {@link AdminServerArgs}
   * @return An instance of {@link ActorSystem} in which the server is being executed
   */
  static public  akka.actor.ActorSystem adminserver (org.apache.predictionio.tools.commands.AdminServerArgs aa)  { throw new RuntimeException(); }
  static private  java.lang.String stripMarginAndNewlines (java.lang.String string)  { throw new RuntimeException(); }
  static public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.commands.PioStatus> status (scala.Option<java.lang.String> pioHome, scala.Option<java.lang.String> sparkHome)  { throw new RuntimeException(); }
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
