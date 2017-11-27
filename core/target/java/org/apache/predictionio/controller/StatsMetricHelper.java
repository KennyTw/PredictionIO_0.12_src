package org.apache.predictionio.controller;
public  interface StatsMetricHelper<EI extends java.lang.Object, Q extends java.lang.Object, P extends java.lang.Object, A extends java.lang.Object> {
  public  double calculate (Q q, P p, A a)  ;
  public  org.apache.spark.util.StatCounter calculateStats (org.apache.spark.SparkContext sc, scala.collection.Seq<scala.Tuple2<EI, org.apache.spark.rdd.RDD<scala.Tuple3<Q, P, A>>>> evalDataSet)  ;
}
