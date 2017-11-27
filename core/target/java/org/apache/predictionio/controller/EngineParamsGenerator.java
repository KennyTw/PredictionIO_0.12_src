package org.apache.predictionio.controller;
/** Defines an engine parameters generator.
 * <p>
 * Implementations of this trait can be supplied to "pio eval" as the second
 * command line argument.
 * <p>
 * @group Evaluation
 */
public  interface EngineParamsGenerator {
  public  scala.collection.Seq<org.apache.predictionio.controller.EngineParams> epList ()  ;
  public  boolean epListSet ()  ;
  /** Returns the list of {@link EngineParams} of this {@link EngineParamsGenerator}. */
  public  scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList ()  ;
}
