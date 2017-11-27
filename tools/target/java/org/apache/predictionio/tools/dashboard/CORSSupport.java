package org.apache.predictionio.tools.dashboard;
public  interface CORSSupport {
  public  spray.http.HttpHeaders.Access$minusControl$minusAllow$minusOrigin allowOriginHeader ()  ;
  public  scala.collection.immutable.List<spray.http.HttpHeaders.ModeledHeader> optionsCorsHeaders ()  ;
  public <T extends java.lang.Object> spray.routing.Directive<shapeless.HNil> cors ()  ;
  public  spray.routing.StandardRoute timeoutRoute ()  ;
}
