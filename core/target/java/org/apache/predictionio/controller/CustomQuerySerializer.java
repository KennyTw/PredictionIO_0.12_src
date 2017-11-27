package org.apache.predictionio.controller;
/** If your query class cannot be automatically serialized/deserialized to/from
 * JSON, implement a trait by extending this trait, and overriding the
 * <code>querySerializer</code> member with your
 * {@link https://github.com/json4s/json4s#serializing-non-supported-types custom JSON4S serializer}.
 * Algorithm and serving classes using your query class would only need to mix
 * in the trait to enable the custom serializer.
 * <p>
 * @group Helper
 */
public  interface CustomQuerySerializer extends org.apache.predictionio.core.BaseQuerySerializer {
}
