package org.apache.predictionio.tools.admin;
public  class CommandClient {
  public  org.apache.predictionio.data.storage.Apps appClient ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.AccessKeys accessKeyClient ()  { throw new RuntimeException(); }
  public  org.apache.predictionio.data.storage.LEvents eventClient ()  { throw new RuntimeException(); }
  // not preceding
  public   CommandClient (org.apache.predictionio.data.storage.Apps appClient, org.apache.predictionio.data.storage.AccessKeys accessKeyClient, org.apache.predictionio.data.storage.LEvents eventClient)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.predictionio.tools.admin.BaseResponse> futureAppNew (org.apache.predictionio.tools.admin.AppRequest req, scala.concurrent.ExecutionContext ec)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.predictionio.tools.admin.AppListResponse> futureAppList (scala.concurrent.ExecutionContext ec)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.predictionio.tools.admin.GeneralResponse> futureAppDataDelete (java.lang.String appName, scala.concurrent.ExecutionContext ec)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.predictionio.tools.admin.GeneralResponse> futureAppDelete (java.lang.String appName, scala.concurrent.ExecutionContext ec)  { throw new RuntimeException(); }
  public  scala.concurrent.Future<org.apache.predictionio.tools.admin.GeneralResponse> futureTrain (org.apache.predictionio.tools.admin.TrainRequest req, scala.concurrent.ExecutionContext ec)  { throw new RuntimeException(); }
}
