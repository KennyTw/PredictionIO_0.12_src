package org.apache.predictionio.workflow;
public  class BatchPredictConfig implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String inputFilePath ()  { throw new RuntimeException(); }
  public  java.lang.String outputFilePath ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> queryPartitions ()  { throw new RuntimeException(); }
  public  java.lang.String engineInstanceId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineVersion ()  { throw new RuntimeException(); }
  public  java.lang.String engineVariant ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> env ()  { throw new RuntimeException(); }
  public  boolean verbose ()  { throw new RuntimeException(); }
  public  boolean debug ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value jsonExtractor ()  { throw new RuntimeException(); }
  // not preceding
  public   BatchPredictConfig (java.lang.String inputFilePath, java.lang.String outputFilePath, scala.Option<java.lang.Object> queryPartitions, java.lang.String engineInstanceId, scala.Option<java.lang.String> engineId, scala.Option<java.lang.String> engineVersion, java.lang.String engineVariant, scala.Option<java.lang.String> env, boolean verbose, boolean debug, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
}
