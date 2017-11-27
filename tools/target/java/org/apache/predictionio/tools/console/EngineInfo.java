package org.apache.predictionio.tools.console;
public  class EngineInfo implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String engineId ()  { throw new RuntimeException(); }
  public  java.lang.String engineVersion ()  { throw new RuntimeException(); }
  public  java.lang.String variantId ()  { throw new RuntimeException(); }
  // not preceding
  public   EngineInfo (java.lang.String engineId, java.lang.String engineVersion, java.lang.String variantId)  { throw new RuntimeException(); }
}
