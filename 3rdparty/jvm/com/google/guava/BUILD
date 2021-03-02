load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "failureaccess",
    exports = [
        "//external:jar/com/google/guava/failureaccess"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "guava",
    exports = [
        "//3rdparty/jvm/com/google/j2objc:j2objc_annotations",
        "//3rdparty/jvm/org/checkerframework:checker_compat_qual",
        "//external:jar/com/google/guava/guava",
        ":failureaccess",
        ":listenablefuture"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "listenablefuture",
    exports = [
        "//external:jar/com/google/guava/listenablefuture"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


