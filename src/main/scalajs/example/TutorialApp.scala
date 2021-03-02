package scalajs.example

import org.scalajs.dom
import org.scalajs.dom.document

//import scalapb.web.myservice._

object TutorialApp {
  def main(args: Array[String]): Unit = {
    init
  }

  def getNames: Seq[String] = Seq("foo", "bar", "baz")

//  def getRequests: Seq[Req] = Seq(
//    Req().withPayload("foobar").withVals(Seq(1, 2, 3)),
//    Req().withPayload("foobar").withVals(Seq(1, 2, 3)),
//    Req().withPayload("foobar").withVals(Seq(1, 2, 3)),
//    Req().withPayload("foobar").withVals(Seq(1, 2, 3))
//  )

  def hdrs: Seq[String] = Seq("payload", "vals")
//  def displayRows(rows: Seq[Req]): Seq[Seq[String]] = rows.map { req =>
//    Seq(req.payload, "[" + req.vals.mkString(", ") + "]")
//  }

  def appendTable(targetNode: dom.Node, hdrs: Seq[String], rows: Seq[Seq[String]]): Unit = {
    val table = document.createElement("table")
    val headerRow = document.createElement("tr")
    // add headers
    hdrs.foreach { hdr =>
      val hdrNode = document.createElement("th")
      hdrNode.textContent = hdr
      headerRow.appendChild(hdrNode)
    }
    table.appendChild(headerRow)
    // add rows
    rows.foreach { row =>
      val rowNode = document.createElement("tr")
      row.foreach { value =>
        val rowValue = document.createElement("td")
        rowValue.textContent = value
        rowNode.appendChild(rowValue)
      }
      table.appendChild(rowNode)
    }
    targetNode.appendChild(table)
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  def init: Unit = {
    appendPar(document.body, "Proto Requests Received")
    appendTable(
      document.body,
      hdrs,
      Seq(Seq("foo", "bar"), Seq("foo", "bar"))
//      displayRows(getRequests)
    )
  }
}
