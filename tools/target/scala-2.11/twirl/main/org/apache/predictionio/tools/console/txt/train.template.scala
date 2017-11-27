
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class train extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio train [--batch <value>] [--skip-sanity-check]
                 [--stop-after-read] [--stop-after-prepare]
                 [--engine-factory <value>] [--engine-params-key <value>]
                 [--scratch-uri <value>]
                 [common options...]

Kick off a training using an engine (variant) to produce an engine instance.
This command will pass all pass-through arguments to its underlying spark-submit
command.

  --batch <value>
      Batch label of the run.
  --skip-sanity-check
      Disable all data sanity check. Useful for speeding up training in
      production.
  --stop-after-read
      Stop the training process after DataSource.read(). Useful for debugging.
  --stop-after-prepare
      Stop the training process after Preparator.prepare(). Useful for
      debugging.
  --engine-factory
      Override engine factory class.
  --engine-params-key
      Retrieve engine parameters programmatically from the engine factory class.
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
object train extends train
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/train.scala.txt
                  HASH: 777b9f175682dcbd5b5fac6b386d398c23c72e3a
                  MATRIX: 444->0
                  LINES: 16->1
                  -- GENERATED --
              */
          