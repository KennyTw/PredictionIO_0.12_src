package org.apache.predictionio.core;
/** :: DeveloperApi ::
 * Base trait with default custom query serializer, exposed to engine developer
 * via {@link org.apache.predictionio.controller.CustomQuerySerializer}
 */
public  interface BaseQuerySerializer {
  /** :: DeveloperApi ::
   * Serializer for Scala query classes using
   * {@link org.apache.predictionio.controller.Utils.json4sDefaultFormats}
   * @return (undocumented)
   */
  public  org.json4s.Formats querySerializer ()  ;
  /** :: DeveloperApi ::
   * Serializer for Java query classes using Gson
   * @return (undocumented)
   */
  public  scala.collection.Seq<com.google.gson.TypeAdapterFactory> gsonTypeAdapterFactories ()  ;
}
