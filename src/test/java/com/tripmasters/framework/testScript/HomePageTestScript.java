package com.tripmasters.framework.testScript;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tripmasters.framework.base.PageBase;
import com.tripmasters.framework.base.TestBase;
import com.tripmasters.framework.pageLocators.ActionPageData;
import com.tripmasters.framework.pageLocators.HomePageLocators;
import com.tripmasters.framework.reports.ExtentTestManager;
import com.tripmasters.framework.reports.Logs;

import junit.framework.Assert;

public class HomePageTestScript extends TestBase {

	static Logs logs=new Logs();
	
	 @Test(groups = { "smoke" }, priority = 11)
	public void TC_0011_verifyMoreHighlightAndAttractionLinks(Method method) throws Exception {
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "TC_0011_verifyMoreHighlightAndAttractionLinks");
		logs.startTestCase(method.getName());
		test.log(LogStatus.INFO, "User entered the URL: 'https://www.tripmasters.com/");
		String homePageTitle = homePage.getPageTitle();
		PageBase.clickUsingJavaScript(HomePageLocators.getmoreHighLightsBtn());
		test.log(LogStatus.INFO, "User clicked on More HighLights & Attraction Links");
		boolean amazonLinkDisplayed = homePage.isElementDisplayed(HomePageLocators.getTheLink("The Amazon"));
		boolean middleEastDisplayed = homePage.isElementDisplayed(HomePageLocators.getTheLink("Best Of Middle East"));
		boolean londonDisplayed = homePage.isElementDisplayed(HomePageLocators.getTheLink("London - Paris and Beyond"));
		boolean europeDisplayed = homePage.isElementDisplayed(HomePageLocators.getTheLink("Europe"));
		Assert.assertEquals(ActionPageData.getHomePageTitle(), homePageTitle);
		test.log(LogStatus.INFO, "Home Page Title Verified.");
		logs.info("Home Page Title Verified.");
		Assert.assertTrue(amazonLinkDisplayed);
		test.log(LogStatus.INFO, "The Amazon Link is displayed.");
		logs.info("The Amazon Link is displayed.");

		Assert.assertTrue(middleEastDisplayed);
		test.log(LogStatus.INFO, "Best Of Middle East Link is displayed.");
		logs.info("Best Of Middle East Link is displayed.");

		Assert.assertTrue(londonDisplayed);
		test.log(LogStatus.INFO, "London - Paris and Beyond Link is displayed.");
		logs.info("London - Paris and Beyond Link is displayed.");

		Assert.assertTrue(europeDisplayed);
		test.log(LogStatus.INFO, "Europe Link is displayed.");
		test.log(LogStatus.INFO, "HightLights and Attraction Links Verified");
		logs.info("verifyMoreHighlightAndAttractionLinks is Passed.");
		logs.endTestCase(method.getName());
	}

	@Test(groups = { "smoke" }, priority = 12)
	public void TC_0012_verifyOtherVacationPackages(Method method) throws Exception {
		String PackageTitle;
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "TC_0012_verifyOtherVacationPackages");
		logs.startTestCase(method.getName());
		test.log(LogStatus.INFO, "User entered the URL: 'https://www.tripmasters.com/");
		homePage.scrollDownForMob(1);
		PageBase.clickUsingJavaScript(HomePageLocators.getExploreEuropeLnk());
		test.log(LogStatus.INFO, "User clicked on Explore Europe Link");
		logs.info("User clicked on Explore Europe Link");
		homePage.scrollDownForMob(3);
		PackageTitle = homePage.clickOnPackageDisplayedUnderOtherVacationPackages();
		test.log(LogStatus.INFO, "User clicked on package:'"+PackageTitle+"' displayed under other vacation package");
		logs.info("User clicked on particular vacation package");
		boolean romeFlorenceVeniceByTrainHeader = homePage.getPageTitle().contains(PackageTitle);
		test.log(LogStatus.INFO, "Verified User is redirected  to the particular vacation packages");
		Assert.assertTrue(romeFlorenceVeniceByTrainHeader);
		test.log(LogStatus.INFO, "verify selected Vacation Package: '"+PackageTitle+"' is displayed on navigating");
		logs.info("verifyOtherVacationPackages is displayed & testcase passed successfully.");
		logs.endTestCase(method.getName());
	}

	 @Test(groups = {"smoke"},priority=13)
	public void TC_0013_verifyPopularVacationPackages(Method method) {
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "TC_0013_verifyPopularVacationPackages");
		logs.startTestCase(method.getName());
		test.log(LogStatus.INFO, "User entered the URL: 'https://www.tripmasters.com/");
		String verifyPackage  = driver.findElement(HomePageLocators.getExploreEuropeLnk()).getText();
		PageBase.clickUsingJavaScript(HomePageLocators.getExploreEuropeLnk());
		test.log(LogStatus.INFO, "User validated that Popular Vacation Packages heading displayed on the homepage");
		logs.info("User validated that Popular Vacation Packages displayed on the homepage");
		String europePageTitle = homePage.getPageTitle();
		 Assert.assertEquals(ActionPageData.getEuropePageTitle().trim(),europePageTitle);
		test.log(LogStatus.INFO, "User is able to see all existing popular vacation packages,Verified");
		test.log(LogStatus.INFO, "User clicks on particular vacation package: '"+verifyPackage+"'");
		test.log(LogStatus.INFO, "Verify that user redirected to selected Vacation Package page: '"+europePageTitle+"'");
		logs.info("VerifyPopularVacationPackages displayed");
		logs.endTestCase(method.getName());
	}

	@Test(groups = {"smoke"},priority=10)
	public void TC_0010_verifySearchCity(Method method) throws Exception {
		ExtentTest test=ExtentTestManager.startTest(method.getName(), "TC_0010_verifySearchCity");
		logs.startTestCase(method.getName());
		test.log(LogStatus.INFO, "User entered the URL: 'https://www.tripmasters.com/");
		String verifyhomepage = homePage.getPageTitle();
		Assert.assertEquals(ActionPageData.getHomePageTitle(), verifyhomepage);
		test.log(LogStatus.INFO, "Verified User is on homepage");
		logs.info("Verified User is on homepage");
		homePage.clickSearch();
		test.log(LogStatus.INFO, "Click on Search textBox avialable on HomePage");
		logs.info("Click on Search textBox avialable on HomePage");
		homePage.fillSearch("Berlin");
		test.log(LogStatus.INFO, "Search for a particular city & Click on Go Button");
		logs.info("Search for a particular city & Click on Go Button");
		homePage.validateURL();
	    test.log(LogStatus.INFO, "User redirected to that particular city.Verified!");
	    logs.info("User redirected to that particular city.Verified!");
	    logs.endTestCase(method.getName());
}

	@Test(groups = {"smoke"},priority=15)
	public void TC_0015_verifyStartAgainLink(Method method) throws Exception {
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "TC_0015_verifyStartAgainLink");
		logs.startTestCase(method.getName());
		test.log(LogStatus.INFO, "User entered the URL: 'https://www.tripmasters.com/");
		bookingPage.fillLeavingFromDetails("New York, Newark, NJ");
		test.log(LogStatus.INFO, "User entered \"New York, Newark, NJ - EWR\" into leaving from field");
		bookingPage.fillGoingToCityDetails("Delhi (India)");
		test.log(LogStatus.INFO, "User entered \"Delhi (India)\" into Going to from field");
		String selectDate=bookingPage.selectValueFromCalendar(90,1);
		test.log(LogStatus.INFO,   "User selects '" + selectDate + "'from calendar");
		bookingPage.selectStayingTime("4");
		test.log(LogStatus.INFO, "Select staying time :4 nights");
		bookingPage.selectNoMoreCitiesBtn();
		test.log(LogStatus.INFO,   "Click on Next Button");
		bookingPage.selectGuestDetails("1|2");
		test.log(LogStatus.INFO, "User select 1 Room for 2 Adults");
		test.log(LogStatus.INFO, "User fills all the basic booking details");
		logs.info("User fills all the basic booking details");
		homePage.getStartAgain();
		test.log(LogStatus.INFO, "Verify StartAgain Link is displayed");
		test.log(LogStatus.INFO, "User clicks on Start Again Link");
		test.log(LogStatus.INFO, "On clicking start again,User redirected to super homepage");
		logs.info("verifyStartAgainLink is displayed");
		logs.endTestCase(method.getName());
	}

	@Test(groups = {"smoke"},priority=16)
	public void TC_0016_verifyFooterText(Method method) {
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "TC_0016_verifyFooterText");
		logs.startTestCase(method.getName());
		test.log(LogStatus.INFO, "User entered the URL: 'https://www.tripmasters.com/");
		test.log(LogStatus.INFO, "Scroll down to the footer of the page");
		boolean validatefooter = homePage.validateFooterText();
		Assert.assertTrue(validatefooter);
		test.log(LogStatus.INFO, "verifyFooterText is displayed");
		logs.info("verifyFooterText is displayed");
		logs.endTestCase(method.getName());
	}

}
