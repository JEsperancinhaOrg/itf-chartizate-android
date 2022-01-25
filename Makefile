build:
	./gradlew clean build test jacocoTestReport -i
	#java -jar libs/jacococli.jar report itf-chartizate-android/build/jacoco/testDebugUnitTest.exec --classfiles itf-chartizate-android/build/.transforms/*/transformed/out/jars/classes.jar --xml itf-chartizate-android/build/jacoco/jacocoDebug.xml
	java -jar libs/jacococli.jar report itf-chartizate-android/build/jacoco/testReleaseUnitTest.exec --classfiles itf-chartizate-android/build/.transforms/*/transformed/out/jars/classes.jar --xml itf-chartizate-android/build/jacoco/jacocoRelease.xml
	gradle
install-jacococli:
	wget https://search.maven.org/remotecontent\?filepath\=org/jacoco/jacoco/0.8.7/jacoco-0.8.7.zip
	unzip remotecontent\?filepath=org%2Fjacoco%2Fjacoco%2F0.8.7%2Fjacoco-0.8.7.zip
