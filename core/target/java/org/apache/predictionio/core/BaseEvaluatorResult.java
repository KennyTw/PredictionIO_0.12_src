package org.apache.predictionio.core;
/** Base trait of evaluator result */
public  interface BaseEvaluatorResult extends scala.Serializable {
  /** A short description of the result */
  public  java.lang.String toOneLiner ()  ;
  /** HTML portion of the rendered evaluator results */
  public  java.lang.String toHTML ()  ;
  /** JSON portion of the rendered evaluator results */
  public  java.lang.String toJSON ()  ;
  /** :: Experimental ::
   * Indicate if this result is inserted into database
   * @return (undocumented)
   */
  public  boolean noSave ()  ;
}
