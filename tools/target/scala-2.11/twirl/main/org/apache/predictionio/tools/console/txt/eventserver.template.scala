
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class eventserver extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio eventserver [--ip <value>] [--port <value>] [--stats]

  --ip <value>
      IP to bind to. Default: 0.0.0.0
  --port <value>
      Port to bind to. Default: 7070
  --stats
      Enable Event Server internal statistics and its API endpoint.
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object eventserver extends eventserver
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/eventserver.scala.txt
                  HASH: 357d8989325d2cd218c44e8466120c8f653e45bc
                  MATRIX: 450->0
                  LINES: 16->1
                  -- GENERATED --
              */
          