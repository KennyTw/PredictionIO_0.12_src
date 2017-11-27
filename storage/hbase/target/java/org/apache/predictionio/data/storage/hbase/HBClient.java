package org.apache.predictionio.data.storage.hbase;
public  class HBClient implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration conf ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.hbase.client.HConnection connection ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.hbase.client.HBaseAdmin admin ()  { throw new RuntimeException(); }
  // not preceding
  public   HBClient (org.apache.hadoop.conf.Configuration conf, org.apache.hadoop.hbase.client.HConnection connection, org.apache.hadoop.hbase.client.HBaseAdmin admin)  { throw new RuntimeException(); }
}
