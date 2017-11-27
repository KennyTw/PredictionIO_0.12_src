package org.apache.predictionio.controller;
/** :: Experimental ::
 * Workflow based on {@link FastEvalEngine}
 * <p>
 * @group Evaluation
 */
public  class FastEvalEngineWorkflow<TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> implements scala.Serializable {
  static public  class DataSourcePrefix implements scala.Product, scala.Serializable {
    public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams ()  { throw new RuntimeException(); }
    // not preceding
    public   DataSourcePrefix (scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams)  { throw new RuntimeException(); }
    public   DataSourcePrefix (org.apache.predictionio.controller.FastEvalEngineWorkflow.PreparatorPrefix pp)  { throw new RuntimeException(); }
    public   DataSourcePrefix (org.apache.predictionio.controller.FastEvalEngineWorkflow.AlgorithmsPrefix ap)  { throw new RuntimeException(); }
    public   DataSourcePrefix (org.apache.predictionio.controller.FastEvalEngineWorkflow.ServingPrefix sp)  { throw new RuntimeException(); }
  }
  static public  class DataSourcePrefix$ extends scala.runtime.AbstractFunction1<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>, org.apache.predictionio.controller.FastEvalEngineWorkflow.DataSourcePrefix> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DataSourcePrefix$ MODULE$ = null;
    public   DataSourcePrefix$ ()  { throw new RuntimeException(); }
  }
  static public  class PreparatorPrefix implements scala.Product, scala.Serializable {
    public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams ()  { throw new RuntimeException(); }
    public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> preparatorParams ()  { throw new RuntimeException(); }
    // not preceding
    public   PreparatorPrefix (scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> preparatorParams)  { throw new RuntimeException(); }
    public   PreparatorPrefix (org.apache.predictionio.controller.FastEvalEngineWorkflow.AlgorithmsPrefix ap)  { throw new RuntimeException(); }
  }
  static public  class PreparatorPrefix$ extends scala.runtime.AbstractFunction2<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>, org.apache.predictionio.controller.FastEvalEngineWorkflow.PreparatorPrefix> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PreparatorPrefix$ MODULE$ = null;
    public   PreparatorPrefix$ ()  { throw new RuntimeException(); }
  }
  static public  class AlgorithmsPrefix implements scala.Product, scala.Serializable {
    public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams ()  { throw new RuntimeException(); }
    public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> preparatorParams ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> algorithmParamsList ()  { throw new RuntimeException(); }
    // not preceding
    public   AlgorithmsPrefix (scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> preparatorParams, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> algorithmParamsList)  { throw new RuntimeException(); }
    public   AlgorithmsPrefix (org.apache.predictionio.controller.FastEvalEngineWorkflow.ServingPrefix sp)  { throw new RuntimeException(); }
  }
  static public  class AlgorithmsPrefix$ extends scala.runtime.AbstractFunction3<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>>, org.apache.predictionio.controller.FastEvalEngineWorkflow.AlgorithmsPrefix> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AlgorithmsPrefix$ MODULE$ = null;
    public   AlgorithmsPrefix$ ()  { throw new RuntimeException(); }
  }
  static public  class ServingPrefix implements scala.Product, scala.Serializable {
    public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams ()  { throw new RuntimeException(); }
    public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> preparatorParams ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> algorithmParamsList ()  { throw new RuntimeException(); }
    public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> servingParams ()  { throw new RuntimeException(); }
    // not preceding
    public   ServingPrefix (scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> preparatorParams, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> algorithmParamsList, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> servingParams)  { throw new RuntimeException(); }
    public   ServingPrefix (org.apache.predictionio.controller.EngineParams ep)  { throw new RuntimeException(); }
  }
  static public  class ServingPrefix$ extends scala.runtime.AbstractFunction4<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>>, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>, org.apache.predictionio.controller.FastEvalEngineWorkflow.ServingPrefix> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ServingPrefix$ MODULE$ = null;
    public   ServingPrefix$ ()  { throw new RuntimeException(); }
  }
  static public  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  static public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.immutable.Map<java.lang.Object, scala.Tuple3<TD, EI, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.Tuple2<Q, A>>>>> getDataSourceResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.DataSourcePrefix prefix)  { throw new RuntimeException(); }
  static public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.immutable.Map<java.lang.Object, PD> getPreparatorResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.PreparatorPrefix prefix)  { throw new RuntimeException(); }
  static public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.immutable.Map<java.lang.Object, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.collection.Seq<P>>>> computeAlgorithmsResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.AlgorithmsPrefix prefix)  { throw new RuntimeException(); }
  static public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.immutable.Map<java.lang.Object, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.collection.Seq<P>>>> getAlgorithmsResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.AlgorithmsPrefix prefix)  { throw new RuntimeException(); }
  static public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> getServingResult (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, org.apache.predictionio.controller.FastEvalEngineWorkflow.ServingPrefix prefix)  { throw new RuntimeException(); }
  static public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>>>> get (org.apache.predictionio.controller.FastEvalEngineWorkflow<TD, EI, PD, Q, P, A> workflow, scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList)  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.FastEvalEngine<TD, EI, PD, Q, P, A> engine ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.workflow.WorkflowParams workflowParams ()  { throw new RuntimeException(); }
  // not preceding
  public   FastEvalEngineWorkflow (org.apache.predictionio.controller.FastEvalEngine<TD, EI, PD, Q, P, A> engine, org.apache.spark.SparkContext sc, org.apache.predictionio.workflow.WorkflowParams workflowParams)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.predictionio.controller.FastEvalEngineWorkflow.DataSourcePrefix, scala.collection.immutable.Map<java.lang.Object, scala.Tuple3<TD, EI, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.Tuple2<Q, A>>>>>> dataSourceCache ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.predictionio.controller.FastEvalEngineWorkflow.PreparatorPrefix, scala.collection.immutable.Map<java.lang.Object, PD>> preparatorCache ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.predictionio.controller.FastEvalEngineWorkflow.AlgorithmsPrefix, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, scala.collection.Seq<P>>>>> algorithmsCache ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<org.apache.predictionio.controller.FastEvalEngineWorkflow.ServingPrefix, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>>> servingCache ()  { throw new RuntimeException(); }
}
