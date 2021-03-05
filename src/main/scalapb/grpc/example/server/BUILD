load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary", "scala_library", "scala_test")
load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scala_proto_library")

scala_proto_library(
    name = "my_service_proto_scala",
    visibility = ["//visibility:public"],
    deps = ["//protos/src/main/protobuf:my_service_proto"],
)

scala_binary(
    name = "server",
    srcs = ["Server.scala"],
    main_class = "scalapb.grpc.example.Server",
    deps = [
        ":my_service_proto_scala",
        "//3rdparty/jvm/io/grpc:grpc_netty",
    ],
)
