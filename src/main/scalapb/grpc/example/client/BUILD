load("@io_bazel_rules_scala//scala:scala.bzl", "scalajs_binary", "scalajs_library")
load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scalajs_proto_library")

scalajs_proto_library(
    name = "my_service_proto_scalajs",
    visibility = ["//visibility:public"],
    deps = ["//protos/src/main/protobuf:my_service_proto_scalajs"],
)

scalajs_library(
    name = "sjsir",
    srcs = glob(["*.scala"]),
    deps = [
        ":my_service_proto_scalajs",
        "//3rdparty/jvm/com/thesamet/scalapb/grpcweb:scalapb_grpcweb_sjs1",
        "//3rdparty/jvm/org/scala_js:scalajs_dom_sjs1",
    ],
)

scalajs_binary(
    name = "index",
    main_class = "scalapb.grpc.example.Client",
    method = "init",
    deps = [
        ":sjsir",
    ],
)
