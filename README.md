🧪 Cucumber Selenium BDD Automation Framework

📌 Project Overview

This project is a Cucumber BDD-based automation framework built using Selenium WebDriver and TestNG.

The framework automates the login functionality and account page validation of the Automation Practice website:

👉 http://www.automationpractice.pl

The project follows the Page Object Model (POM) design pattern and supports parallel test execution.

🛠️ Tech Stack

Java 17

Selenium WebDriver

Cucumber (BDD)

TestNG

Maven

WebDriverManager

Extent Reports

Git & GitHub

🧪 Functionalities Automated

Validate Login page title

Verify Forgot Password link

Perform login using valid credentials

Navigate to Accounts page

Validate account sections

Verify total number of sections

Capture screenshots for failed scenarios

Generate HTML & Extent Reports

⚙️ Framework Architecture
✅ Page Object Model (POM)

LoginPage.java – Contains login page locators and actions

AccountsPage.java – Contains account page locators and validations

✅ Driver Management

DriverFactory.java – Manages WebDriver initialization

Uses ThreadLocal for parallel execution support

✅ Cucumber BDD Structure

Feature files written in Gherkin

Step Definitions mapped to feature steps

DataTable used for passing login credentials

✅ Hooks

ApplicationHooks.java

Handles browser setup & teardown

Captures screenshots for failed tests

✅ Reporting

Cucumber HTML Report

JSON Report

Extent Reports integration

📂 Project Structure
src/test/java/
 ├── com/pages/          # Page Object classes
 ├── com/qa/factory/     # Driver & Configuration
 ├── parallel/           # Steps, Hooks, Runner

src/test/resources/
 ├── features/           # Gherkin feature files

pom.xml                  # Dependencies & Plugins
extent-config.xml        # Extent report configuration
▶️ How to Run
Run all tests:
mvn clean test
Run parallel execution:
mvn verify
View Reports:

target/cucumber-reports.html

test-output/ExtentReports

🎯 Key Learning Outcomes

Implementing Page Object Model (POM)

Cucumber BDD framework integration

Parallel execution using TestNG

Driver management using ThreadLocal

DataTable usage in Cucumber

Extent report configuration

Maven test execution lifecycle
