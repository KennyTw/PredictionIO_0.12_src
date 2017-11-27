
package org.apache.predictionio.tools.console.txt

import play.twirl.api._
import play.twirl.api.TemplateMagic._


class app extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable,Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template0[play.twirl.api.TxtFormat.Appendable] {

  /**/
  def apply():play.twirl.api.TxtFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""Usage: pio app new [--id <value>] [--description <value>] [--access-key <value>]
                   <name>

Create a new app key to app ID mapping.

  --id <value>
      Specify this if you already have data under an app ID.
  --description <value>
      Description of the new app.
  --access-key <value>
      Specify a custom default access key.
  <name>
      App name.


Usage: pio app list

List all apps.


Usage: pio app show <name>

Show details of an app.

  <name>
      App name.


Usage: pio app delete <name> [--force]

Name of the app to be deleted.

  <name>
      App name.
  --force, -f
      Delete data without prompting for confirmation


Usage: pio app data-delete <name> [--channel <name>] [--all] [--force]

Delete data of an app.

  <name>
      App name.
  --channel <name>
      Delete data of the specified channel (default channel if not specified)
  --all
      Delete all data of this app (including both default and all channels)
  --force, -f
      Delete data without prompting for confirmation


Usage: pio app channel-new <name> <channel>

Create a new channel for the app.

  <name>
      App name.

  <channel>
      Channel name to be created.


Usage: pio app channel-delete <name> <channel> [--force]

Delete a channel for the app.

  <name>
      App name.

  <channel>
      Channel name to be deleted.
  --force, -f
      Delete data without prompting for confirmation
"""))
      }
    }
  }

  def render(): play.twirl.api.TxtFormat.Appendable = apply()

  def f:(() => play.twirl.api.TxtFormat.Appendable) = () => apply()

  def ref: this.type = this

}



/**/
object app extends app
              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:11:17 CST 2017
                  SOURCE: /Users/kennylee/dev/PredictionIO_0.12/tools/src/main/twirl/org/apache/predictionio/tools/console/app.scala.txt
                  HASH: 710c5d56c7ef7ad6fb46b5479929a01849a35421
                  MATRIX: 442->0
                  LINES: 16->1
                  -- GENERATED --
              */
          