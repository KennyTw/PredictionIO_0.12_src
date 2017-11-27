package org.apache.predictionio.controller;
/** If you intend to let PredictionIO create workflow and deploy serving
 * automatically, you will need to implement an object that extends this class
 * and return an {@link Engine}.
 * <p>
 * @group Engine
 */
public abstract class EngineFactory {
  public   EngineFactory ()  { throw new RuntimeException(); }
  /** Creates an instance of an {@link Engine}. */
  public abstract  org.apache.predictionio.core.BaseEngine<?, ?, ?, ?> apply ()  ;
  /** Override this method to programmatically return engine parameters. */
  public  org.apache.predictionio.controller.EngineParams engineParams (java.lang.String key)  { throw new RuntimeException(); }
}
