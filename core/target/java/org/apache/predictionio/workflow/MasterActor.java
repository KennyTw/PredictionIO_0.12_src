package org.apache.predictionio.workflow;
public  class MasterActor implements akka.actor.Actor, org.apache.predictionio.configuration.SSLConfiguration, org.apache.predictionio.authentication.KeyAuthentication {
  public   MasterActor (org.apache.predictionio.workflow.ServerConfig sc, org.apache.predictionio.data.storage.EngineInstance engineInstance, java.lang.String engineFactoryName)  { throw new RuntimeException(); }
  public  akka.event.LoggingAdapter log ()  { throw new RuntimeException(); }
  public  akka.actor.ActorSystem system ()  { throw new RuntimeException(); }
  public  scala.Option<akka.actor.ActorRef> sprayHttpListener ()  { throw new RuntimeException(); }
  public  scala.Option<akka.actor.ActorRef> currentServerActor ()  { throw new RuntimeException(); }
  public  int retry ()  { throw new RuntimeException(); }
  public  com.typesafe.config.Config serverConfig ()  { throw new RuntimeException(); }
  public  boolean sslEnforced ()  { throw new RuntimeException(); }
  public  java.lang.String protocol ()  { throw new RuntimeException(); }
  public  void undeploy (java.lang.String ip, int port)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  akka.actor.ActorRef createServerActor (org.apache.predictionio.workflow.ServerConfig sc, org.apache.predictionio.data.storage.EngineInstance engineInstance, java.lang.String engineFactoryName)  { throw new RuntimeException(); }
}
