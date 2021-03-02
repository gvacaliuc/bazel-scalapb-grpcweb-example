load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
scala_import(
    name = "compilerplugin",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/org/scala_lang/modules:scala_collection_compat",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":protoc_gen"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/compilerplugin_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "lenses",
    exports = [
        "//3rdparty/jvm/org/scala_lang/modules:scala_collection_compat",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/lenses_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "lenses_sjs1",
    exports = [
        "//3rdparty/jvm/org/scala_js:scalajs_library",
        "//3rdparty/jvm/org/scala_lang/modules:scala_collection_compat_sjs1",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/lenses_sjs1_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "protobuf_runtime_scala_sjs1",
    exports = [
        "//3rdparty/jvm/org/scala_js:scalajs_library",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/protobuf_runtime_scala_sjs1_2_12"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "protoc_bridge",
    exports = [
        "//3rdparty/jvm/dev/dirs:directories",
        "//3rdparty/jvm/org/scala_lang:scala_library"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/protoc_bridge_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "protoc_gen",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":protoc_bridge"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/protoc_gen_2_12"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalapb_runtime",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/lihaoyi:fastparse_2_12",
        "//3rdparty/jvm/org/scala_lang/modules:scala_collection_compat",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":lenses"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/scalapb_runtime_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scalapb_runtime_grpc",
    exports = [
        "//3rdparty/jvm/io/grpc:grpc_protobuf",
        "//3rdparty/jvm/io/grpc:grpc_stub",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":scalapb_runtime"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/scalapb_runtime_grpc_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "scalapb_runtime_sjs1",
    exports = [
        "//3rdparty/jvm/com/lihaoyi:fastparse_sjs1_2_12",
        "//3rdparty/jvm/org/scala_js:scalajs_library",
        "//3rdparty/jvm/org/scala_lang/modules:scala_collection_compat_sjs1",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        ":lenses_sjs1",
        ":protobuf_runtime_scala_sjs1"
    ],
    jars = [
        "//external:jar/com/thesamet/scalapb/scalapb_runtime_sjs1_2_12"
    ],
    visibility = [
        "//visibility:public"
    ]
)


