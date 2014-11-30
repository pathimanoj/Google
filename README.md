Google
======

Sample Selenium Webdriver project in page object model framework using java

This framework is created using Maven.
Maven gives you a basic folder structure called src/main/java , src/main/test and POM.XML file.
In POM.XML file, you will add dependencies that you need in the project.
If you run MAVEN INSTALL, all the dependencies will download.
In src/test/java, there are 2 packages, com.google and com.google.regression.
In com.google package, there is a baseTest class, where driver instialisation and driver quit happens.
In com.google.regression package, there is a RegressionTestSuite class, where all the automated automated test cases are written.

In src/main/java, there are 2 packages, com.google and com.google.pages.
In com.google package, there is a basePage class, where there is a link between basePage and baseTest classes.
In com.google.pages folder, there is a HomePage class, all the actions and reactions performed in that page written as methods.

For each and every webpage in the web application there is a separate class and all the actions and reactions 
performed in that page are written as methods.
In Test cases, just create an object for the class and call corresponding methods you need for the test case.



