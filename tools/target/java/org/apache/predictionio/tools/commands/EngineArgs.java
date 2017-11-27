package org.apache.predictionio.tools.commands;
public  class EngineArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineVersion ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineDir ()  { throw new RuntimeException(); }
  // not preceding
  public   EngineArgs (scala.Option<java.lang.String> engineId, scala.Option<java.lang.String> engineVersion, scala.Option<java.lang.String> engineDir)  { throw new RuntimeException(); }
}
