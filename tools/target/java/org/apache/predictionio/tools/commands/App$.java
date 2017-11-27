package org.apache.predictionio.tools.commands;
public  class App$ implements org.apache.predictionio.tools.EitherLogging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final App$ MODULE$ = null;
  public   App$ ()  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.commands.AppDescription> create (java.lang.String name, scala.Option<java.lang.Object> id, scala.Option<java.lang.String> description, java.lang.String accessKey)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.predictionio.tools.commands.AppDescription> list ()  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, scala.Tuple2<org.apache.predictionio.tools.commands.AppDescription, scala.collection.Seq<org.apache.predictionio.data.storage.Channel>>> show (java.lang.String appName)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> delete (java.lang.String name)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> dataDelete (java.lang.String name, scala.Option<java.lang.String> channel, boolean all)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.data.storage.Channel> channelNew (java.lang.String appName, java.lang.String newChannel)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.ReturnTypes.Ok> channelDelete (java.lang.String appName, java.lang.String deleteChannel)  { throw new RuntimeException(); }
}
