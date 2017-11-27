package org.apache.predictionio.tools.commands;
public  class Management$ implements org.apache.predictionio.tools.EitherLogging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Management$ MODULE$ = null;
  public   Management$ ()  { throw new RuntimeException(); }
  public  java.lang.String version ()  { throw new RuntimeException(); }
  /** Starts a dashboard server and returns immediately
   * <p>
   * @param da An instance of {@link DashboardArgs}
   * @return An instance of {@link ActorSystem} in which the server is being executed
   */
  public  akka.actor.ActorSystem dashboard (org.apache.predictionio.tools.commands.DashboardArgs da)  { throw new RuntimeException(); }
  /** Starts an eventserver server and returns immediately
   * <p>
   * @param ea An instance of {@link EventServerArgs}
   * @return An instance of {@link ActorSystem} in which the server is being executed
   */
  public  akka.actor.ActorSystem eventserver (org.apache.predictionio.tools.EventServerArgs ea)  { throw new RuntimeException(); }
  /** Starts an adminserver server and returns immediately
   * <p>
   * @param aa An instance of {@link AdminServerArgs}
   * @return An instance of {@link ActorSystem} in which the server is being executed
   */
  public  akka.actor.ActorSystem adminserver (org.apache.predictionio.tools.commands.AdminServerArgs aa)  { throw new RuntimeException(); }
  private  java.lang.String stripMarginAndNewlines (java.lang.String string)  { throw new RuntimeException(); }
  public  scala.util.Either<java.lang.String, org.apache.predictionio.tools.commands.PioStatus> status (scala.Option<java.lang.String> pioHome, scala.Option<java.lang.String> sparkHome)  { throw new RuntimeException(); }
}
