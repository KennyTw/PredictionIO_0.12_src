package org.apache.predictionio.data.api;
public  class KV<K extends java.lang.Object, V extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  K key ()  { throw new RuntimeException(); }
  public  V value ()  { throw new RuntimeException(); }
  // not preceding
  public   KV (K key, V value)  { throw new RuntimeException(); }
}
