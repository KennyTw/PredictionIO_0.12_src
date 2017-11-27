package org.apache.predictionio.controller;
/** Base class of a parallel data source.
 * <p>
 * A parallel data source runs locally within a single machine, or in parallel
 * on a cluster, to return data that is distributed across a cluster.
 * <p>
 * @tparam TD Training data class.
 * @tparam EI Evaluation Info class.
 * @tparam Q Input query class.
 * @tparam A Actual value class.
 * @group Data Source
 */
public abstract class PDataSource<TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PDataSource ()  { throw new RuntimeException(); }
  public  TD readTrainingBase (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /** Implement this method to only return training data from a data source */
  public abstract  TD readTraining (org.apache.spark.SparkContext sc)  ;
  public  scala.collection.Seq<scala.Tuple3<TD, EI, org.apache.spark.rdd.RDD<scala.Tuple2<Q, A>>>> readEvalBase (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /** To provide evaluation feature for your engine, your must override this
   * method to return data for evaluation from a data source. Returned data can
   * optionally include a sequence of query and actual value pairs for
   * evaluation purpose.
   * <p>
   * The default implementation returns an empty sequence as a stub, so that
   * an engine can be compiled without implementing evaluation.
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple3<TD, EI, org.apache.spark.rdd.RDD<scala.Tuple2<Q, A>>>> readEval (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * @deprecated Use readEval() instead. Since 0.9.0. 
  */
  public  scala.collection.Seq<scala.Tuple3<TD, EI, org.apache.spark.rdd.RDD<scala.Tuple2<Q, A>>>> read (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
