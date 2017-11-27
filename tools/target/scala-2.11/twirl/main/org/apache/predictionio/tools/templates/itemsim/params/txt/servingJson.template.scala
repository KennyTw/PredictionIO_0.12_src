
package org.apache.predictionio.tools.templates.itemsim.params.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class servingJson extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""{"""),format.raw/*1.2*/("""}"""),format.raw/*1.3*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object servingJson extends servingJson
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/itemsim/params/servingJson.scala.txt
                  HASH: 5f36b2ea290645ee34d943220a14b54ee5ea5be5
                  MATRIX: 467->0|494->1|521->2
                  LINES: 16->1|16->1|16->1
                  -- GENERATED --
              */
          