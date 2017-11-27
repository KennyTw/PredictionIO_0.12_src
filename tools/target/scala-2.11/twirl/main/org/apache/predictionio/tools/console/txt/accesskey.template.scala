
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class accesskey extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio accesskey new [--key] <app name> [<event1> <event2>...]

Add allowed event(s) to an access key.

  --key <value>
      Specify a custom key.
  <app name>
      App to be associated with the new access key.
  <event1> <event2>...
      Allowed event name(s) to be added to the access key.

Usage: pio accesskey list [<app name>]

  <app name>
      App name.

Usage: pio accesskey delete <access key>

  <access key>
      The access key to be deleted.
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object accesskey extends accesskey
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/accesskey.scala.txt
                  HASH: f85d506a666c511e60941fb560e46a5966289890
                  MATRIX: 448->0
                  LINES: 16->1
                  -- GENERATED --
              */
          