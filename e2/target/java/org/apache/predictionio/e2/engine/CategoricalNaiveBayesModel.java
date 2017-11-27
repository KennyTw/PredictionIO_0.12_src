package org.apache.predictionio.e2.engine;
/** Model for naive Bayes classifiers with categorical variables.
 * <p>
 * param:  priors log prior probabilities
 * param:  likelihoods log likelihood probabilities
 */
public  class CategoricalNaiveBayesModel implements scala.Serializable, scala.Product {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> priors ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Map<java.lang.String, java.lang.Object>[]> likelihoods ()  { throw new RuntimeException(); }
  // not preceding
  public   CategoricalNaiveBayesModel (scala.collection.immutable.Map<java.lang.String, java.lang.Object> priors, scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Map<java.lang.String, java.lang.Object>[]> likelihoods)  { throw new RuntimeException(); }
  public  int featureCount ()  { throw new RuntimeException(); }
  /** Calculate the log score of having the given features and label
   * <p>
   * @param point label and features
   * @param defaultLikelihood a function that calculates the likelihood when a
   *                          feature value is not present. The input to the
   *                          function is the other feature value likelihoods.
   * @return log score when label is present. None otherwise.
   */
  public  scala.Option<java.lang.Object> logScore (org.apache.predictionio.e2.engine.LabeledPoint point, scala.Function1<scala.collection.Seq<java.lang.Object>, java.lang.Object> defaultLikelihood)  { throw new RuntimeException(); }
  private  double logScoreInternal (java.lang.String label, java.lang.String[] features, scala.Function1<scala.collection.Seq<java.lang.Object>, java.lang.Object> defaultLikelihood)  { throw new RuntimeException(); }
  /** Return the label that yields the highest score
   * <p>
   * @param features features for classification
   * <p>
   * @return (undocumented)
   */
  public  java.lang.String predict (java.lang.String[] features)  { throw new RuntimeException(); }
}
