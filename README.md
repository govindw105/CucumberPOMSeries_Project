🧪 Cucumber Selenium POM Framework

📌 Project Overview

This project implements a Page Object Model (POM) based automation testing framework using Cucumber BDD, TestNG, and Selenium WebDriver. The framework automates login functionality and account page validation on the Automation Practice website (http://www.automationpractice.pl).[1]
​

The automation framework:

Validates login page elements and title

Performs successful login with credentials

Verifies accounts page sections and count

Generates comprehensive HTML/Extent reports

Supports parallel test execution

🛠️ Tech Stack

Component	Version/Tools
Language	Java 17 
​
Automation	Selenium WebDriver 4.34.0 
​
BDD Framework	Cucumber 7.14.0 + TestNG 
​
Test Runner	TestNG 7.11.0 
​
Reporting	ExtentReports 5.1.1 + Cucumber Adapter 
​
Driver Management	WebDriverManager 6.2.0 
​
Build Tool	Maven 
​
Version Control	Git & GitHub
🧪 Functional Flow Automated

Launch login page and validate title

Verify forgot password link visibility
​

Enter credentials using DataTable
​

Perform login and navigate to accounts page

Validate accounts sections list and count

Generate test execution reports

⚙️ Key Automation Concepts Implemented
✅ Page Object Model (POM)

LoginPage.java & AccountsPage.java with locators and actions

✅ Cucumber BDD Structure

Gherkin scenarios with step definitions

DataTable support for test data
​

✅ TestNG Integration

Parallel execution via @DataProvider(parallel=true)
​

Failed test rerun capability
​

✅ Framework Features

DriverFactory.java for browser management
​

ConfigReader.java for property-based configuration
​

ApplicationHooks.java for setup/teardown & screenshots
​

ExtentReports with timeline & custom config

✅ Maven Configuration

Surefire/Failsafe plugins for parallel execution
​

cucumber.json + HTML + Extent reports generation
​

📂 Project Structure

text
├── src/test/java/
│   ├── com/pages/          # POM classes [file:2][file:3]
│   ├── com/qa/factory/     # Driver & Config [file:4][file:5]
│   └── parallel/           # Steps, Hooks, Runners [file:8][file:9][file:10][file:11]
├── src/test/resources/     # Feature files (assumed)
├── pom.xml                 # Dependencies & Plugins [file:1]
└── extent-config.xml       # Report configuration [file:14]
▶️ How to Run

bash
# Clone repository
git clone <repo-url>

# Install dependencies
mvn clean install

# Run all tests
mvn test

# Run parallel execution
mvn verify

# View reports
target/cucumber-reports.html
test-output/ (Extent Reports)
🎯 Learning Outcomes

✅ Implementing Page Object Model pattern

✅ Cucumber BDD with TestNG integration

✅ Parallel test execution configuration

✅ ExtentReports generation & customization

✅ DataTable handling in step definitions

✅ Framework hooks for setup/teardown

✅ Maven multi-module test execution

✅ Cross-browser testing setup

Reports generated: HTML, JSON, Extent Dashboard, Timeline
​
