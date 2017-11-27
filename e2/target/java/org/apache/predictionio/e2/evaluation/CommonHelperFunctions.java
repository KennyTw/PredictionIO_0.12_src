package org.apache.predictionio.e2.evaluation;
/** Common helper functions */
public  class CommonHelperFunctions {
  /** Split a data set into evalK folds for crossvalidation.
   * Apply to data sets supplied to evaluation.
   * <p>
   * @tparam D Data point class.
   * @tparam TD Training data class.
   * @tparam EI Evaluation Info class.
   * @tparam Q Input query class.
   * @tparam A Actual value class.
   * @param evalK (undocumented)
   * @param dataset (undocumented)
   * @param evaluatorInfo (undocumented)
   * @param trainingDataCreator (undocumented)
   * @param queryCreator (undocumented)
   * @param actualCreator (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  static public <D extends java.lang.Object, TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, A extends java.lang.Object> scala.collection.Seq<scala.Tuple3<TD, EI, org.apache.spark.rdd.RDD<scala.Tuple2<Q, A>>>> splitData (int evalK, org.apache.spark.rdd.RDD<D> dataset, EI evaluatorInfo, scala.Function1<org.apache.spark.rdd.RDD<D>, TD> trainingDataCreator, scala.Function1<D, Q> queryCreator, scala.Function1<D, A> actualCreator, scala.reflect.ClassTag<D> evidence$1)  { throw new RuntimeException(); }
}
