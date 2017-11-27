package org.apache.predictionio.tools;
public  class BatchPredictArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String inputFilePath ()  { throw new RuntimeException(); }
  public  java.lang.String outputFilePath ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> queryPartitions ()  { throw new RuntimeException(); }
  public  scala.Option<java.io.File> variantJson ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value jsonExtractor ()  { throw new RuntimeException(); }
  // not preceding
  public   BatchPredictArgs (java.lang.String inputFilePath, java.lang.String outputFilePath, scala.Option<java.lang.Object> queryPartitions, scala.Option<java.io.File> variantJson, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
}
