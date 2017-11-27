package org.apache.predictionio.workflow;
public  class PluginsActor implements akka.actor.Actor {
  static public  class HandleREST implements scala.Product, scala.Serializable {
    public  java.lang.String pluginName ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.String> pluginArgs ()  { throw new RuntimeException(); }
    // not preceding
    public   HandleREST (java.lang.String pluginName, scala.collection.Seq<java.lang.String> pluginArgs)  { throw new RuntimeException(); }
  }
  static public  class HandleREST$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.collection.Seq<java.lang.String>, org.apache.predictionio.workflow.PluginsActor.HandleREST> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final HandleREST$ MODULE$ = null;
    public   HandleREST$ ()  { throw new RuntimeException(); }
  }
  static public  akka.actor.ActorContext context ()  { throw new RuntimeException(); }
  static public final  akka.actor.ActorRef self ()  { throw new RuntimeException(); }
  static public final  akka.actor.ActorRef sender ()  { throw new RuntimeException(); }
  static protected  void aroundReceive (scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive, Object msg)  { throw new RuntimeException(); }
  static protected  void aroundPreStart ()  { throw new RuntimeException(); }
  static protected  void aroundPostStop ()  { throw new RuntimeException(); }
  static protected  void aroundPreRestart (java.lang.Throwable reason, scala.Option<java.lang.Object> message)  { throw new RuntimeException(); }
  static protected  void aroundPostRestart (java.lang.Throwable reason)  { throw new RuntimeException(); }
  static public  akka.actor.SupervisorStrategy supervisorStrategy ()  { throw new RuntimeException(); }
  static public  void preStart () throws java.lang.Exception { throw new RuntimeException(); }
  static public  void postStop () throws java.lang.Exception { throw new RuntimeException(); }
  static public  void preRestart (java.lang.Throwable reason, scala.Option<java.lang.Object> message) throws java.lang.Exception { throw new RuntimeException(); }
  static public  void postRestart (java.lang.Throwable reason) throws java.lang.Exception { throw new RuntimeException(); }
  static public  void unhandled (Object message)  { throw new RuntimeException(); }
  public   PluginsActor (java.lang.String engineVariant)  { throw new RuntimeException(); }
  public  akka.actor.ActorSystem system ()  { throw new RuntimeException(); }
  public  akka.event.LoggingAdapter log ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.workflow.EngineServerPluginContext pluginContext ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
}
