package org.apache.predictionio.workflow;
public  class EngineServerPluginContext {
  static public  org.json4s.Formats formats ()  { throw new RuntimeException(); }
  static public  org.apache.predictionio.workflow.EngineServerPluginContext apply (akka.event.LoggingAdapter log, java.lang.String engineVariant)  { throw new RuntimeException(); }
  static private  java.lang.String stringFromFile (java.lang.String filePath)  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.String, scala.collection.mutable.Map<java.lang.String, org.apache.predictionio.workflow.EngineServerPlugin>> plugins ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.String, org.json4s.JsonAST.JValue> pluginParams ()  { throw new RuntimeException(); }
  public  akka.event.LoggingAdapter log ()  { throw new RuntimeException(); }
  // not preceding
  public   EngineServerPluginContext (scala.collection.mutable.Map<java.lang.String, scala.collection.mutable.Map<java.lang.String, org.apache.predictionio.workflow.EngineServerPlugin>> plugins, scala.collection.mutable.Map<java.lang.String, org.json4s.JsonAST.JValue> pluginParams, akka.event.LoggingAdapter log)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.workflow.EngineServerPlugin> outputBlockers ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.workflow.EngineServerPlugin> outputSniffers ()  { throw new RuntimeException(); }
}
