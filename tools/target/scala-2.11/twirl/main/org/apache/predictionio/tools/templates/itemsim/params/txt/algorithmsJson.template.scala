
package org.apache.predictionio.tools.templates.itemsim.params.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class algorithmsJson extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""[
  """),format.raw/*2.3*/("""{"""),format.raw/*2.4*/("""
    """),format.raw/*3.5*/(""""name": "ncMahoutItemBased",
    "params": """),format.raw/*4.15*/("""{"""),format.raw/*4.16*/("""
      """),format.raw/*5.7*/(""""booleanData": true,
      "itemSimilarity": "LogLikelihoodSimilarity",
      "weighted": false,
      "threshold": 4.9E-324,
      "freshness" : 0,
      "freshnessTimeUnit" : 86400
    """),format.raw/*11.5*/("""}"""),format.raw/*11.6*/("""
  """),format.raw/*12.3*/("""}"""),format.raw/*12.4*/("""
"""),format.raw/*13.1*/("""]
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
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/itemsim/params/algorithmsJson.scala.txt
                  HASH: 29b8d224705cf3aac398dc943bc154972140b1b7
                  MATRIX: 470->0|500->4|527->5|558->10|628->53|656->54|689->61|903->248|931->249|961->252|989->253|1017->254
                  LINES: 16->1|17->2|17->2|18->3|19->4|19->4|20->5|26->11|26->11|27->12|27->12|28->13
                  -- GENERATED --
              */
          