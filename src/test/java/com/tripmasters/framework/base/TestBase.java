package com.tripmasters.framework.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentTest;
import com.tripmasters.framework.fileReaders.JsonDataReader;
import com.tripmasters.framework.pageActions.BookingPageAction;
import com.tripmasters.framework.pageActions.HomePageAction;
import com.tripmasters.framework.pageActions.PassengerInfoPageAction;
import com.tripmasters.framework.reports.Logs;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	private static String chromeDriverFilePath = System.getProperty("user.dir")
			+ "/src/test/resources/webdriver/chromedriver.exe";
	public  WebDriver driver;
	private DesiredCapabilities capabilities;
	private URL url;
	private boolean flag = false;
	public static String platform;
	public static WebDriverWait wait;
	public static boolean flag_Mob;

	public BookingPageAction bookingPage;
	public HomePageAction homePage;
	public PassengerInfoPageAction passengerInfoPage;
	public ExtentTest test;

	
	@BeforeMethod(alwaysRun=true)
	// @Parameters(value = { "browser" })
	public void setUp() throws FileNotFoundException, IOException, ParseException {
		// gn = new GenerateReport();
		platform = JsonDataReader.getJSONData("Platform");
		String browser = JsonDataReader.getJSONData("Browser");
		try {
			if(platform.equalsIgnoreCase("Windows")) {
				if (browser.equalsIgnoreCase(("Chrome"))) {
					ChromeOptions options=new ChromeOptions();
					 options.addArguments("ignore-certificate-errors");
					 options.setAcceptInsecureCerts(true);
					System.setProperty("webdriver.chrome.driver", chromeDriverFilePath);
					driver = new ChromeDriver(options);
					
					//Dimension d=new Dimension(1382,744);
					driver.manage().window().maximize();
					Logs.info("ChromeDriver instantiated for " + platform + " platform.");
					flag = true;

				} else if (browser.equalsIgnoreCase("Firefox")) {

					WebDriverManager.firefoxdriver().setup();
					// driver = new FirefoxDriver();
					//Logs.info("FirefoxDriver instantiated for " + platform + " platform.");
					flag = true;

				} else {
					Logs.error("Browser doesn't found!!!! for " + platform + " platfrom");
					System.err.println("Browser doesn't found!!!! for windows platfrom");
				}
			}
			else if(platform.equalsIgnoreCase("Mobile")){
				if (browser.equalsIgnoreCase("Chrome")) {
					capabilities = new DesiredCapabilities();

					System.out.println("chromeDriverFilePath : " + chromeDriverFilePath);
					capabilities.setCapability("chromedriverExecutable", chromeDriverFilePath);
					capabilities.setCapability("platformName", "Android");
					capabilities.setCapability("deviceName", "One Plus");
					capabilities.setCapability("browserName", "Chrome");

					url = new URL("http:127.0.1.1:4723/wd/hub");

					driver = new AndroidDriver<MobileElement>(url, capabilities);

					//Logs.info(browser + " AndroidDriver instantiated for " + platform + " platform.");
					flag = true;

				} else {
					Logs.error("Browser doesn't found!!!! for mobile platform");
					System.err.println("Browser doesn't found!!!! for mobile platform");
				}
				flag_Mob = true;
			}
			else if(platform.equalsIgnoreCase("iOS"))
			{
				if (browser.equalsIgnoreCase("Safari")) {
					capabilities = new DesiredCapabilities();
					capabilities.setCapability("deviceName", "iPhone 11 Pro Max");
					capabilities.setCapability("platformName", "iOS");
					capabilities.setCapability("platformVersion", "13.3");
					capabilities.setCapability(CapabilityType.BROWSER_NAME, "Safari");
					// IOSDriver
					url = new URL("http://127.0.0.1:4723/wd/hub");
					driver = new IOSDriver<IOSElement>(url, capabilities);
					//DesiredCapabilities capabilities = new DesiredCapabilities();
					System.out.println("Safari browser launched on iOS");
					flag = true;
				} else {
					//Logs.error("browser doesn't found!!!!!!!!!!!");
					System.err.println("browser doesn't found!!!!!!!!");
				}
				flag_Mob = true;
			}
			else{
				//Logs.error("Platform doesn't found!!!!!!!!!!!");
				System.err.println("Platform doesn't found!!!!!!!!!!!");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				String url = JsonDataReader.getJSONData("URL");
				driver.get(url);
				//Logs.info("The given URL '" + url + "' launch successfully for " + platform + " platform and " + browser
					//	+ " browser!!!!!!!!!!!!");
				int time = (int) System.nanoTime();
				System.out.println("nano time is: " + time);
			}

		}

		homePage = new HomePageAction(driver);
		bookingPage = new BookingPageAction(driver);
		passengerInfoPage = new PassengerInfoPageAction(driver);
	}

	//@AfterMethod(alwaysRun=true)
	public void tearDown() throws FileNotFoundException, IOException, ParseException {
		
		if (driver != null) {
			//Logs.info("Closing browser after TestClass");
		 driver.close();
		
		} else {
			//Logs.error("Driver is null at AfterClass (TestBase)");
		}

	}

}
