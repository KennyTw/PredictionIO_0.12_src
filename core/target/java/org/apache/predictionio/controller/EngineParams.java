package org.apache.predictionio.controller;
/** This class serves as a logical grouping of all required engine's parameters.
 * <p>
 * param:  dataSourceParams Data Source name-parameters tuple.
 * param:  preparatorParams Preparator name-parameters tuple.
 * param:  algorithmParamsList List of algorithm name-parameter pairs.
 * param:  servingParams Serving name-parameters tuple.
 * @group Engine
 */
public  class EngineParams implements scala.Serializable {
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
  static public  org.apache.predictionio.controller.EngineParams apply (java.lang.String dataSourceName, org.apache.predictionio.controller.Params dataSourceParams, java.lang.String preparatorName, org.apache.predictionio.controller.Params preparatorParams, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> algorithmParamsList, java.lang.String servingName, org.apache.predictionio.controller.Params servingParams)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> preparatorParams ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> algorithmParamsList ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> servingParams ()  { throw new RuntimeException(); }
  // not preceding
  public   EngineParams (scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> preparatorParams, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> algorithmParamsList, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> servingParams)  { throw new RuntimeException(); }
  /** Java-friendly constructor
   * <p>
   * @param dataSourceName Data Source name
   * @param dataSourceParams Data Source parameters
   * @param preparatorName Preparator name
   * @param preparatorParams Preparator parameters
   * @param algorithmParamsList Map of algorithm name-parameters
   * @param servingName Serving name
   * @param servingParams Serving parameters
   */
  public   EngineParams (java.lang.String dataSourceName, org.apache.predictionio.controller.Params dataSourceParams, java.lang.String preparatorName, org.apache.predictionio.controller.Params preparatorParams, java.util.Map<java.lang.String, ? extends org.apache.predictionio.controller.Params> algorithmParamsList, java.lang.String servingName, org.apache.predictionio.controller.Params servingParams)  { throw new RuntimeException(); }
  public  org.apache.predictionio.controller.EngineParams copy (scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> dataSourceParams, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> preparatorParams, scala.collection.Seq<scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params>> algorithmParamsList, scala.Tuple2<java.lang.String, org.apache.predictionio.controller.Params> servingParams)  { throw new RuntimeException(); }
}
