
package org.apache.predictionio.tools.templates.itemrank.params.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class datasourceJson extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""{"""),format.raw/*1.2*/("""
  """),format.raw/*2.3*/(""""appId": 1,
  "actions": [
    "view",
    "like",
    "dislike",
    "conversion",
    "rate"
  ],
  "attributeNames": """),format.raw/*10.21*/("""{"""),format.raw/*10.22*/("""
    """),format.raw/*11.5*/(""""user" : "pio_user",
    "item" : "pio_item",
    "u2iActions": [
      "view",
      "like",
      "dislike",
      "conversion",
      "rate"
    ],
    "itypes" : "pio_itypes",
    "starttime" : "pio_starttime",
    "endtime" : "pio_endtime",
    "inactive" : "pio_inactive",
    "rating" : "pio_rating"
  """),format.raw/*25.3*/("""}"""),format.raw/*25.4*/("""
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object datasourceJson extends datasourceJson
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/itemrank/params/datasourceJson.scala.txt
                  HASH: b8b96ba6c5eb1ae0907655f78d0bfce711c85924
                  MATRIX: 471->0|498->1|527->4|675->124|704->125|736->130|1072->439|1100->440|1128->441|1156->442
                  LINES: 16->1|16->1|17->2|25->10|25->10|26->11|40->25|40->25|41->26|41->26
                  -- GENERATED --
              */
          