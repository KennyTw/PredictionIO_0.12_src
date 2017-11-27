
package org.apache.predictionio.tools.templates.scala.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class engineJson extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template2[String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, engineFactory: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""
  """),format.raw/*3.3*/(""""id": "default",
  "description": """"),_display_(/*4.20*/{name}),format.raw/*4.26*/("""",
  "engineFactory": """"),_display_(/*5.22*/{engineFactory}),format.raw/*5.37*/("""",
  "datasource": """),format.raw/*6.17*/("""{"""),format.raw/*6.18*/("""
    """),format.raw/*7.5*/(""""multiplier": 2
  """),format.raw/*8.3*/("""}"""),format.raw/*8.4*/("""
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(name:String,engineFactory:String): play.twirl.api.TxtFormat.Appendable = apply(name,engineFactory)

  def f:((String,String) => play.twirl.api.TxtFormat.Appendable) = (name,engineFactory) => apply(name,engineFactory)

  def ref: this.type = this

}



/**/
object engineJson extends engineJson
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/scala/engineJson.scala.txt
                  HASH: 2093bc321605799ef9a1af2e60cddf84b9a7898c
                  MATRIX: 383->1|514->38|541->39|568->40|597->43|659->79|685->85|735->109|770->124|816->143|844->144|875->149|919->167|946->168|973->169|1000->170
                  LINES: 11->1|16->1|17->2|17->2|18->3|19->4|19->4|20->5|20->5|21->6|21->6|22->7|23->8|23->8|24->9|24->9
                  -- GENERATED --
              */
          