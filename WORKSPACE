scala_version = "2.12.8"

scala_version_jar_shas = {
    "scala_compiler": "f34e9119f45abd41e85b9e121ba19dd9288b3b4af7f7047e86dc70236708d170",
    "scala_library": "321fb55685635c931eba4bc0d7668349da3f2c09aee2de93a70566066ff25c28",
    "scala_reflect": "4d6405395c4599ce04cea08ba082339e3e42135de9aae2923c9f5367e957315a",
}

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")
load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")
load("@bazel_tools//tools/build_defs/repo:utils.bzl", "maybe")

# https://github.com/bazelbuild/bazel-skylib/releases/tag/0.9.0
maybe(
    http_archive,
    name = "bazel_skylib",
    sha256 = "1dde365491125a3db70731e25658dfdd3bc5dbdfd11b840b3e987ecf043c7ca0",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/0.9.0/bazel_skylib-0.9.0.tar.gz",
)

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")

bazel_skylib_workspace()

rules_scala_version = "af59dde6c87a8b4b4bd04d44c1f82c594c24c3bd"

#http_archive(
#    name = "io_bazel_rules_scala",
#    sha256 = "",
#    strip_prefix = "rules_scala-%s" % rules_scala_version,
#    type = "zip",
#    url = "https://github.com/ConsultingMD/rules_scala/archive/%s.zip" % rules_scala_version,
#)

local_repository(
    name = "io_bazel_rules_scala",
    path = "../../bazelbuild/rules_scala",
)

load("@io_bazel_rules_scala//:version.bzl", "bazel_version")

bazel_version(name = "bazel_version")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories(scala_version)

protobuf_version = "3.11.3"

protobuf_version_sha256 = "cf754718b0aa945b00550ed7962ddc167167bd922b842199eeb6505e6f344852"

http_archive(
    name = "com_google_protobuf",
    sha256 = protobuf_version_sha256,
    strip_prefix = "protobuf-%s" % protobuf_version,
    url = "https://github.com/protocolbuffers/protobuf/archive/v%s.tar.gz" % protobuf_version,
)

load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scala_proto_repositories")

scala_proto_repositories(scala_version)

register_toolchains("//tools/toolchains:scalajs_toolchain")

register_toolchains("//tools/toolchains:scalajs_deps_toolchain")

register_toolchains("//tools/toolchains:scala_proto_toolchain")

register_toolchains("//tools/toolchains:scalajs_proto_toolchain")

load("//3rdparty:workspace.bzl", "maven_dependencies")

maven_dependencies()
