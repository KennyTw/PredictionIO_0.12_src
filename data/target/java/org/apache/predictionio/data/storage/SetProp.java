package org.apache.predictionio.data.storage;
public  class SetProp implements scala.Serializable, scala.Product {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.storage.PropTime> fields ()  { throw new RuntimeException(); }
  public  long t ()  { throw new RuntimeException(); }
  // not preceding
  public   SetProp (scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.storage.PropTime> fields, long t)  { throw new RuntimeException(); }
}
