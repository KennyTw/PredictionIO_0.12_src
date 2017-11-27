
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class upgrade extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio upgrade <from version> <to version> <old App ID> <new app ID>

No longer supported!
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object upgrade extends upgrade
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/upgrade.scala.txt
                  HASH: f65ee7ec8102d743b0764a2738f5096b208a8260
                  MATRIX: 446->0
                  LINES: 16->1
                  -- GENERATED --
              */
          