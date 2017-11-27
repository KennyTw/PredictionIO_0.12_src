
package org.apache.predictionio.tools.templates.scala.project.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class assemblySbt extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.11.2")
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object assemblySbt extends assemblySbt
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/scala/project/assemblySbt.scala.txt
                  HASH: 6e98be3a030e08a7fdd77afe47f92223d2336a03
                  MATRIX: 466->0
                  LINES: 16->1
                  -- GENERATED --
              */
          