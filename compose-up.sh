#!/usr/bin/env bash
echo "Building projects..."
./build.sh
echo "Build done!"
echo "Running docker-compose up..."
docker-compose up --build --scale rest-service=2
echo "Done!"