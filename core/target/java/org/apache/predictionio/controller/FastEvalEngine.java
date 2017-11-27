package org.apache.predictionio.controller;
/** :: Experimental ::
 * FastEvalEngine is a subclass of {@link Engine} that exploits the immutability of
 * controllers to optimize the evaluation process
 * <p>
 * @group Evaluation
 */
public  class FastEvalEngine<TD extends java.lang.Object, EI extends java.lang.Object, PD extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> extends org.apache.predictionio.controller.Engine<TD, EI, PD, Q, P, A> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   FastEvalEngine (scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseDataSource<TD, EI, Q, A>>> dataSourceClassMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BasePreparator<TD, PD>>> preparatorClassMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseAlgorithm<PD, ?, Q, P>>> algorithmClassMap, scala.collection.immutable.Map<java.lang.String, java.lang.Class<? extends org.apache.predictionio.core.BaseServing<Q, P>>> servingClassMap)  { throw new RuntimeException(); }
  public  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> eval (org.apache.spark.SparkContext sc, org.apache.predictionio.controller.EngineParams engineParams, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<org.apache.predictionio.controller.EngineParams, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>>>> batchEval (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.predictionio.controller.EngineParams> engineParamsList, org.apache.predictionio.workflow.WorkflowParams params)  { throw new RuntimeException(); }
}
