package org.apache.predictionio.tools.commands;
public  class AppDescription implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.App app ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey> keys ()  { throw new RuntimeException(); }
  // not preceding
  public   AppDescription (org.apache.predictionio.data.storage.App app, scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey> keys)  { throw new RuntimeException(); }
}
