# itf-chartizate-android

[![Twitter URL](https://img.shields.io/twitter/url?logoColor=blue&style=social&url=https%3A%2F%2Fimg.shields.io%2Ftwitter%2Furl%3Fstyle%3Dsocial)](https://twitter.com/intent/tweet?text=%20Checkout%20this%20%40github%20repo%20by%20%40joaofse%20%F0%9F%91%A8%F0%9F%8F%BD%E2%80%8D%F0%9F%92%BB%3A%20https%3A//github.com/JEsperancinhaOrg/itf-chartizate-android)
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

[![](https://img.shields.io/badge/youtube-%230077B5.svg?style=for-the-badge&logo=youtube&color=red)](https://www.youtube.com/@joaoesperancinha)
[![](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/@jofisaes)
[![](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/joaoesperancinha/)
[![](https://img.shields.io/badge/Spotify-1ED760?style=for-the-badge&logo=spotify&logoColor=white)](https://open.spotify.com/user/jlnozkcomrxgsaip7yvffpqqm)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/JEOrgLogo-20.png "João Esperancinha Homepage")](http://joaofilipesabinoesperancinha.nl)
[![GitHub followers](https://img.shields.io/github/followers/jesperancinha.svg?label=Jesperancinha&style=social "GitHub")](https://github.com/jesperancinha)
[![alt text](https://raw.githubusercontent.com/jesperancinha/project-signer/master/project-signer-templates/icons-20/mastodon-20.png "Mastodon")](https://masto.ai/@jesperancinha)
[![Twitter Follow](https://img.shields.io/twitter/follow/joaofse?label=João%20Esperancinha&style=social "Twitter")](https://twitter.com/joaofse)
| [Sessionize](https://sessionize.com/joao-esperancinha/)
| [Instagram](https://www.instagram.com/joaofisaes/)
| [Buy me a coffee](https://www.buymeacoffee.com/jesperancinha)
| [Credly Badges](https://www.credly.com/users/joao-esperancinha)
| [Google Apps](https://play.google.com/store/apps/developer?id=Joao+Filipe+Sabino+Esperancinha)
| [Sonatype Search Repos](https://search.maven.org/search?q=org.jesperancinha)
| [Docker Images](https://hub.docker.com/u/jesperancinha)
| [Stack Overflow Profile](https://stackoverflow.com/users/3702839/joao-esperancinha)
| [Reddit](https://www.reddit.com/user/jesperancinha/)
| [Dev.TO](https://dev.to/jofisaes)
| [Hackernoon](https://hackernoon.com/@jesperancinha)
| [Code Project](https://www.codeproject.com/Members/jesperancinha)
| [BitBucket](https://bitbucket.org/jesperancinha)
| [GitLab](https://gitlab.com/jesperancinha)
| [Coursera](https://www.coursera.org/user/da3ff90299fa9297e283ee8e65364ffb)
| [FreeCodeCamp](https://www.freecodecamp.org/jofisaes)
| [HackerRank](https://www.hackerrank.com/jofisaes)
| [LeetCode](https://leetcode.com/jofisaes)
| [Codebyte](https://coderbyte.com/profile/jesperancinha)
| [CodeWars](https://www.codewars.com/users/jesperancinha)
| [Code Pen](https://codepen.io/jesperancinha)
| [Hacker Earth](https://www.hackerearth.com/@jofisaes)
| [Khan Academy](https://www.khanacademy.org/profile/jofisaes)
| [Hacker News](https://news.ycombinator.com/user?id=jesperancinha)
| [InfoQ](https://www.infoq.com/profile/Joao-Esperancinha.2/)
| [LinkedIn](https://www.linkedin.com/in/joaoesperancinha/)
| [Xing](https://www.xing.com/profile/Joao_Esperancinha/cv)
| [Tumblr](https://jofisaes.tumblr.com/)
| [Pinterest](https://nl.pinterest.com/jesperancinha/)
| [Quora](https://nl.quora.com/profile/Jo%C3%A3o-Esperancinha)
| [VMware Spring Professional 2021](https://www.credly.com/badges/762fa7a4-9cf4-417d-bd29-7e072d74cdb7)
| [Oracle Certified Professional, Java SE 11 Programmer](https://www.credly.com/badges/87609d8e-27c5-45c9-9e42-60a5e9283280)
| [Oracle Certified Professional, JEE7 Developer](https://www.credly.com/badges/27a14e06-f591-4105-91ca-8c3215ef39a2)
| [IBM Cybersecurity Analyst Professional](https://www.credly.com/badges/ad1f4abe-3dfa-4a8c-b3c7-bae4669ad8ce)
| [Certified Advanced JavaScript Developer](https://cancanit.com/certified/1462/)
| [Certified Neo4j Professional](https://graphacademy.neo4j.com/certificates/c279afd7c3988bd727f8b3acb44b87f7504f940aac952495ff827dbfcac024fb.pdf)
| [Deep Learning](https://www.credly.com/badges/8d27e38c-869d-4815-8df3-13762c642d64)
| [![Generic badge](https://img.shields.io/static/v1.svg?label=GitHub&message=JEsperancinhaOrg&color=yellow "jesperancinha.org dependencies")](https://github.com/JEsperancinhaOrg)
[![Generic badge](https://img.shields.io/static/v1.svg?label=All%20Badges&message=Badges&color=red "All badges")](https://joaofilipesabinoesperancinha.nl/badges)
[![Generic badge](https://img.shields.io/static/v1.svg?label=Status&message=Project%20Status&color=red "Project statuses")](https://github.com/jesperancinha/project-signer/blob/master/project-signer-quality/Build.md)
