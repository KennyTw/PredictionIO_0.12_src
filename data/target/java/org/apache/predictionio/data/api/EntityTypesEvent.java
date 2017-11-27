package org.apache.predictionio.data.api;
public  class EntityTypesEvent implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String entityType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> targetEntityType ()  { throw new RuntimeException(); }
  public  java.lang.String event ()  { throw new RuntimeException(); }
  // not preceding
  public   EntityTypesEvent (java.lang.String entityType, scala.Option<java.lang.String> targetEntityType, java.lang.String event)  { throw new RuntimeException(); }
  public   EntityTypesEvent (org.apache.predictionio.data.storage.Event e)  { throw new RuntimeException(); }
}
