
package org.apache.predictionio.tools.templates.scala.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class manifestJson extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, version: String, name: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*2.1*/("""{"""),format.raw/*2.2*/("""
  """),format.raw/*3.3*/(""""id": """"),_display_(/*3.11*/{id}),format.raw/*3.15*/("""",
  "version": """"),_display_(/*4.16*/{version}),format.raw/*4.25*/("""",
  "name": """"),_display_(/*5.13*/{name}),format.raw/*5.19*/("""",
  "description": """"),_display_(/*6.20*/{name}),format.raw/*6.26*/(""""
  "engineFactory": "",
  "files": []
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(id:String,version:String,name:String): play.twirl.api.TxtFormat.Appendable = apply(id,version,name)

  def f:((String,String,String) => play.twirl.api.TxtFormat.Appendable) = (id,version,name) => apply(id,version,name)

  def ref: this.type = this

}



/**/
object manifestJson extends manifestJson
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/scala/manifestJson.scala.txt
                  HASH: 6c018f50d135315eff4269168d13cfc7c89e3331
                  MATRIX: 392->1|529->44|556->45|583->46|612->49|646->57|670->61|714->79|743->88|784->103|810->109|858->131|884->137|949->176|976->177
                  LINES: 11->1|16->1|17->2|17->2|18->3|18->3|18->3|19->4|19->4|20->5|20->5|21->6|21->6|24->9|24->9
                  -- GENERATED --
              */
          