package org.apache.predictionio.data.storage;
public  class PropTime implements scala.Serializable, scala.Product {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.json4s.JsonAST.JValue d ()  { throw new RuntimeException(); }
  public  long t ()  { throw new RuntimeException(); }
  // not preceding
  public   PropTime (org.json4s.JsonAST.JValue d, long t)  { throw new RuntimeException(); }
}
