package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserActions extends ConfigBrowser {

	public static void launchweb(WebDriver driver, String sUrl) {

		driver.get(sUrl);
		driver.manage().window().maximize();
	}

	public static void click(WebDriver driver, String sObject) {

		try {
			driver.findElement(By.cssSelector(sObject)).click();
		} catch (Exception e) {
			driver.quit();
			e.printStackTrace();
		}
	}
	
	
	public static void click_xpath(WebDriver driver, String sObject) {

		try {
			driver.findElement(By.xpath(sObject)).click();
		} catch (Exception e) {
			driver.quit();
			e.printStackTrace();
		}
	}

	public static void enter(WebDriver driver, String sObject, String sData) {

		try {
			driver.findElement(By.cssSelector(sObject)).sendKeys(sData);
		} catch (Exception e) {
			driver.quit();
			e.printStackTrace();
		}
	}

	public static void verifyElementPresent(WebDriver driver, String sObject) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sObject)));

			driver.findElement(By.xpath(sObject)).isDisplayed();
		} catch (Exception e) {
			driver.quit();
			e.printStackTrace();
		}
	}

	public static void scrollDown(WebDriver driver) {

		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,250)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
