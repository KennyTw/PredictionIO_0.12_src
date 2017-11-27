package org.apache.predictionio.tools.imprt;
public  class FileToEventsArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String env ()  { throw new RuntimeException(); }
  public  java.lang.String logFile ()  { throw new RuntimeException(); }
  public  int appId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> channel ()  { throw new RuntimeException(); }
  public  java.lang.String inputPath ()  { throw new RuntimeException(); }
  public  boolean verbose ()  { throw new RuntimeException(); }
  public  boolean debug ()  { throw new RuntimeException(); }
  // not preceding
  public   FileToEventsArgs (java.lang.String env, java.lang.String logFile, int appId, scala.Option<java.lang.String> channel, java.lang.String inputPath, boolean verbose, boolean debug)  { throw new RuntimeException(); }
}
