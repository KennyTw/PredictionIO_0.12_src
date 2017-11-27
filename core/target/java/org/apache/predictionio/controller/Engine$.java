package org.apache.predictionio.controller;
/** This object contains concrete implementation for some methods of the
 * {@link Engine} class.
 * <p>
 * @group Engine
 */
public  class Engine$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Engine$ MODULE$ = null;
  public   Engine$ ()  { throw new RuntimeException(); }
  private  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  /** Convenient method for returning an instance of {@link Engine}.
   * <p>
   * @param dataSourceMap Accepts either an instance of Class of the data
   *                      source, or a Map of data source classes (implicitly
   *                      converted to {@link DataSourceMap}.
   * @param preparatorMap Accepts either an instance of Class of the
   *                      preparator, or a Map of preparator classes
   *                      (implicitly converted to {@link PreparatorMap}.
   * @param algorithmClassMap Accepts a Map of algorithm classes.
   * @param servingMap Accepts either an instance of Class of the serving, or
   *                   a Map of serving classes (implicitly converted to
   *                   {@link ServingMap}.
   * @tparam TD Training data class
   * @tparam EI Evaluation information class
   * @tparam PD Prepared data class
   * @tparam Q Input query class
   * @tparam P Predicted result class
   * @tparam A Actual result class
   * @return An instance of {@link Engine}
   */
  public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> org.apache.predictionio.controller.Engine<TD, EI, PD, Q, P, A> apply (org.apache.predictionio.controller.Engine.DataSourceMap<TD, EI, Q, A> dataSourceMap, org.apache.predictionio.controller.Engine.PreparatorMap<TD, PD> preparatorMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, P>>> algorithmClassMap, org.apache.predictionio.controller.Engine.ServingMap<Q, P> servingMap)  { throw new RuntimeException(); }
  /** Provides concrete implementation of training for {@link Engine}.
   * <p>
   * @param sc An instance of SparkContext
   * @param dataSource An instance of data source
   * @param preparator An instance of preparator
   * @param algorithmList A list of algorithm instances
   * @param params An instance of {@link WorkflowParams} that controls the training
   *               process.
   * @tparam TD Training data class
   * @tparam PD Prepared data class
   * @tparam Q Input query class
   * @return A list of trained models
   */
  public <TD extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object> scala.collection.Seq<java.lang.Object> train (org.apache.spark.SparkContext sc, org.apache.predictionio.core.BaseDataSource<TD, ?, Q, ?> dataSource, org.apache.predictionio.core.BasePreparator<TD, PD> preparator, scala.collection.Seq<org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, ?>> algorithmList, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  /** Provides concrete implementation of evaluation for {@link Engine}.
   * <p>
   * @param sc An instance of SparkContext
   * @param dataSource An instance of data source
   * @param preparator An instance of preparator
   * @param algorithmList A list of algorithm instances
   * @param serving An instance of serving
   * @tparam TD Training data class
   * @tparam PD Prepared data class
   * @tparam Q Input query class
   * @tparam P Predicted result class
   * @tparam A Actual result class
   * @tparam EI Evaluation information class
   * @return A list of evaluation information, RDD of query, predicted result,
   *         and actual result tuple tuple.
   */
  public <TD extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object, EI extends java.lang.Object> scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> eval (org.apache.spark.SparkContext sc, org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A> dataSource, org.apache.predictionio.core.BasePreparator<TD, PD> preparator, scala.collection.Seq<org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, P>> algorithmList, org.apache.predictionio.core.BaseServing<Q, P> serving)  { throw new RuntimeException(); }
}
