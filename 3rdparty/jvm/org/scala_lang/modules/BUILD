load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
scala_import(
    name = "scala_collection_compat",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/org/scala_lang/modules/scala_collection_compat_2_12"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scala_collection_compat_sjs1",
    exports = [
        "//3rdparty/jvm/org/scala_js:scalajs_library",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/org/scala_lang/modules/scala_collection_compat_sjs1_2_12"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_library(
    name = "scala_parser_combinators",
    exports = [
        "@io_bazel_rules_scala_scala_parser_combinators//:io_bazel_rules_scala_scala_parser_combinators"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_library(
    name = "scala_xml",
    exports = [
        "@io_bazel_rules_scala_scala_xml//:io_bazel_rules_scala_scala_xml"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


