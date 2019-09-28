#!/usr/bin/env bash
echo "You are now deploying version 6.0.1 to bintray."
echo "Building and installing version 6.0.1"
gradle clean build install
echo "Uploading libraries to bintray"
./gradlew bintrayUpload
