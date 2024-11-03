# itf-chartizate-android

[![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=itf-chartizate-android🧿&color=informational)](https://github.com/JEsperancinhaOrg/itf-chartizate-android)

[![GitHub License](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)

[![GitHub release](https://img.shields.io/github/v/release/JEsperancinhaOrg/itf-chartizate-android)](https://github.com/JEsperancinhaOrg/itf-chartizate-android/releases)
[![Maven Central](https://img.shields.io/maven-central/v/org.jesperancinha.itf/itf-chartizate-android)](https://mvnrepository.com/artifact/org.jesperancinha.itf/itf-chartizate-android)
[![Sonatype Nexus](https://img.shields.io/nexus/r/https/oss.sonatype.org/org.jesperancinha.itf/itf-chartizate-android.svg)](https://search.maven.org/artifact/org.jesperancinha.itf/itf-chartizate-android)

[![Status badge](https://img.shields.io/static/v1.svg?label=Status&message=Under%20Construction%20🚧&color=informational)](https://github.com/JEsperancinhaOrg/itf-chartizate-android)

[![CircleCI](https://circleci.com/gh/JEsperancinhaOrg/itf-chartizate-android.svg?style=svg)](https://circleci.com/gh/JEsperancinhaOrg/itf-chartizate-android)
[![Build status](https://ci.appveyor.com/api/projects/status/59hue3nnb3hqpn5i?svg=true)](https://ci.appveyor.com/project/jesperancinha/itf-chartizate-android)
[![itf-chartizate-android](https://github.com/JEsperancinhaOrg/itf-chartizate-android/actions/workflows/itf-chartizate-android.yml/badge.svg)](https://github.com/JEsperancinhaOrg/itf-chartizate-android/actions/workflows/itf-chartizate-android.yml)

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/023d8e96dd29487fa44bcfd03685221c)](https://www.codacy.com/gh/JEsperancinhaOrg/itf-chartizate-android/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=JEsperancinhaOrg/itf-chartizate-android&amp;utm_campaign=Badge_Grade)
[![codebeat badge](https://codebeat.co/badges/3bfe5689-c2d6-42f0-94ad-93bdbd479472)](https://codebeat.co/projects/github-com-jesperancinhaorg-itf-chartizate-android-master)
[![BCH compliance](https://bettercodehub.com/edge/badge/JEsperancinhaOrg/itf-chartizate-android?branch=master)](https://bettercodehub.com/)

[![Codacy Badge](https://app.codacy.com/project/badge/Coverage/023d8e96dd29487fa44bcfd03685221c)](https://www.codacy.com/gh/JEsperancinhaOrg/itf-chartizate-android/dashboard?utm_source=github.com&utm_medium=referral&utm_content=JEsperancinhaOrg/itf-chartizate-android&utm_campaign=Badge_Coverage)
[![Coverage Status](https://coveralls.io/repos/github/JEsperancinhaOrg/itf-chartizate-android/badge.svg?branch=master)](https://coveralls.io/github/JEsperancinhaOrg/itf-chartizate-android?branch=master)
[![codecov](https://codecov.io/gh/JEsperancinhaOrg/itf-chartizate-android/branch/master/graph/badge.svg?token=k04uju1JEa)](https://codecov.io/gh/JEsperancinhaOrg/itf-chartizate-android)

[![GitHub language count](https://img.shields.io/github/languages/count/jesperancinhaorg/itf-chartizate-android.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/top/jesperancinhaorg/itf-chartizate-android.svg)](#)
[![GitHub top language](https://img.shields.io/github/languages/code-size/jesperancinhaorg/itf-chartizate-android.svg)](#)

## Description

This project is extremely old and so it need some refreshing. Major maintenance underway.

ITF library for android

Example:

[![alt text](documentation/testMarket.jpg "Bologna Market Original Image")](https://goo.gl/maps/ujJC9RPnpqA3QG3R9)
[![alt text](documentation/testMarket1.png "Bologna Market Filter Image")](https://goo.gl/maps/ujJC9RPnpqA3QG3R9)
[![alt text](documentation/testMarket2.png "Bologna Market Filter Rd Image")](https://goo.gl/maps/ujJC9RPnpqA3QG3R9)

## Gradle

```text
implementation 'org.jesperancinha.itf:itf-chartizate-android:6.0.1'
```

## Maven

```xml
<dependency>
  <groupId>org.jesperancinha.itf</groupId>
  <artifactId>itf-chartizate-android</artifactId>
  <version>6.0.1</version>
</dependency>
```

## Buid

```shell
gradle wrapper --gradle-version 7.4
```

```shelll
gradle wrapper

./gradlew assembleRelease
```

```shell
gpg --keyring secring.gpg --export-secret-keys > ~/.gnupg/secring.gpg

./gradlew assemble -x signArchives

./gradlew assemble -x signArchives uploadArchives
```

```shell
./gradlew bintrayUpload
```

## [Jacoco](https://www.jacoco.org/jacoco/)

```shell
wget https://search.maven.org/remotecontent\?filepath\=org/jacoco/jacoco/0.8.7/jacoco-0.8.7.zip
unzip remotecontent\?filepath=org%2Fjacoco%2Fjacoco%2F0.8.7%2Fjacoco-0.8.7.zip
```

## gradle.properties

```text
signing.keyId=<keyId>
signing.password=<password>
 
sonatypeUsername=<username>
sonatypePassword=<password>
```

---

## References

## About me

[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=Jesperancinha&style=for-the-badge&logo=github&color=grey "GitHub")](https://github.com/jesperancinha)
