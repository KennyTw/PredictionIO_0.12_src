
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class run extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio run [--sbt-extra <value>] [--clean] [--no-asm]
               [common options...] <main class>

Launch a driver program. This command will pass all pass-through arguments to
its underlying spark-submit command. In addition, it also supports a second
level of pass-through arguments to the driver program, e.g.

  pio run -- --master spark://localhost:7077 -- --driver-arg foo

  <main class>
      Main class name of the driver program.
  --sbt-extra <value>
      Extra command to pass to SBT when it builds your engine.
  --clean
      Clean build.
  --no-asm
      Skip building external dependencies assembly.
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object run extends run
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/run.scala.txt
                  HASH: 37324d2d6fbfbb2455d00be0490c64be27f87f6d
                  MATRIX: 442->0
                  LINES: 16->1
                  -- GENERATED --
              */
          