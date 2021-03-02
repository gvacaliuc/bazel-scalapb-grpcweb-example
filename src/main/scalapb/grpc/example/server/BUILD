load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary", "scala_library", "scala_test")

scala_binary(
    name = "server",
    srcs = ["Server.scala"],
    main_class = "scalapb.grpc.example.Server",
    deps = [
        "//protos/src/main/protobuf:my_service_proto_scala",
    ],
)
