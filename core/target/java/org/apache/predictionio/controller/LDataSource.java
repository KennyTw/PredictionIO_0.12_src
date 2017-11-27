package org.apache.predictionio.controller;
/** Base class of a local data source.
 * <p>
 * A local data source runs locally within a single machine and return data
 * that can fit within a single machine.
 * <p>
 * @tparam TD Training data class.
 * @tparam EI Evaluation Info class.
 * @tparam Q Input query class.
 * @tparam A Actual value class.
 * @group Data Source
 */
public abstract class LDataSource<TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.core.BaseDataSource<org.apache.spark.rdd.RDD<TD>, EI, Q, A> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LDataSource (scala.reflect.ClassTag<TD> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<TD> readTrainingBase (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /** Implement this method to only return training data from a data source */
  public abstract  TD readTraining ()  ;
  public  scala.collection.Seq<scala.Tuple3<org.apache.spark.rdd.RDD<TD>, EI, org.apache.spark.rdd.RDD<scala.Tuple2<Q, A>>>> readEvalBase (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /** To provide evaluation feature for your engine, your must override this
   * method to return data for evaluation from a data source. Returned data can
   * optionally include a sequence of query and actual value pairs for
   * evaluation purpose.
   * <p>
   * The default implementation returns an empty sequence as a stub, so that
   * an engine can be compiled without implementing evaluation.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple3<TD, EI, scala.collection.Seq<scala.Tuple2<Q, A>>>> readEval ()  { throw new RuntimeException(); }
  /**
   * @deprecated Use readEval() instead. Since 0.9.0. 
  */
  public  scala.collection.Seq<scala.Tuple3<TD, EI, scala.collection.Seq<scala.Tuple2<Q, A>>>> read ()  { throw new RuntimeException(); }
}
