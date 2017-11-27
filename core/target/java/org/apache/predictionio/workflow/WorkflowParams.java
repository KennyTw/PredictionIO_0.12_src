package org.apache.predictionio.workflow;
/** Workflow parameters.
 * <p>
 * param:  batch Batch label of the run.
 * param:  verbose Verbosity level.
 * param:  saveModel Controls whether trained models are persisted.
 * param:  sparkEnv Spark properties that will be set in SparkConf.setAll().
 * param:  skipSanityCheck Skips all data sanity check.
 * param:  stopAfterRead Stops workflow after reading from data source.
 * param:  stopAfterPrepare Stops workflow after data preparation.
 * @group Workflow
 */
public  class WorkflowParams implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  java.lang.String batch ()  { throw new RuntimeException(); }
  public  int verbose ()  { throw new RuntimeException(); }
  public  boolean saveModel ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkEnv ()  { throw new RuntimeException(); }
  public  boolean skipSanityCheck ()  { throw new RuntimeException(); }
  public  boolean stopAfterRead ()  { throw new RuntimeException(); }
  public  boolean stopAfterPrepare ()  { throw new RuntimeException(); }
  // not preceding
  public   WorkflowParams (java.lang.String batch, int verbose, boolean saveModel, scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkEnv, boolean skipSanityCheck, boolean stopAfterRead, boolean stopAfterPrepare)  { throw new RuntimeException(); }
  public   WorkflowParams (java.lang.String batch, int verbose, boolean saveModel)  { throw new RuntimeException(); }
}
