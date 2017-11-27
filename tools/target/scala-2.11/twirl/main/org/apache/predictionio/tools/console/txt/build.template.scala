
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class build extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio build [--sbt-extra <value>] [--clean] [--no-asm]
                 [common options...]
                 
Build an engine at the current directory.

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
object build extends build
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/build.scala.txt
                  HASH: 7e87a216bccace26e61cc78b04329e7d7ef8516f
                  MATRIX: 444->0
                  LINES: 16->1
                  -- GENERATED --
              */
          