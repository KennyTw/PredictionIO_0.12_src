package org.apache.predictionio.tools;
public  class SparkArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> sparkHome ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> sparkPassThrough ()  { throw new RuntimeException(); }
  public  boolean sparkKryo ()  { throw new RuntimeException(); }
  public  scala.Option<java.net.URI> scratchUri ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkArgs (scala.Option<java.lang.String> sparkHome, scala.collection.Seq<java.lang.String> sparkPassThrough, boolean sparkKryo, scala.Option<java.net.URI> scratchUri)  { throw new RuntimeException(); }
}
