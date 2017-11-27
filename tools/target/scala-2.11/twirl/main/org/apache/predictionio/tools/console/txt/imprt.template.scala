
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class imprt extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio import --appid <value> --input <value> [--channel <value>]

Imports all events from a file to an app. Each line of the file should be a JSON
object that represent a single event. If Hadoop configuration is present, the
file will be imported from HDFS instead of local filesystem.

  --appid <value>
      App ID of events to be imported.
  --channel <value>
      Channel Name (default if this is not specified)
  --input <value>
      Input path of the import file.
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object imprt extends imprt
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/imprt.scala.txt
                  HASH: 229d2eedebb9432badc18f3a7de23ef50860a0b3
                  MATRIX: 444->0
                  LINES: 16->1
                  -- GENERATED --
              */
          