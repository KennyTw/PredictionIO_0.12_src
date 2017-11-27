package org.apache.predictionio.data.storage;
/** Backend-agnostic data storage layer with lazy initialization. Use this
 * object when you need to interface with Event Store in your engine.
 * <p>
 * @group Storage System
 */
public  class Storage {
  static private  class ClientMeta implements scala.Product, scala.Serializable {
    public  java.lang.String sourceType ()  { throw new RuntimeException(); }
    public  org.apache.predictionio.data.storage.BaseStorageClient client ()  { throw new RuntimeException(); }
    public  org.apache.predictionio.data.storage.StorageClientConfig config ()  { throw new RuntimeException(); }
    // not preceding
    public   ClientMeta (java.lang.String sourceType, org.apache.predictionio.data.storage.BaseStorageClient client, org.apache.predictionio.data.storage.StorageClientConfig config)  { throw new RuntimeException(); }
  }
  static private  class ClientMeta$ extends scala.runtime.AbstractFunction3<java.lang.String, org.apache.predictionio.data.storage.BaseStorageClient, org.apache.predictionio.data.storage.StorageClientConfig, org.apache.predictionio.data.storage.Storage.ClientMeta> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ClientMeta$ MODULE$ = null;
    public   ClientMeta$ ()  { throw new RuntimeException(); }
  }
  static private  class DataObjectMeta implements scala.Product, scala.Serializable {
    public  java.lang.String sourceName ()  { throw new RuntimeException(); }
    public  java.lang.String namespace ()  { throw new RuntimeException(); }
    // not preceding
    public   DataObjectMeta (java.lang.String sourceName, java.lang.String namespace)  { throw new RuntimeException(); }
  }
  static private  class DataObjectMeta$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.predictionio.data.storage.Storage.DataObjectMeta> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DataObjectMeta$ MODULE$ = null;
    public   DataObjectMeta$ ()  { throw new RuntimeException(); }
  }
  static public  org.apache.predictionio.data.storage.EnvironmentService environmentService ()  { throw new RuntimeException(); }
  static private  int errors ()  { throw new RuntimeException(); }
  static private  java.lang.String sourcesPrefix ()  { throw new RuntimeException(); }
  static private  scala.util.matching.Regex sourceTypesRegex ()  { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> sourceKeys ()  { throw new RuntimeException(); }
  static private  scala.collection.mutable.Map<java.lang.String, scala.Option<org.apache.predictionio.data.storage.Storage.ClientMeta>> s2cm ()  { throw new RuntimeException(); }
  /** Reference to the app data repository. */
  static private  java.lang.String EventDataRepository ()  { throw new RuntimeException(); }
  static private  java.lang.String ModelDataRepository ()  { throw new RuntimeException(); }
  static private  java.lang.String MetaDataRepository ()  { throw new RuntimeException(); }
  static private  java.lang.String repositoriesPrefix ()  { throw new RuntimeException(); }
  static private  scala.util.matching.Regex repositoryNamesRegex ()  { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> repositoryKeys ()  { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.String> requiredRepositories ()  { throw new RuntimeException(); }
  static private  scala.collection.immutable.Map<java.lang.String, org.apache.predictionio.data.storage.Storage.DataObjectMeta> repositoriesToDataObjectMeta ()  { throw new RuntimeException(); }
  static private  java.lang.String prefixPath (java.lang.String prefix, java.lang.String body)  { throw new RuntimeException(); }
  static private  java.lang.String sourcesPrefixPath (java.lang.String body)  { throw new RuntimeException(); }
  static private  java.lang.String repositoriesPrefixPath (java.lang.String body)  { throw new RuntimeException(); }
  static private  scala.Option<org.apache.predictionio.data.storage.Storage.ClientMeta> sourcesToClientMeta (java.lang.String source, boolean parallel, boolean test)  { throw new RuntimeException(); }
  static private  org.apache.predictionio.data.storage.BaseStorageClient getClient (org.apache.predictionio.data.storage.StorageClientConfig clientConfig, java.lang.String pkg)  { throw new RuntimeException(); }
  /** Get the StorageClient config data from PIO Framework's environment variables */
  static public  scala.Option<org.apache.predictionio.data.storage.StorageClientConfig> getConfig (java.lang.String sourceName)  { throw new RuntimeException(); }
  static private  scala.Option<org.apache.predictionio.data.storage.Storage.ClientMeta> updateS2CM (java.lang.String k, boolean parallel, boolean test)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T getDataObjectFromRepo (java.lang.String repo, boolean test, scala.reflect.api.TypeTags.TypeTag<T> tag)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T getPDataObject (java.lang.String repo, scala.reflect.api.TypeTags.TypeTag<T> tag)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T getDataObject (java.lang.String sourceName, java.lang.String namespace, boolean parallel, boolean test, scala.reflect.api.TypeTags.TypeTag<T> tag)  { throw new RuntimeException(); }
  static private <T extends java.lang.Object> T getPDataObject (java.lang.String sourceName, java.lang.String databaseName, scala.reflect.api.TypeTags.TypeTag<T> tag)  { throw new RuntimeException(); }
  static private  scala.collection.Seq<java.lang.Object> dataObjectCtorArgs (org.apache.predictionio.data.storage.BaseStorageClient client, java.lang.String namespace)  { throw new RuntimeException(); }
  static public  void verifyAllDataObjects ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Get a data access object for {@link EngineInstances}
   * <p>
   * @return An implementation of {@link EngineInstances}, depending on the runtime configuration
   */
  static public  org.apache.predictionio.data.storage.EngineInstances getMetaDataEngineInstances ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Get a data access object for {@link EvaluationInstances}
   * <p>
   * @return An implementation of {@link EvaluationInstances}, depending on the runtime configuration
   */
  static public  org.apache.predictionio.data.storage.EvaluationInstances getMetaDataEvaluationInstances ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Get a data access object for {@link Apps}
   * <p>
   * @return An implementation of {@link Apps}, depending on the runtime configuration
   */
  static public  org.apache.predictionio.data.storage.Apps getMetaDataApps ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Get a data access object for {@link AccessKeys}
   * <p>
   * @return An implementation of {@link AccessKeys}, depending on the runtime configuration
   */
  static public  org.apache.predictionio.data.storage.AccessKeys getMetaDataAccessKeys ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Get a data access object for {@link Channels}
   * <p>
   * @return An implementation of {@link Channels}, depending on the runtime configuration
   */
  static public  org.apache.predictionio.data.storage.Channels getMetaDataChannels ()  { throw new RuntimeException(); }
  /** :: DeveloperApi ::
   * Get a data access object for {@link Models}
   * <p>
   * @return An implementation of {@link Models}, depending on the runtime configuration
   */
  static public  org.apache.predictionio.data.storage.Models getModelDataModels ()  { throw new RuntimeException(); }
  /** Obtains a data access object that returns {@link Event} related local data
   * structure.
   * @param test (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.predictionio.data.storage.LEvents getLEvents (boolean test)  { throw new RuntimeException(); }
  /** Obtains a data access object that returns {@link Event} related RDD data
   * structure.
   * @return (undocumented)
   */
  static public  org.apache.predictionio.data.storage.PEvents getPEvents ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Map<java.lang.String, java.lang.String>>> config ()  { throw new RuntimeException(); }
  static protected  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  static protected  java.lang.String loggerName ()  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void trace (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void trace (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isDebugEnabled ()  { throw new RuntimeException(); }
  static protected  void debug (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void debug (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isErrorEnabled ()  { throw new RuntimeException(); }
  static protected  void error (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void error (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isInfoEnabled ()  { throw new RuntimeException(); }
  static protected  void info (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void info (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isWarnEnabled ()  { throw new RuntimeException(); }
  static protected  void warn (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void warn (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
}
