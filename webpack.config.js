const path = require('path');
module.exports = {
  mode: "production",
  entry: "./bazel-bin/src/main/scalapb/grpc/example/client/index.js",
  resolve: {
    modules: [path.resolve(__dirname, 'node_modules')]
  },
  optimization: {
      minimize: false
  },
};
