
package org.apache.predictionio.tools.templates.scala.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class buildSbt extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, pioVersion: String, sparkVersion: String):play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""
"""),format.raw/*2.1*/("""import AssemblyKeys._

assemblySettings

name := """"),_display_(/*6.11*/{name}),format.raw/*6.17*/(""""

organization := "myorg"

version := "0.0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.apache.predictionio"    %% "core"          % """"),_display_(/*13.55*/{pioVersion}),format.raw/*13.67*/("""" % "provided",
  "org.apache.spark" %% "spark-core"    % """"),_display_(/*14.45*/{sparkVersion}),format.raw/*14.59*/("""" % "provided")
"""))
      }
    }
  }

  def render(name:String,pioVersion:String,sparkVersion:String): play.twirl.api.TxtFormat.Appendable = apply(name,pioVersion,sparkVersion)

  def f:((String,String,String) => play.twirl.api.TxtFormat.Appendable) = (name,pioVersion,sparkVersion) => apply(name,pioVersion,sparkVersion)

  def ref: this.type = this

}



/**/
object buildSbt extends buildSbt
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/scala/buildSbt.scala.txt
                  HASH: 8dcf89dd3e5e207ccade8604474f2bbc4d37e600
                  MATRIX: 388->1|538->57|565->58|642->109|668->115|835->255|868->267|955->327|990->341
                  LINES: 11->1|16->1|17->2|21->6|21->6|28->13|28->13|29->14|29->14
                  -- GENERATED --
              */
          