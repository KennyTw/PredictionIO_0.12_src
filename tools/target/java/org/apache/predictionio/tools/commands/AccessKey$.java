package org.apache.predictionio.tools.commands;
public  class AccessKey$ implements org.apache.predictionio.tools.EitherLogging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AccessKey$ MODULE$ = null;
  public   AccessKey$ ()  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.data.storage.AccessKey> create (java.lang.String appName, java.lang.String key, scala.collection.Seq<java.lang.String> events)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, scala.collection.Seq<org.apache.predictionio.data.storage.AccessKey>> list (scala.Option<java.lang.String> app)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> delete (java.lang.String key)  { throw new RuntimeException(); }
}
