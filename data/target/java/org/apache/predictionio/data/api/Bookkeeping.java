package org.apache.predictionio.data.api;
public  class Bookkeeping implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int appId ()  { throw new RuntimeException(); }
  public  spray.http.StatusCode statusCode ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.Event event ()  { throw new RuntimeException(); }
  // not preceding
  public   Bookkeeping (int appId, spray.http.StatusCode statusCode, org.apache.predictionio.data.storage.Event event)  { throw new RuntimeException(); }
}
