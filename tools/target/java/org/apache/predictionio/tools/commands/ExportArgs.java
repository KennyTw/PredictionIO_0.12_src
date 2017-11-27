package org.apache.predictionio.tools.commands;
public  class ExportArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> channel ()  { throw new RuntimeException(); }
  public  java.lang.String outputPath ()  { throw new RuntimeException(); }
  public  java.lang.String format ()  { throw new RuntimeException(); }
  // not preceding
  public   ExportArgs (int appId, scala.Option<java.lang.String> channel, java.lang.String outputPath, java.lang.String format)  { throw new RuntimeException(); }
}
