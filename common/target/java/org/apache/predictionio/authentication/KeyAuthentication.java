package org.apache.predictionio.authentication;
/**
 * This is a (very) simple authentication for the dashboard and engine servers
 * It is highly recommended to implement a stonger authentication mechanism
 */
public  interface KeyAuthentication {
  public  class ServerKey {
    public   ServerKey ()  { throw new RuntimeException(); }
    private  com.typesafe.config.Config config ()  { throw new RuntimeException(); }
    public  boolean authEnforced ()  { throw new RuntimeException(); }
    public  java.lang.String get ()  { throw new RuntimeException(); }
    public  java.lang.String param ()  { throw new RuntimeException(); }
  }
  public  org.apache.predictionio.authentication.KeyAuthentication.ServerKey$ ServerKey ()  ;
  public  scala.Function1<spray.routing.RequestContext, scala.concurrent.Future<scala.util.Either<spray.routing.Rejection, spray.http.HttpRequest>>> withAccessKeyFromFile ()  ;
}
