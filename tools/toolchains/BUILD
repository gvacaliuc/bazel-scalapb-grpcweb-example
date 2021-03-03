# Register default scala.js toolchain
load("@io_bazel_rules_scala//scala:scala_toolchain.bzl", "export_scala_toolchain_deps", "scala_deps_toolchain", "scala_toolchain")
load("@io_bazel_rules_scala//scala:providers.bzl", "declare_deps_provider")

scala_toolchain(
    name = "scalajs_toolchain_impl",
    dep_providers = [
        "@io_bazel_rules_scala//scala:parser_combinators_provider",
        ":scalajs_compile_classpath_provider",
        ":scalajs_library_classpath_provider",
        "@io_bazel_rules_scala//scala:scala_macro_classpath_provider",
        "@io_bazel_rules_scala//scala:scala_xml_provider",
        ":scalajs_compiler_plugin_provider",
    ],
    visibility = ["//visibility:public"],
)

toolchain(
    name = "scalajs_toolchain",
    toolchain = ":scalajs_toolchain_impl",
    toolchain_type = "@io_bazel_rules_scala//scala:toolchain_type",
    visibility = ["//visibility:public"],
)

scala_deps_toolchain(
    name = "scalajs_deps_toolchain_impl",
    dep_providers = [
        ":scalajs_linker_provider",
    ],
    visibility = ["//visibility:public"],
)

toolchain(
    name = "scalajs_deps_toolchain",
    toolchain = ":scalajs_deps_toolchain_impl",
    toolchain_type = "@io_bazel_rules_scala//scala:deps_toolchain_type",
    visibility = ["//visibility:public"],
)

declare_deps_provider(
    name = "scalajs_linker_provider",
    deps_id = "scalajs_linker_deps",
    visibility = ["//visibility:public"],
    deps = [
        "//3rdparty/jvm/org/scala_js:scalajs_ir",
        "//3rdparty/jvm/org/scala_js:scalajs_linker",
    ],
)

export_scala_toolchain_deps(
    name = "scalajs_linker_deps",
    deps_id = "scalajs_linker_deps",
    visibility = ["//visibility:public"],
)

declare_deps_provider(
    name = "scalajs_compile_classpath_provider",
    deps_id = "scala_compile_classpath",
    visibility = ["//visibility:public"],
    deps = [
        "//external:io_bazel_rules_scala/dependency/scala/scala_compiler",
        "//external:io_bazel_rules_scala/dependency/scala/scala_library",
        "//external:io_bazel_rules_scala/dependency/scala/scala_reflect",
        "//jars:scalajs_compiler",
    ],
)

declare_deps_provider(
    name = "scalajs_library_classpath_provider",
    deps_id = "scala_library_classpath",
    visibility = ["//visibility:public"],
    deps = [
        "//external:io_bazel_rules_scala/dependency/scala/scala_library",
        "//external:io_bazel_rules_scala/dependency/scala/scala_reflect",
        "//jars:scalajs_compiler",
    ],
)

declare_deps_provider(
    name = "scalajs_compiler_plugin_provider",
    deps_id = "scalajs_compiler_plugin",
    visibility = ["//visibility:public"],
    deps = [
        "//jars:scalajs_compiler",
    ],
)

# NOTE: here we create the scala proto deps toolchain that exports the scala.js plugins to the actual proto toolchain.

load("@io_bazel_rules_scala//scala_proto:scala_proto_toolchain.bzl", "export_scalapb_toolchain_deps", "scala_proto_deps_toolchain", "scala_proto_toolchain")

scala_proto_toolchain(
    name = "scala_proto_toolchain_impl",
    extra_generator_dependencies = [
        "//3rdparty/jvm/com/thesamet/scalapb/grpcweb:scalapb_grpcweb_code_gen",
    ],
    named_generators = {
        "grpc-web": "scalapb.grpcweb.GrpcWebCodeGenerator",
    },
    visibility = ["//visibility:public"],
    with_flat_package = False,
    with_grpc = True,
    with_single_line_to_string = False,
)

toolchain(
    name = "scala_proto_toolchain",
    toolchain = ":scala_proto_toolchain_impl",
    toolchain_type = "@io_bazel_rules_scala//scala_proto:toolchain_type",
    visibility = ["//visibility:public"],
)

declare_deps_provider(
    name = "scalapb_compile_deps_provider",
    deps_id = "scalapb_compile_deps",
    visibility = ["//visibility:public"],
    deps = [
        "//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime",
    ],
)

declare_deps_provider(
    name = "scalapb_grpc_deps_provider",
    deps_id = "scalapb_grpc_deps",
    visibility = ["//visibility:public"],
    deps = [
        # this needs to be listed first, so that it's jar appears on the classpath first.  scalapb-grpcweb overrides
        # some io.grpc classes (i think)
        #        "//3rdparty/jvm/com/thesamet/scalapb/grpcweb:scalapb_grpcweb_sjs1",
        "//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime_grpc",
        #        "//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime_sjs1",
    ],
)

declare_deps_provider(
    name = "scalapb_worker_deps_provider",
    deps_id = "scalapb_worker_deps",
    visibility = ["//visibility:public"],
    deps = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/thesamet/scalapb:compilerplugin",
        "//3rdparty/jvm/com/thesamet/scalapb:protoc_bridge",
    ],
)

export_scalapb_toolchain_deps(
    name = "scalapb_worker_deps",
    deps_id = "scalapb_worker_deps",
    visibility = ["//visibility:public"],
)

declare_deps_provider(
    name = "scalajs_proto_compile_deps_provider",
    deps_id = "scalajs_proto_compile_deps",
    deps = [
        "//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime_sjs1",
        "//3rdparty/jvm/org/scala_js:scalajs_library",
    ],
)

declare_deps_provider(
    name = "scalajs_grpc_deps_provider",
    deps_id = "scalajs_grpc_deps",
    deps = [
        #        "//3rdparty/jvm/com/thesamet/scalapb:scalapb_runtime_sjs1",
        "//3rdparty/jvm/com/thesamet/scalapb/grpcweb:scalapb_grpcweb_sjs1",
    ],
)

scala_proto_deps_toolchain(
    name = "scalajs_proto_toolchain_configuration",
    dep_providers = [
        ":scalajs_compiler_plugin_provider",
        ":scalapb_compile_deps_provider",
        ":scalapb_grpc_deps_provider",
        ":scalajs_grpc_deps_provider",
        ":scalapb_worker_deps_provider",
        ":scalajs_proto_compile_deps_provider",
    ],
    visibility = ["//visibility:public"],
)

toolchain(
    name = "scalajs_proto_toolchain",
    toolchain = ":scalajs_proto_toolchain_configuration",
    toolchain_type = "@io_bazel_rules_scala//scala_proto:deps_toolchain_type",
    visibility = ["//visibility:public"],
)

export_scalapb_toolchain_deps(
    name = "export_scalajs_compiler_plugin_deps",
    deps_id = "scalajs_compiler_plugin",
)
