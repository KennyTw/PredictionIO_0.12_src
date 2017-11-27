package org.apache.predictionio.controller;
/** Mix in this trait for queries that contain prId (PredictedResultId).
 * This is useful when your engine expects queries to also be associated with
 * prId keys when feedback loop is enabled.
 * <p>
 * @group Helper
 *
 * @deprecated To be removed in future releases. Since 0.9.2. 
*/
public  interface WithPrId {
  public  java.lang.String prId ()  ;
}
