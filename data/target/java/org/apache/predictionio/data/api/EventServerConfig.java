package org.apache.predictionio.data.api;
public  class EventServerConfig implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String ip ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  java.lang.String plugins ()  { throw new RuntimeException(); }
  public  boolean stats ()  { throw new RuntimeException(); }
  // not preceding
  public   EventServerConfig (java.lang.String ip, int port, java.lang.String plugins, boolean stats)  { throw new RuntimeException(); }
}
