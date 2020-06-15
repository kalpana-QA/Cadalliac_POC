package com.tripmasters.framework.testScript;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tripmasters.framework.Listeners.Retry;
import com.tripmasters.framework.Listeners.RetryCountIfFailed;
import com.tripmasters.framework.base.PageBase;
import com.tripmasters.framework.base.TestBase;
import com.tripmasters.framework.fileReaders.ExcelUtilityClass;
import com.tripmasters.framework.pageLocators.BookingLocators;
import com.tripmasters.framework.pageLocators.HomePageLocators;
import com.tripmasters.framework.reports.ExtentTestManager;
import com.tripmasters.framework.reports.Logs;

public class BookingPageTestScript extends TestBase {

	static Logs logs=new Logs();
	
	List<String> expectedFirstTravellerInfo = new ArrayList<String>();
	List<String> expectedSecondTravellerInfo = new ArrayList<String>();
	List<String> expectedThirdTravellerInfo = new ArrayList<String>();
	List<String> expectedFourthTravellerInfo = new ArrayList<String>();
	List<String> expectedFlightDetails = new ArrayList<String>();
	
	
	private static String ActualHotel;
	private static String ExpectedHotel;
    
    @Test(groups= {"smoke"},priority=9)
	public void TC_0009_dateChanging(Method method) throws Exception {
		ExtentTest test=ExtentTestManager.startTest(method.getName(), "TC_0009_dateChanging");
		logs.startTestCase(method.getName());
		test.log(LogStatus.INFO, "User entered the URL: 'https://www.tripmasters.com/");
		bookingPage.clickOnBuildYourVacationDropDown();
		bookingPage.fillLeavingFromDetails(ExcelUtilityClass.getKeyValue("TestDataSheet", "Leaving From_Second", "Valid-Value"));
		test.log(LogStatus.INFO, "User entered \"New York, Newark, NJ - EWR\" into leaving from field");
		bookingPage.fillGoingToCityDetails(ExcelUtilityClass.getKeyValue("TestDataSheet", "Going To", "Valid-Value"));
		test.log(LogStatus.INFO, "User entered \"Berlin (Germany)\" into Going to from field");
		String selectDate=bookingPage.selectValueFromCalendar(90,1);
		test.log(LogStatus.INFO,   "User selects '" + selectDate + "' from calendar");
		bookingPage.selectStayingTime(ExcelUtilityClass.getKeyValue("TestDataSheet", "Staying Time", "Valid-Value"));
		test.log(LogStatus.INFO, "Select staying time :12 nights");
		bookingPage.selectNoMoreCitiesBtn();
		test.log(LogStatus.INFO,   "Click on Next Button");
		bookingPage.selectGuestDetails("1|2");
		test.log(LogStatus.INFO, "User select 1 Room with 2 Adults");
		test.log(LogStatus.INFO, "Booking details Source & Destination filled successfully ");
		logs.info("Booking details Source & Destination filled successfully ");
		bookingPage.clickonContinueButton();
		test.log(LogStatus.INFO, "Click on Continue Button");
		String sessionID=bookingPage.getSessionID();
		test.log(LogStatus.INFO, "Session ID is: '"+sessionID+"'");
		bookingPage.selectCheaperFlights("Coach/Economy");
		test.log(LogStatus.INFO, "User clicks on Browse all Flights link");
		test.log(LogStatus.INFO, "User selects a particular flight from existing options");
		logs.info("Select Cheaper flights from flight options");
		test.log(LogStatus.INFO, "User clicks on Select button");
		test.log(LogStatus.INFO, "User selects cabin class:Coach/Economy");
		test.log(LogStatus.INFO, "click to continue button");
		bookingPage.getTripinclusionContinueButton();
		bookingPage.clicktoContinuePage();
		test.log(LogStatus.INFO, "User clicks on Continue  to arrive in Pax Info Page");
		expectedFirstTravellerInfo = passengerInfoPage.fillFirstTravellerDetails(ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_FirstName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_LastName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_Gender", "Valid-Value"),ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_DOB", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_Passport", "Valid-Value"));
		test.log(LogStatus.INFO, "User enters \"Morris\" as First Traveller First Name");
		test.log(LogStatus.INFO, "User enters \"Mano\" as First Traveller Last Name");
		test.log(LogStatus.INFO, "User selects \"Gender:Male\" for First Traveller");
		test.log(LogStatus.INFO, "User selects \"DOB:01/01/1992\" for First Traveller's Date of Birth");
		test.log(LogStatus.INFO, "User selects \"Passport details as:US\" for First Traveller");
		expectedSecondTravellerInfo = passengerInfoPage.fillSecondTravellerDetails(ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_FirstName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_LastName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_Gender", "Valid-Value"),ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_DOB", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_Passport", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "Traveller_Type", "Valid-Value"));
		test.log(LogStatus.INFO, "User enters \"Shally\" as Second Traveller First Name");
		test.log(LogStatus.INFO, "User enters \"Mano\" as Second Traveller Last Name");
		test.log(LogStatus.INFO, "User selects \"Female\" for Second Traveller Last Name");
		test.log(LogStatus.INFO, "User selects \"DOB:01/01/1994\" for Second Traveller's Date of Birth");
		test.log(LogStatus.INFO, "User selects \"Passport details as:US\" for Second Traveller");
		test.log(LogStatus.INFO, "User filled all the passenger details successfully");
		logs.info("User filled all the passenger details successfully");
		bookingPage.getTripinclusionContinueButton();
		bookingPage.clicktoContinuePage();
		test.log(LogStatus.INFO, "Click on Continue button to validate trip summary on Payment page");
		if(TestBase.flag_Mob){
			PageBase.verifyTravellerDetails(BookingLocators.getverifyTraveler1NameiOS(), expectedFirstTravellerInfo);
			PageBase.verifyTravellerDetails(BookingLocators.getverifyTraveler2NameiOS(), expectedSecondTravellerInfo);
		}else{
		PageBase.verifyTravellerDetails(BookingLocators.getverifyTraveler1Name(), expectedFirstTravellerInfo);
		PageBase.verifyTravellerDetails(BookingLocators.getverifyTraveler2Name(), expectedSecondTravellerInfo);
		}
		test.log(LogStatus.INFO, "Flights & passenger details verified successfully on PaymentPage");
		logs.info("Flights & passenger details verified successfully on PaymentPage");
		bookingPage.tripSummary();
		logs.endTestCase(method.getName());
	}

	@Test(groups= {"smoke"},priority=4)
	public void TC_0004_FirstPackageoptionalongwithRemoveHotelFunc(Method method) throws Exception {
		 ExtentTest test = ExtentTestManager.startTest(method.getName(), "TC_0004_FirstPackageoptionalongwithRemoveHotelFunc");
		 logs.startTestCase(method.getName());
		 test.log(LogStatus.INFO, "User entered the URL: 'https://www.tripmasters.com/");
		 String selectedPackage=bookingPage.selectFromVacationPackageIdeas();
		 test.log(LogStatus.INFO, "User selects '"+selectedPackage+"' option from Vacation Package Ideas");
		bookingPage.fillLeavingFromDetails_FirstPckg(ExcelUtilityClass.getKeyValue("TestDataSheet", "Leaving From", "Valid-Value"));
		test.log(LogStatus.INFO, "User entered \"Washington (all Airports), DC\" into leaving from field");
		String selectDate=bookingPage.selectValueFromCalendar_FirstPckg(150,2);
		test.log(LogStatus.INFO,   "User selects '" + selectDate + "' from calendar");		
		bookingPage.selectGuestDetails_FirstPckgOneRoom("1|2");
		test.log(LogStatus.INFO, "User selects 1 Room with two Adults");
		bookingPage.clickOnViewPrice();
		test.log(LogStatus.INFO, "User clicks on View Price Button");
		String sessionID=bookingPage.getSessionID();
		test.log(LogStatus.INFO, "Session ID is: '"+sessionID+"'");
		bookingPage.clickToRemoveSecondCityHotel();
		test.log(LogStatus.INFO, "User clicks on remove second city button");
		bookingPage.clickToYesOnDialogBox();
		test.log(LogStatus.INFO, "User clicks to Yes button on Dialog Box");
		bookingPage.getContinueLink();
		test.log(LogStatus.INFO, "User clicks on Continue Button");
		test.log(LogStatus.INFO, "User validates that the hotel name is removed for second city ");
		bookingPage.clicktoContinuePage();
		test.log(LogStatus.INFO, "User clicks on Continue Page to fill PAX details");
		expectedFirstTravellerInfo = passengerInfoPage.fillFirstTravellerDetails(ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_FirstName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_LastName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_Gender", "Valid-Value"),ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_DOB", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_Passport", "Valid-Value"));
		test.log(LogStatus.INFO, "User enters \"John\" as First Traveller First Name");
		test.log(LogStatus.INFO, "User enters \"Leo\" as First Traveller Last Name");
		test.log(LogStatus.INFO, "User selects \"Gender:Male\" for First Traveller ");
		test.log(LogStatus.INFO, "User selects \"DOB:01/01/1992\" for First Traveller's Date of Birth");
		test.log(LogStatus.INFO, "User selects \"Passport details as:US\" for First Traveller");
		expectedSecondTravellerInfo = passengerInfoPage.fillSecondTravellerDetails(ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_FirstName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_LastName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_Gender", "Valid-Value"),ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_DOB", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_Passport", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "Traveller_Type", "Valid-Value"));
		test.log(LogStatus.INFO, "User enters \"Elvin\" as Second Traveller First Name");
		test.log(LogStatus.INFO, "User enters \"Leo\" as Second Traveller Last Name");
		test.log(LogStatus.INFO, "User selects \"Gender:Male\" for Second Traveller");
		test.log(LogStatus.INFO, "User selects \"DOB:01/01/1994\" for Second Traveller's Date of Birth");
		test.log(LogStatus.INFO, "User selects \"Passport details as:US\" for Second Traveller");
		bookingPage.getTripinclusionContinueButton();
		bookingPage.clicktoContinuePage();
		test.log(LogStatus.INFO, "Click to Continue & User redirected to Payment Page");
		PageBase.verifyTravellerDetails(BookingLocators.getverifyTraveler1Name(), expectedFirstTravellerInfo);
		PageBase.verifyTravellerDetails(BookingLocators.getverifyTraveler2Name(), expectedSecondTravellerInfo);
		bookingPage.tripSummary();
		test.log(LogStatus.INFO, "Removed Hotel is not available for second City,Verified!");
		test.log(LogStatus.INFO, "Flights & passenger details verified successfully on PaymentPage");
		logs.endTestCase(method.getName());
	}
	
	
	@Test(groups= {"testdemo"},priority=4)
	public void TC_0004_bookingFlightAndSingleRoomWithTwoAdults_FromFirstPackages(Method method) throws Exception {
		ExtentTest test = ExtentTestManager.startTest(method.getName(), "TC_0004_bookingFlightAndSingleRoomWithTwoAdults_FromFirstPackages");
		test.log(LogStatus.INFO, "Entered the URL: http://www.tripmasters.com/");
		String explorelinkname = bookingPage.exploreList();
		bookingPage.getexploreLink();
		test.log(LogStatus.INFO, "Scrolled Down");
		test.log(LogStatus.INFO, "User tap on first package on Explore Slider");
		test.log(LogStatus.INFO, "Redirect to the package named "+ explorelinkname);
		bookingPage.fillLeavingonExplorepage(ExcelUtilityClass.getKeyValue("TestDataSheet", "Leaving From", "Valid-Value"));
		test.log(LogStatus.INFO, "Scrolled Down");
		test.log(LogStatus.INFO, "User entered \"Washington (all Airports), DC\" into leaving from field");
		String date = bookingPage.selectValueFromCalendar(152 ,0);
		test.log(LogStatus.INFO,   "User selects arrival date '" + date + "'from calendar");
		bookingPage.selectGuestDetails("1|2");
		test.log(LogStatus.INFO, "User select \" One Room for Two Adults\" from Guest list");
		bookingPage.doneButtonMob();
		test.log(LogStatus.INFO, "Tap on Done");
		test.log(LogStatus.INFO, "Booking details filled successfully for Two Adults");
		bookingPage.clickOnViewPrice();
		test.log(LogStatus.INFO, "User tap on View Price.");
		PageBase.waitForElement(10);
		bookingPage.removeSecondCityHotel();
		test.log(LogStatus.INFO, "Scrolled Down");
		test.log(LogStatus.INFO, "Tap on Remove hotel for second city");
		test.log(LogStatus.INFO, "Tap on Yes button");
		bookingPage.getContinueLink();
		test.log(LogStatus.INFO, "Scrolled Down");
		test.log(LogStatus.INFO, "Tap on Continue.");
		bookingPage.validateSecondCityHotel();
		test.log(LogStatus.INFO, "Verifies Hotel for Second City removed successfully");
		bookingPage.getTripinclusionContinueButton();
		test.log(LogStatus.INFO, "Scrolled Down");
		test.log(LogStatus.INFO, "Tap on Continue to Reservation page");
		expectedFirstTravellerInfo = passengerInfoPage.fillFirstTravellerDetails(ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_FirstName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_LastName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_Gender", "Valid-Value"),ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_DOB", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "FirstT_Passport", "Valid-Value"));
		test.log(LogStatus.INFO, "User enters \"Morris\" as First Traveller First Name");
		test.log(LogStatus.INFO, "User enters \"Mano\" as First Traveller Last Name");
      	test.log(LogStatus.INFO, "User selects \"Gender:Male\" for First Traveller Last Name");
      	test.log(LogStatus.INFO, "Scrolled Down");
		test.log(LogStatus.INFO, "User selects \"DOB:01/01/1992\" for First Traveller's Date of Birth");
		test.log(LogStatus.INFO, "User selects \"Passport details as:US\" for First Traveller");
		expectedSecondTravellerInfo = passengerInfoPage.fillSecondTravellerDetails(ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_FirstName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_LastName", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_Gender", "Valid-Value"),ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_DOB", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "SecondT_Passport", "Valid-Value"), ExcelUtilityClass.getKeyValue("TestDataSheet", "Traveller_Type", "Valid-Value"));
		test.log(LogStatus.INFO, "User enters \"Elvin\" as Second Traveller First Name");
		test.log(LogStatus.INFO, "User enters \"Leo\" as Second Traveller Last Name");
		test.log(LogStatus.INFO, "User selects \"Gender:Male\" for Second Traveller Last Name");
		test.log(LogStatus.INFO, "User selects \"DOB:01/01/1994\" for Second Traveller's Date of Birth");
		test.log(LogStatus.INFO, "User selects \"Passport details as:US\" for Second Traveller");
		bookingPage.getTripinclusionContinueButton();
		bookingPage.clicktoContinuePage();
		test.log(LogStatus.INFO, "Scrolled Down");
		test.log(LogStatus.INFO, "Tap to Continue & User redirected to Payment Page");
		if(TestBase.flag_Mob){
			PageBase.verifyTravellerDetails(BookingLocators.getverifyTraveler1NameiOS(), expectedFirstTravellerInfo);
			PageBase.verifyTravellerDetails(BookingLocators.getverifyTraveler2NameiOS(), expectedSecondTravellerInfo);
		}
		test.log(LogStatus.INFO, "Flights & passenger details verified successfully on PaymentPage");
	}
	
}

