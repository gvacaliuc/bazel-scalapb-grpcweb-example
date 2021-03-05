package scalapb.grpc.example

import io.grpc.stub.StreamObserver
import scalapb.grpc.Channels
import scalapb.grpcweb.Metadata
import scalapb.web.myservice.TestServiceGrpcWeb
import scalapb.web.myservice.{Req, Res}
import scala.concurrent.ExecutionContext.Implicits.global
import org.scalajs.dom
import org.scalajs.dom.document

class GrpcError(code: String, message: String)
    extends RuntimeException(s"Grpc-web error ${code}: ${message}")

object Client {
  def init: Unit = {
    main(Array.empty)
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  def main(args: Array[String]): Unit = {
    println("Hello world!")

    val stub =
      TestServiceGrpcWeb.stub(Channels.grpcwebChannel("http://localhost:8080"))

    val req = Req(payload = "Hello!", vals = Seq(-4000, -1, 17, 39, 4175))
    // val req = Req(payload="error", vals=Seq(-4000, -1, 17, 39, 4175))

    val metadata: Metadata = Metadata("custom-header-1" -> "unary-value")
    // Make an async unary call
    stub.unary(req.update(_.payload := "Hello, World!")).onComplete { f =>
      println("Unary", f)
    }

    // Make an async unary call with metadata
    stub.unary(req.update(_.payload := ""), metadata).onComplete { f =>
      println("Unary", f)
    }
//    val metadata2: Metadata = Metadata("custom-header-2" -> "streaming-value")

    // Make an async server streaming call
    val stream = stub.serverStreaming(
      req.update(_.payload := "WOWOWOWOWOWOWOWOWOWOWOWOW"),
      metadata,
      new StreamObserver[Res] {
        override def onNext(value: Res): Unit = { throw new RuntimeException() }

        override def onError(throwable: Throwable): Unit = {
          println(s"error: $throwable")
        }

        override def onCompleted(): Unit = {
          appendPar(document.body, "Stream Completed!")
        }
      }
    )

    // Cancel ongoing streamig call
    // stream.cancel()
  }
}
