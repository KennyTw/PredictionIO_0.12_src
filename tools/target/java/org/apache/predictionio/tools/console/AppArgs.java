package org.apache.predictionio.tools.console;
public  class AppArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String channel ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> dataDeleteChannel ()  { throw new RuntimeException(); }
  public  boolean all ()  { throw new RuntimeException(); }
  public  boolean force ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> description ()  { throw new RuntimeException(); }
  // not preceding
  public   AppArgs (scala.Option<java.lang.Object> id, java.lang.String name, java.lang.String channel, scala.Option<java.lang.String> dataDeleteChannel, boolean all, boolean force, scala.Option<java.lang.String> description)  { throw new RuntimeException(); }
}
