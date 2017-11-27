package org.apache.predictionio.e2.engine;
/** Class for training a Markov Chain model */
public  class MarkovChain$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MarkovChain$ MODULE$ = null;
  public   MarkovChain$ ()  { throw new RuntimeException(); }
  /** Train a Markov Chain model
   * <p>
   * @param matrix Tally of all state transitions
   * @param topN Use the top-N tally for each state
   * @return (undocumented)
   */
  public  org.apache.predictionio.e2.engine.MarkovChainModel train (org.apache.spark.mllib.linalg.distributed.CoordinateMatrix matrix, int topN)  { throw new RuntimeException(); }
}
