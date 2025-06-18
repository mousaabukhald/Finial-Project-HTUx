

````markdown
# 🧪 Travel Booking Automation Test Suite 🚀

This repository contains a **Selenium-based automated test suite** for validating the core features of a travel booking platform. The tests are written in **Java**, powered by **Selenium WebDriver**, and managed using **TestNG**.

---

## 📦 Project Overview

This suite demonstrates the following features:

- **Dynamic user account creation** with randomized input
- **Flight and hotel search** functionality with random data selection
- **Booking process** automation for flights and hotels
- **Data-driven tests** using random generators for input values

---

## ⚙️ Tech Stack

| Tool               | Description                                   |
|--------------------|-----------------------------------------------|
| Java               | Main programming language                     |
| Selenium WebDriver | UI automation framework                       |
| TestNG             | Test management and assertions                |
| ChromeDriver       | Chrome browser driver for Selenium            |

---

## 🚀 Getting Started

### ✅ Prerequisites

To run the tests, make sure you have the following installed:

- **Java JDK 11 or higher**
- **Maven**
- **Chrome browser**
- **ChromeDriver** in system path

### 🔧 Setup

Clone the repo and import it into your preferred IDE.

Install dependencies via Maven:

```bash
mvn clean install
````

To run all tests, execute the following command:

```bash
mvn test
```

---

## 📋 Test Structure

The test suite is structured in a single Java class: **`TestCases.java`**. Each test method has a defined `@Test(priority = X)` annotation and is self-contained.

---

## 🔍 Test Case Descriptions

### 1. `MultiLanguageUsing()` – 🌍 Language Toggle Test

**Status:** ✅ Enabled
**Priority:** 1
**Description:**
This test verifies the platform's ability to switch between **English** and **Arabic** languages by randomly selecting one and validating page load.

```java
String[] WebsitesLanguages = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
int RandomLanguages = rand.nextInt(WebsitesLanguages.length);
driver.get(WebsitesLanguages[RandomLanguages]);
```

---

### 2. `CreateAccount()` – 📝 New Account Registration

**Status:** ✅ Enabled
**Priority:** 2
**Description:**
Simulates the user signup process by filling in random user details (name, email, password) and submitting the form.

```java
String RandomFirstName = firstnames[randomIndex];
Email.sendKeys(username + "@gmail.com");
Select countrySelect = new Select(driver.findElement(By.id("AccountFrm_country_id")));
countrySelect.selectByVisibleText("Jordan");
```

---

### 3. `LoginAccount()` – 🔑 Login Existing User

**Status:** ✅ Enabled
**Priority:** 3
**Description:**
Automates the login process using predefined credentials to verify user authentication.

```java
Email.sendKeys("mousaabukhaled8@gmail.com");
Password.sendKeys("MOuss1234#");
driver.findElement(By.xpath("//span[text()='Sign in']")).click();
```

---

### 4. `ForgetPassword()` – 🔑 Password Recovery

**Status:** ✅ Enabled
**Priority:** 4
**Description:**
Tests the password recovery feature by submitting an email address and checking for recovery instructions.

```java
WebElement forgotPasswordLink = driver.findElement(By.xpath("//div[text()='Forgot your password?']"));
forgotPasswordLink.click();
WebElement SendEmail = driver.findElement(By.id("InputField_email"));
SendEmail.sendKeys("mousaabukhaled8@gmail.com");
driver.findElement(By.xpath("//span[text()='Continue']")).click();
```

---

### 5. `FlightSearch()` – ✈️ Flight Search

**Status:** ✅ Enabled
**Priority:** 5
**Description:**
Searches for flights from **Riyadh** to **Dubai** and selects a random available date.

```java
FlightOrigin.click();
RiyadhAirport.click();
FlightDestination.sendKeys("Dubai, United Arab Emirates");
DubiaAirport.click();
Calendar.click();
List<WebElement> AvailableDates = driver.findElements(By.className("rdp-tbody"));
int RandomIndex = rand.nextInt(AvailableDates.size());
WebElement RandomDay = AvailableDates.get(RandomIndex);
RandomDay.click();
```

---

### 6. `BookingProcess()` – 🛬 Booking Flight

**Status:** ✅ Enabled
**Priority:** 6
**Description:**
Simulates the flight booking process by selecting a flight and proceeding to the next step.

```java
WebElement CheckPricesButton = driver.findElement(By.xpath("//button[@data-testid='Group0__CheckPricesButton']"));
CheckPricesButton.click();
```

---

### 7. `SubmitInformation()` – 📝 Submit Booking Details

**Status:** ✅ Enabled
**Priority:** 7
**Description:**
Fills in personal information (first name, last name) during the booking process.

```java
titleMr.click();
FirstName.sendKeys("Mousa");
MiddleName.sendKeys("Nedel");
ListName.sendKeys("Abukhaled");
```

---

### 8. `CheckOutProcess()` – 💳 Checkout Process

**Status:** ✅ Enabled
**Priority:** 8
**Description:**
Automates the checkout process by selecting random date, month, year, and nationality for the user.

```java
String RandomDay = Days[rand.nextInt(Days.length)];
DayInput.sendKeys(RandomDay);
```

---

### 9. `HotelSearch()` – 🏨 Hotel Search

**Status:** ✅ Enabled
**Priority:** 9
**Description:**
Searches for hotels in **Dubai** and selects a random available date.

```java
WebElement Stays = driver.findElement(By.id("tab-hotels"));
Stays.click();
Hotels.sendKeys("Dubai");
BookingCalendar.click();
```

---

### 10. `HotelBookingProcess()` – 🏨 Hotel Booking

**Status:** ✅ Enabled
**Priority:** 10
**Description:**
Automates the process of booking a hotel by filling in personal and contact information.

```java
ContactFirstName.sendKeys("Mousa");
ContactEmail.sendKeys("mousaabukhaled8@gmail.com");
inputPhoneCode.click();
```

---

### 11. `FiltersSearchResults()` – 🔍 Filters Search Results

**Status:** ✅ Enabled
**Priority:** 11
**Description:**
Verifies the filtering options for hotel search results, such as **star rating** and **free cancellation**.

```java
Starrating.click();
starRating.click();
```

---

### 12. `CustomerSupport()` – 💬 Customer Support Interaction

**Status:** ✅ Enabled
**Priority:** 12
**Description:**
Simulates a customer support request submission regarding a hotel booking issue.

```java
ContactUsLink.click();
FullName.sendKeys("Mousa Nedal Abukhaled");
Phone.sendKeys("780008844");
SubmitRequest.click();
```

---

## 📂 Folder Structure

```
src
└── test
    └── java
        └── com
            └── example
                └── tests
                    └── TestCases.java
```

---

## 📌 Best Practices & Notes

* Use **`WebDriverWait`** for synchronization instead of **`Thread.sleep()`** for better stability.
* Sensitive data (e.g., passwords) should be externalized in **config files** for security.
* Consider using the **Page Object Model (POM)** design pattern to separate page locators.
* Ensure to use **`@AfterTest`** or **`@AfterClass`** annotations to properly close the driver instance after test execution using `driver.quit()`.

---

## 🔚 Future Improvements

* Add **assertions** to validate page titles or messages after actions.
* Export test results to **TestNG** or **Allure** for better reporting.
* Use **parameterized inputs** (e.g., names, emails) from **`.csv`** or **`.json`** files for data-driven testing.

---

```

### What’s New:
1. **Test Method Structure**: Each test case now has a clear description of the actions, with relevant code snippets and comments.
2. **Improved Layout**: Project overview, test descriptions, and tech stack are clearly defined to help you and others easily follow the structure.
3. **Actionable Steps**: Each section is actionable, focusing on what needs to be done at every step of the code.

Let me know if you'd like any changes!
```
