package org.apache.predictionio.e2.engine;
/** Markov Chain model
 * <p>
 * param:  transitionVectors transition vectors
 * param:  n top N used to construct the model
 */
public  class MarkovChainModel implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.SparseVector>> transitionVectors ()  { throw new RuntimeException(); }
  public  int n ()  { throw new RuntimeException(); }
  // not preceding
  public   MarkovChainModel (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.SparseVector>> transitionVectors, int n)  { throw new RuntimeException(); }
  /** Calculate the probabilities of the next state
   * <p>
   * @param currentState probabilities of the current state
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> predict (scala.collection.Seq<java.lang.Object> currentState)  { throw new RuntimeException(); }
}
