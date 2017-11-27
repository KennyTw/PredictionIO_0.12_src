package org.apache.predictionio.controller.java;
/** Define an engine parameter generator in Java
 * <p>
 * Implementations of this abstract class can be supplied to "pio eval" as the second
 * command line argument.
 * <p>
 * @group Evaluation
 */
public abstract class JavaEngineParamsGenerator implements org.apache.predictionio.controller.EngineParamsGenerator {
  public   JavaEngineParamsGenerator ()  { throw new RuntimeException(); }
  /** Set the list of {@link EngineParams}.
   * <p>
   * @param engineParams A list of engine params
   */
  public  void setEngineParamsList (java.util.List<? extends org.apache.predictionio.controller.EngineParams> engineParams)  { throw new RuntimeException(); }
}
