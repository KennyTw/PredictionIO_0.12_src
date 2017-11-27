package org.apache.predictionio.data.api;
public  class EventInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> channelId ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.Event event ()  { throw new RuntimeException(); }
  // not preceding
  public   EventInfo (int appId, scala.Option<java.lang.Object> channelId, org.apache.predictionio.data.storage.Event event)  { throw new RuntimeException(); }
}
