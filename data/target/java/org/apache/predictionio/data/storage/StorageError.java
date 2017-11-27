package org.apache.predictionio.data.storage;
/** DEPRECATED. Use {@link StorageException}.
 * <p>
 * @deprecated Use {@link StorageException}
 */
public  class StorageError implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  // not preceding
  public   StorageError (java.lang.String message)  { throw new RuntimeException(); }
}
