# qaworks
QAWorks Acceptance Tests

Install Maven
Maven is used to manage dependencies, build the project and run the tests.

Chrome

To run the tests in Google Chrome, you will need to install Chrome itself and ChromeDriver which can be downloaded from here. Extract chromedriver.exe and place it somewhere on your System PATH.

Compile The Code

To run all the tests in the default browser, run:

mvn clean verify

To specify which browser to use, add the webdriver.driver flag:

mvn clean verify -Dwebdriver.driver=chrome

Test Result Reports

The verify task produces a set of Serenity test reports in a html format in this folder target/site/serenity
