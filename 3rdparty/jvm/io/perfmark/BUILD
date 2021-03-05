load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "perfmark_api",
    exports = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//external:jar/io/perfmark/perfmark_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


