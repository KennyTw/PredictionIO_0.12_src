package org.apache.predictionio.tools;
public  class ServerArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.DeployArgs deploy ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.tools.EventServerArgs eventServer ()  { throw new RuntimeException(); }
  public  java.lang.String batch ()  { throw new RuntimeException(); }
  public  java.lang.String accessKey ()  { throw new RuntimeException(); }
  public  scala.Option<java.io.File> variantJson ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value jsonExtractor ()  { throw new RuntimeException(); }
  // not preceding
  public   ServerArgs (org.apache.predictionio.tools.DeployArgs deploy, org.apache.predictionio.tools.EventServerArgs eventServer, java.lang.String batch, java.lang.String accessKey, scala.Option<java.io.File> variantJson, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
}
