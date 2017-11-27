package org.apache.predictionio.workflow;
public  class ServerActor<Q extends java.lang.Object, P extends java.lang.Object> implements akka.actor.Actor, spray.routing.HttpService, org.apache.predictionio.authentication.KeyAuthentication {
  public  org.apache.predictionio.workflow.ServerConfig args ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.EngineInstance engineInstance ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.Engine<?, ?, ?, Q, P, ?> engine ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value engineLanguage ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.Params dataSourceParams ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.Params preparatorParams ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.core.BaseAlgorithm<?, ?, Q, P>> algorithms ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.controller.Params> algorithmsParams ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> models ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.core.BaseServing<Q, P> serving ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.Params servingParams ()  { throw new RuntimeException(); }
  // not preceding
  public   ServerActor (org.apache.predictionio.workflow.ServerConfig args, org.apache.predictionio.data.storage.EngineInstance engineInstance, org.apache.predictionio.controller.Engine<?, ?, ?, Q, P, ?> engine, scala.Enumeration.Value engineLanguage, org.apache.predictionio.controller.Params dataSourceParams, org.apache.predictionio.controller.Params preparatorParams, scala.collection.Seq<org.apache.predictionio.core.BaseAlgorithm<?, ?, Q, P>> algorithms, scala.collection.Seq<org.apache.predictionio.controller.Params> algorithmsParams, scala.collection.Seq<java.lang.Object> models, org.apache.predictionio.core.BaseServing<Q, P> serving, org.apache.predictionio.controller.Params servingParams)  { throw new RuntimeException(); }
  public  org.joda.time.DateTime serverStartTime ()  { throw new RuntimeException(); }
  public  akka.event.LoggingAdapter log ()  { throw new RuntimeException(); }
  public  int requestCount ()  { throw new RuntimeException(); }
  public  double avgServingSec ()  { throw new RuntimeException(); }
  public  double lastServingSec ()  { throw new RuntimeException(); }
  /** The following is required by HttpService */
  public  akka.actor.ActorContext actorRefFactory ()  { throw new RuntimeException(); }
  public  akka.util.Timeout timeout ()  { throw new RuntimeException(); }
  public  akka.actor.ActorRef pluginsActorRef ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.workflow.EngineServerPluginContext pluginContext ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  boolean feedbackEnabled ()  { throw new RuntimeException(); }
  public  void remoteLog (java.lang.String logUrl, java.lang.String logPrefix, java.lang.String message)  { throw new RuntimeException(); }
  /** Handle feedback to Event Server
   * Send the following back to the Event Server
   * - appId
   * - engineInstanceId
   * - query
   * - prediction
   * - prId
   * @return (undocumented)
   */
  public  scala.Function1<spray.routing.RequestContext, scala.runtime.BoxedUnit> myRoute ()  { throw new RuntimeException(); }
}
