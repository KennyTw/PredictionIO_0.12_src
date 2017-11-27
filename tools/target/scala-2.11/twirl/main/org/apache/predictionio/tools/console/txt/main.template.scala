
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class main extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio <command> [options] <args>...

Options common to all commands:
  [--pio-home <value>] [--spark-home <value>] [--sbt <value>]
  [-ei <value>] [-ev <value>] [-ed <value>] [-v <value>]
  [-sk | --spark-kryo] [--verbose]
  [<args>] [-- [<args passed to Spark>] [-- [<args passed to runner]]]

  --sbt <value>
      Full path of sbt. Default: sbt
  -ei <value> | --engine-id <value>
      Specify an engine ID. Usually used by distributed deployment.
  -ev <value> | --engine-version <value>
      Specify an engine version. Usually used by distributed deployment.
  -ed <value> | --engine-dir <value>
      Specify path of engine directory to run build/train/deploy commands.
  -v <value> | --variant <value>
      Path to an engine variant JSON file. Default: engine.json
  -sk | --spark-kryo
      Shorthand for setting the spark.serializer property to
      org.apache.spark.serializer.KryoSerializer.
  --verbose
      Enable third-party informational messages.

Note that it is possible to supply pass-through arguments at the en
of the command by using a '--' separator, e.g.

  pio train -v my-variant -- --master spark://mycluster:7077

In the example above, the '--master' argument will be passed to the underlying
spark-submit command. Please refer to the usage section for each command for
more information.

The most commonly used pio commands are:
    status        Displays status information about PredictionIO
    version       Displays the version of this command line console
    template      Creates a new engine based on an engine template
    build         Build an engine at the current directory
    train         Kick off a training using an engine
    deploy        Deploy an engine as an engine server
    batchpredict  Process bulk predictions with an engine
    eventserver   Launch an Event Server
    app           Manage apps that are used by the Event Server
    accesskey     Manage app access keys
    export        Export events from the Event Server

The following are experimental development commands:
    run           Launch a driver program
    eval          Kick off an evaluation using an engine
    dashboard     Launch an evaluation dashboard
    adminserver   Launch an Admin Server

See 'pio help <command>' to read about a specific subcommand.
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object main extends main
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/main.scala.txt
                  HASH: b348626762aa4f04e985f794111e76a005ecb215
                  MATRIX: 443->0
                  LINES: 16->1
                  -- GENERATED --
              */
          