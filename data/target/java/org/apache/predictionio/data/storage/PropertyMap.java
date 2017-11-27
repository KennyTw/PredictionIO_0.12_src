package org.apache.predictionio.data.storage;
/** A PropertyMap stores aggregated properties of the entity.
 * Internally it is a Map
 * whose keys are property names and values are corresponding JSON values
 * respectively. Use the get() method to retrieve the value of mandatory
 * property or use getOpt() to retrieve the value of the optional property.
 * <p>
 * param:  fields Map of property name to JValue
 * param:  firstUpdated first updated time of this PropertyMap
 * param:  lastUpdated last updated time of this PropertyMap
 */
public  class PropertyMap extends org.apache.predictionio.data.storage.DataMap {
  /** Create an PropertyMap from a Map of String to JValue,
   * firstUpdated and lastUpdated time.
   * <p>
   * @param fields a Map of String to JValue
   * @param firstUpdated First updated time
   * @param lastUpdated Last updated time
   * @return a new PropertyMap
   */
  static public  org.apache.predictionio.data.storage.PropertyMap apply (scala.collection.immutable.Map<java.lang.String, org.json4s.JsonAST.JValue> fields, org.joda.time.DateTime firstUpdated, org.joda.time.DateTime lastUpdated)  { throw new RuntimeException(); }
  /** Create an PropertyMap from a JSON String and firstUpdated and lastUpdated
   * time.
   * @param js JSON String. eg """{ "a": 1, "b": "foo" }"""
   * @param firstUpdated First updated time
   * @param lastUpdated Last updated time
   * @return a new PropertyMap
   */
  static public  org.apache.predictionio.data.storage.PropertyMap apply (java.lang.String js, org.joda.time.DateTime firstUpdated, org.joda.time.DateTime lastUpdated)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, org.json4s.JsonAST.JValue> fields ()  { throw new RuntimeException(); }
  static public  void require (java.lang.String name)  { throw new RuntimeException(); }
  static public  boolean contains (java.lang.String name)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T get (java.lang.String name, scala.reflect.Manifest<T> evidence$1)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> scala.Option<T> getOpt (java.lang.String name, scala.reflect.Manifest<T> evidence$2)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T getOrElse (java.lang.String name, T default_, scala.reflect.Manifest<T> evidence$3)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T get (java.lang.String name, java.lang.Class<T> clazz)  { throw new RuntimeException(); }
  static public  java.util.List<java.lang.String> getStringList (java.lang.String name)  { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.DataMap $plus$plus (org.apache.predictionio.data.storage.DataMap that)  { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.DataMap $minus$minus (scala.collection.GenTraversableOnce<java.lang.String> that)  { throw new RuntimeException(); }
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<java.lang.String> keySet ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<scala.Tuple2<java.lang.String, org.json4s.JsonAST.JValue>> toList ()  { throw new RuntimeException(); }
  static public  org.json4s.JsonAST.JObject toJObject ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T extract (scala.reflect.Manifest<T> evidence$4)  { throw new RuntimeException(); }
  public  org.joda.time.DateTime firstUpdated ()  { throw new RuntimeException(); }
  public  org.joda.time.DateTime lastUpdated ()  { throw new RuntimeException(); }
  // not preceding
  public   PropertyMap (scala.collection.immutable.Map<java.lang.String, org.json4s.JsonAST.JValue> fields, org.joda.time.DateTime firstUpdated, org.joda.time.DateTime lastUpdated)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  boolean canEqual (Object other)  { throw new RuntimeException(); }
}
