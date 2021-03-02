load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
scala_import(
    name = "scalajs_dom_sjs1",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":scalajs_library"
    ],
    jars = [
        "//external:jar/org/scala_js/scalajs_dom_sjs1_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scalajs_ir",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/org/scala_js/scalajs_ir_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scalajs_library",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/org/scala_js/scalajs_library_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scalajs_linker",
    exports = [
        "//3rdparty/jvm/com/google/javascript:closure_compiler",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":scalajs_ir",
        ":scalajs_linker_interface"
    ],
    jars = [
        "//external:jar/org/scala_js/scalajs_linker_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scalajs_linker_interface",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":scalajs_ir",
        ":scalajs_logging"
    ],
    jars = [
        "//external:jar/org/scala_js/scalajs_linker_interface_2_12"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalajs_logging",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/org/scala_js/scalajs_logging_2_12"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


