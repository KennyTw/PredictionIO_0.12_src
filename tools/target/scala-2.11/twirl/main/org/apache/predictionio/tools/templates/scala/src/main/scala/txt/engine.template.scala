
package org.apache.predictionio.tools.templates.scala.src.main.scala.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class engine extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""package myorg

// Pulls in necessary PredictionIO controller components
import org.apache.predictionio.controller.EmptyActualResult
import org.apache.predictionio.controller.EmptyEvaluationInfo
import org.apache.predictionio.controller.IEngineFactory
import org.apache.predictionio.controller.LAlgorithm
import org.apache.predictionio.controller.LDataSource
import org.apache.predictionio.controller.Params
import org.apache.predictionio.controller.SimpleEngine

// All data classes must be an instance of Serializable
class MyTrainingData(
  val multiplier: Int
) extends Serializable

class MyQuery(
  val multiplicand: Int
) extends Serializable

class MyModel(
  val multiplier: Int
) extends Serializable """),format.raw/*23.24*/("""{"""),format.raw/*23.25*/("""
  """),format.raw/*24.3*/("""override def toString = s"MyModel's multiplier: $"""),format.raw/*24.52*/("""{"""),format.raw/*24.53*/("""multiplier.toString"""),format.raw/*24.72*/("""}"""),format.raw/*24.73*/(""""
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""

"""),format.raw/*27.1*/("""class MyPredictedResult(
  val product: Int
) extends Serializable

case class MyDataSourceParams(
  val multiplier: Int
) extends Params

// Your controller components
class MyDataSource(val dsp: MyDataSourceParams) extends LDataSource[
    MyTrainingData,
    EmptyEvaluationInfo,
    MyQuery,
    EmptyActualResult] """),format.raw/*40.24*/("""{"""),format.raw/*40.25*/("""

  """),format.raw/*42.3*/("""/** Implement readTraining() when you are not concerned about evaluation.
    *
    */
  override def readTraining(): MyTrainingData = """),format.raw/*45.49*/("""{"""),format.raw/*45.50*/("""
    """),format.raw/*46.5*/("""new MyTrainingData(dsp.multiplier)
  """),format.raw/*47.3*/("""}"""),format.raw/*47.4*/("""
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

"""),format.raw/*50.1*/("""class MyAlgorithm extends LAlgorithm[
    MyTrainingData,
    MyModel,
    MyQuery,
    MyPredictedResult] """),format.raw/*54.24*/("""{"""),format.raw/*54.25*/("""

  """),format.raw/*56.3*/("""override def train(pd: MyTrainingData): MyModel = """),format.raw/*56.53*/("""{"""),format.raw/*56.54*/("""
    """),format.raw/*57.5*/("""// Our model is simply one integer...
    new MyModel(pd.multiplier)
  """),format.raw/*59.3*/("""}"""),format.raw/*59.4*/("""

  """),format.raw/*61.3*/("""override def predict(model: MyModel, query: MyQuery): MyPredictedResult = """),format.raw/*61.77*/("""{"""),format.raw/*61.78*/("""
    """),format.raw/*62.5*/("""new MyPredictedResult(query.multiplicand * model.multiplier)
  """),format.raw/*63.3*/("""}"""),format.raw/*63.4*/("""
"""),format.raw/*64.1*/("""}"""),format.raw/*64.2*/("""

"""),format.raw/*66.1*/("""/** Engine factory that pieces everything together. SimpleEngine only requires
  * one DataSource and one Algorithm. Preparator is an identity function, and
  * Serving simply outputs Algorithm's prediction without further processing.
  */
object MyEngineFactory extends IEngineFactory """),format.raw/*70.47*/("""{"""),format.raw/*70.48*/("""
  """),format.raw/*71.3*/("""override def apply() = """),format.raw/*71.26*/("""{"""),format.raw/*71.27*/("""
    """),format.raw/*72.5*/("""new SimpleEngine(
      classOf[MyDataSource],
      classOf[MyAlgorithm])
  """),format.raw/*75.3*/("""}"""),format.raw/*75.4*/("""
"""),format.raw/*76.1*/("""}"""),format.raw/*76.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object engine extends engine
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/templates/scala/src/main/scala/engine.scala.txt
                  HASH: c944d55c25c4ff4ffd017d54430f0c8a1d74a1c9
                  MATRIX: 468->0|1206->710|1235->711|1265->714|1342->763|1371->764|1418->783|1447->784|1476->786|1504->787|1533->789|1880->1108|1909->1109|1940->1113|2103->1248|2132->1249|2164->1254|2228->1291|2256->1292|2284->1293|2312->1294|2341->1296|2476->1403|2505->1404|2536->1408|2614->1458|2643->1459|2675->1464|2773->1535|2801->1536|2832->1540|2934->1614|2963->1615|2995->1620|3085->1683|3113->1684|3141->1685|3169->1686|3198->1688|3512->1974|3541->1975|3571->1978|3622->2001|3651->2002|3683->2007|3787->2084|3815->2085|3843->2086|3871->2087
                  LINES: 16->1|38->23|38->23|39->24|39->24|39->24|39->24|39->24|40->25|40->25|42->27|55->40|55->40|57->42|60->45|60->45|61->46|62->47|62->47|63->48|63->48|65->50|69->54|69->54|71->56|71->56|71->56|72->57|74->59|74->59|76->61|76->61|76->61|77->62|78->63|78->63|79->64|79->64|81->66|85->70|85->70|86->71|86->71|86->71|87->72|90->75|90->75|91->76|91->76
                  -- GENERATED --
              */
          