load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
scala_import(
    name = "scalapb_grpcweb_code_gen",
    exports = [
        "//3rdparty/jvm/com/thesamet/scalapb:compilerplugin",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/grpcweb/scalapb_grpcweb_code_gen_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scalapb_grpcweb_sjs1",
    exports = [
        "//3rdparty/jvm/com/thesamet/scalapb:protobuf_runtime_scala_sjs1",
        "//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime_sjs1",
        "//3rdparty/jvm/org/scala_js:scalajs_library",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/grpcweb/scalapb_grpcweb_sjs1_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)


