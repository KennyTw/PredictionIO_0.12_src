package org.apache.predictionio.controller;
/** Companion object for creating {@link EngineParams} instances.
 * <p>
 * @group Engine
 */
public  class EngineParams$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EngineParams$ MODULE$ = null;
  public   EngineParams$ ()  { throw new RuntimeException(); }
  /** Create EngineParams.
   * <p>
   * @param dataSourceName Data Source name
   * @param dataSourceParams Data Source parameters
   * @param preparatorName Preparator name
   * @param preparatorParams Preparator parameters
   * @param algorithmParamsList List of algorithm name-parameter pairs.
   * @param servingName Serving name
   * @param servingParams Serving parameters
   * @return (undocumented)
   */
  public  org.apache.predictionio.controller.EngineParams apply (java.lang.String dataSourceName, org.apache.predictionio.controller.Params dataSourceParams, java.lang.String preparatorName, org.apache.predictionio.controller.Params preparatorParams, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> algorithmParamsList, java.lang.String servingName, org.apache.predictionio.controller.Params servingParams)  { throw new RuntimeException(); }
}
