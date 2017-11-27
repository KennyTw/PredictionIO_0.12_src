
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class adminserver extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""(Experimental Only!) Usage: pio adminserver [--ip <value>] [--port <value>]

  --ip <value>
      IP to bind to. Default: localhost
  --port <value>
      Port to bind to. Default: 7071
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object adminserver extends adminserver
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/adminserver.scala.txt
                  HASH: c6653bd5d836fecc9e1a4c25f5138c26ac9ad4b3
                  MATRIX: 450->0
                  LINES: 16->1
                  -- GENERATED --
              */
          