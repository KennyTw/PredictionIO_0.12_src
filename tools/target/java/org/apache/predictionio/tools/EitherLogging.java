package org.apache.predictionio.tools;
public  interface EitherLogging extends grizzled.slf4j.Logging {
  public <T extends java.lang.Object> scala.util.Either<java.lang.String, T> logAndFail (scala.Function0<java.lang.String> msg)  ;
  public <T extends java.lang.Object> scala.util.Either<java.lang.String, T> logOnFail (scala.Function0<java.lang.String> msg, scala.Function0<java.lang.Throwable> t)  ;
  public <T extends java.lang.Object> scala.util.Either<java.lang.String, T> logAndReturn (T value, scala.Function0<java.lang.Object> msg)  ;
  public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> logAndSucceed (scala.Function0<java.lang.Object> msg)  ;
}
