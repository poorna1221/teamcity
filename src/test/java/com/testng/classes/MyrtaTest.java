package com.testng.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ExtentReporter.ReporterClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.pages.PageObjects;

public class MyrtaTest {

	WebDriver driver;
	FileInputStream fis;
	Properties prop = new Properties();
	PageObjects pageObjects;
	ExtentReports eR = ReporterClass.initializeReport();
	ExtentTest eTest;

	@BeforeTest
	public void setup() throws IOException {
		eTest = eR.createTest("loginTest");
		fis = new FileInputStream("Config.Properties");
		prop.load(fis);

	}

	@Test
	public void loginTest() throws InterruptedException, IOException {

		eTest = eR.createTest("loginTest");
		fis = new FileInputStream("Config.Properties");
		prop.load(fis);

		System.setProperty("webdriver.chrome.driver", "ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("myrtaURL"));
		driver.manage().window().maximize();

		pageObjects = new com.pages.PageObjects(driver);

		pageObjects.LogInLinkTest.click();

		pageObjects.cardNumber.sendKeys("23518373");
		pageObjects.password.sendKeys("Sowji1234");
		Thread.sleep(3000);
		pageObjects.loginButton.click();
		Thread.sleep(5000);
		pageObjects.manageBooking.click();

		pageObjects.changeTime.click();

		// pageObjects.findEarliest.click();

		for (int i = 0; i < 5; i++) {
			System.out.println("--------------------------------------------------");
			// System.out.println("week is " + pageObjects.weekStarting.getText());

			System.out.println("Total Slots available in " + pageObjects.weekStarting.getText() + "are "
					+ pageObjects.availableSlots.size());

			for (int j = 0; j < pageObjects.availableSlots.size(); j++) {
				System.out.println("Time" + pageObjects.availableSlots.get(j).getAttribute("id"));

				// System.out.println("TIME Is"
				// +
				// pageObjects.availableSlots.get(j).findElement(By.xpath("/parent:td")).getAttribute("id"));
			}

			pageObjects.prevWeekButton_label.click();

		}

	}

	public static boolean waitForPresenceBycssSelector(WebDriver driver, int timeLimitInSeconds,
			String targetResourceId) {

		boolean isElementPresent;
		try {
			WebElement webElement;
			WebDriverWait wait = new WebDriverWait(driver, timeLimitInSeconds);

			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(targetResourceId)));
			isElementPresent = webElement.isDisplayed();
			return isElementPresent;
		} catch (Exception e) {
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		}
	}

	@AfterTest
	public void tearDown() {

		pageObjects.LogOut.click();

		pageObjects.clickYes.click();

		driver.close();
		// eTest.fail("FailTest");
		eR.flush();
	}

}
