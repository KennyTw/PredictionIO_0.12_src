package org.apache.predictionio.data.storage;
/** :: DeveloperApi ::
 * Stores model for each engine instance
 * <p>
 * param:  id ID of the model, which should be the same as engine instance ID
 * param:  models Trained models of all algorithms
 * @group Model Data
 */
public  class Model implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String id ()  { throw new RuntimeException(); }
  public  byte[] models ()  { throw new RuntimeException(); }
  // not preceding
  public   Model (java.lang.String id, byte[] models)  { throw new RuntimeException(); }
}
