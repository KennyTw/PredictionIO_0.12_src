package org.apache.predictionio.tools.admin;
public  class AdminServiceActor extends spray.routing.HttpServiceActor {
  public  org.apache.predictionio.tools.admin.CommandClient commandClient ()  { throw new RuntimeException(); }
  // not preceding
  public   AdminServiceActor (org.apache.predictionio.tools.admin.CommandClient commandClient)  { throw new RuntimeException(); }
  public  class Json4sProtocol implements spray.httpx.Json4sSupport {
    public   Json4sProtocol ()  { throw new RuntimeException(); }
    public  org.json4s.Formats json4sFormats ()  { throw new RuntimeException(); }
  }
  public  org.apache.predictionio.tools.admin.AdminServiceActor.Json4sProtocol$ Json4sProtocol ()  { throw new RuntimeException(); }
  public  akka.event.LoggingAdapter log ()  { throw new RuntimeException(); }
  public  scala.concurrent.ExecutionContext executionContext ()  { throw new RuntimeException(); }
  public  akka.util.Timeout timeout ()  { throw new RuntimeException(); }
  public  spray.routing.RejectionHandler rejectionHandler ()  { throw new RuntimeException(); }
  public  scala.util.matching.Regex jsonPath ()  { throw new RuntimeException(); }
  public  scala.Function1<spray.routing.RequestContext, scala.runtime.BoxedUnit> route ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
}
