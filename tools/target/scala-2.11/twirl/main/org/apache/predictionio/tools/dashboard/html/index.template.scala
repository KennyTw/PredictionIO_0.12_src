
package org.apache.predictionio.tools.dashboard.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import org.apache.predictionio.data.storage.EvaluationInstance
import org.apache.predictionio.tools.dashboard.DashboardConfig
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[DashboardConfig,DateTime,Map[String, String],Seq[EvaluationInstance],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(dc: DashboardConfig,
  dashboardStartTime: DateTime,
  env: Map[String, String],
  completedInstances: Seq[EvaluationInstance]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.47*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
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
    <title>PredictionIO Dashboard at """),_display_(/*28.39*/{dc.ip}),format.raw/*28.46*/(""":"""),_display_(/*28.48*/{dc.port}),format.raw/*28.57*/("""</title>
    <link href="/assets/favicon.png" rel="shortcut icon" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <style type="text/css">
    .string """),format.raw/*32.13*/("""{"""),format.raw/*32.14*/(""" """),format.raw/*32.15*/("""color: green; """),format.raw/*32.29*/("""}"""),format.raw/*32.30*/("""
    """),format.raw/*33.5*/(""".number """),format.raw/*33.13*/("""{"""),format.raw/*33.14*/(""" """),format.raw/*33.15*/("""color: darkorange; """),format.raw/*33.34*/("""}"""),format.raw/*33.35*/("""
    """),format.raw/*34.5*/(""".boolean """),format.raw/*34.14*/("""{"""),format.raw/*34.15*/(""" """),format.raw/*34.16*/("""color: blue; """),format.raw/*34.29*/("""}"""),format.raw/*34.30*/("""
    """),format.raw/*35.5*/(""".null """),format.raw/*35.11*/("""{"""),format.raw/*35.12*/(""" """),format.raw/*35.13*/("""color: magenta; """),format.raw/*35.29*/("""}"""),format.raw/*35.30*/("""
    """),format.raw/*36.5*/(""".key """),format.raw/*36.10*/("""{"""),format.raw/*36.11*/(""" """),format.raw/*36.12*/("""color: red; """),format.raw/*36.24*/("""}"""),format.raw/*36.25*/("""
    """),format.raw/*37.5*/("""</style>
    <script type="text/javascript">
      function syntaxHighlight(json) """),format.raw/*39.38*/("""{"""),format.raw/*39.39*/("""
        """),format.raw/*40.9*/("""if (typeof json != 'string') """),format.raw/*40.38*/("""{"""),format.raw/*40.39*/("""
          """),format.raw/*41.11*/("""json = JSON.stringify(json, undefined, 2);
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/("""
        """),format.raw/*43.9*/("""json = json.replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;');
        return json.replace(/("(\\u[a-zA-Z0-9]"""),format.raw/*44.47*/("""{"""),format.raw/*44.48*/("""4"""),format.raw/*44.49*/("""}"""),format.raw/*44.50*/("""|\\[^u]|[^\\"])*"(\s*:)?|\b(true|false|null)\b|-?\d+(?:\.\d*)?(?:[eE][+\-]?\d+)?)/g, function (match) """),format.raw/*44.152*/("""{"""),format.raw/*44.153*/("""
          """),format.raw/*45.11*/("""var cls = 'number';
          if (/^"/.test(match)) """),format.raw/*46.33*/("""{"""),format.raw/*46.34*/("""
            """),format.raw/*47.13*/("""if (/:$/.test(match)) """),format.raw/*47.35*/("""{"""),format.raw/*47.36*/("""
              """),format.raw/*48.15*/("""cls = 'key';
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/(""" """),format.raw/*49.15*/("""else """),format.raw/*49.20*/("""{"""),format.raw/*49.21*/("""
              """),format.raw/*50.15*/("""cls = 'string';
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
          """),format.raw/*52.11*/("""}"""),format.raw/*52.12*/(""" """),format.raw/*52.13*/("""else if (/true|false/.test(match)) """),format.raw/*52.48*/("""{"""),format.raw/*52.49*/("""
            """),format.raw/*53.13*/("""cls = 'boolean';
          """),format.raw/*54.11*/("""}"""),format.raw/*54.12*/(""" """),format.raw/*54.13*/("""else if (/null/.test(match)) """),format.raw/*54.42*/("""{"""),format.raw/*54.43*/("""
            """),format.raw/*55.13*/("""cls = 'null';
          """),format.raw/*56.11*/("""}"""),format.raw/*56.12*/("""
          """),format.raw/*57.11*/("""return '<span class="' + cls + '">' + match + '</span>';
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/(""");
      """),format.raw/*59.7*/("""}"""),format.raw/*59.8*/("""
      """),format.raw/*60.7*/("""function shorternClassName(className) """),format.raw/*60.45*/("""{"""),format.raw/*60.46*/("""
        """),format.raw/*61.9*/("""return className.replace(/(\w)\w*\./g, "$1."); 
      """),format.raw/*62.7*/("""}"""),format.raw/*62.8*/("""
    """),format.raw/*63.5*/("""</script>
  </head>
  <body>
    <div class="container-fluid">
      <div class="page-header">
        <h1>PredictionIO Dashboard at """),_display_(/*68.40*/{dc.ip}),format.raw/*68.47*/(""":"""),_display_(/*68.49*/{dc.port}),format.raw/*68.58*/("""</h1>
        <p class="lead">Started on: """),_display_(/*69.38*/{DateTimeFormat.forStyle("FF").print(dashboardStartTime)}),format.raw/*69.95*/("""</p>
      </div>
      <h2>Completed Evaluations</h2>
      <table class="table table-bordered table-striped">
        <tr>
          <th></th>
          <th>Evaluator Result (One-liner)</th>
          <th>Evaluation Class</th>
          <th>Engine Parameters Generator Class</th>
          <th>Start Time</th>
          <th>End Time</th>
          <th>Batch</th>
        </tr>
        """),_display_(/*82.10*/for(i <- completedInstances) yield /*82.38*/ {_display_(Seq[Any](format.raw/*82.40*/("""
        """),format.raw/*83.9*/("""<tr>
          <td>
            <div>
              <a href="/engine_instances/"""),_display_(/*86.43*/{i.id}),format.raw/*86.49*/("""/evaluator_results.html" class="btn btn-primary">HTML</a>
            </div>
          </td>
          <td>
            <div>"""),_display_(/*90.19*/{i.evaluatorResults}),format.raw/*90.39*/("""</div>
          </td>
          <td>
            <span title=""""),_display_(/*93.27*/{i.evaluationClass}),format.raw/*93.46*/(""""><script type="text/javascript">document.write(shorternClassName(""""),_display_(/*93.114*/{i.evaluationClass}),format.raw/*93.133*/(""""));</script></span>
          </td>
          <td>
            <span title=""""),_display_(/*96.27*/{i.engineParamsGeneratorClass}),format.raw/*96.57*/(""""><script type="text/javascript">document.write(shorternClassName(""""),_display_(/*96.125*/{i.engineParamsGeneratorClass}),format.raw/*96.155*/(""""));</script></span>
          </td>
          <td>"""),_display_(/*98.16*/{DateTimeFormat.forStyle("MM").print(i.startTime)}),format.raw/*98.66*/("""</td>
          <td>"""),_display_(/*99.16*/{DateTimeFormat.forStyle("MM").print(i.endTime)}),format.raw/*99.64*/("""</td>
          <td>"""),_display_(/*100.16*/{i.batch}),format.raw/*100.25*/("""</td>
        </tr>
        """)))}),format.raw/*102.10*/("""
      """),format.raw/*103.7*/("""</table>
      <h2>Environment</h2>
      <p>The following values are accurate up to the time when the dashboard was launched.</p>
      <table class="table table-bordered table-striped">
        """),_display_(/*107.10*/for(k <- env.keys.toSeq.sorted) yield /*107.41*/ {_display_(Seq[Any](format.raw/*107.43*/("""
        """),format.raw/*108.9*/("""<tr><th>"""),_display_(/*108.18*/{k}),format.raw/*108.21*/("""</th><td>"""),_display_(/*108.31*/{env(k)}),format.raw/*108.39*/("""</td></tr>
        """)))}),format.raw/*109.10*/("""
      """),format.raw/*110.7*/("""</table>
    </div>
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ=" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  </body>
</html>
"""))
      }
    }
  }

  def render(dc:DashboardConfig,dashboardStartTime:DateTime,env:Map[String, String],completedInstances:Seq[EvaluationInstance]): play.twirl.api.HtmlFormat.Appendable = apply(dc,dashboardStartTime,env,completedInstances)

  def f:((DashboardConfig,DateTime,Map[String, String],Seq[EvaluationInstance]) => play.twirl.api.HtmlFormat.Appendable) = (dc,dashboardStartTime,env,completedInstances) => apply(dc,dashboardStartTime,env,completedInstances)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/dashboard/index.scala.html
                  HASH: fa221832a8a2704c57dcd2c4b01647ca128cb70d
                  MATRIX: 659->204|882->332|909->333|1804->1201|1832->1208|1861->1210|1891->1219|2241->1541|2270->1542|2299->1543|2341->1557|2370->1558|2402->1563|2438->1571|2467->1572|2496->1573|2543->1592|2572->1593|2604->1598|2641->1607|2670->1608|2699->1609|2740->1622|2769->1623|2801->1628|2835->1634|2864->1635|2893->1636|2937->1652|2966->1653|2998->1658|3031->1663|3060->1664|3089->1665|3129->1677|3158->1678|3190->1683|3300->1765|3329->1766|3365->1775|3422->1804|3451->1805|3490->1816|3568->1867|3597->1868|3633->1877|3787->2003|3816->2004|3845->2005|3874->2006|4005->2108|4035->2109|4074->2120|4154->2172|4183->2173|4224->2186|4274->2208|4303->2209|4346->2224|4399->2249|4428->2250|4457->2251|4490->2256|4519->2257|4562->2272|4618->2300|4647->2301|4686->2312|4715->2313|4744->2314|4807->2349|4836->2350|4877->2363|4932->2390|4961->2391|4990->2392|5047->2421|5076->2422|5117->2435|5169->2459|5198->2460|5237->2471|5329->2536|5358->2537|5394->2546|5422->2547|5456->2554|5522->2592|5551->2593|5587->2602|5668->2656|5696->2657|5728->2662|5889->2796|5917->2803|5946->2805|5976->2814|6046->2857|6124->2914|6539->3302|6583->3330|6623->3332|6659->3341|6766->3421|6793->3427|6946->3553|6987->3573|7078->3637|7118->3656|7214->3724|7255->3743|7360->3821|7411->3851|7507->3919|7559->3949|7638->4001|7709->4051|7757->4072|7826->4120|7875->4141|7906->4150|7967->4179|8002->4186|8227->4383|8275->4414|8316->4416|8353->4425|8390->4434|8415->4437|8453->4447|8483->4455|8535->4475|8570->4482
                  LINES: 17->5|25->8|26->9|45->28|45->28|45->28|45->28|49->32|49->32|49->32|49->32|49->32|50->33|50->33|50->33|50->33|50->33|50->33|51->34|51->34|51->34|51->34|51->34|51->34|52->35|52->35|52->35|52->35|52->35|52->35|53->36|53->36|53->36|53->36|53->36|53->36|54->37|56->39|56->39|57->40|57->40|57->40|58->41|59->42|59->42|60->43|61->44|61->44|61->44|61->44|61->44|61->44|62->45|63->46|63->46|64->47|64->47|64->47|65->48|66->49|66->49|66->49|66->49|66->49|67->50|68->51|68->51|69->52|69->52|69->52|69->52|69->52|70->53|71->54|71->54|71->54|71->54|71->54|72->55|73->56|73->56|74->57|75->58|75->58|76->59|76->59|77->60|77->60|77->60|78->61|79->62|79->62|80->63|85->68|85->68|85->68|85->68|86->69|86->69|99->82|99->82|99->82|100->83|103->86|103->86|107->90|107->90|110->93|110->93|110->93|110->93|113->96|113->96|113->96|113->96|115->98|115->98|116->99|116->99|117->100|117->100|119->102|120->103|124->107|124->107|124->107|125->108|125->108|125->108|125->108|125->108|126->109|127->110
                  -- GENERATED --
              */
          