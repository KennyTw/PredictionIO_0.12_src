
package org.apache.predictionio.workflow.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import org.apache.predictionio.data.storage.EngineInstance
import org.apache.predictionio.workflow.ServerConfig
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template15[ServerConfig,EngineInstance,Seq[String],Seq[String],Seq[String],String,String,String,DateTime,Boolean,String,Int,Int,Double,Double,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(args: ServerConfig,
  engineInstance: EngineInstance,
  algorithms: Seq[String],
  algorithmsParams: Seq[String],
  models: Seq[String],
  dataSourceParams: String,
  preparatorParams: String,
  servingParams: String,
  serverStartTime: DateTime,
  feedback: Boolean,
  eventServerIp: String,
  eventServerPort: Int,
  requestCount: Int,
  avgServingSec: Double,
  lastServingSec: Double
  ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*20.4*/("""
"""),format.raw/*21.1*/("""<!DOCTYPE html>
<!--
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
-->
<html lang="en">
  <head>
    <title>"""),_display_(/*40.13*/{engineInstance.engineFactory}),format.raw/*40.43*/(""" """),format.raw/*40.44*/("""("""),_display_(/*40.46*/{engineInstance.engineVariant}),format.raw/*40.76*/(""") - PredictionIO Engine Server at """),_display_(/*40.111*/{args.ip}),format.raw/*40.120*/(""":"""),_display_(/*40.122*/{args.port}),format.raw/*40.133*/("""</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <style type="text/css">
      td """),format.raw/*43.10*/("""{"""),format.raw/*43.11*/(""" """),format.raw/*43.12*/("""font-family: Menlo, Monaco, Consolas, "Courier New", monospace; """),format.raw/*43.76*/("""}"""),format.raw/*43.77*/("""
    """),format.raw/*44.5*/("""</style>
  </head>
  <body>
    <div class="container">
      <div class="page-header">
        <h1>PredictionIO Engine Server at """),_display_(/*49.44*/{args.ip}),format.raw/*49.53*/(""":"""),_display_(/*49.55*/{args.port}),format.raw/*49.66*/("""</h1>
        <p class="lead">"""),_display_(/*50.26*/{engineInstance.engineFactory}),format.raw/*50.56*/(""" """),format.raw/*50.57*/("""("""),_display_(/*50.59*/{engineInstance.engineVariant}),format.raw/*50.89*/(""")</p>
      </div>
      <h2>Engine Information</h2>
      <table class="table table-bordered table-striped">
        <tr><th>Training Start Time</th><td>"""),_display_(/*54.46*/{DateTimeFormat.forStyle("FF").print(engineInstance.startTime)}),format.raw/*54.109*/("""</td></tr>
        <tr><th>Training End Time</th><td>"""),_display_(/*55.44*/{DateTimeFormat.forStyle("FF").print(engineInstance.endTime)}),format.raw/*55.105*/("""</td></tr>
        <tr><th>Variant ID</th><td>"""),_display_(/*56.37*/{engineInstance.engineVariant}),format.raw/*56.67*/("""</td></tr>
        <tr><th>Instance ID</th><td>"""),_display_(/*57.38*/{engineInstance.id}),format.raw/*57.57*/("""</td></tr>
      </table>
      <h2>Server Information</h2>
      <table class="table table-bordered table-striped">
        <tr><th>Start Time</th><td>"""),_display_(/*61.37*/{DateTimeFormat.forStyle("FF").print(serverStartTime)}),format.raw/*61.91*/("""</td></tr>
        <tr><th>Request Count</th><td>"""),_display_(/*62.40*/{requestCount}),format.raw/*62.54*/("""</td></tr>
        <tr><th>Average Serving Time</th><td>"""),_display_(/*63.47*/{f"${avgServingSec}%.4f"}),format.raw/*63.72*/(""" """),format.raw/*63.73*/("""seconds</td></tr>
        <tr><th>Last Serving Time</th><td>"""),_display_(/*64.44*/{f"${lastServingSec}%.4f"}),format.raw/*64.70*/(""" """),format.raw/*64.71*/("""seconds</td></tr>
        <tr><th>Engine Factory Class (Scala/Java)</th><td>"""),_display_(/*65.60*/{engineInstance.engineFactory}),format.raw/*65.90*/("""</td></tr>
      </table>
      <h2>Data Source</h2>
      <table class="table table-bordered table-striped">
        <tr><th>Parameters</th><td>"""),_display_(/*69.37*/{dataSourceParams}),format.raw/*69.55*/("""</td></tr>
      </table>
      <h2>Data Preparator</h2>
      <table class="table table-bordered table-striped">
        <tr><th>Parameters</th><td>"""),_display_(/*73.37*/{preparatorParams}),format.raw/*73.55*/("""</td></tr>
      </table>
      <h2>Algorithms and Models</h2>
        <table class="table table-bordered table-striped">
          <tr><th>#</th><th colspan="2">Information</th></tr>
          """),_display_(/*78.12*/for((((algo, param), model), i) <- algorithms.zip(algorithmsParams).zip(models).zipWithIndex) yield /*78.105*/ {_display_(Seq[Any](format.raw/*78.107*/("""
            """),format.raw/*79.13*/("""<tr>
              <th rowspan="3">"""),_display_(/*80.32*/{i + 1}),format.raw/*80.39*/("""</th>
              <th>Class</th><td>"""),_display_(/*81.34*/{algo}),format.raw/*81.40*/("""</td>
            </tr>
            <tr><th>Parameters</th><td>"""),_display_(/*83.41*/{param}),format.raw/*83.48*/("""</td></tr>
            <tr><th>Model</th><td>"""),_display_(/*84.36*/{model}),format.raw/*84.43*/("""</td></tr>
          """)))}),format.raw/*85.12*/("""
        """),format.raw/*86.9*/("""</table>
      <h2>Serving</h2>
      <table class="table table-bordered table-striped">
        <tr><th>Parameters</th><td>"""),_display_(/*89.37*/{servingParams}),format.raw/*89.52*/("""</td></tr>
      </table>
      <h2>Feedback Loop Information</h2>
      <table class="table table-bordered table-striped">
        <tr><th>Feedback Loop Enabled?</th><td>"""),_display_(/*93.49*/{feedback}),format.raw/*93.59*/("""</td></tr>
        <tr><th>Event Server IP</th><td>"""),_display_(/*94.42*/{eventServerIp}),format.raw/*94.57*/("""</td></tr>
        <tr><th>Event Server Port</th><td>"""),_display_(/*95.44*/{eventServerPort}),format.raw/*95.61*/("""</td></tr>
      </table>
    </div>
  </body>
</html>
"""))
      }
    }
  }

  def render(args:ServerConfig,engineInstance:EngineInstance,algorithms:Seq[String],algorithmsParams:Seq[String],models:Seq[String],dataSourceParams:String,preparatorParams:String,servingParams:String,serverStartTime:DateTime,feedback:Boolean,eventServerIp:String,eventServerPort:Int,requestCount:Int,avgServingSec:Double,lastServingSec:Double): play.twirl.api.HtmlFormat.Appendable = apply(args,engineInstance,algorithms,algorithmsParams,models,dataSourceParams,preparatorParams,servingParams,serverStartTime,feedback,eventServerIp,eventServerPort,requestCount,avgServingSec,lastServingSec)

  def f:((ServerConfig,EngineInstance,Seq[String],Seq[String],Seq[String],String,String,String,DateTime,Boolean,String,Int,Int,Double,Double) => play.twirl.api.HtmlFormat.Appendable) = (args,engineInstance,algorithms,algorithmsParams,models,dataSourceParams,preparatorParams,servingParams,serverStartTime,feedback,eventServerIp,eventServerPort,requestCount,avgServingSec,lastServingSec) => apply(args,engineInstance,algorithms,algorithmsParams,models,dataSourceParams,preparatorParams,servingParams,serverStartTime,feedback,eventServerIp,eventServerPort,requestCount,avgServingSec,lastServingSec)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:06:57 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/core/src/main/twirl/org/apache/predictionio/workflow/index.scala.html
                  HASH: 4eee6b978fdf3c2f7c8b33e85c5ae7f023c53b36
                  MATRIX: 701->190|1188->582|1216->583|2085->1425|2136->1455|2165->1456|2194->1458|2245->1488|2308->1523|2339->1532|2369->1534|2402->1545|2689->1804|2718->1805|2747->1806|2839->1870|2868->1871|2900->1876|3058->2007|3088->2016|3117->2018|3149->2029|3207->2060|3258->2090|3287->2091|3316->2093|3367->2123|3549->2278|3634->2341|3715->2395|3798->2456|3872->2503|3923->2533|3998->2581|4038->2600|4218->2753|4293->2807|4370->2857|4405->2871|4489->2928|4535->2953|4564->2954|4652->3015|4699->3041|4728->3042|4832->3119|4883->3149|5056->3295|5095->3313|5272->3463|5311->3481|5533->3676|5643->3769|5684->3771|5725->3784|5788->3820|5816->3827|5882->3866|5909->3872|6000->3936|6028->3943|6101->3989|6129->3996|6182->4018|6218->4027|6370->4152|6406->4167|6605->4339|6636->4349|6715->4401|6751->4416|6832->4470|6870->4487
                  LINES: 17->5|37->20|38->21|57->40|57->40|57->40|57->40|57->40|57->40|57->40|57->40|57->40|60->43|60->43|60->43|60->43|60->43|61->44|66->49|66->49|66->49|66->49|67->50|67->50|67->50|67->50|67->50|71->54|71->54|72->55|72->55|73->56|73->56|74->57|74->57|78->61|78->61|79->62|79->62|80->63|80->63|80->63|81->64|81->64|81->64|82->65|82->65|86->69|86->69|90->73|90->73|95->78|95->78|95->78|96->79|97->80|97->80|98->81|98->81|100->83|100->83|101->84|101->84|102->85|103->86|106->89|106->89|110->93|110->93|111->94|111->94|112->95|112->95
                  -- GENERATED --
              */
          