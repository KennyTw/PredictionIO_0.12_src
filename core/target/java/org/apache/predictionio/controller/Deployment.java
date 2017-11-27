package org.apache.predictionio.controller;
/** Defines a deployment that contains an {@link Engine}
 * <p>
 * @group Engine
 */
public  interface Deployment {
  public  org.apache.predictionio.core.BaseEngine<?, ?, ?, ?> _engine ()  ;
  public  boolean engineSet ()  ;
  /** Returns the {@link Engine} of this {@link Deployment} */
  public  org.apache.predictionio.core.BaseEngine<?, ?, ?, ?> apply ()  ;
  /** Returns the {@link Engine} contained in this {@link Deployment}. */
  public  org.apache.predictionio.core.BaseEngine<?, ?, ?, ?> engine ()  ;
}
