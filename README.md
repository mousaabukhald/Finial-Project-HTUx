

---

# Final Project Test Cases - Travel Booking Automation 🚀

![Selenium Logo](https://upload.wikimedia.org/wikipedia/commons/3/33/Selenium_Logo.png)

## 📜 Overview

This repository contains **automated test cases** for a **web-based travel booking platform** built using **Selenium WebDriver** (Java). The tests simulate user interactions and cover core functionalities of the platform, such as:

* **Account creation**
* **Login and password recovery**
* **Flight search and booking**
* **Hotel search and booking**
* **Customer support**

---

## ⚙️ Prerequisites

Before running the test cases, ensure you have the following tools installed:

1. **Java JDK (Version 11 or Higher)**

   * Download from: [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

2. **Apache Maven**

   * Download from: [Maven](https://maven.apache.org/install.html)

3. **Selenium WebDriver 3.x or Higher**

   * Install via Maven or download from [Selenium Downloads](https://www.selenium.dev/downloads/).

4. **ChromeDriver**

   * Download from [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/).

5. **TestNG**

   * Install via Maven: `testng:testng:7.x`

---

## 🚀 Setup Guide

1. Clone this repository to your local machine:

```bash
git clone https://github.com/yourusername/FinalProjectTestCases.git
cd FinalProjectTestCases
```

2. Install required dependencies using Maven:

```bash
mvn clean install
```

3. Run the test cases using TestNG:

```bash
mvn test
```

---

## 🧪 Test Cases

### 1. **Home Page Test**

This test case ensures that the travel booking platform's home page loads successfully. It navigates to the given URL and maximizes the window.

```java
@Test(priority = 1)
public void HomePage() {
    driver.get(URL);
    driver.manage().window().maximize();
}
```

The test simply checks if the URL loads correctly and the browser window opens in full size, which is necessary for ensuring the application starts properly.

---

### 2. **Multi-language Website**

In this test case, we verify that the platform supports multiple languages (English and Arabic). It randomly selects either the English or Arabic version of the website.

```java
@Test(priority = 2)
public void MultiLanguageUsing() throws InterruptedException {
    String[] WebsitesLanguages = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
    int RandomLanguages = rand.nextInt(WebsitesLanguages.length);
    driver.get(WebsitesLanguages[RandomLanguages]);
}
```

Here, a random language (either English or Arabic) is chosen, and the respective version of the website is loaded. This ensures that the multi-language functionality works as expected.

---

### 3. **Account Creation**

This test case automates the process of creating a new account. It clicks the "Create an account" link, fills in randomly generated email and password fields, and submits the form.

```java
@Test(priority = 3)
public void CreateAccount() throws InterruptedException {
    WebElement Login = driver.findElement(By.cssSelector(".MuiButtonBase-root"));
    Login.click();
    WebElement CreatEmail = driver.findElement(By.linkText("Create an account"));
    CreatEmail.click();
    // More code to fill the form...
}
```

This test ensures that a user can successfully create an account on the platform with randomly generated credentials.

---

### 4. **Login Account**

In this test case, we log in using an existing account. The test inputs an email and password, clicks the "Sign in" button, and waits for the login process to complete.

```java
@Test(priority = 4)
public void LoginAccount() throws InterruptedException {
    WebElement Login = driver.findElement(By.cssSelector(".MuiButtonBase-root"));
    Login.click();
    WebElement Email = driver.findElement(By.id("InputField_email"));
    Email.sendKeys("user@example.com");
    WebElement Password = driver.findElement(By.id("InputField_password"));
    Password.sendKeys("password123");
    // Submit login form...
}
```

This test automates the login process to check whether users can successfully sign in with their credentials.

---

### 5. **Forgot Password**

This test verifies that the "Forgot your password?" functionality works. The test simulates the user entering their email and clicking "Continue" to reset their password.

```java
@Test(priority = 5)
public void ForgetPassword() throws InterruptedException {
    WebElement forgotPasswordLink = driver.findElement(By.xpath("//div[text()='Forgot your password?']"));
    forgotPasswordLink.click();
    WebElement SendEmail = driver.findElement(By.id("InputField_email"));
    SendEmail.sendKeys("user@example.com");
    WebElement continueButton = driver.findElement(By.xpath("//span[text()='Continue']"));
    continueButton.click();
}
```

The test checks the password recovery flow by clicking on the "Forgot Password" link and simulating the email submission process.

---

### 6. **Flight Search**

In this case, we automate the process of searching for flights between Riyadh and Dubai. The test selects airports, sets a travel date, and performs the search.

```java
@Test(priority = 6)
public void FlightSearch() throws InterruptedException {
    WebElement FlightOrigin = driver.findElement(By.id("FlightHome__AirportPicker__OriginSearchInput"));
    FlightOrigin.click();
    WebElement RiyadhAirport = driver.findElement(By.className("alm-desktop-7buqd5"));
    RiyadhAirport.click();
    WebElement FlightDestination = driver.findElement(By.id("FlightHome__AirportPicker__DestinationSearchInput"));
    FlightDestination.sendKeys("Dubai, United Arab Emirates");
    // More code for date selection and search...
}
```

This test ensures that the flight search functionality works, including selecting origin and destination airports and inputting a travel date.

---

### 7. **Booking Process**

This test simulates the process of booking a flight. After selecting a flight option, it checks prices, selects a fare family, and proceeds with booking.

```java
@Test(priority = 7)
public void BookingProcess() throws InterruptedException {
    WebElement CheckPricesButton = driver.findElement(By.xpath("//button[@data-testid='Group0__CheckPricesButton']"));
    CheckPricesButton.click();
    // More code for selecting flight and confirming booking...
}
```

The test automates the booking process, ensuring users can proceed to the booking stage after selecting a flight.

---

### 8. **Hotel Search**

This test case searches for hotels in Dubai. It enters the destination, selects check-in dates, and triggers the search.

```java
@Test(priority = 8)
public void HotelSearch() throws InterruptedException {
    WebElement Stays = driver.findElement(By.id("tab-hotels"));
    Stays.click();
    WebElement Hotels = driver.findElement(By.id("DesktopSearchWidget_Destination_InputField_Test_Id"));
    Hotels.sendKeys("Dubai");
    // More code for selecting check-in dates and searching...
}
```

It automates the hotel search, ensuring that users can find available accommodations in their desired destination.

---

### 9. **Customer Support**

This test simulates the user filling out a customer support form to report an issue with hotel booking confirmation. It enters personal details and submits the query.

```java
@Test(priority = 9)
public void CustomerSupport() throws InterruptedException {
    WebElement ContactUsLink = driver.findElement(By.linkText("Contact Us"));
    ContactUsLink.click();
    WebElement FullName = driver.findElement(By.name("full_name"));
    FullName.sendKeys("Mousa Nedal Abukhaled");
    // More code for submitting the support request...
}
```

This test ensures that users can contact customer support, submit their details, and report issues or inquiries.

---

## 📋 Conclusion

This project covers a comprehensive set of functionalities for testing a travel booking platform, from account creation to booking flights and hotels, as well as interacting with customer support.

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

