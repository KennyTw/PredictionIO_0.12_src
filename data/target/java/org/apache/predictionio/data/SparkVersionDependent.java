package org.apache.predictionio.data;
public  class SparkVersionDependent {
  static public  org.apache.spark.sql.SparkSession sqlSession (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
}
