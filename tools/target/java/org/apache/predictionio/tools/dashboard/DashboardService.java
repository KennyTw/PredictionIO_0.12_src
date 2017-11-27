package org.apache.predictionio.tools.dashboard;
public  interface DashboardService extends spray.routing.HttpService, org.apache.predictionio.authentication.KeyAuthentication, org.apache.predictionio.tools.dashboard.CORSSupport {
  public  scala.concurrent.ExecutionContext executionContext ()  ;
  public  org.apache.predictionio.tools.dashboard.DashboardConfig dc ()  ;
  public  org.apache.predictionio.data.storage.EvaluationInstances evaluationInstances ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> pioEnvVars ()  ;
  public  org.joda.time.DateTime serverStartTime ()  ;
  public  scala.Function1<spray.routing.RequestContext, scala.runtime.BoxedUnit> dashboardRoute ()  ;
}
