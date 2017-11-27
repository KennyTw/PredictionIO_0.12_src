package org.apache.predictionio.workflow;
public  class BatchPredict {
  static public  class KryoInstantiator extends com.twitter.chill.ScalaKryoInstantiator {
    public   KryoInstantiator (java.lang.ClassLoader classLoader)  { throw new RuntimeException(); }
    public  com.twitter.chill.KryoBase newKryo ()  { throw new RuntimeException(); }
  }
  static public  class KryoInstantiator$ implements java.io.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final KryoInstantiator$ MODULE$ = null;
    public   KryoInstantiator$ ()  { throw new RuntimeException(); }
    public  com.twitter.bijection.Injection<java.lang.Object, byte[]> newKryoInjection ()  { throw new RuntimeException(); }
  }
  static public  org.apache.predictionio.data.storage.EngineInstances engineInstances ()  { throw new RuntimeException(); }
  static public  org.apache.predictionio.data.storage.Models modeldata ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  org.apache.predictionio.controller.Engine<?, ?, ?, ?, ?, ?> getEngine (org.apache.predictionio.data.storage.EngineInstance engineInstance)  { throw new RuntimeException(); }
  static public <Q extends java.lang.Object, P extends java.lang.Object> void run (org.apache.predictionio.workflow.BatchPredictConfig config, org.apache.predictionio.data.storage.EngineInstance engineInstance, org.apache.predictionio.controller.Engine<?, ?, ?, Q, P, ?> engine)  { throw new RuntimeException(); }
  static protected  grizzled.slf4j.Logger logger ()  { throw new RuntimeException(); }
  static protected  java.lang.String loggerName ()  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void trace (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void trace (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isDebugEnabled ()  { throw new RuntimeException(); }
  static protected  void debug (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void debug (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isErrorEnabled ()  { throw new RuntimeException(); }
  static protected  void error (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void error (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isInfoEnabled ()  { throw new RuntimeException(); }
  static protected  void info (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void info (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
  static protected  boolean isWarnEnabled ()  { throw new RuntimeException(); }
  static protected  void warn (scala.Function0<java.lang.Object> msg)  { throw new RuntimeException(); }
  static protected  void warn (scala.Function0<java.lang.Object> msg, scala.Function0<java.lang.Throwable> t)  { throw new RuntimeException(); }
}
