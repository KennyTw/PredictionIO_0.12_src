package org.apache.predictionio.data.storage.s3;
public  class S3Models implements org.apache.predictionio.data.storage.Models, grizzled.slf4j.Logging {
  public   S3Models (com.amazonaws.services.s3.AmazonS3 s3Client, org.apache.predictionio.data.storage.StorageClientConfig config, java.lang.String prefix)  { throw new RuntimeException(); }
  public  void insert (org.apache.predictionio.data.storage.Model i)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.Model> get (java.lang.String id)  { throw new RuntimeException(); }
  public  void delete (java.lang.String id)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.predictionio.data.storage.Model> doAction (java.lang.String id, scala.Function2<java.lang.String, java.lang.String, scala.Option<org.apache.predictionio.data.storage.Model>> action)  { throw new RuntimeException(); }
}
