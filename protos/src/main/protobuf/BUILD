load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scala_proto_library", "scalajs_proto_library")

proto_library(
    name = "my_service_proto",
    srcs = ["myservice.proto"],
    visibility = ["//visibility:public"],
)

scala_proto_library(
    name = "my_service_proto_scala",
    visibility = ["//visibility:public"],
    deps = [":my_service_proto"],
)

scalajs_proto_library(
    name = "my_service_proto_scalajs",
    visibility = ["//visibility:public"],
    deps = [":my_service_proto"],
)
