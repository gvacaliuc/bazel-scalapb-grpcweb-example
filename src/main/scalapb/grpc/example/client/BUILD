load("@io_bazel_rules_scala//scala:scala.bzl", "scalajs_binary", "scalajs_library")

scalajs_library(
    name = "sjsir",
    srcs = glob(["*.scala"]),
    deps = [
        "//3rdparty/jvm/com/thesamet/scalapb/grpcweb:scalapb_grpcweb_sjs1",
        "//3rdparty/jvm/org/scala_js:scalajs_dom_sjs1",
        "//protos/src/main/protobuf:my_service_proto_scala",
    ],
)

scalajs_binary(
    name = "index",
    main_class = "scalapb.grpc.example.Client",
    method = "init",
    deps = [
        ":sjsir",
        "//3rdparty/jvm/com/thesamet/scalapb:lenses_sjs1",
        "//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime_sjs1",
        "//3rdparty/jvm/com/thesamet/scalapb/grpcweb:scalapb_grpcweb_sjs1",
        "//3rdparty/jvm/org/scala_js:scalajs_dom_sjs1",
        "//protos/src/main/protobuf:my_service_proto_scala",
    ],
)
