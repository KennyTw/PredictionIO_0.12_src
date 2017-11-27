
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class batchpredict extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio batchpredict [--input <value>]
                        [--output <value>]
                        [--query-partitions <value>]
                        [--engine-instance-id <value>]

Use an engine instance to process batch predictions. This command will pass all
pass-through arguments to its underlying spark-submit command. All algorithm
classes used in the engine must be serializable.

  --input <value>
      Path to file containing queries; a multi-object JSON file with one
      query object per line. Accepts any valid Hadoop file URL.
      Default: batchpredict-input.json
  --output <value>
      Path to file to receive results; a multi-object JSON file with one
      object per line, the prediction + original query. Accepts any
      valid Hadoop file URL. Actual output will be written as Hadoop
      partition files in a directory with the output name.
      Default: batchpredict-output.json
  --query-partitions <value>
      Limit concurrency of predictions by setting the number of partitions
      used internally for the RDD of queries.
      Default: number created by Spark context's `textFile`
  --engine-instance-id <value>
      Engine instance ID. Default: the latest trained instance.
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object batchpredict extends batchpredict
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/batchpredict.scala.txt
                  HASH: 40081dc0b31a2fdcbca5f4ea70adcaf026075ce9
                  MATRIX: 451->0
                  LINES: 16->1
                  -- GENERATED --
              */
          