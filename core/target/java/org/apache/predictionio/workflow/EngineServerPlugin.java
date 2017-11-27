package org.apache.predictionio.workflow;
public  interface EngineServerPlugin {
  public  java.lang.String pluginName ()  ;
  public  java.lang.String pluginDescription ()  ;
  public  java.lang.String pluginType ()  ;
  public  org.json4s.JsonAST.JValue process (org.apache.predictionio.data.storage.EngineInstance engineInstance, org.json4s.JsonAST.JValue query, org.json4s.JsonAST.JValue prediction, org.apache.predictionio.workflow.EngineServerPluginContext context)  ;
  public  java.lang.String handleREST (scala.collection.Seq<java.lang.String> arguments)  ;
}
