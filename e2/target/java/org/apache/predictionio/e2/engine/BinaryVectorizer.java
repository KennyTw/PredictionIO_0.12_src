package org.apache.predictionio.e2.engine;
public  class BinaryVectorizer implements scala.Serializable {
  static public  org.apache.predictionio.e2.engine.BinaryVectorizer apply (org.apache.spark.rdd.RDD<scala.collection.immutable.HashMap<java.lang.String, java.lang.String>> input, scala.collection.immutable.HashSet<java.lang.String> properties)  { throw new RuntimeException(); }
  static public  org.apache.predictionio.e2.engine.BinaryVectorizer apply (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> input)  { throw new RuntimeException(); }
  public   BinaryVectorizer (scala.collection.immutable.HashMap<scala.Tuple2<java.lang.String, java.lang.String>, java.lang.Object> propertyMap)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.String>[] properties ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector toBinary (scala.Tuple2<java.lang.String, java.lang.String>[] map)  { throw new RuntimeException(); }
}
