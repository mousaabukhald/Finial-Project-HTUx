# 🧳 Final Project Test Cases - Travel Booking Automation 🚀

![Selenium Logo](https://upload.wikimedia.org/wikipedia/commons/3/33/Selenium_Logo.png)

## 📜 Overview

This repository contains **automated test cases** for a **web-based travel booking platform** built using **Selenium WebDriver** (Java). The tests simulate user interactions and cover the core functionalities of the platform such as:

- Account creation
- Login and password recovery
- Flight search and booking
- Hotel booking
- Customer support interaction

The tests are written in **Java**, using **TestNG** as the test framework and **Selenium WebDriver** for browser automation.

---

## ⚙️ Prerequisites

Before running the tests, make sure you have the following tools installed on your machine:

- **Java JDK** version 11 or higher
- **Maven** (for dependency management)
- **Selenium WebDriver** 3.x or higher
- **ChromeDriver** (or any WebDriver corresponding to your browser)
- **TestNG** for running the tests

You can install dependencies using **Maven** by defining them in the `pom.xml` file.

---

## 🚀 Setup Instructions

### 1. Clone the Repository

Clone the repository to your local machine using the following command:

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
GitHub Profile
Email

yaml
نسخ

---

### Key Design Elements Explained:

1. **Badges and Logos**: Adding visual appeal with the **Selenium** logo and potentially badges for build status or test coverage (e.g., **Travis CI** badge).
   
2. **Code Snippets**: Properly formatted code blocks for cloning the repo, installing dependencies, and running tests. This makes it easier for users to follow.

3. **Emojis**: Used to break up the text and make the document more engaging.

4. **Headings and Subheadings**: Clear, hierarchical structure with **H1** for the title and **H2** for major sections (like Setup, Test Cases, Technologies Used).

5. **Test Cases**: List all the major test cases with their descriptions, priorities, and whether they are enabled or disabled.

6. **Installation and Running Instructions**: Concise steps for setup, installation, and running the tests locally.

7. **License Section**: Clear indication of the licensing under **MIT** (you can replace it with the appropriate license).

---

### How to Use This Design:
1. **Create a README.md file** in your project’s root directory.
2. **Copy and Paste** the markdown content above into that file.
3. **Customize** your GitHub profile link, email, and repository-specific details like the project URL and any other specifics you may want to add.
4. **Push to GitHub**: After modifying the content to fit your project, commit the `README.md` file and push it to your GitHub repository.

---

With this approach, your README will be clean, professional, and easy to navigate!
