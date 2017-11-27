
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class export extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio export --appid <value> --output <value> [--format <value>] [--channel <value>]

Exports all events of an app to a file. If Hadoop configuration is present, the
file will be exported to HDFS instead of local filesystem.

  --appid <value>
      App ID of events to be exported.
  --channel <value>
      Channel Name (default if this is not specified)
  --output <value>
      Output path of the exported file.
  --format <value>
      The format of the exported file. Valid values are "json" and "parquet".
      The default format is "json".
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object export extends export
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/export.scala.txt
                  HASH: 79f617fc7871edc25d6f968ab667851f1c50125e
                  MATRIX: 445->0
                  LINES: 16->1
                  -- GENERATED --
              */
          