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

	 //@Test(groups = { "regression" }, priority = 15)
	public void verifyMoreHighlightAndAttractionLinks_TC_11(Method method) throws Exception {
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "verifyMoreHighlightAndAttractionLinks_TC_11");
		String homePageTitle = homePage.getPageTitle();
		PageBase.clickUsingJavaScript(HomePageLocators.getmoreHighLightsBtn());
		test.log(LogStatus.INFO, "User clicked on More HighLights & Attraction Links");
		boolean amazonLinkDisplayed = homePage.isElementDisplayed(HomePageLocators.getTheLink("The Amazon"));
		boolean middleEastDisplayed = homePage.isElementDisplayed(HomePageLocators.getTheLink("Best Of Middle East"));
		boolean londonDisplayed = homePage.isElementDisplayed(HomePageLocators.getTheLink("London - Paris and Beyond"));
		boolean europeDisplayed = homePage.isElementDisplayed(HomePageLocators.getTheLink("Best of Northern Europe"));

		Assert.assertEquals(ActionPageData.getHomePageTitle(), homePageTitle);
		test.log(LogStatus.INFO, "Home Page Title Verified.");
		Logs.info("Home Page Title Verified.");
		Assert.assertTrue(amazonLinkDisplayed);
		test.log(LogStatus.INFO, "The Amazon Link is displayed.");
		Logs.info("The Amazon Link is displayed.");

		Assert.assertTrue(middleEastDisplayed);
		test.log(LogStatus.INFO, "Best Of Middle East Link is displayed.");
		Logs.info("Best Of Middle East Link is displayed.");

		Assert.assertTrue(londonDisplayed);
		test.log(LogStatus.INFO, "London - Paris and Beyond Link is displayed.");
		Logs.info("London - Paris and Beyond Link is displayed.");

		Assert.assertTrue(europeDisplayed);
		test.log(LogStatus.INFO, "London - Paris and Beyond Link is displayed.");
		test.log(LogStatus.INFO, "HightLights and Attraction Links Verified");
		Logs.info("verifyMoreHighlightAndAttractionLinks is Passed.");

	}

	//@Test(groups = { "regression" }, priority = 16)
	public void verifyOtherVacationPackages_TC_12(Method method) throws Exception {
		String PackageTitle;
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "verifyOtherVacationPackages_TC_12");
		homePage.scrollDownForMob(1);
		PageBase.clickUsingJavaScript(HomePageLocators.getExploreEuropeLnk());
		test.log(LogStatus.INFO, "User clicked on Explore Europe Link");
		Logs.info("User clicked on Explore Europe Link");
		homePage.scrollDownForMob(3);
		PackageTitle = homePage.clickOnPackageDisplayedUnderOtherVacationPackages();
		test.log(LogStatus.INFO, "User clicked on particular vacation package");
		Logs.info("User clicked on particular vacation package");
		boolean romeFlorenceVeniceByTrainHeader = homePage.getPageTitle().contains(PackageTitle);
		test.log(LogStatus.INFO, "Verified User is redirected  to the particular vacation packages");
		Assert.assertTrue(romeFlorenceVeniceByTrainHeader);
		test.log(LogStatus.INFO, "verifyOtherVacationPackages is displayed & testcase passed successfully.");
		Logs.info("verifyOtherVacationPackages is displayed & testcase passed successfully.");
	}

	 //@Test(groups = {"smoke"},priority=17)
	public void verifyPopularVacationPackages_TC_13(Method method) {
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "VerifyPopularVacationPackages_TC_13");
		PageBase.clickUsingJavaScript(HomePageLocators.getExploreEuropeLnk());
		test.log(LogStatus.INFO, "Clicked on Popular Vacation Packages");
		Logs.info("Clicked on Popular Vacation Packages");
		String europePageTitle = homePage.getPageTitle();
		// Assert.assertEquals(HomePageLocators.getEuropePageTitle().trim(),
		 Assert.assertEquals(ActionPageData.getEuropePageTitle().trim(),europePageTitle);
		// europePageTitle.trim());
		test.log(LogStatus.INFO, "User is able to see all existing popular vacation packages");
		test.log(LogStatus.INFO, "VerifyPopularVacationPackages displayed");
		Logs.info("VerifyPopularVacationPackages displayed");
	}

	//@Test(groups = {"smoke"},priority=18)
	public void verifyCity_TC_10(Method method) throws Exception {
		ExtentTest test=ExtentTestManager.startTest(method.getName(), "Verify Search City Button on homepage");
		String verifyhomepage = homePage.getPageTitle();
		Assert.assertEquals(ActionPageData.getHomePageTitle(), verifyhomepage);
		test.log(LogStatus.INFO, "Verified User is on homepage");
		Logs.info("Verified User is on homepage");
		homePage.clickSearch();
		test.log(LogStatus.INFO, "Click on Search textBox avialable on HomePage");
		Logs.info("Click on Search textBox avialable on HomePage");
		homePage.fillSearch("Berlin");
		test.log(LogStatus.INFO, "Search for a particular city & Click on Go Button");
		Logs.info("Search for a particular city & Click on Go Button");
		homePage.validateURL();
	    test.log(LogStatus.INFO, "User redirected to that particular city.Verified!");
	    Logs.info("User redirected to that particular city.Verified!");
}

	//@Test(groups = {"smoke"},priority=19)
	public void verifyStartAgainLink_TC_15(Method method) throws Exception {
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "verifyStartAgainLink_TC_15");
		//String verifyhomepage = homePage.getPageTitle();
		bookingPage.clickOnBuildYourVacationDropDown();
		test.log(LogStatus.INFO, "Click on Build Your Vacation Dropdown");
		Logs.info("Click on Build Your Vacation Dropdown");
		bookingPage.fillLeavingFromDetails("New York, Newark, NJ");
		bookingPage.fillGoingToCityDetails("Delhi (India)");
		bookingPage.selectStayingTime("4");
		bookingPage.selectNoMoreCitiesBtn();
		bookingPage.selectGuestDetails("1|2");
		test.log(LogStatus.INFO, "User fills all the basic booking details");
		Logs.info("User fills all the basic booking details");
		homePage.getStartAgain();
		test.log(LogStatus.INFO, "Verify StartAgain Link is displayed");
		Logs.info("verifyStartAgainLink is displayed");
	}

	//@Test(groups = {"smoke"},priority=20)
	public void verifyFooterText_TC_16(Method method) {
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "verifyFooterText_TC_16");
		boolean validatefooter = homePage.validateFooterText();
		Assert.assertTrue(validatefooter);
		test.log(LogStatus.INFO, "verifyFooterText is displayed");
		Logs.info("verifyFooterText is displayed");
	}

}
