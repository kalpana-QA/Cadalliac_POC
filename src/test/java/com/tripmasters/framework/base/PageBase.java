package com.tripmasters.framework.base;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.tripmasters.framework.reports.Logs;

import junit.framework.Assert;

public class PageBase {

	private static WebElement element = null;
	static String screenShotPath = "";
	protected static WebDriver driver;
    ExtentTest test;
	
	@SuppressWarnings("static-access")
	public PageBase(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Scroll page down to full of its height.
	 * 
	 * @author Shivam Kashyap
	 * @throws Exception
	 **/

	public WebElement findElementByXpath(String xpath) throws Exception {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			Logs.info("Element Found");
		} catch (Exception e) {
			Logs.error("Element Not Found");
			// Logs.error("e");
			// element = null;
		}
		return element;
	}

	/**
	 * It's find the element on current page.
	 * 
	 * @author Shivam Kashyap
	 * @throws Exception
	 * @version 1
	 **/
	public WebElement findElement(String locatorString, String typeOfLocator) {
		try {
			if (typeOfLocator.equalsIgnoreCase("xpath")) {
				element = driver.findElement(By.xpath(locatorString));
			} else if (typeOfLocator.equalsIgnoreCase("id")) {
				element = driver.findElement(By.id(locatorString));
			} else if (typeOfLocator.equalsIgnoreCase("cssSelector")) {
				element = driver.findElement(By.cssSelector(locatorString));
			} else if (typeOfLocator.equalsIgnoreCase("linkText")) {
				element = driver.findElement(By.linkText(locatorString));
			} else if (typeOfLocator.equalsIgnoreCase("name")) {
				element = driver.findElement(By.name(locatorString));
			} else if (typeOfLocator.equalsIgnoreCase("className")) {
				element = driver.findElement(By.className(locatorString));
			} else if (typeOfLocator.equalsIgnoreCase("tagName")) {
				element = driver.findElement(By.tagName(locatorString));
			} else if (typeOfLocator.equalsIgnoreCase("partialLinkText")) {
				element = driver.findElement(By.partialLinkText(locatorString));
			} else {
				Logs.info("Element Not Found");
			}
			highlightElement(element);
		} catch (Exception e) {
			Logs.error("Something wrong with element data passed because of which element not Found.");
		}
		return element;
	}

	/**
	 * TODO Also need to add un-highlight method
	 * 
	 * @param element
	 * @throws Exception
	 */
	public static void highlightElement(WebElement element) throws Exception {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
					"color: black; border: 2px solid red;");
		} catch (Exception e) {

		}
	}

	/**
	 * Description: This method will take the screenshot of current page.
	 * 
	 * @author Kalpana Kaushik
	 * @throws IOException
	 * @Version 1
	 **/
	public static String takeScreenShot() throws IOException {

		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy-h-mm-ss");
			String CurrentDate = sdf.format(date);
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			screenShotPath = System.getProperty("user.dir") + "\\" + "defectScreenShots\\" + CurrentDate + ".jpeg";
			FileUtils.copyFile(scrFile, new File(screenShotPath));
			String base = System.getProperty("user.dir") + "/defectScreenShots";
			screenShotPath = new File(base).toURI().relativize(new File(screenShotPath).toURI()).getPath();

		} catch (FileNotFoundException fnfe) {
			Logs.info("In takeScreenShot " + fnfe.getMessage());

			Logs.info("File not found" + fnfe);
		} catch (IOException e) {
			Logs.info("In takeScreenShot " + e.getMessage());

		} catch (Exception e) {
			Logs.info("In takeScreenShot " + e.getMessage());

		}
		return screenShotPath;
	}
	
	/**
	 * Description: This method will clear and set the value.
	 * @param element(By FieldElement contains the xpath for field in which the value to be entered.;
	 * String parameters is the value to be entered in the field.)
	 * @author Kalpana Kaushik
	 * @throws IOException
	 * @Version 1
	 **/

	public static String clearAndSetValues(By FieldElement, String StringToBeEntered) throws Exception {
	
			try {
				waitForElement(5);
				new WebDriverWait(driver, 40).until(ExpectedConditions.elementToBeClickable(FieldElement));
				WebElement element = driver.findElement(FieldElement);
				waitForElement(5);
				highlightElement(element);
				element.clear();
				element.sendKeys(StringToBeEntered);
				waitForElement(5);
			} catch (Exception e) {
				System.out.println("Unable to click on element"+ FieldElement);
			}
		
		return StringToBeEntered;
	}

	/**
	 * It's click on the web element using JavascriptExecutor.
	 * 
	 * @author Shivam Kashyap
	 * @throws Exception
	 * @version 1
	 **/

	public static void clickUsingJavaScript(By FieldElement) {
		try {
			waitForElement(5);
			System.out.println("waited for 5 secs");
			WebElement element = driver.findElement(FieldElement);
			waitForElement(5);
			System.out.println("waited for 5 secs after element found");
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			waitForElement(5);
		} catch (Exception e) {
			System.out.println("Unable to click on element"+ FieldElement);
		}
	}

	/**
	 * Click on webelement Using JavaScript
	 * 
	 * @param element
	 * @author Mrinal
	 * @throws Exception
	 */

	public static void clickUsingJavaScript(WebElement element) {

		try {
			highlightElement(element);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			waitForElement(3);
		} catch (Exception e) {
			System.out.println("Unable to click on element using Javascript Executor");
		}
	}
	/**
	 * Description: This method will select the element by value from the dropdown.
	 * @param element(By FieldElement contains the xpath for field in which the value to be entered.;
	 * String parameters is the value to be entered in the field.)
	 * @author Kalpana Kaushik
	 * @Version 1
	 **/


	public static String selectOptionByValue(By element, String valueOfOption) {

		try {
			WebElement selectField = driver.findElement(element);
			//wait.until(ExpectedConditions.elementToBeClickable(selectField));
			highlightElement(selectField);
			Select option = new Select(selectField);
			option.selectByValue(valueOfOption);
			waitForElement(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valueOfOption;
	}

	/**
	 * Description: This method will select the element by text from the dropdown.
	 * @param element(By FieldElement contains the xpath for field in which the value to be entered.;
	 * String parameters is the value to be entered in the field.)
	 * @author Kalpana Kaushik
	 * @Version 1
	 **/
	public static String selectOptionByText(By element, String optionText) {

		try {
			WebElement selectField = driver.findElement(element);
			highlightElement(selectField);
			Select option = new Select(selectField);
			option.selectByVisibleText(optionText);
			waitForElement(2);
		} catch (Exception e) {
			Logs.error("Unable to select element by text");
		}
		return optionText;
	}

	/**
	 * Description: This method will verify the traveller details.
	 * @param element(By FieldElement fetch the list of all actual elements present in the DOM;
	 *List<String>expectedTravellerInfo contains the list of expected elements.)
	 * @author Kalpana Kaushik
	 * @Version 1
	 **/
	public static void verifyTravellerDetails(By element, List<String> expectedTravellerInfo) {

		try {
			List<String> actualTravellerInfo = new ArrayList<String>();
			List<WebElement> tempList = driver.findElements(element);
			for (WebElement list : tempList) {
				String text = list.getText();
				actualTravellerInfo.add(text);
			}
			System.out.println("actual List:" + actualTravellerInfo);
			Assert.assertEquals(expectedTravellerInfo, actualTravellerInfo);
		} catch (Exception e) {
			Logs.error("Traveller Details are not same as expected");
		}
	}

	/**
	 * 

	 * Description :: object is present or not :: Input Parameters : String
	 * String Return Type:: boolean
	 * @author Kalpana Kaushik

	 */

	public static boolean isElementDisplayed(By element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement waitElement = wait.until(ExpectedConditions.visibilityOf(driver.findElement((element))));
			highlightElement(waitElement);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					waitElement);
			waitElement.isDisplayed();

			return true;

		} catch (Exception e) {
			Logs.error("Element is not displayed");
			return false;
		}
	}

	/**
	 * 
	 * Description :: To click a Element using HTML method Input Parameters :: Input
	 * Parameters : String String Return Type:: Void
	 * 
	 */

	public static void clickOnElement(By element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement waitElement = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(element)));
			highlightElement(waitElement);
			waitElement.click();
		} catch (Exception e) {
			Logs.error("Unable to click on element even after specified time");
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * get Text by locator
	 * 
	 * @param element
	 * @return
	 * @author Mrinal
	 * @version 1
	 */
	public String getText(By locator) {

		WebElement Wb = driver.findElement(locator);
		String text = null;
		try {
			highlightElement(Wb);
			text = Wb.getText();

		} catch (Exception e) {

			Logs.error("Unable to find element");
		}
		return text;

	}

	/**
	 * 
	 * Description :: Select a date from Calendar,100 days from today's date.
	 * String Return Type:: 
	 * @author Kalpana Kaushik
	 */
//	public static String selectNewDateFromCalendar(int AdditionalDays) {
//
//		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(new Date());
//		System.out.println(cal.getTime());
//		cal.add(Calendar.DATE, AdditionalDays);
//		String newDate = dateFormat.format(cal.getTime());
////		String[] newDateDay = newDate.split("/");
////		return newDateDay[1];
//		return newDate;
//	}
	public static String selectNewDateFromCalendar(int additionaldays) {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		System.out.println(cal.getTime());
		cal.add(Calendar.DATE, additionaldays);
		String newDate = dateFormat.format(cal.getTime());
		//String[] newDateDay = newDate.split("/");
		//return newDateDay[1];
		return newDate;
		}


	/**
	 * Scroll page down to full of its height
	 * 
	 * @author Mrinal
	 * @throws Exception
	 **/
	public static void scrollDown() throws Exception {
		if(TestBase.flag_Mob) {
		try {
			waitForElement(3);
			java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0," + screenSize.height + ")", "");
			System.out.println("scrolled down");
		} catch (Exception e) {
			throw new Exception("Unable to scroll page");
		}
	}
	}

	/**
	 * It will wait for specific time.
	 * 
	 * @author Kalpana Kaushik
	 * @throws Exception
	 * @version 1
	 **/

	public static  void waitForElement(int time) throws Exception {
		Thread.sleep(time * 1000);
	}

	/**
	 * Scroll page down to full of its hight on mobile with defined repeatation
	 * 
	 * @author Mrinal
	 * @throws Exception
	 * @param enterNumberofRepetaion
	 **/
	public static void scrollDownForMob(int enterNumberofRepetaion) throws Exception {
		if (TestBase.flag_Mob) {
			while (enterNumberofRepetaion > 0) {
				try {
					waitForElement(3);
					java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					JavascriptExecutor jse = (JavascriptExecutor) driver;
					jse.executeScript("window.scrollBy(0," + screenSize.height + ")", "");
					System.out.println("scrolled down");
				} catch (Exception e) {
					throw new Exception("Unable to scroll page");
				}
				waitForElement(1);
				enterNumberofRepetaion--;
			}
		}
	}

	/**
	 * Get text of a webelement
	 * 
	 * @param element
	 * @return
	 * @throws Exception
	 * @author Mrinal
	 */
	public String getText(WebElement element) throws Exception {
		String text;
		highlightElement(element);
		text = element.getText();
		return text;

	}

}
