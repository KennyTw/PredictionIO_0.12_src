package org.apache.predictionio.controller;
/** Extends a data class with this trait if you want PredictionIO to
 * automatically perform sanity check on your data classes during training.
 * This is very useful when you need to debug your engine.
 * <p>
 * @group Helper
 */
public  interface SanityCheck {
  /** Implement this method to perform checks on your data. This method should
   * contain assertions that throw exceptions when your data does not meet
   * your pre-defined requirement.
   */
  public  void sanityCheck ()  ;
}
