
package org.apache.predictionio.tools.templates.itemrank.params.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class algorithmsJson extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""[
  """),format.raw/*2.3*/("""{"""),format.raw/*2.4*/("""
    """),format.raw/*3.5*/(""""name": "mahoutItemBased",
    "params": """),format.raw/*4.15*/("""{"""),format.raw/*4.16*/("""
      """),format.raw/*5.7*/(""""booleanData": true,
      "itemSimilarity": "LogLikelihoodSimilarity",
      "weighted": false,
      "nearestN": 10,
      "threshold": 4.9E-324,
      "numSimilarItems": 50,
      "numUserActions": 50,
      "freshness" : 0,
      "freshnessTimeUnit" : 86400
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""
  """),format.raw/*15.3*/("""}"""),format.raw/*15.4*/("""
"""),format.raw/*16.1*/("""]
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object algorithmsJson extends algorithmsJson
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/itemrank/params/algorithmsJson.scala.txt
                  HASH: 6fa4528ba81a48f3ce078116e3b15f8f62733692
                  MATRIX: 471->0|501->4|528->5|559->10|627->51|655->52|688->59|981->325|1009->326|1039->329|1067->330|1095->331
                  LINES: 16->1|17->2|17->2|18->3|19->4|19->4|20->5|29->14|29->14|30->15|30->15|31->16
                  -- GENERATED --
              */
          