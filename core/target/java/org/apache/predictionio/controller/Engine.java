package org.apache.predictionio.controller;
/** This class chains up the entire data process. PredictionIO uses this
 * information to create workflows and deployments. In Scala, you should
 * implement an object that extends the {@link EngineFactory} trait similar to the
 * following example.
 * <p>
 * <pre><code>
 * object ItemRankEngine extends EngineFactory {
 *   def apply() = {
 *     new Engine(
 *       classOf[ItemRankDataSource],
 *       classOf[ItemRankPreparator],
 *       Map(
 *         "knn" -&gt; classOf[KNNAlgorithm],
 *         "rand" -&gt; classOf[RandomAlgorithm],
 *         "mahoutItemBased" -&gt; classOf[MahoutItemBasedAlgorithm]),
 *       classOf[ItemRankServing])
 *   }
 * }
 * </code></pre>
 * <p>
 * @see EngineFactory
 * @tparam TD Training data class.
 * @tparam EI Evaluation info class.
 * @tparam PD Prepared data class.
 * @tparam Q Input query class.
 * @tparam P Output prediction class.
 * @tparam A Actual value class.
 * param:  dataSourceClassMap Map of data source names to class.
 * param:  preparatorClassMap Map of preparator names to class.
 * param:  algorithmClassMap Map of algorithm names to classes.
 * param:  servingClassMap Map of serving names to class.
 * @group Engine
 */
public  class Engine<TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.core.BaseEngine<EI, Q, P, A> {
  /** Helper class to accept either a single data source, or a map of data
   * sources, with a companion object providing implicit conversions, so
   * using this class directly is not necessary.
   * <p>
   * @tparam TD Training data class
   * @tparam EI Evaluation information class
   * @tparam Q Input query class
   * @tparam A Actual result class
   */
  static public  class DataSourceMap<TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, A extends java.lang.Object> {
    public  scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>>> m ()  { throw new RuntimeException(); }
    // not preceding
    public   DataSourceMap (scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>>> m)  { throw new RuntimeException(); }
    public   DataSourceMap (java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>> c)  { throw new RuntimeException(); }
  }
  /** Companion object providing implicit conversions, so using this directly
   * is not necessary.
   */
  static public  class DataSourceMap$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DataSourceMap$ MODULE$ = null;
    public   DataSourceMap$ ()  { throw new RuntimeException(); }
    public <TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, A extends java.lang.Object> org.apache.predictionio.controller.Engine.DataSourceMap<TD, EI, Q, A> cToMap (java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>> c)  { throw new RuntimeException(); }
    public <TD extends java.lang.Object, EI extends java.lang.Object, Q extends java.lang.Object, A extends java.lang.Object> org.apache.predictionio.controller.Engine.DataSourceMap<TD, EI, Q, A> mToMap (scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>>> m)  { throw new RuntimeException(); }
  }
  /** Helper class to accept either a single preparator, or a map of
   * preparators, with a companion object providing implicit conversions, so
   * using this class directly is not necessary.
   * <p>
   * @tparam TD Training data class
   * @tparam PD Prepared data class
   */
  static public  class PreparatorMap<TD extends java.lang.Object, PD extends java.lang.Object> {
    public  scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>>> m ()  { throw new RuntimeException(); }
    // not preceding
    public   PreparatorMap (scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>>> m)  { throw new RuntimeException(); }
    public   PreparatorMap (java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>> c)  { throw new RuntimeException(); }
  }
  /** Companion object providing implicit conversions, so using this directly
   * is not necessary.
   */
  static public  class PreparatorMap$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PreparatorMap$ MODULE$ = null;
    public   PreparatorMap$ ()  { throw new RuntimeException(); }
    public <TD extends java.lang.Object, PD extends java.lang.Object> org.apache.predictionio.controller.Engine.PreparatorMap<TD, PD> cToMap (java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>> c)  { throw new RuntimeException(); }
    public <TD extends java.lang.Object, PD extends java.lang.Object> org.apache.predictionio.controller.Engine.PreparatorMap<TD, PD> mToMap (scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>>> m)  { throw new RuntimeException(); }
  }
  /** Helper class to accept either a single serving, or a map of serving, with
   * a companion object providing implicit conversions, so using this class
   * directly is not necessary.
   * <p>
   * @tparam Q Input query class
   * @tparam P Predicted result class
   */
  static public  class ServingMap<Q extends java.lang.Object, P extends java.lang.Object> {
    public  scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>>> m ()  { throw new RuntimeException(); }
    // not preceding
    public   ServingMap (scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>>> m)  { throw new RuntimeException(); }
    public   ServingMap (java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>> c)  { throw new RuntimeException(); }
  }
  /** Companion object providing implicit conversions, so using this directly
   * is not necessary.
   */
  static public  class ServingMap$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ServingMap$ MODULE$ = null;
    public   ServingMap$ ()  { throw new RuntimeException(); }
    public <Q extends java.lang.Object, P extends java.lang.Object> org.apache.predictionio.controller.Engine.ServingMap<Q, P> cToMap (java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>> c)  { throw new RuntimeException(); }
    public <Q extends java.lang.Object, P extends java.lang.Object> org.apache.predictionio.controller.Engine.ServingMap<Q, P> mToMap (scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>>> m)  { throw new RuntimeException(); }
  }
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
  static public <TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> org.apache.predictionio.controller.Engine<TD, EI, PD, Q, P, A> apply (org.apache.predictionio.controller.Engine.DataSourceMap<TD, EI, Q, A> dataSourceMap, org.apache.predictionio.controller.Engine.PreparatorMap<TD, PD> preparatorMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, P>>> algorithmClassMap, org.apache.predictionio.controller.Engine.ServingMap<Q, P> servingMap)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>>>> batchEval (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>>> dataSourceClassMap ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>>> preparatorClassMap ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, P>>> algorithmClassMap ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>>> servingClassMap ()  { throw new RuntimeException(); }
  // not preceding
  public   Engine (scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>>> dataSourceClassMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>>> preparatorClassMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, P>>> algorithmClassMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>>> servingClassMap)  { throw new RuntimeException(); }
  public  org.json4s.Formats formats ()  { throw new RuntimeException(); }
  protected  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  /** This auxiliary constructor is provided for backward compatibility.
   * <p>
   * @param dataSourceClass Data source class.
   * @param preparatorClass Preparator class.
   * @param algorithmClassMap Map of algorithm names to classes.
   * @param servingClass Serving class.
   */
  public   Engine (java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>> dataSourceClass, java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>> preparatorClass, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, P>>> algorithmClassMap, java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>> servingClass)  { throw new RuntimeException(); }
  /** Java-friendly constructor
   * <p>
   * @param dataSourceClass Data source class.
   * @param preparatorClass Preparator class.
   * @param algorithmClassMap Map of algorithm names to classes.
   * @param servingClass Serving class.
   */
  public   Engine (java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>> dataSourceClass, java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>> preparatorClass, java.util.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, P>>> algorithmClassMap, java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>> servingClass)  { throw new RuntimeException(); }
  /** Returns a new Engine instance, mimicking case class's copy method behavior.
   * @param dataSourceClassMap (undocumented)
   * @param preparatorClassMap (undocumented)
   * @param algorithmClassMap (undocumented)
   * @param servingClassMap (undocumented)
   * @return (undocumented)
   */
  public  org.apache.predictionio.controller.Engine<TD, EI, PD, Q, P, A> copy (scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>>> dataSourceClassMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>>> preparatorClassMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, P>>> algorithmClassMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>>> servingClassMap)  { throw new RuntimeException(); }
  /** Training this engine would return a list of models.
   * <p>
   * @param sc An instance of SparkContext.
   * @param engineParams An instance of {@link EngineParams} for running a single training.
   * @param params An instance of {@link WorkflowParams} that controls the workflow.
   * @return A list of models.
   * @param engineInstanceId (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> train (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.EngineParams engineParams, java.lang.String engineInstanceId, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  /** Algorithm models can be persisted before deploy. However, it is also
   * possible that models are not persisted. This method retrains non-persisted
   * models and return a list of models that can be used directly in deploy.
   * @param sc (undocumented)
   * @param engineParams (undocumented)
   * @param engineInstanceId (undocumented)
   * @param persistedModels (undocumented)
   * @param params (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.Object> prepareDeploy (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.EngineParams engineParams, java.lang.String engineInstanceId, scala.collection.Seq<java.lang.Object> persistedModels, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  /** Extract model for persistent layer.
   * <p>
   * PredictionIO presist models for future use. It allows custom
   * implementation for persisting models. You need to implement the
   * {@link org.apache.predictionio.controller.PersistentModel} interface. This method
   * traverses all models in the workflow. If the model is a
   * {@link org.apache.predictionio.controller.PersistentModel}, it calls the save method
   * for custom persistence logic.
   * <p>
   * For model doesn't support custom logic, PredictionIO serializes the whole
   * model if the corresponding algorithm is local. On the other hand, if the
   * model is parallel (i.e. model associated with a number of huge RDDS), this
   * method return Unit, in which case PredictionIO will retrain the whole
   * model from scratch next time it is used.
   * @param sc (undocumented)
   * @param engineInstanceId (undocumented)
   * @param algoTuples (undocumented)
   * @return (undocumented)
   */
  private  scala.collection.Seq<java.lang.Object> makeSerializableModels (org.apache.spark.SparkContext sc, java.lang.String engineInstanceId, scala.collection.Seq<scala.Tuple4<java.lang.String, org.apache.predictionio.controller.Params, org.apache.predictionio.core.BaseAlgorithm<?, ?, ?, ?>, java.lang.Object>> algoTuples)  { throw new RuntimeException(); }
  /** This is implemented such that {@link org.apache.predictionio.controller.Evaluation} can
   * use this method to generate inputs for {@link org.apache.predictionio.controller.Metric}.
   * <p>
   * @param sc An instance of SparkContext.
   * @param engineParams An instance of {@link EngineParams} for running a single evaluation.
   * @param params An instance of {@link WorkflowParams} that controls the workflow.
   * @return A list of evaluation information and RDD of query, predicted
   *         result, and actual result tuple tuple.
   */
  public  scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> eval (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.EngineParams engineParams, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.EngineParams jValueToEngineParams (org.json4s.JsonAST.JValue variantJson, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.EngineParams engineInstanceToEngineParams (org.apache.predictionio.data.storage.EngineInstance engineInstance, scala.Enumeration.Value jsonExtractor)  { throw new RuntimeException(); }
}
