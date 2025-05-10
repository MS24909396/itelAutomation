# 🧪 Selenium Java BDD Framework with Cucumber & ExtentReports

This project is a basic automation framework using:
- Selenium WebDriver
- Cucumber (BDD with Gherkin)
- JUnit
- Maven
- ExtentReports for HTML reporting

## ✅ Project Structure

```
src
├── main
│   └── resources
│       └── extent.properties       # Extent report configuration
├── test
│   ├── java
│   │   └── org.example
│   │       ├── runners
│   │       │   └── TestRunner.java
│   │       └── stepdefinitions
│   │           └── LoginSteps.java
│   └── resources
│       └── features
│           └── login.feature
```

## ⚙️ Prerequisites

- Java 11 or higher (Java 23 compatible)
- Maven installed and added to your PATH
- Git (to manage version control)
- Chrome browser installed
- ChromeDriver installed and in your PATH
- Your test environment should be running locally at:  
  👉 `http://localhost:3000/`

## 🚀 How to Run the Tests

### 🔁 1. Clone the Repository

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

### 🔨 2. Run Tests Using Maven

```bash
mvn clean test
```

> This will:
> - Launch Chrome
> - Navigate to the target URL
> - Execute the scenarios from `login.feature`
> - Generate ExtentReports

## 📊 Where to Find the Test Reports

After running the tests, open the following file in a browser:

```
target/reports/ExtentReport.html
```

> This file includes all your **step logs**, **pass/fail status**, and detailed test reports.

## 📦 Project Dependencies

```xml
<dependencies>
  <!-- Cucumber -->
  <dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.14.0</version>
  </dependency>
  <dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.14.0</version>
  </dependency>

  <!-- Selenium -->
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.19.1</version>
  </dependency>

  <!-- ExtentReports -->
  <dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>5.1.1</version>
  </dependency>
  <dependency>
    <groupId>tech.grasshopper</groupId>
    <artifactId>extentreports-cucumber7-adapter</artifactId>
    <version>1.14.0</version>
  </dependency>
</dependencies>
```

## 📁 Configurable Report Settings

Update `src/test/resources/extent.properties` to modify report path or settings:

```properties
extent.reporter.spark.start=true
extent.reporter.spark.out=target/reports/ExtentReport.html
```

## 🙋 Support

If you run into any issues, raise an issue on GitHub or contact the project maintainer.

---

Happy Testing! 🎯
