package org.apache.predictionio.data.api;
public  class StatsSnapshot implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.joda.time.DateTime startTime ()  { throw new RuntimeException(); }
  public  scala.Option<org.joda.time.DateTime> endTime ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.api.KV<org.apache.predictionio.data.api.EntityTypesEvent, java.lang.Object>> basic ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.api.KV<spray.http.StatusCode, java.lang.Object>> statusCode ()  { throw new RuntimeException(); }
  // not preceding
  public   StatsSnapshot (org.joda.time.DateTime startTime, scala.Option<org.joda.time.DateTime> endTime, scala.collection.Seq<org.apache.predictionio.data.api.KV<org.apache.predictionio.data.api.EntityTypesEvent, java.lang.Object>> basic, scala.collection.Seq<org.apache.predictionio.data.api.KV<spray.http.StatusCode, java.lang.Object>> statusCode)  { throw new RuntimeException(); }
}
