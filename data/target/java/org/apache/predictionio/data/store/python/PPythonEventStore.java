package org.apache.predictionio.data.store.python;
/** This object provides a set of operation to access Event Store
 * with Spark's parallelization
 */
public  class PPythonEventStore {
  /** Read events from Event Store
   * <p>
   * @param appName          return events of this app
   * @param channelName      return events of this channel (default channel if it's None)
   * @param startTime        return events with eventTime >= startTime
   * @param untilTime        return events with eventTime < untilTime
   * @param entityType       return events of this entityType
   * @param entityId         return events of this entityId
   * @param eventNames       return events with any of these event names.
   * @param targetEntityType return events of this targetEntityType:
   *   - None means no restriction on targetEntityType
   *   - Some(None) means no targetEntityType for this event
   *   - Some(Some(x)) means targetEntityType should match x.
   * @param targetEntityId   return events of this targetEntityId
   *   - None means no restriction on targetEntityId
   *   - Some(None) means no targetEntityId for this event
   *   - Some(Some(x)) means targetEntityId should match x.
   * @param spark            Spark context
   * @return DataFrame
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> find (java.lang.String appName, java.lang.String channelName, java.sql.Timestamp startTime, java.sql.Timestamp untilTime, java.lang.String entityType, java.lang.String entityId, java.lang.String[] eventNames, java.lang.String targetEntityType, java.lang.String targetEntityId, org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  /** Aggregate properties of entities based on these special events:
   * \$set, \$unset, \$delete events.
   * <p>
   * @param appName     use events of this app
   * @param entityType  aggregate properties of the entities of this entityType
   * @param channelName use events of this channel (default channel if it's None)
   * @param startTime   use events with eventTime >= startTime
   * @param untilTime   use events with eventTime < untilTime
   * @param required    only keep entities with these required properties defined
   * @param spark       Spark session
   * @return DataFrame  DataFrame of entityId and PropetyMap pair
   */
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> aggregateProperties (java.lang.String appName, java.lang.String entityType, java.lang.String channelName, java.sql.Timestamp startTime, java.sql.Timestamp untilTime, java.lang.String[] required, org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
}
