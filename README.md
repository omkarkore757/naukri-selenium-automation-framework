# Naukri Selenium Automation Framework

## Project Overview

This project is a Selenium TestNG automation framework developed using Java and Maven.
It follows the Page Object Model (POM) design pattern and supports data-driven testing using Excel.

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Apache POI (Excel Data Handling)
* Log4j (Logging)
* Extent Reports (Reporting)

## Framework Features

* Page Object Model (POM) structure
* Data Driven Testing using Excel
* Configurable test settings using config.properties
* Screenshot capture for failures
* Extent HTML reports
* Logging using Log4j
* TestNG execution using testng.xml

## Project Structure

src/test/java

* base → Base test setup and WebDriver initialization
* pages → Page Object classes
* tests → Test classes
* utils → Utilities like ConfigReader, ExcelUtils, ScreenshotUtil

src/test/resources

* testdata → Excel test data
* config.properties → Framework configuration
* log4j2.xml → Logging configuration

## How to Run Tests

1. Clone the repository
2. Open the project in Eclipse / IntelliJ
3. Install Maven dependencies
4. Run the TestNG suite

Run using TestNG:

testng.xml

## Author

Omkar Kore
