package org.apache.predictionio.workflow;
public  class ServerConfig implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String batch ()  { throw new RuntimeException(); }
  public  java.lang.String engineInstanceId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineId ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> engineVersion ()  { throw new RuntimeException(); }
  public  java.lang.String engineVariant ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> env ()  { throw new RuntimeException(); }
  public  java.lang.String ip ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  boolean feedback ()  { throw new RuntimeException(); }
  public  java.lang.String eventServerIp ()  { throw new RuntimeException(); }
  public  int eventServerPort ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> accessKey ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> logUrl ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> logPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> logFile ()  { throw new RuntimeException(); }
  public  boolean verbose ()  { throw new RuntimeException(); }
  public  boolean debug ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value jsonExtractor ()  { throw new RuntimeException(); }
  // not preceding
  public   ServerConfig (java.lang.String batch, java.lang.String engineInstanceId, scala.Option<java.lang.String> engineId, scala.Option<java.lang.String> engineVersion, java.lang.String engineVariant, scala.Option<java.lang.String> env, java.lang.String ip, int port, boolean feedback, java.lang.String eventServerIp, int eventServerPort, scala.Option<java.lang.String> accessKey, scala.Option<java.lang.String> logUrl, scala.Option<java.lang.String> logPrefix, scala.Option<java.lang.String> logFile, boolean verbose, boolean debug, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
}
