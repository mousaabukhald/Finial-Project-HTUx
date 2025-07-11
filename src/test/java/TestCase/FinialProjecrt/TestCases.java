package TestCase.FinialProjecrt;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases extends DataTestCase {

	WebDriver driver = new ChromeDriver();

	Random rand = new Random();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	@BeforeTest

	public void HomePage() {

		driver.get(URL);
		driver.manage().window().maximize();

	}
	
	
	
	@Test(priority = 1)
	public void LoginAccount() throws InterruptedException {

		WebElement Login = driver.findElement(By.cssSelector(".MuiButtonBase-root.alm-desktop-1nxh3l"));
		Login.click();

		WebElement ClickEmail = driver.findElement(By.id("tab-tab-1"));
		ClickEmail.click();

		WebElement Email = driver.findElement(By.id("InputField_email"));
		Email.sendKeys("Mousaabukhaled8@gmail.com");

		WebElement Password = driver.findElement(By.id("InputField_password"));
		Password.sendKeys("MOuss1234#");

		WebElement SignInButton = driver.findElement(By.id("mui-7"));
		SignInButton.click();
        
		Thread.sleep(3000);
		
		
	}
	
	
	@Test(priority = 2, invocationCount = 5)
	public void MultiLanguageUsing() throws InterruptedException {

		String[] WebsitesLanguages = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };
		int RandomLanguages = rand.nextInt(WebsitesLanguages.length);
		Thread.sleep(500);
		driver.get(WebsitesLanguages[RandomLanguages]); 
		Thread.sleep(2000);
	}
	

	@Test(priority = 3,enabled = false)
	public void CreateAccount() throws InterruptedException {
		driver.get(URL);
		WebElement Login = driver.findElement(By.cssSelector(".MuiButtonBase-root.alm-desktop-1nxh3l"));
		Login.click();

		WebElement CreatEmail = driver.findElement(By.linkText("Create an account"));
		CreatEmail.click();

		WebElement ClickEmail = driver.findElement(By.id("tab-tab-1"));
		ClickEmail.click();

		WebElement Email = driver.findElement(By.id("InputField_email"));
		int randomIndex = rand.nextInt(Emails.length);
		String SelectedEmail = Emails[randomIndex];
		Email.sendKeys(SelectedEmail);

		WebElement Password = driver.findElement(By.id("InputField_password"));
        int randomIndexPassword = rand.nextInt(Passwords.length);
		String SelectedPassword = Passwords[randomIndexPassword];
		Password.sendKeys(SelectedPassword);

		WebElement CheckboxSubscribe = driver.findElement(By.id("checkbox_subscribe"));
		CheckboxSubscribe.click();

		WebElement createAccountButton = driver.findElement(By.xpath("//span[text()='Create an account']"));
		createAccountButton.click();

		Thread.sleep(3000);

		WebElement SignInButton = driver.findElement(By.xpath("//div[text()='Sign in']"));
		SignInButton.click();

		WebElement ClickEmailAgain = wait.until(ExpectedConditions.elementToBeClickable(By.id("tab-tab-1")));
		ClickEmailAgain.click();

		WebElement EmailAgain = driver.findElement(By.id("InputField_email"));
		EmailAgain.sendKeys(SelectedEmail);

		WebElement PasswordAgain = driver.findElement(By.id("InputField_password"));
		PasswordAgain.sendKeys(SelectedPassword);

		WebElement SignInSubmit = driver.findElement(By.xpath("//span[text()='Sign in']"));
		SignInSubmit.click();

		Thread.sleep(3000);

		System.out.println("Created and signed in successfully with: " + SelectedEmail);
		Thread.sleep(2000);
		
	}
	


	

	@Test(priority = 4,enabled = false)
	public void ForgetPassward() throws InterruptedException {
		driver.get(URL);
		WebElement Login = driver.findElement(By.cssSelector(".MuiButtonBase-root.alm-desktop-1nxh3l"));
		Login.click();
		Thread.sleep(2000);
		WebElement forgotPasswordLink = driver.findElement(By.xpath("//div[text()='Forgot your password?']"));
		forgotPasswordLink.click();

		Thread.sleep(2000);
		WebElement ClickEmail = driver.findElement(By.id("tab-tab-1"));
		ClickEmail.click();
		Thread.sleep(2000);
		WebElement SendEmail = driver.findElement(By.id("InputField_email"));
		SendEmail.sendKeys("mousaabukhaled8@gmail.com");
		Thread.sleep(2000);
		WebElement continueButton = driver.findElement(By.xpath("//span[text()='Continue']"));
		continueButton.click();

	}
	
	
	@Test(priority = 5,enabled = false)
	public void FlightSearch() throws InterruptedException {

		WebElement FlightOrigin = driver.findElement(By.id("FlightHome__AirportPicker__OriginSearchInput"));
		FlightOrigin.click();

		Thread.sleep(3000);

		WebElement RiyadhAirport = driver.findElement(By.className("alm-desktop-7buqd5"));
		RiyadhAirport.click();

		Thread.sleep(4000);

		WebElement FlightDestination = driver.findElement(By.id("FlightHome__AirportPicker__DestinationSearchInput"));
		FlightDestination.sendKeys("Dubai, United Arab Emirates");

		Thread.sleep(2000);

		WebElement DubiaAirport = driver.findElement(By.className("alm-desktop-1x2nrxx"));
		DubiaAirport.click();

		WebElement Calendar = driver.findElement(By.id("testIdPickerPrefix__DatePicker__DepartureDate"));
		Calendar.click();

		Thread.sleep(2000);

		List<WebElement> AvailableDates = driver.findElements(By.className("rdp-tbody"));

		Thread.sleep(2000);

		int RandomIndex = rand.nextInt(AvailableDates.size());
		WebElement RandomDay = AvailableDates.get(RandomIndex);
		Thread.sleep(2000);

		String selectedDay = RandomDay.getText();
		RandomDay.click();
		Thread.sleep(2000);

		WebElement Search = driver.findElement(By.id("mui-1"));
		Search.click();
		
	}

	
	
	@Test(priority = 6,enabled = false)
	public void BookingProcess() throws InterruptedException {
		Thread.sleep(12000);
		WebElement CheckPricesButton = driver.findElement(By.xpath("//button[@data-testid='Group0__CheckPricesButton']"));
		CheckPricesButton.click();

		Thread.sleep(3000);

		WebElement SelectButton = driver.findElement(By.xpath("//button[@data-testid='FareFamilyCard__Option0__SelectCTA']"));
		SelectButton.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,100)");

		WebElement CheckPriceButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='Group0__CheckPricesButton']")));
		CheckPriceButton.click();

		WebElement SelectToButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='FareFamilyCard__Option0__SelectCTA']")));
		SelectToButton.click();

		WebElement ContinueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='SummaryPrice__Continue_Button']")));
		ContinueButton.click();

		Thread.sleep(4000);

	}
	

	@Test(priority = 7,enabled = false )
	public void SubmitInformation() throws InterruptedException {

		WebElement titleMr = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-testid='PaxForm__ADT1__TitleOption__Mr']")));
		titleMr.click();

		Thread.sleep(2000);
		WebElement FirstName = driver.findElement(By.name("firstName"));
		FirstName.sendKeys("Mousa");

		Thread.sleep(1000);

		WebElement MiddleName = driver.findElement(By.name("middleName"));
		MiddleName.sendKeys("Nedel");

		Thread.sleep(1000);

		WebElement ListName = driver.findElement(By.name("lastName"));
		ListName.sendKeys("Abukhaled");

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,200)");

		
		Thread.sleep(3000);
		
		
	}
		

    @Test(priority = 8,enabled = false)
    public void CheckOutProcess() throws InterruptedException {
    
        String RandomDay = Days[rand.nextInt(Days.length)];
        WebElement DayInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("mui-2")));
        DayInput.click();
        DayInput.sendKeys(RandomDay);
        DayInput.sendKeys(Keys.ENTER);

		Thread.sleep(3000);

        String RandomMonth = Months[rand.nextInt(Months.length)];
        WebElement MonthsInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("mui-3")));
        MonthsInput.click();
        MonthsInput.sendKeys(RandomMonth);
        MonthsInput.sendKeys(Keys.ENTER);
        
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,200)");
		Thread.sleep(3000);

        String RandomYear = Years[rand.nextInt(Years.length)];
        WebElement YearsInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("mui-4")));
        YearsInput.click();
        YearsInput.sendKeys(RandomYear);
        YearsInput.sendKeys(Keys.ENTER);
        
		Thread.sleep(3000);

        WebElement nationality = driver.findElement(By.id("mui-5"));
        nationality.click();
        nationality.sendKeys("Jordan");
        nationality.sendKeys(Keys.ENTER);
        
		Thread.sleep(3000);
	    js.executeScript("window.scrollTo(0,0)");	

    }

	
	@Test(priority = 9)
	public void HotelSearch() throws InterruptedException {
		driver.get(URL);
		WebElement Stays = driver.findElement(By.id("tab-hotels"));
		Stays.click();

		WebElement Hotels = driver.findElement(By.id("DesktopSearchWidget_Destination_InputField_Test_Id"));
		Hotels.sendKeys("Dubai");

		WebElement BookingCalendar = driver.findElement(By.id("DesktopSearchWidget_Dates_Check_In_InputField_Test_Id"));
		BookingCalendar.click();

		Thread.sleep(500);

		List<WebElement> AvailableDates = driver.findElements(By.className("DayPicker-Body"));

		Thread.sleep(500);

		int RandomIndex = rand.nextInt(AvailableDates.size());
		WebElement RandomDay = AvailableDates.get(RandomIndex);
		Thread.sleep(500);

		String selectedDay = RandomDay.getText();
		RandomDay.click();
		Thread.sleep(500);

		WebElement Search = driver.findElement(By.id("mui-4"));
		Search.click();
		 
		Thread.sleep(500);

	}

	@Test(priority = 10)
	public void HotelBookingProcess() throws InterruptedException {

		driver.get("https://www.almosafer.com/en/hotel/details/atg/hyde-hotel-dubai-1999925?checkin=09-07-2025&checkout=10-07-2025&rooms=2_adult");
		WebElement hotelName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Hyde Hotel Dubai']")));
	    hotelName.click();

	    Thread.sleep(6000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,800)");
        Thread.sleep(500);
	    WebElement bookNowButton = driver.findElement(By.id("mui-13"));
	    bookNowButton.click();
        Thread.sleep(2000);

	    js.executeScript("window.scrollTo(0,500)");
	    
	    WebElement mrOption = driver.findElement(By.xpath("//p[text()='Mr.']"));
        mrOption.click();
        Thread.sleep(1000);
		WebElement ContactFirstName = driver.findElement(By.id("contact.firstname"));
		ContactFirstName.sendKeys("Mousa");
		Thread.sleep(1000);
		WebElement ContactLastName = driver.findElement(By.id("contact.lastname"));
		ContactLastName.sendKeys("Abukhaled");

		WebElement ContactEmail = driver.findElement(By.id("contact.email"));
		ContactEmail.sendKeys("");
		
		Thread.sleep(2000);

		WebElement inputPhoneCode = wait.until(ExpectedConditions.elementToBeClickable(By.id("mui-6")));
		inputPhoneCode.click();
		
		Thread.sleep(500);
		inputPhoneCode.click();

		List<WebElement> options = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li[contains(@class, 'MuiAutocomplete-option')]")));
		Thread.sleep(500);

		for (WebElement option : options) {
		    if (option.getText().contains("+962")) {
		        option.click();   
		        break;
		    }
		}

		
		
		WebElement contactPhoneNumber = driver.findElement(By.id("contact.phoneNumber"));
		Thread.sleep(300);
		contactPhoneNumber.sendKeys("782888006");
		
		 js.executeScript("window.scrollTo(0,700)");
		Thread.sleep(1000);
		
		WebElement Countine = driver.findElement(By.id("mui-3"));
		Countine.click();

		Thread.sleep(1000);
		
		
	}
	
	
		@Test(priority = 11)
		public void CheckOutHotal() throws InterruptedException {
			

		WebElement CardNumber = driver.findElement(By.name("cardNumber"));
		CardNumber.sendKeys("4475 2210 0365 1981");
		
		
		WebElement ExpiryDate = driver.findElement(By.name("expiryDate"));
		ExpiryDate.sendKeys("11/30");
		
		WebElement Cvv = driver.findElement(By.name("cvv"));
		Cvv.sendKeys("2536");
		
		Thread.sleep(500);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,600)");
		Thread.sleep(500);

		WebElement NameInput = driver.findElement(By.xpath("//input[@id='outlined-basic' and @testid='name']"));
		NameInput.sendKeys("Mousa Abukhald");
		
		Thread.sleep(500);

		js.executeScript("window.scrollTo(0,700)");
		
		Thread.sleep(500);
		
		WebElement PayNowButton = driver.findElement(By.id("mui-4"));
		PayNowButton.click();
	
		Thread.sleep(1000);
	}

		
	@Test(priority = 12, enabled = false)
	public void FiltersSearchResults() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,700)");

		Thread.sleep(2000);
		WebElement Starrating = driver.findElement(By.xpath("//p[text()='Free cancellation']"));
		Starrating.click();
		Thread.sleep(2000);
		WebElement starRating = driver.findElement(By.xpath("//div[text()='5 stars']"));
		starRating.click();
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0,0)");

	}

	
	@Test(priority = 13)
	public void PromotionalOffers() throws InterruptedException {
		driver.get(URL);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,400)");

		
		Thread.sleep(3000);

		WebElement viewAllLink = driver.findElement(By.xpath("//a[text()='View all']"));
		viewAllLink.click();

		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,600)");
		Thread.sleep(2000);

	}
	
	

	@Test(priority = 14)
	public void CustomerSupport() throws InterruptedException {
		driver.get(URL);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0,7800)");

		Thread.sleep(1000);

		WebElement ContactUsLink = driver.findElement(By.linkText("Contact Us"));
		ContactUsLink.click();

		js.executeScript("window.scrollTo(0,300)");

		WebElement FullName = driver.findElement(By.name("full_name"));
		FullName.sendKeys("Mousa Nedal Abukhaled");

		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("Mousaabukhald8@gmail.com");

		Thread.sleep(300);

		WebElement input = driver.findElement(By.id("mui-3"));
		input.click();

		Thread.sleep(300);
		input.click();

		List<WebElement> Options = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//li")));

		for (WebElement option : Options) {
			if (option.getText().contains("+962")) {
				Thread.sleep(200);
				option.click();
				break;
			}
		}

		Thread.sleep(1000);

		WebElement Phone = driver.findElement(By.name("phone"));
		Thread.sleep(300);

		Phone.sendKeys("780008844");

		WebElement EnquiryType = driver.findElement(By.id("mui-component-select-enquiryType"));
		EnquiryType.click();

		WebElement HotelOption = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[data-value='Hotel']")));
		HotelOption.click();

		WebElement ContactSubject = driver.findElement(By.name("contactSubject"));
		ContactSubject.sendKeys("Issue with hotel booking confirmation");

		WebElement ContactDescription = driver.findElement(By.name("contactDescription"));
		ContactDescription.sendKeys("Hello,I’m Mousa Nedal Abukhaled,"
				+ " I recently booked a hotel using your platform, but I have not yet received the booking confirmation email.");

		Thread.sleep(2000);

		WebElement SubmitRequest = driver.findElement(By.id("mui-6"));
		SubmitRequest.click();

	}

}