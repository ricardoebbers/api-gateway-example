#!/usr/bin/env bash
function build {
  cd $1
  echo "Building $1 project..."
  ./gradlew build
  mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)
  echo "Project $1 built!"
  cd ..
}
build gateway
build registry
build rest-service