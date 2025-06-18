
---

# Final Project Test Cases - Travel Booking Automation 🚀



## 📜 Project Overview

This repository contains an **automated test suite** designed for a **web-based travel booking platform** using **Selenium WebDriver** (Java) and **TestNG**. The tests simulate real user interactions in an **automated environment**, covering various functionalities such as **account creation**, **login**, **flight and hotel booking**, and **customer support**. The main objective is to **automate the testing** of the platform's key features to ensure they are working as expected and provide **scalable and repeatable tests**.

---

## ⚙️ Prerequisites

To run the automated tests, ensure you have the following tools installed:

* **Java JDK (Version 11 or Higher)**: Required for running Java applications. You can download it from [JDK 11 Download](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
* **Apache Maven**: This tool is used for managing dependencies and building Java projects. You can install it from [Maven Install Guide](https://maven.apache.org/install.html).
* **Selenium WebDriver**: A browser automation tool used to simulate user interactions with web pages. Download it from [Selenium Downloads](https://www.selenium.dev/downloads/).
* **ChromeDriver**: WebDriver for controlling Chrome. Download it from [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/).
* **TestNG**: A testing framework for Java used to execute automated tests. TestNG is included in the `pom.xml` file (see below for dependency).

### TestNG Dependency

To ensure the necessary libraries are available for your project, add the following TestNG dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.x</version>
    <scope>test</scope>
</dependency>
```

---

## 🚀 Setup Guide

To set up and run the automated tests, follow these steps:

1. **Clone the repository** to your local machine and navigate to the project directory.
2. **Install dependencies** using the following command:

   ```bash
   mvn clean install
   ```
3. **Run the tests** using the following command:

   ```bash
   mvn test
   ```

The tests will be executed using **TestNG**, and you can view the results in the console or in the generated Maven reports.

---

## 🧪 Automated Test Cases

Here’s a breakdown of the **automated test cases** that simulate real user actions across different functionalities of the travel booking platform. The tests are automated using **Selenium WebDriver** for browser automation and **TestNG** for test management.

### 1. **Home Page Load Test 🚀**

**Objective:**
This test ensures that the **home page** of the platform loads correctly when the URL is accessed. The automation script opens the URL, maximizes the browser window, and verifies that the page loads without errors.

**Expected Outcome:**
The home page should load successfully, and the browser window should be maximized, providing a smooth user experience.

**Automation Details:**
The test is executed by opening the URL in a browser using **Selenium WebDriver** and confirming that no loading issues occur, which is essential for user access to the site.

---

### 2. **Multi-language Support 🌍**

**Objective:**
This test case ensures that the platform can handle multiple languages, particularly **English** and **Arabic**. The test automatically selects one of these languages and confirms that the content is displayed correctly in the chosen language.

**Expected Outcome:**
The platform should display content in either English or Arabic based on the language selected by the test script.

**Automation Details:**
The test uses **Selenium WebDriver** to simulate a user selecting a language and checks if the page content updates accordingly, ensuring proper language handling.

---

### 3. **Account Creation 🔑**

**Objective:**
This test automates the process of creating a new account. The test enters a valid email, sets a password, and optionally subscribes to a newsletter. It then submits the form to create the account.

**Expected Outcome:**
The account should be created successfully, and a confirmation email should be sent to the provided email address.

**Automation Details:**
**Selenium WebDriver** is used to fill out the form fields with random values for the email and password, then submit the form to complete the account creation process. A success message is expected if the form is submitted successfully.

---

### 4. **Login Functionality 🔒**

**Objective:**
This test verifies the **login** functionality by automating the login process with valid credentials (email and password). The test checks if the user can log in successfully.

**Expected Outcome:**
The user should be able to log in and be redirected to the dashboard or home page, depending on the platform’s flow.

**Automation Details:**
Using **Selenium WebDriver**, the test inputs the email and password, submits the login form, and checks if the user is logged in and redirected to the correct page.

---

### 5. **Password Recovery 🔑**

**Objective:**
This test simulates the **password recovery** process. It automates clicking the "Forgot Password" link, entering an email address, and submitting the request to reset the password.

**Expected Outcome:**
A password reset email should be sent to the user’s email address, enabling the recovery of the account.

**Automation Details:**
The test uses **Selenium WebDriver** to fill out the email field and submit the password reset request. If successful, the user will receive a reset email to the provided address.

---

### 6. **Flight Search ✈️**

**Objective:**
This test automates the **flight search** process by entering a departure city, a destination, and a travel date. The test then verifies that available flights are displayed.

**Expected Outcome:**
A list of available flights should be displayed, based on the user’s input for departure, destination, and date.

**Automation Details:**
**Selenium WebDriver** automates the selection of departure and destination airports, inputs the travel date, and ensures that the flight search results are returned as expected.

---

### 7. **Booking Process 🛒**

**Objective:**
This test automates the **flight booking process**. After selecting a flight, the test verifies that the user can confirm the fare and proceed to the booking confirmation page.

**Expected Outcome:**
The user should successfully proceed to the booking confirmation page and be ready for payment.

**Automation Details:**
The test uses **Selenium WebDriver** to simulate a user selecting a flight, confirming the fare, and proceeding through the booking stages to reach the confirmation page.

---

### 8. **Hotel Search 🏨**

**Objective:**
This test ensures that the **hotel search** functionality works by searching for hotels in a specific destination (Dubai). The test verifies that the list of hotels is correctly displayed based on the selected dates.

**Expected Outcome:**
A list of available hotels with relevant details (e.g., price, location, availability) should be displayed.

**Automation Details:**
The test uses **Selenium WebDriver** to enter the destination and check-in/check-out dates, ensuring that the results are returned and displayed on the page.

---

## 📋 Conclusion

This project demonstrates the power of **Selenium WebDriver** for automating **critical user interactions** on a travel booking platform. Each test case simulates a real user journey from **account creation** to **flight and hotel bookings**. The focus is on verifying the functionality of the core features of the platform and ensuring that the automation process runs smoothly and efficiently, providing **scalable and repeatable tests** for ongoing regression testing.

---

## 📝 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

### Final Thoughts:

* **Clear Structure:** This README provides a clean and professional structure for each **automated test**, explaining its objective and expected outcome clearly.
* **Focus on Automation:** Emphasizes that the tests are **automated** using **Selenium** and **TestNG**, and provides a detailed breakdown of each test case.
* **User-friendly:** The information is well-organized and designed to be easy to follow for both technical and non-technical users.

---

