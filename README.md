# scalapb-grpc-web example

Example of using bazel + rules_scala to build scala.js with support for
grpcweb.

The server/client code  was lifted from:
[scalapb/scalapb-grpcweb](https://github.com/scalapb/scalapb-grpcweb).

1. Build the client js:

    ```
    bazelisk build //src/main/scalajs/example:index.js
    # nvm use --lts
    npm install
    npx webpack
    ```

1. Run the server

    ```
    bazelisk run //src/main/scalapb/grpc/example/server:server
    ```

1. Run the proxy

    ```
    docker run --rm -ti --net=host -v $PWD/envoy.yaml:/etc/envoy/envoy.yaml envoyproxy/envoy:v1.17.0
    ```

1. Open the `index.html` file from this directory in your browser.

   **NOTE**: All the output goes into the Javascript console. It is expected
   for the page to be blank!
