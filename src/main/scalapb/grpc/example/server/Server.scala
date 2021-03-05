package scalapb.grpc.example

import io.grpc.ServerBuilder
import io.grpc.stub.StreamObserver
import scalapb.web.myservice.{Req, Res, TestServiceGrpc}
import scalapb.web.myservice.TestServiceGrpc.TestService

import scala.concurrent.{ExecutionContext, Future}

object Server {
  def main(args: Array[String]): Unit = {
    val port = 9090
    val server = ServerBuilder
      .forPort(port)
      .addService(
        TestServiceGrpc.bindService(new MyServiceImpl, ExecutionContext.global)
      )
      .build()
      .start()

    println(s"Server started... Listening on :$port")

    sys.addShutdownHook {
      println("Shutting down...")
      server.shutdown()
    }
    server.awaitTermination()
  }
}

class MyServiceImpl extends TestService {
  override def unary(request: Req): Future[Res] = {
    println(s"unary: ${request.vals}")
    Future.successful(Res(request.payload.length, vals = request.vals))
  }

  override def serverStreaming(request: Req, responseObserver: StreamObserver[Res]): Unit = {
    println(s"serverStreaming: ${request.vals}")
    responseObserver.onNext(Res(payload = request.payload.length))
    println(s"serverStreaming: sent request")
    responseObserver.onNext(Res(payload = request.payload.length + 1))
    println(s"serverStreaming: sent request")
    responseObserver.onNext(Res(payload = request.payload.length + 2))
    println(s"serverStreaming: sent request")
    if (request.payload == "error") {
      println(s"serverStreaming: sending error")
      responseObserver.onError(new RuntimeException("Problem Problem"))
    } else {
      responseObserver.onNext(Res(payload = request.payload.length + 10))
      println(s"serverStreaming: sent final req, completing")
      responseObserver.onCompleted()
    }
  }

  // bidiStreaming and clientStreaming are not supported by gRPC web?
  override def bidiStreaming(responseObserver: StreamObserver[Res]): StreamObserver[Req] = ???
  override def clientStreaming(responseObserver: StreamObserver[Res]): StreamObserver[Req] = ???
}
