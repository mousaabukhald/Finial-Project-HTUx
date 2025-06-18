# 🌍 Final Project Test Cases 🚀

![Selenium Logo](https://upload.wikimedia.org/wikipedia/commons/3/33/Selenium_Logo.png)

## 📚 Overview

This project contains **automated test cases** for a **web-based travel booking platform**. The tests use **Selenium WebDriver** for browser automation and **TestNG** for test management. It simulates real user interactions to verify key functionalities such as:

- **Account Management** (Sign up, login, reset password)
- **Flight Booking**
- **Hotel Booking**
- **Customer Support Interaction**

---

## ⚙️ Prerequisites

To run the tests locally, make sure you have these tools installed:

- **Java JDK** 11 or higher
- **Maven** (for dependency management and building the project)
- **Selenium WebDriver** 3.x or higher
- **ChromeDriver** (or any WebDriver for your preferred browser)
- **TestNG** (for running tests)

You can install dependencies using **Maven**.

---

## 🚀 Setup Guide

### 1. **Clone the repository:**

```bash
git clone https://github.com/yourusername/FinalProjectTestCases.git
2. Install Dependencies
Ensure your Maven dependencies are set up in the pom.xml. Here's a sample setup:

xml
نسخ
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.3.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
3. Download ChromeDriver
Download ChromeDriver from this link.

Ensure ChromeDriver is either:

Added to your system's PATH

Or, specify its location in the code directly.

4. Configure the Base URL
Open the code and update the URL variable with the actual base URL of the web application you're testing.

🏃‍♂️ Running the Tests
Using Maven (Command Line):
Install Project Dependencies:

Navigate to the project directory and run the following command:

bash
نسخ
mvn clean install
Run the Tests:

Execute the tests with:

bash
نسخ
mvn test
Using IDE (IntelliJ IDEA / Eclipse):
Open the Project in your preferred IDE.

Run the tests by right-clicking the test class or package and selecting Run.

🧪 Test Cases
1. MultiLanguageUsing
Description: Switches between English and Arabic versions of the website.

Priority: High

Enabled: No (for future testing)

2. CreateAccount
Description: Creates a new user account, logs in, and verifies the account creation.

Priority: High

Enabled: No

3. LoginAccount
Description: Logs into an account using predefined credentials.

Priority: Medium

Enabled: No

4. ForgetPassword
Description: Tests the password reset functionality.

Priority: Medium

Enabled: No

5. FlightSearch
Description: Verifies flight search functionality by choosing the origin and destination airports.

Priority: High

Enabled: Yes

6. BookingProcess
Description: Completes the flight booking process.

Priority: High

Enabled: Yes

7. SubmitInformation
Description: Submits passenger information during the flight booking.

Priority: High

Enabled: Yes

8. CheckOutProcess
Description: Completes the checkout process, including submitting payment details.

Priority: High

Enabled: Yes

🛠️ Technologies Used
Selenium WebDriver: Automates web browser interaction.

TestNG: Test management framework.

Java: Programming language for test case implementation.

ChromeDriver: Browser driver for Selenium to interact with Chrome.

Maven: For managing project dependencies.

📊 Test Execution Results
Test Results: View real-time execution results by using a testing CI/CD pipeline such as Travis CI, CircleCI, or GitHub Actions. The results can be visualized in TestNG Reports.

📝 License
This project is licensed under the MIT License. See the LICENSE file for more details.

🌱 Contribution Guidelines
We welcome contributions to improve this project! If you want to improve the project, follow these steps:

Fork the repository.

Create a new branch (git checkout -b feature-branch).

Commit your changes (git commit -am 'Add new feature').

Push to the branch (git push origin feature-branch).

Open a pull request.

📬 Contact
If you have any questions, feel free to reach out!

Mousa Abukhaled
