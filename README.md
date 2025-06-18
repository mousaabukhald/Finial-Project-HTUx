Final Project Test Cases - Travel Booking Automation 🚀


📜 Project Overview
This repository contains an automated test suite designed for a web-based travel booking platform using Selenium WebDriver (Java) and TestNG. The tests simulate real user interactions across various functionalities of the platform, such as account creation, login, flight and hotel booking, and customer support. The primary goal is to ensure the platform’s key features are working as expected and deliver a seamless user experience.

⚙️ Prerequisites
To get started, make sure you have the following tools installed:

Tool	Description	Installation Link
Java JDK	Required to run Java applications.	JDK 11 Download
Apache Maven	Tool for managing dependencies and building Java projects.	Maven Install Guide
Selenium WebDriver	A browser automation tool for web testing.	Selenium Downloads
ChromeDriver	WebDriver for controlling Chrome.	ChromeDriver
TestNG	A testing framework for Java used to run the automated tests.	TestNG is included in the pom.xml file (see below)

🚀 Setup Guide
Follow these steps to set up and run the automated tests:

Step	Description
Clone the repository	Clone the project to your local machine and navigate to the project directory.
Install dependencies	Run mvn clean install to install the necessary dependencies for your project.
Run the tests	Execute the tests using mvn test and view the results.

🧪 Test Cases
1. Home Page Load Test 🚀
Description:
This test ensures that the home page of the platform loads correctly when the URL is accessed. It also verifies that the window is maximized for proper visibility.

Objective:
To confirm that the home page is accessible and displays correctly to users upon launch.

Expected Outcome:
The page should load successfully, with no errors, and the browser window should be maximized.

Status:

Pass: If the home page is displayed correctly.

Fail: If there are errors during the page load or the page does not display as expected.

2. Multi-language Support 🌍
Description:
This test checks the platform’s ability to support multiple languages, particularly English and Arabic. The test will randomly select one of these languages and verify that the platform displays content in the selected language.

Objective:
To ensure that users can view the platform in their preferred language and that language switching works smoothly.

Expected Outcome:
The page should switch to the selected language (either English or Arabic) and display relevant content.

Status:

Pass: If the language is switched successfully.

Fail: If the platform does not switch languages or displays incorrect content.

3. Account Creation 🔑
Description:
This test simulates the account creation process. It includes entering an email address, setting a password, subscribing to the newsletter (optional), and submitting the registration form.

Objective:
To verify that users can create a new account and that all required fields are validated.

Expected Outcome:
The account should be created successfully, and a confirmation or welcome email should be sent to the user.

Status:

Pass: If the account is created and a confirmation email is received.

Fail: If the account is not created or there is an issue with the form submission.

4. Login Functionality 🔒
Description:
This test automates the login process for an existing account. The test enters valid credentials (email and password) and submits the form to verify successful login.

Objective:
To ensure that the platform's login functionality works as expected, allowing users to access their accounts after entering valid credentials.

Expected Outcome:
The user should be logged in and redirected to the dashboard or home page.

Status:

Pass: If the user is logged in successfully.

Fail: If the login fails due to incorrect credentials or a technical issue.

5. Password Recovery 🔑
Description:
This test verifies the password recovery process. It involves clicking the "Forgot Password" link, entering the registered email address, and submitting the request to reset the password.

Objective:
To ensure that users can recover their password if they forget it and that they receive a reset email.

Expected Outcome:
A password reset email should be sent to the user's email address.

Status:

Pass: If the password reset email is received.

Fail: If the email is not sent or if the process fails at any stage.

6. Flight Search ✈️
Description:
This test automates the process of searching for a flight between Riyadh and Dubai. It inputs the departure and destination cities, selects a travel date, and initiates the search for available flights.

Objective:
To confirm that the flight search feature is functional and that the platform returns available flight options.

Expected Outcome:
The search results should display a list of available flights for the selected route and dates.

Status:

Pass: If flights are found for the specified route.

Fail: If no flights are found or the search function does not return results.

7. Booking Process 🛒
Description:
This test verifies the flight booking process. After selecting a flight, it simulates the process of choosing a fare option, confirming prices, and proceeding with the booking.

Objective:
To test that the user can successfully select a flight, view prices, and proceed to the payment section.

Expected Outcome:
The user should be able to proceed to the booking confirmation page and check out.

Status:

Pass: If the user can proceed to the payment page without issues.

Fail: If the user encounters errors or is unable to proceed.

8. Hotel Search 🏨
Description:
This test ensures that the hotel search functionality works. The test involves searching for hotels in Dubai by entering the destination and selecting check-in and check-out dates.

Objective:
To confirm that the platform can correctly search for available hotels in the specified location.

Expected Outcome:
The system should return a list of available hotels with pricing and booking options.

Status:

Pass: If hotels are listed based on the search criteria.

Fail: If no hotels are returned or there is an issue with the search.

📋 Conclusion
This project demonstrates the power of Selenium WebDriver for automating critical user interactions on a travel booking platform. From account creation and login to searching for flights and hotels, every critical user flow is tested to ensure the application’s reliability and user experience.

📝 License
This project is licensed under the MIT License - see the LICENSE file for details.

