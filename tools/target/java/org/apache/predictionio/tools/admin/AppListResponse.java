package org.apache.predictionio.tools.admin;
public  class AppListResponse extends org.apache.predictionio.tools.admin.BaseResponse implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  int status ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.tools.admin.AppResponse> apps ()  { throw new RuntimeException(); }
  // not preceding
  public   AppListResponse (int status, java.lang.String message, scala.collection.Seq<org.apache.predictionio.tools.admin.AppResponse> apps)  { throw new RuntimeException(); }
}
