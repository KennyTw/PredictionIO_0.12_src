package org.apache.predictionio.tools.console;
public  class AccessKeyArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String accessKey ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> events ()  { throw new RuntimeException(); }
  // not preceding
  public   AccessKeyArgs (java.lang.String accessKey, scala.collection.Seq<java.lang.String> events)  { throw new RuntimeException(); }
}
