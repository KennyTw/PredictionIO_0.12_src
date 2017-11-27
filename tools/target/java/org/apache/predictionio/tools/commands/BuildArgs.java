package org.apache.predictionio.tools.commands;
public  class BuildArgs implements scala.Product, scala.Serializable {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  scala.Option<java.io.File> sbt ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> sbtExtra ()  { throw new RuntimeException(); }
  public  boolean sbtAssemblyPackageDependency ()  { throw new RuntimeException(); }
  public  boolean sbtClean ()  { throw new RuntimeException(); }
  public  boolean uberJar ()  { throw new RuntimeException(); }
  public  boolean forceGeneratePIOSbt ()  { throw new RuntimeException(); }
  // not preceding
  public   BuildArgs (scala.Option<java.io.File> sbt, scala.Option<java.lang.String> sbtExtra, boolean sbtAssemblyPackageDependency, boolean sbtClean, boolean uberJar, boolean forceGeneratePIOSbt)  { throw new RuntimeException(); }
}
