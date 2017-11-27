
package org.apache.predictionio.tools.templates.itemrank.params.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class preparatorJson extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""{"""),format.raw/*1.2*/("""
  """),format.raw/*2.3*/(""""actions": """),format.raw/*2.14*/("""{"""),format.raw/*2.15*/("""
    """),format.raw/*3.5*/(""""view": 3,
    "like": 5,
    "dislike": 1,
    "conversion": 4,
    "rate": null
  """),format.raw/*8.3*/("""}"""),format.raw/*8.4*/(""",
  "conflict": "latest"
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object preparatorJson extends preparatorJson
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/itemrank/params/preparatorJson.scala.txt
                  HASH: 7f29c5ed2e6691906acc7b23e1f819984a75b9d9
                  MATRIX: 471->0|498->1|527->4|565->15|593->16|624->21|734->105|761->106|813->131|841->132
                  LINES: 16->1|16->1|17->2|17->2|17->2|18->3|23->8|23->8|25->10|25->10
                  -- GENERATED --
              */
          