
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class deploy extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio deploy [--ip <value>] [--port <value>]
                  [--engine-instance-id <value>]
                  [--feedback] [--accesskey <value>]
                  [--event-server-ip <value>] [--event-server-port <value>]
                  [--batch <value>] [--scratch-uri <value>]

Deploy an engine instance as a prediction server. This command will pass all
pass-through arguments to its underlying spark-submit command.

  --ip <value>
      IP to bind to. Default: 0.0.0.0
  --port <value>
      Port to bind to. Default: 8000
  --engine-instance-id <value>
      Engine instance ID.
  --feedback
      Enable feedback loop to event server.
  --accesskey <value>
      Access key of the App where feedback data will be stored.
  --event-server-ip <value>
      Event server IP. Default: 0.0.0.0
  --event-server-port <value>
      Event server port. Default: 7070
  --batch <value>
      Batch label of the deployment.
  --scratch-uri
      URI of the working scratch space. Specify this when you want to have all
      necessary files transferred to a remote location. You will usually want to
      specify this when you use --deploy-mode cluster.
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object deploy extends deploy
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/deploy.scala.txt
                  HASH: 136b73a2458dc39b4b9321b3279e8ec3b43edf44
                  MATRIX: 445->0
                  LINES: 16->1
                  -- GENERATED --
              */
          