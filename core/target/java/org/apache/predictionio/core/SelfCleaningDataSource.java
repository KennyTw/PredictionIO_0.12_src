package org.apache.predictionio.core;
/** :: DeveloperApi ::
 * Base class of cleaned data source.
 * <p>
 * A cleaned data source consists tools for cleaning events that happened earlier that
 * specified duration in seconds from train moment. Also it can remove duplicates and compress
 * properties(flat set/unset events to one)
 * <p>
 */
public  interface SelfCleaningDataSource {
  public  class DateTimeOrdering implements scala.math.Ordering<org.joda.time.DateTime> {
    public   DateTimeOrdering ()  { throw new RuntimeException(); }
    public  int compare (org.joda.time.DateTime d1, org.joda.time.DateTime d2)  { throw new RuntimeException(); }
  }
  public  org.apache.predictionio.core.SelfCleaningDataSource.DateTimeOrdering$ DateTimeOrdering ()  ;
  public  org.apache.predictionio.data.storage.PEvents pEventsDb ()  ;
  public  org.apache.predictionio.data.storage.LEvents lEventsDb ()  ;
  /** :: DeveloperApi ::
   * Current App name which events will be cleaned.
   * <p>
   * @return App name
   */
  public  java.lang.String appName ()  ;
  /** :: DeveloperApi ::
   * Param list that used for cleanup.
   * <p>
   * @return current event windows that will be used to clean up events.
   */
  public  scala.Option<org.apache.predictionio.core.EventWindow> eventWindow ()  ;
  public  grizzled.slf4j.Logger logger ()  ;
  /** :: DeveloperApi ::
   * <p>
   * Returns RDD of events happend after duration in event window params.
   * <p>
   * @return RDD[Event] most recent PEvents.
   * @param pEvents (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> getCleanedPEvents (org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> pEvents)  ;
  /** :: DeveloperApi ::
   * <p>
   * Returns Iterator of events happend after duration in event window params.
   * <p>
   * @return Iterator[Event] most recent LEvents.
   * @param lEvents (undocumented)
   */
  public  scala.collection.Iterable<org.apache.predictionio.data.storage.Event> getCleanedLEvents (scala.collection.Iterable<org.apache.predictionio.data.storage.Event> lEvents)  ;
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> compressPProperties (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> rdd)  ;
  public  scala.collection.Iterable<org.apache.predictionio.data.storage.Event> compressLProperties (scala.collection.Iterable<org.apache.predictionio.data.storage.Event> events)  ;
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> removePDuplicates (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> rdd)  ;
  public  org.apache.predictionio.data.storage.Event recreateEvent (org.apache.predictionio.data.storage.Event x, scala.Option<java.lang.String> eventId, org.joda.time.DateTime creationTime)  ;
  public  scala.collection.Iterable<org.apache.predictionio.data.storage.Event> removeLDuplicates (scala.collection.Iterable<org.apache.predictionio.data.storage.Event> ls)  ;
  /** :: DeveloperApi ::
   * <p>
   * Filters most recent, compress properties and removes duplicates of PEvents
   * <p>
   * @return RDD[Event] most recent PEvents
   * @param sc (undocumented)
   */
  public  void cleanPersistedPEvents (org.apache.spark.SparkContext sc)  ;
  /** Replace events in Event Store */
  public  void wipePEvents (org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> newEvents, org.apache.spark.rdd.RDD<java.lang.String> eventsToRemove, org.apache.spark.SparkContext sc)  ;
  public  void removeEvents (scala.collection.immutable.Set<java.lang.String> eventsToRemove, int appId)  ;
  public  void removePEvents (org.apache.spark.rdd.RDD<java.lang.String> eventsToRemove, int appId, org.apache.spark.SparkContext sc)  ;
  /** Replace events in Event Store
   * <p>
   * @param newEvents new events
   * @param eventsToRemove event ids to remove
   */
  public  void wipe (scala.collection.immutable.Set<org.apache.predictionio.data.storage.Event> newEvents, scala.collection.immutable.Set<java.lang.String> eventsToRemove)  ;
  /** :: DeveloperApi ::
   * <p>
   * Filters most recent, compress properties of PEvents
   * @param sc (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.predictionio.data.storage.Event> cleanPEvents (org.apache.spark.SparkContext sc)  ;
  /** :: DeveloperApi ::
   * <p>
   * Filters most recent, compress properties and removes duplicates of LEvents
   * <p>
   * @return Iterator[Event] most recent LEvents
   */
  public  void cleanPersistedLEvents ()  ;
  /** :: DeveloperApi ::
   * <p>
   * Filters most recent, compress properties of LEvents
   * @return (undocumented)
   */
  public  scala.collection.Iterable<org.apache.predictionio.data.storage.Event> cleanLEvents ()  ;
  public  boolean isSetEvent (org.apache.predictionio.data.storage.Event e)  ;
  public  org.apache.predictionio.data.storage.Event compress (scala.collection.Iterable<org.apache.predictionio.data.storage.Event> events)  ;
}
