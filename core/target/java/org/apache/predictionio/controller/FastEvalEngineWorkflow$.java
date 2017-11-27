package org.apache.predictionio.controller;
/** :: Experimental ::
 * Workflow based on {@link FastEvalEngine}
 * <p>
 * @group Evaluation
 */
public  class FastEvalEngineWorkflow$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FastEvalEngineWorkflow$ MODULE$ = null;
  public   FastEvalEngineWorkflow$ ()  { throw new RuntimeException(); }
  public  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.immutable.Map<java.lang.Object, scala.Tuple3<TD, EI, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.Tuple2<Q, A>>>>> getDataSourceResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.DataSourcePrefix prefix)  { throw new RuntimeException(); }
  public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.immutable.Map<java.lang.Object, PD> getPreparatorResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.PreparatorPrefix prefix)  { throw new RuntimeException(); }
  public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.immutable.Map<java.lang.Object, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.collection.Seq<P>>>> computeAlgorithmsResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.AlgorithmsPrefix prefix)  { throw new RuntimeException(); }
  public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.immutable.Map<java.lang.Object, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.collection.Seq<P>>>> getAlgorithmsResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.AlgorithmsPrefix prefix)  { throw new RuntimeException(); }
  public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> getServingResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.ServingPrefix prefix)  { throw new RuntimeException(); }
  public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>>>> get (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList)  { throw new RuntimeException(); }
}
