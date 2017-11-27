
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class eval extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio eval <evaluation-class> <engine-parameters-generator-class>
                [--batch <value>]
                [common options...]

Kick off an evaluation using specified evaluation and engine parameters
generator class. This command will pass all pass-through arguments to its
underlying spark-submit command.

  --batch <value>
      Batch label of the run.
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object eval extends eval
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/eval.scala.txt
                  HASH: 6fa74ccb6468a705ce718944fdda95f107492da5
                  MATRIX: 443->0
                  LINES: 16->1
                  -- GENERATED --
              */
          