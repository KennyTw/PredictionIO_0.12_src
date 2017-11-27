
package org.apache.predictionio.controller.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class metric_evaluator extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!--
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
<html>
  <head>
    <script type='text/javascript' src='https://www.google.com/jsapi'></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script>
      google.load('visualization', '1', """),format.raw/*22.41*/("""{"""),format.raw/*22.42*/("""packages:['table', 'corechart',]"""),format.raw/*22.74*/("""}"""),format.raw/*22.75*/(""");
    </script>
  </head>
  <body>
    <h1>Metric Evaluator</h1>
    <div id='debug'></div>
    <div id='table'>
      <h3>Engine Params Evaluation Results</h3>
      <div>Click on table to view the engine params</div>
    </div>
    <pre id='engineParams'></div>
    <script type='text/javascript'>
      google.setOnLoadCallback(load);

      //var url =  'http://localhost:9000/engine_instances/ky01Q-glQheNE_s885JTSg/local_evaluator_results.json';
      var url = 'evaluator_results.json';
      var rawData;
      var metricHeader;
      var otherMetricHeaders;
      var engineParamsScores;
      var table;
      var dataTable;

      function load() """),format.raw/*45.23*/("""{"""),format.raw/*45.24*/("""
        """),format.raw/*46.9*/("""rawData = JSON.parse(
            jQuery.ajax("""),format.raw/*47.25*/("""{"""),format.raw/*47.26*/("""
              """),format.raw/*48.15*/("""url: url,
              dataType: 'json',
              async: false,
              """),format.raw/*51.15*/("""}"""),format.raw/*51.16*/(""").responseText);

        metricHeader = rawData['metricHeader'];
        otherMetricHeaders = rawData['otherMetricHeaders'];
        engineParamsScores = rawData['engineParamsScores'];

        drawTable();
      """),format.raw/*58.7*/("""}"""),format.raw/*58.8*/("""

      """),format.raw/*60.7*/("""function tableSelectHandler() """),format.raw/*60.37*/("""{"""),format.raw/*60.38*/("""
        """),format.raw/*61.9*/("""var selection = table.getSelection();
        if (selection.length > 0) """),format.raw/*62.35*/("""{"""),format.raw/*62.36*/("""
          """),format.raw/*63.11*/("""var row = selection[0].row;
          var idx = dataTable.getValue(row, 0);
          var engineParams = engineParamsScores[idx]._1;

          document.getElementById('engineParams').innerHTML = JSON.stringify(
            engineParams, null, 2);
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/(""" """),format.raw/*69.11*/("""else """),format.raw/*69.16*/("""{"""),format.raw/*69.17*/("""
          """),format.raw/*70.11*/("""document.getElementById('engineParams').innerHTML = "";
        """),format.raw/*71.9*/("""}"""),format.raw/*71.10*/("""
      """),format.raw/*72.7*/("""}"""),format.raw/*72.8*/("""

      """),format.raw/*74.7*/("""function drawTable() """),format.raw/*74.28*/("""{"""),format.raw/*74.29*/("""
        """),format.raw/*75.9*/("""var tableDiv = document.createElement('div');
        document.getElementById('table').appendChild(tableDiv);


        var dataArray = [];

        var headers = ['Index', 'Best', metricHeader].concat(otherMetricHeaders);
        dataArray.push(headers);

        for (epIdx = 0; epIdx < engineParamsScores.length; epIdx++) """),format.raw/*84.69*/("""{"""),format.raw/*84.70*/("""
          """),format.raw/*85.11*/("""var epScore = engineParamsScores[epIdx];
          var isBest = (epIdx == rawData.bestIdx ? "*" : "");
          dataArray.push([epIdx, isBest, epScore._2.score].concat(epScore._2.otherScores));
        """),format.raw/*88.9*/("""}"""),format.raw/*88.10*/("""

        """),format.raw/*90.9*/("""dataTable = google.visualization.arrayToDataTable(dataArray, false);

        // formatter
        var numberFormatter = new google.visualization.NumberFormat("""),format.raw/*93.69*/("""{"""),format.raw/*93.70*/("""fractionDigits: 4"""),format.raw/*93.87*/("""}"""),format.raw/*93.88*/(""");

        for (colIdx = 1; colIdx < dataTable.getNumberOfColumns(); colIdx++) """),format.raw/*95.77*/("""{"""),format.raw/*95.78*/("""
          """),format.raw/*96.11*/("""if (dataTable.getColumnType(colIdx) == "number") """),format.raw/*96.60*/("""{"""),format.raw/*96.61*/("""
            """),format.raw/*97.13*/("""numberFormatter.format(dataTable, colIdx);
          """),format.raw/*98.11*/("""}"""),format.raw/*98.12*/("""
        """),format.raw/*99.9*/("""}"""),format.raw/*99.10*/("""

        """),format.raw/*101.9*/("""table = new google.visualization.Table(tableDiv);

        // select handler
        google.visualization.events.addListener(table, 'select', tableSelectHandler);

        table.draw(dataTable);
      """),format.raw/*107.7*/("""}"""),format.raw/*107.8*/("""

    """),format.raw/*109.5*/("""</script>
  </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object metric_evaluator extends metric_evaluator
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:06:57 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/core/src/main/twirl/org/apache/predictionio/controller/metric_evaluator.scala.html
                  HASH: 948275759a41cca025547d5599d1ac60141ee61c
                  MATRIX: 458->0|1515->1029|1544->1030|1604->1062|1633->1063|2320->1722|2349->1723|2385->1732|2459->1778|2488->1779|2531->1794|2643->1878|2672->1879|2913->2093|2941->2094|2976->2102|3034->2132|3063->2133|3099->2142|3199->2214|3228->2215|3267->2226|3550->2482|3579->2483|3608->2484|3641->2489|3670->2490|3709->2501|3800->2565|3829->2566|3863->2573|3891->2574|3926->2582|3975->2603|4004->2604|4040->2613|4393->2938|4422->2939|4461->2950|4691->3153|4720->3154|4757->3164|4944->3323|4973->3324|5018->3341|5047->3342|5155->3422|5184->3423|5223->3434|5300->3483|5329->3484|5370->3497|5451->3550|5480->3551|5516->3560|5545->3561|5583->3571|5812->3772|5841->3773|5875->3779
                  LINES: 16->1|37->22|37->22|37->22|37->22|60->45|60->45|61->46|62->47|62->47|63->48|66->51|66->51|73->58|73->58|75->60|75->60|75->60|76->61|77->62|77->62|78->63|84->69|84->69|84->69|84->69|84->69|85->70|86->71|86->71|87->72|87->72|89->74|89->74|89->74|90->75|99->84|99->84|100->85|103->88|103->88|105->90|108->93|108->93|108->93|108->93|110->95|110->95|111->96|111->96|111->96|112->97|113->98|113->98|114->99|114->99|116->101|122->107|122->107|124->109
                  -- GENERATED --
              */
          