package org.apache.predictionio.workflow;
public  class NameParams implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.Option<org.json4s.JsonAST.JValue> params ()  { throw new RuntimeException(); }
  // not preceding
  public   NameParams (java.lang.String name, scala.Option<org.json4s.JsonAST.JValue> params)  { throw new RuntimeException(); }
}
