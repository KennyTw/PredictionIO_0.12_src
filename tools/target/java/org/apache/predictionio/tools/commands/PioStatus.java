package org.apache.predictionio.tools.commands;
public  class PioStatus implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String version ()  { throw new RuntimeException(); }
  public  java.lang.String pioHome ()  { throw new RuntimeException(); }
  public  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public  java.lang.String sparkVersion ()  { throw new RuntimeException(); }
  public  java.lang.String sparkMinVersion ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> warnings ()  { throw new RuntimeException(); }
  // not preceding
  public   PioStatus (java.lang.String version, java.lang.String pioHome, java.lang.String sparkHome, java.lang.String sparkVersion, java.lang.String sparkMinVersion, scala.collection.Seq<java.lang.String> warnings)  { throw new RuntimeException(); }
}
