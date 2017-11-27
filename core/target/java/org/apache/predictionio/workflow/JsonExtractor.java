package org.apache.predictionio.workflow;
public  class JsonExtractor {
  static public  org.json4s.JsonAST.JValue toJValue (scala.Enumeration.Value extractorOption, Object o, org.json4s.Formats json4sFormats, scala.collection.Seq<com.google.gson.TypeAdapterFactory> gsonTypeAdapterFactories)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T extract (scala.Enumeration.Value extractorOption, java.lang.String json, java.lang.Class<T> clazz, org.json4s.Formats json4sFormats, scala.collection.Seq<com.google.gson.TypeAdapterFactory> gsonTypeAdapterFactories)  { throw new RuntimeException(); }
  static public  java.lang.String paramToJson (scala.Enumeration.Value extractorOption, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> param)  { throw new RuntimeException(); }
  static public  java.lang.String paramsToJson (scala.Enumeration.Value extractorOption, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> params)  { throw new RuntimeException(); }
  static public  java.lang.String engineParamsToJson (scala.Enumeration.Value extractorOption, org.apache.predictionio.controller.EngineParams params)  { throw new RuntimeException(); }
  static public  java.lang.String engineParamstoPrettyJson (scala.Enumeration.Value extractorOption, org.apache.predictionio.controller.EngineParams params)  { throw new RuntimeException(); }
  static private  org.json4s.JsonAST.JValue engineParamsToJValue (scala.Enumeration.Value extractorOption, org.apache.predictionio.controller.EngineParams params)  { throw new RuntimeException(); }
  static private  org.json4s.JsonAST.JArray paramsToJValue (scala.Enumeration.Value extractorOption, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> params)  { throw new RuntimeException(); }
  static private <T extends java.lang.Object> T extractWithJson4sNative (java.lang.String json, org.json4s.Formats formats, java.lang.Class<T> clazz)  { throw new RuntimeException(); }
  static private <T extends java.lang.Object> T extractWithGson (java.lang.String json, java.lang.Class<T> clazz, scala.collection.Seq<com.google.gson.TypeAdapterFactory> gsonTypeAdapterFactories)  { throw new RuntimeException(); }
  static private  com.google.gson.Gson gson (scala.collection.Seq<com.google.gson.TypeAdapterFactory> gsonTypeAdapterFactories)  { throw new RuntimeException(); }
}
