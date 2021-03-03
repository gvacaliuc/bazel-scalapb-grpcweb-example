load("@io_bazel_rules_scala//scala:scala.bzl", "scalajs_binary", "scalajs_library")

scalajs_library(
    name = "sjsir",
    srcs = glob(["*.scala"]),
    deps = [
        "//3rdparty/jvm/org/scala_js:scalajs_dom_sjs1",
        "//protos/src/main/protobuf:my_service_proto_scalajs",
    ],
)

scalajs_binary(
    name = "index",
    # TODO: handle #init after the main_class, to indicate the method to run
    # TODO: should we handle args? i think sbt adds an empty array by default
    main_class = "scalajs.example.TutorialApp",
    method = "init",
    deps = [
        ":sjsir",
    ],
)
