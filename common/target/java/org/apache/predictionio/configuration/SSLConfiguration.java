package org.apache.predictionio.configuration;
/**
 * Created by ykhodorkovsky on 2/26/16.
 */
public  interface SSLConfiguration {
  public  com.typesafe.config.Config serverConfig ()  ;
  public  java.lang.String keyStoreResource ()  ;
  public  java.lang.String password ()  ;
  public  java.lang.String keyAlias ()  ;
  public  java.security.KeyStore keyStore ()  ;
  public  javax.net.ssl.SSLContext sslContext ()  ;
  public  spray.io.ServerSSLEngineProvider sslEngineProvider ()  ;
}
