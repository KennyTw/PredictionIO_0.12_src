package org.apache.predictionio.tools;
public  class WorkflowArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String batch ()  { throw new RuntimeException(); }
  public  scala.Option<java.io.File> variantJson ()  { throw new RuntimeException(); }
  public  int verbosity ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineParamsKey ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineFactory ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> evaluation ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineParamsGenerator ()  { throw new RuntimeException(); }
  public  boolean stopAfterRead ()  { throw new RuntimeException(); }
  public  boolean stopAfterPrepare ()  { throw new RuntimeException(); }
  public  boolean skipSanityCheck ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> mainPyFile ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value jsonExtractor ()  { throw new RuntimeException(); }
  // not preceding
  public   WorkflowArgs (java.lang.String batch, scala.Option<java.io.File> variantJson, int verbosity, scala.Option<java.lang.String> engineParamsKey, scala.Option<java.lang.String> engineFactory, scala.Option<java.lang.String> evaluation, scala.Option<java.lang.String> engineParamsGenerator, boolean stopAfterRead, boolean stopAfterPrepare, boolean skipSanityCheck, scala.Option<java.lang.String> mainPyFile, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
}
