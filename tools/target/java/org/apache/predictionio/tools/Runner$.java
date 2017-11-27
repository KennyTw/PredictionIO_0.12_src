package org.apache.predictionio.tools;
public  class Runner$ implements org.apache.predictionio.tools.EitherLogging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Runner$ MODULE$ = null;
  public   Runner$ ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> envStringToMap (java.lang.String env)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> argumentValue (scala.collection.Seq<java.lang.String> arguments, java.lang.String argumentName)  { throw new RuntimeException(); }
  public  java.lang.String handleScratchFile (scala.Option<org.apache.hadoop.fs.FileSystem> fileSystem, scala.Option<java.net.URI> uri, java.io.File localFile)  { throw new RuntimeException(); }
  public  void cleanup (scala.Option<org.apache.hadoop.fs.FileSystem> fs, scala.Option<java.net.URI> uri)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> detectFilePaths (scala.Option<org.apache.hadoop.fs.FileSystem> fileSystem, scala.Option<java.net.URI> uri, scala.collection.Seq<java.lang.String> args)  { throw new RuntimeException(); }
  /** Group argument values by argument names
   * <p>
   * This only works with long argument names immediately followed by a value
   * <p>
   * Input:
   * Seq("--foo", "bar", "--flag", "--dead", "beef baz", "n00b", "--foo", "jeez")
   * <p>
   * Output:
   * Map("--foo" -> Seq("bar", "jeez"), "--dead"- > "beef baz")
   * <p>
   * @param arguments Sequence of argument names and values
   * @return A map with argument values keyed by the same argument name
   */
  public  scala.collection.immutable.Map<java.lang.String, scala.collection.Seq<java.lang.String>> groupByArgumentName (scala.collection.Seq<java.lang.String> arguments)  { throw new RuntimeException(); }
  /** Remove argument names and values
   * <p>
   * This only works with long argument names immediately followed by a value
   * <p>
   * Input:
   * Seq("--foo", "bar", "--flag", "--dead", "beef baz", "n00b", "--foo", "jeez")
   * Set("--flag", "--foo")
   * <p>
   * Output:
   * Seq("--flag", "--dead", "beef baz", "n00b")
   * <p>
   * @param arguments Sequence of argument names and values
   * @param remove Name of argument and associated values to remove
   * @return Sequence of argument names and values with targets removed
   */
  public  scala.collection.Seq<java.lang.String> removeArguments (scala.collection.Seq<java.lang.String> arguments, scala.collection.immutable.Set<java.lang.String> remove)  { throw new RuntimeException(); }
  /** Combine repeated arguments together
   * <p>
   * Input:
   * Seq("--foo", "bar", "--flag", "--dead", "beef baz", "n00b", "--foo", "jeez")
   * Map("--foo", (_ + _))
   * <p>
   * Output:
   * Seq("--flag", "--dead", "beef baz", "n00b", "--foo", "bar jeez")
   * <p>
   * @param arguments Sequence of argument names and values
   * @param combinators Map of argument name to combinator function
   * @return Sequence of argument names and values with specific argument values combined
   */
  public  scala.collection.Seq<java.lang.String> combineArguments (scala.collection.Seq<java.lang.String> arguments, scala.collection.immutable.Map<java.lang.String, scala.Function2<java.lang.String, java.lang.String, java.lang.String>> combinators)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, scala.Tuple2<scala.sys.process.Process, scala.Function0<scala.runtime.BoxedUnit>>> runOnSpark (java.lang.String resourceName, scala.collection.Seq<java.lang.String> classArgs, org.apache.predictionio.tools.SparkArgs sa, scala.collection.Seq<java.net.URI> extraJars, java.lang.String pioHome, boolean verbose)  { throw new RuntimeException(); }
}
