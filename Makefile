SHELL := /bin/bash
GRADLE_VERSION ?= 8.14

b: buildw
buildw:
	./gradlew clean build test jacocoTestReport -i
	gradle
install-jacococli:
	wget https://search.maven.org/remotecontent\?filepath\=org/jacoco/jacoco/0.8.7/jacoco-0.8.7.zip
	unzip remotecontent\?filepath=org%2Fjacoco%2Fjacoco%2F0.8.7%2Fjacoco-0.8.7.zip
unpack-reports:
	mkdir -p jacoco
	java -jar lib/jacococli.jar report itf-chartizate-android/build/jacoco/testReleaseUnitTest.exec --classfiles itf-chartizate-android/build/.transforms/*/transformed/out/jars/classes.jar --xml jacoco/jacocoRelease.xml
	java -jar lib/jacococli.jar report itf-chartizate-android/build/jacoco/testDebugUnitTest.exec --classfiles itf-chartizate-android/build/.transforms/*/transformed/out/jars/classes.jar --xml jacoco/jacocoDebug.xml
install-linux:
	sudo apt install sdkmanager
	sudo sdkmanager "build-tools;27.0.3"
	sudo sdkmanager "platform-tools" "platforms;android-28"
	sudo sdkmanager "platforms;android-30"
android-home:
	export ANDROID_HOME=/home/$(whoami)/Android/Sdk
dependencies:
	./gradlew androidDependencies
lint:
	./gradlew lint test
local-pipeline: dependencies lint b
upgrade:
	gradle wrapper --gradle-version $(GRADLE_VERSION) --validate-url
upgrade-gradle:
	sudo apt upgrade
	sudo apt update
	export SDKMAN_DIR="$(HOME)/.sdkman"; \
	[[ -s "$(HOME)/.sdkman/bin/sdkman-init.sh" ]]; \
	source "$(HOME)/.sdkman/bin/sdkman-init.sh"; \
	sdk update; \
	gradleOnlineVersion=$(shell curl -s https://services.gradle.org/versions/current | jq .version | xargs -I {} echo {}); \
	if [[ -z "$$gradleOnlineVersion" ]]; then \
		sdk install gradle $(GRADLE_VERSION); \
		sdk use gradle $(GRADLE_VERSION); \
	else \
		sdk install gradle $$gradleOnlineVersion; \
		sdk use gradle $$gradleOnlineVersion; \
		export GRADLE_VERSION=$$gradleOnlineVersion; \
	fi; \
	make upgrade
install-linux:
	sudo apt-get install jq
	sudo apt-get install curl
	curl https://services.gradle.org/versions/current
deps-gradle-update:
	curl -sL https://raw.githubusercontent.com/jesperancinha/project-signer/master/gradleUpdatesOne.sh | bash
deps-plugins-update:
	curl -sL https://raw.githubusercontent.com/jesperancinha/project-signer/master/pluginUpdatesOne.sh | bash -s -- $(PARAMS)
deps-quick-update: deps-gradle-update deps-plugins-update
accept-prs:
	curl -sL https://raw.githubusercontent.com/jesperancinha/project-signer/master/acceptPR.sh | bash
update-repo-prs:
	curl -sL https://raw.githubusercontent.com/jesperancinha/project-signer/master/update-all-repo-prs.sh | bash
