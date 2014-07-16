This is an example that uses maven for the project structure

To run the tests in this project, you'll need to have maven installed on the machine where you want to run the tests, you can get it here: http://maven.apache.org/download.cgi

After you clone the code in this repo, you'll need to place yourself in the support_classes directory in the command line and run: "mvn clean install" to compile those classes, since their jars are a dependency for the tests

It's key to indicate that this will be a clean install, so maven cleans up old versions of the support classes jar files in case you modify them, so you have the latest code being used for your tests

To run the test, simply go to the test_classes directory in your command line and run: "mvn clean test"
