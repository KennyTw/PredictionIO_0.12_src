package org.apache.predictionio.controller;
/** Case class storing a primary score, and other scores
 * <p>
 * param:  score Primary metric score
 * param:  otherScores Other scores this metric might have
 * @tparam R Type of the primary metric score
 * @group Evaluation
 */
public  class MetricScores<R extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  R score ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> otherScores ()  { throw new RuntimeException(); }
  // not preceding
  public   MetricScores (R score, scala.collection.Seq<java.lang.Object> otherScores)  { throw new RuntimeException(); }
}
