package com.tripmasters.framework.pageActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.html5.RemoteSessionStorage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tripmasters.framework.base.PageBase;
import com.tripmasters.framework.base.TestBase;
import com.tripmasters.framework.pageLocators.BookingLocators;
import com.tripmasters.framework.pageLocators.HomePageLocators;
import com.tripmasters.framework.pageLocators.TripInclusionPageLocators;
import com.tripmasters.framework.reports.Logs;


public class BookingPageAction extends PageBase {

	ExtentTest test;
	public static String  secondCityHotel;
	
	public BookingPageAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void fillLeavingFromDetails(String leavingFrom) throws Exception{
		
		clearAndSetValues(BookingLocators.getLeavingTxtbox(), leavingFrom);
		//Logs.info("User entered '" + leavingFrom + "' into leaving from field");
		//test.log(LogStatus.INFO, "User entered '" + leavingFrom + "' into leaving from field");
	}
	
	public void fillGoingToCityDetails(String destination) throws Exception{
		clearAndSetValues(BookingLocators.getgoingToTextbox(), destination);
		//Logs.info("User entered '" + destination + "' into Going to from field");
		//test.log(LogStatus.INFO, "User entered '" + destination + "' into Going to from field");
	}
	
	public  void selectStayingTime(String stayingTime) {
		selectOptionByValue(BookingLocators.getstayingDrpdown(), stayingTime);
		//Logs.info("User entered '" + stayingTime + "' nights staying time");
		//test.log(LogStatus.INFO, "User entered '" + stayingTime + "' nights staying time");
	}
	
	public void selectNoMoreCitiesBtn(){
		clickUsingJavaScript(BookingLocators.getnoMoreCitiesBtn());
	}

	/**
	 * Select guest details
	 * 
	 * @param guestInfo
	 * @throws Exception 
	 */
	public  void selectGuestDetails(String guestInfo) throws Exception {

		if (TestBase.flag_Mob) {
			clickUsingJavaScript(BookingLocators.getselectGuestRoomOptions());
			clickUsingJavaScript(BookingLocators.getselectGuestRoomOptionsDrpdown());
			WebElement wb = driver.findElement(BookingLocators.getoptionListForGuestsAndRooms())
					.findElement(By.xpath(".//li[@id='" + guestInfo + "']"));
			clickUsingJavaScript(wb);
		} else {
			selectOptionByValue(BookingLocators.getselectGuestDrpdown(), guestInfo);
			//Logs.info("User select '" + guestInfo + "' from Guest list");
			//test.log(LogStatus.INFO, "User select '" + guestInfo + "' from Guest list");
		}
	}
	//Satyam
	public void clickonContinue() {
		WebElement e =	 driver.findElement(BookingLocators.getnoMoreCitiesBtn());
		e.click();
		}
	
	public void selectPremiumEconomy()
	{
		if(TestBase.flag_Mob)
	{
		clickUsingJavaScript(HomePageLocators.getSelectPremiumEconomy());
	}
	}
	
	public void doneButtonMob() throws Exception
	{
	if(TestBase.flag_Mob){
		clickUsingJavaScript(BookingLocators.getdoneButton());
	   }
	}
	
	/*
	 * public void selectGuestDetailsForOneandOther(String guestInfo) {
	 * clickUsingJavaScript(BookingLocators.getselectGuestRoomOptions());
	 * clickUsingJavaScript(BookingLocators.getselectGuestRoomOptionsDrpdown());
	 * WebElement wb =
	 * driver.findElement(BookingLocators.getoptionListForGuestsAndRooms())
	 * .findElement(By.xpath(".//li[@id='" + guestInfo + "']"));
	 * clickUsingJavaScript(wb);
	 * clickUsingJavaScript(BookingLocators.getselectNumberOfAdults) }
	 */

	/**
	 * 
	 * @param guestInfo
	 */
	public  void selectGuestDetailsOnMob(String guestInfo) {
		selectOptionByValue(BookingLocators.getselectGuestDrpdown(), guestInfo);
		//Logs.info("User select '" + guestInfo + "' from Guest list");
	}

	public  void clickonContinueButton() throws Exception {

		clickUsingJavaScript(BookingLocators.getcontinueBtn());
		waitForElement(2);
	}

	public  void clickonContinueLink() throws Exception {
		if(TestBase.flag_Mob) {
			scrollDown();
			scrollDown();
			clickUsingJavaScript(BookingLocators.getcontinueLink());
		}
		else {
		clickUsingJavaScript(BookingLocators.getcontinueLink());
		}
	}

	public  String selectCheaperFlights(String cabinType) throws Exception {
		String flightvalue = null;
		if (TestBase.flag_Mob) {
			flightvalue=selectCheaperFlights_Mob();
		} else {
			
			waitForElement(8);
			clickUsingJavaScript(BookingLocators.getcheaperFlightsLink());
			waitForElement(8);
			flightvalue = driver.findElement(BookingLocators.getexpectedFlight()).getText();
			clickUsingJavaScript(BookingLocators.getselectFlightOption());
			clickUsingJavaScript(BookingLocators.getselectButtonInFlightOption1());
			//clickUsingJavaScript(BookingLocators.getcontinueLink());
			waitForElement(3);
			//newadded*************************
			if(cabinType.equalsIgnoreCase("Coach/Economy")){
			clickUsingJavaScript(BookingLocators.getselectCabinFromFlightOptions());
			}else if(cabinType.equalsIgnoreCase("Business")){
				clickUsingJavaScript(BookingLocators.getselectscndCabinFromFlightOptions());
			}else if(cabinType.equalsIgnoreCase("Mixed")){
				clickUsingJavaScript(BookingLocators.getselectscndCabinFromFlightOptions());
			}
			//clickUsingJavaScript(BookingLocators.getbackToItineraryOption());
			//***************
			waitForElement(2);
			clickUsingJavaScript(BookingLocators.getcontinueLink());
			waitForElement(5);
		}
		return flightvalue;
	}

	public  String selectCheaperFlights_Mob() throws Exception {
		
		isElementDisplayed(BookingLocators.getcheaperFlightsLink());
		scrollDown();
		clickUsingJavaScript(BookingLocators.getcheaperFlightsLink());
		String expectflightvalue = driver.findElement(BookingLocators.getexpectedFlight()).getText();
		System.out.println(expectflightvalue);
		clickUsingJavaScript(BookingLocators.getselectFlightOption());
		clickUsingJavaScript(BookingLocators.getselectbutton());
		isElementDisplayed(BookingLocators.getcontinueLink());
		scrollDown();
		scrollDown();
		clickUsingJavaScript(BookingLocators.getcontinueLink());
		return expectflightvalue;
	}

	public  void clicktoContinuePage() throws Exception {
     if(!TestBase.flag_Mob){
			clickUsingJavaScript(BookingLocators.getcontinueImage());
     }
	}
	
//satyam changes made according to iphone======================================
	public  void selectNumberOfAdult(String numOfAdults, By element) {
		if(!TestBase.flag_Mob) {
		selectOptionByValue(element, numOfAdults);
		}
	}
	public void selectnumberofadultsRoom_1iOS() {
		if(TestBase.flag_Mob){
		clickUsingJavaScript(BookingLocators.getselectfirstRoomAdultPlus());
		}
	}
	
	public void selectnumberofadultsRoom_2iOS(){
		// adult two for room two ---->
		if(TestBase.flag_Mob){
		driver.findElement(BookingLocators.getSecondRoomadultPlus()).click();
		}
	}
	
	public  void select2NumberOfAdultForRoom1(String numOfAdults, By element) throws Exception
	{
      selectOptionByValue(element, numOfAdults);
	}
	
	public void select1NumberOfAdultForRoom2(String numOfAdults,By element) throws Exception
	{
		if(TestBase.flag_Mob)
		{
			PageBase.waitForElement(3);
			{
				clickUsingJavaScript(BookingLocators.getselectNumberOfAdultRoom2Mob());
			}
		}
		else
		{
			selectOptionByValue(element, numOfAdults);
		}
	}
	
	public  void ClickOnWithoutAir() {

		BookingLocators.getWithoutAirButton();

	}

	//TODO:this method need some modifications.
	//modified by satyam
	public  void selectNumberOfChild(String numOfChild, String ageOfChild, String childType) throws Exception
	{

	if(TestBase.flag_Mob)
	{
	    if(childType.equals("Child1"))
			{
				// clickUsingJavaScript(BookingLocators.getselectfirstRoomAdultPlus());
				clickUsingJavaScript(BookingLocators.getselectfirstRoomChildPlus());
				PageBase.waitForElement(3);
				driver.findElement(BookingLocators.getfirstChildDropdowniOS()).click();
				PageBase.waitForElement(3);
				driver.findElement(BookingLocators.getselectChildAgeDropdownMob()).click();
				PageBase.waitForElement(2);
			} else {
				clickUsingJavaScript(BookingLocators.getselectsecondRoomChildPlus());
				PageBase.waitForElement(3);
				driver.findElement(BookingLocators.getsecondRoomChildDropdowniOS()).click();
				PageBase.waitForElement(3);
				driver.findElement(BookingLocators.getselectRoomtwoChildAgeDropdownMob()).click();
				PageBase.waitForElement(2);
			}
	}
	else
		{
			if (childType.equals("Child1")) {
				selectOptionByValue(BookingLocators.getselectChildDrpdown(), numOfChild);
				//Logs.info("User entered number of child'" + numOfChild + "' ");
				Select option = new Select(driver.findElement(By.xpath("//select[@id='xiChild1']")));
				option.selectByValue(ageOfChild);
				// selectOptionByValue(BookingLocators.getselectChildAgeDrpdown(),
				// ageOfChild);
				//Logs.info("User entered age of child'" + ageOfChild + "' ");
			} else {
				selectOptionByValue(BookingLocators.getselectChildRoom2Drpdown(), numOfChild);
				//Logs.info("User entered number of child'" + numOfChild + "' ");
				Select option = new Select(driver.findElement(By.xpath("//select[@id='xRoom2_iChild1']")));
				option.selectByValue(ageOfChild);
				// selectOptionByValue(BookingLocators.getselectChildAgeRoom2Drpdown(),
				// ageOfChild);
				//Logs.info("User entered age of child'" + ageOfChild + "' ");
	   }
	 }
	}
	public void selectNumberofChildiOS() {
		clickUsingJavaScript(BookingLocators.getselectfirstRoomChildPlus());
		BookingLocators.getfirstChildDropdowniOS();
	}
	
	public  void fillBasicDetatilsForMultipleCities(String leavefrom, String firstdestination,String stayingTime,String seconddestination,String seconddrop) throws Exception {
		clearAndSetValues(BookingLocators.getLeavingTxtbox(), leavefrom);
		clearAndSetValues(BookingLocators.getgoingToTextbox(), firstdestination);
		selectStayingTime(stayingTime);
		clickUsingJavaScript(BookingLocators.getaddCityBtn());
		clearAndSetValues(BookingLocators.getgoingToTextboxSecond(), seconddestination);
		selectStayingTimeTwo(seconddrop);
		
	}
	public void getTripinclusionContinueButton() throws Exception {
		if(TestBase.flag_Mob){
		scrollDown();
		scrollDown();
		clickUsingJavaScript(BookingLocators.getTripInclusionContinueButtonmob());
		}
	}

	public  void getWithoutButton() {

		clickUsingJavaScript(BookingLocators.getWithoutAirButton());
	}


	public  String browseHotelsButton() throws Exception {
		waitForElement(5);
		clickUsingJavaScript(BookingLocators.getBrowseHotelsLink());
		waitForElement(2);
		if(!TestBase.flag_Mob){
			String actualhotel = driver.findElement(BookingLocators.getFirstHotel()).getText();
			return actualhotel;
			}
		else{
			String actualhotel = driver.findElement(BookingLocators.getfirstHoteliOS()).getText();
			return actualhotel;
		}
	}

	public void selectFirstHotel(){
		clickUsingJavaScript(BookingLocators.getselectFirstHotel());
	}

	public void selectFirstHotel_SingleCity(){
		
		clickUsingJavaScript(BookingLocators.getselectFirstHotel_SingleCity());
	}
	
	public  String browseSelectHotel() {
		String expectedhotel = driver.findElement(BookingLocators.getExpectedHotel()).getText();
		return expectedhotel;
	}

	public  void getContinueLink() throws Exception {
		clickUsingJavaScript(BookingLocators.getcontinueLink());
		waitForElement(5);
	}

	public  List<String> getSelectedFlightsDetails() {
		List<String> actualFlightdetails = new ArrayList<String>();

		List<WebElement> actualFlight = driver.findElements(BookingLocators.getactualFlightDetails());

		for (WebElement details : actualFlight) {
			actualFlightdetails.add(details.getText());
		}
		return actualFlightdetails;
	}

	public  String getActualFlight() {
		String flightvalue = driver.findElement(BookingLocators.getactualFlightDetails()).getText();
		return flightvalue;
	}

	public  void selectWithoutAir() throws Exception {
		clickUsingJavaScript(BookingLocators.getwithoutAir());
        waitForElement(2);
        }

	public  void clickChangedArriveDate() {
		clickUsingJavaScript(BookingLocators.getChangedArriveDate());
		boolean expecteddate = driver.findElement(BookingLocators.getChangedArriveDate()).isEnabled();
		Assert.assertTrue(expecteddate);
	}

	public  void fillBasicDetails(String leavefrom, String firstdestination, String stayingTime,
			String seconddestination, String seconddrop, String thirddestination, String thirddrop) throws Exception {

		clearAndSetValues(BookingLocators.getLeavingTxtbox(), leavefrom);
		clearAndSetValues(BookingLocators.getgoingToTextbox(), firstdestination);
		selectStayingTime(stayingTime);
		clickUsingJavaScript(BookingLocators.getaddCityBtn());
		clearAndSetValues(BookingLocators.getgoingToTextboxSecond(), seconddestination);
		selectStayingTimeTwo(seconddrop);
		clickUsingJavaScript(BookingLocators.getaddCityBtn());
		clearAndSetValues(BookingLocators.getgoingToTextboxThird(), thirddestination);
		selectStayingTimeThree(thirddrop);

	}

	public  void deleteAddedCities() {
		clickUsingJavaScript(BookingLocators.getthirdremoveCitylink());
		//clickUsingJavaScript(BookingLocators.getsecondremovecitylink());

	}

	public  void getNoMoreCitiesButton() {
		clickUsingJavaScript(BookingLocators.getnoMoreCitiesBtn());
	}

	public  void selectguesdetatils(String guestinfo) throws Exception {
		selectGuestDetails(guestinfo);
	}

	public  boolean isremovecitydisplayed() {
		boolean result = false;
		if (driver.findElement(BookingLocators.getsecondremovecitylink()).isDisplayed()) {
			result = true;

		}
		return result;
	}

	public  void selectStayingTimeTwo(String stayingTimeTwo) {

		selectOptionByValue(BookingLocators.getstayingDrpdowntwo(), stayingTimeTwo);
	}

//	public  String selectValueFromCalendar(int AdditionalDays) {
//		clickOnElement(BookingLocators.getArriveDateDropdown());
//		String newDate = selectNewDateFromCalendar(AdditionalDays);
//		String[] newDateDay = newDate.split("/");
//		String selecteddate=newDateDay[1];
//		List<WebElement> columns = driver.findElements(BookingLocators.getArriveDateCalender());
//		for (WebElement cell : columns) {
//			if (cell.getText().equals(selecteddate)) {
//				cell.findElement(By.linkText(selecteddate)).click();
//				//test.log(LogStatus.INFO, "User selects '" + newDate + "' as Arriving_On Date");
//				break;
//			}
//		}
//		return newDate;
//	}
	
	public  String selectValueFromCalendar(int additionaldays,int n) throws Exception {
		clickOnElement(BookingLocators.getArriveDateDropdown());
		if(n>=2) {
		for(int i=0;i<n;i++)
		{
		clickOnElement(BookingLocators.getnavMonth());
		}
		}else if(n<1) {
		clickOnElement(BookingLocators.getnavMonth_prev());
		}
		
		clickOnElement(BookingLocators.clickondate());
		
		String newDate = selectNewDateFromCalendar(additionaldays);
		String[] newDateDay = newDate.split("/");
		String selectdate=newDateDay[1]; 
		List<WebElement> columns = driver.findElements(BookingLocators.getArriveDateCalender());
		for (WebElement cell : columns) {
		if (cell.getText().equals(selectdate)) {
		Thread.sleep(20000);
		cell.findElement(By.linkText(selectdate)).click();
		break;
		}
		}
		return newDate;
		}
	
//	public  String selectValueFromCalendar(int additionaldays,int n) throws Exception {
//		clickOnElement(BookingLocators.getArriveDateDropdown());
//		String newDate = selectNewDateFromCalendar(additionaldays);
//		String[] newDateDay = newDate.split("/");
//		String selectdate=newDateDay[1]; 
//		
//		if(n>=2) {
//		for(int i=0;i<n;i++)
//		{
//		clickOnElement(BookingLocators.getnavMonth());
//		}
//		List<WebElement> columns = driver.findElements(BookingLocators.getArriveDateCalender());
//		for (WebElement cell : columns) {
//			if (cell.getText().equals(selectdate)) {
//			Thread.sleep(20000);
//			cell.findElement(By.linkText(selectdate)).click();
//			break;
//			}
//		 }
//	   }
//	
//		else if(n<1) {
//		clickOnElement(BookingLocators.getnavMonth_prev());
//		List<WebElement> columns = driver.findElements(BookingLocators.getArriveDateCalender());
//		for (WebElement cell : columns) {
//			if (cell.getText().equals(selectdate)) {
//			Thread.sleep(20000);
//			cell.findElement(By.linkText(selectdate)).click();
//			break;
//			}
//		  }
//		}
//		return newDate;
//		}


	public  void selectCabinClass(String cabinclass) {
		selectOptionByText(BookingLocators.getCabinClassDropdown(), cabinclass);
	}

	/**
	 * Select Cabin Class For Mobile
	 * 
	 * @param cabinclass
	 * @throws Exception 
	 * @author Mrinal
	 */
	public  void selectCabinClassForMob(String cabinclass) throws Exception {
		if (TestBase.flag_Mob) {
			WebElement wb = driver.findElement(BookingLocators.getcabinSectionMob())
					.findElement(By.xpath(".//span[text()='" + cabinclass + "']/parent::p"));
			clickUsingJavaScript(wb);
		} else {
			selectOptionByText(BookingLocators.getCabinClassDropdown(), cabinclass);
		}
	}

	public  void validateremovedcity() {
		boolean flag = false;
		try {
			driver.findElement(BookingLocators.getthirdremoveCitylink());
			flag = false;
		} catch (Exception NoSuchElementException) {
			flag = true;
		}
		Assert.assertTrue(flag);
	}

	public  void bookingDetailswithPremiumEcomomy(String leavingFrom, String destination, String cabinclass,String stayingTime, String guestInfo) throws Exception {
		selectCabinClass(cabinclass);
		clearAndSetValues(BookingLocators.getLeavingTxtbox(), leavingFrom);
		clearAndSetValues(BookingLocators.getgoingToTextbox(), destination);
		selectStayingTime(stayingTime);
		clickUsingJavaScript(BookingLocators.getnoMoreCitiesBtn());
		selectGuestDetails(guestInfo);
	}

	public  String selectedcabinAssert() {

		if (TestBase.flag_Mob)
		{
			//clickUsingJavaScript(HomePageLocators.getSelectPremiumEconomy());
		String expectedcabin = driver.findElement(HomePageLocators.getSelectPremiumEconomy()).getText();
		return expectedcabin;
		}
		else
		{
		String selectedcabin = driver.findElement(BookingLocators.getFirstpremiumOption()).getText();
		   return selectedcabin;
		}
		}
	
	    public String verifycabinAssert() {
		if(TestBase.flag_Mob)
		{
		   
		String expectedcabin = driver.findElement(BookingLocators.getVerifyPremiumEconomy()).getText();
		return expectedcabin;
		}
		else
		{
		    String expectedcabin = driver.findElement(BookingLocators.getSecondpremiumOption()).getText();
		    String[] actualCabinClass=expectedcabin.split("Cabin: ");
		    String actualExpectedCabin=actualCabinClass[1];
		     return actualExpectedCabin;
		}
		}
	    
	    public  static boolean verifyCabin()
		{
		clickUsingJavaScript(HomePageLocators.getSelectPremiumEconomy());
		boolean verifycabin = driver.findElement(HomePageLocators.getSelectPremiumEconomy()).isEnabled();
		return verifycabin;
		}

	public  void selectLatinAmericaLink() {
		clickUsingJavaScript(HomePageLocators.getExploreLatinAmericaLnk());
		boolean actuallink = (getPageTitle().contains("Vacation Packages"));
		Assert.assertTrue(actuallink);
	}

	public  void verifyLatinAmericPage() {
		boolean expectedlink = (getPageTitle().contains("Latin America Vacations"));
		Assert.assertTrue(expectedlink);
	}

	/**
	 * click On Spot light On DrpDwn for mobile
	 * 
	 * @throws Exception
	 * @author Mrinal
	 */
	public  void clickOnSpotlightOnDrpDwnForMob() throws Exception {
		if (TestBase.flag_Mob) {
			scrollDownForMob(4);
			clickUsingJavaScript(HomePageLocators.getSpotlightOnDrpDwn());
			
		}
	}

	/**
	 * click On First Option Under Spot light On DrpDwn for mobile
	 * 
	 * @throws Exception
	 * @author Mrinal
	 * @return
	 */
	public  String clickOnFirstOptionUnderSpotlightForMob() throws Exception {
		String title = null;
		if (TestBase.flag_Mob) {
			title = getText(HomePageLocators.getfirstOptionUnderSpotlightDrpDwn());
			clickUsingJavaScript(HomePageLocators.getfirstOptionUnderSpotlightDrpDwn());
		}
		return title;
	}

	/**
	 * verify Page Displayed
	 * 
	 * @throws Exception
	 * @author Mrinal
	 */
	public  void verifyPageDisplayed(String PageTitle) {
		if(TestBase.flag_Mob){
		Assert.assertTrue(getPageTitle().contains(PageTitle.trim()));
		}
	}

	public  void oldArriveDate() throws Exception {
		boolean actualdate = driver.findElement(BookingLocators.getArriveDate()).isEnabled();
		Assert.assertTrue(actualdate);
		waitForElement(5);
	}

	public  void tripSummary() throws Exception 
	{
		if(TestBase.flag_Mob)
		{
			scrollDownForMob(4);
			clickUsingJavaScript(TripInclusionPageLocators.getTripSummaryButton());
         }
		else
		{
			clickUsingJavaScript(TripInclusionPageLocators.getTripSummaryButton());
		}
	}

	public  void validateTripIncluisonPage() {
		boolean flag = false;
		if (driver.getTitle().contains("Itinerary - Review"))
			flag = true;
		else
			flag = false;

		Assert.assertTrue(flag);
	}

	public  void selectStayingTimeThree(String stayingTimeThree) {
		selectOptionByValue(BookingLocators.getstayingDrpdownthree(), stayingTimeThree);
	}
	public void validateTripPage() {
		  if(!TestBase.flag_Mob)
		  {
		  if (driver.getTitle().contains("Itinerary - Review"))
		  {
		  System.out.println("Title is "+ driver.getTitle());

		  boolean flag = true;
		  Assert.assertTrue(flag);
		  }

		  }
		  }

	/**
	 * click On Build Your Vacation Drop Down on mobile browser
	 * 
	 * @author Mrinal
	 */
	public  void clickOnBuildYourVacationDropDown() {
		if (TestBase.flag_Mob)
			clickOnElement(BookingLocators.getBuildYourVacationDropDown());
	}
	
	public void clickOnAddCityBtn(){
		clickUsingJavaScript(BookingLocators.getaddCityBtn());
	}

	public void fillSecndAddedCityDetails(String destination_second) throws Exception {
		clearAndSetValues(BookingLocators.getgoingToTextboxSecond(), destination_second);
		//Logs.info("User entered '" + destination_second + "' into Second Going to field");
	}

	public void fillThirdAddedCityDetails(String destination_third) throws Exception {
		clearAndSetValues(BookingLocators.getgoingToTextboxThird(), destination_third);
		//Logs.info("User entered '" + destination_third + "' into Second Going to field");
	}
	public void clickonAsian_PacificLink(){
		clickUsingJavaScript(HomePageLocators.getasiaPagelink());
	}

	public void ValidateTravelByOption() {
		boolean validateTravelByStatus=isElementDisplayed(BookingLocators.validateTravelByOption());
		Assert.assertTrue(validateTravelByStatus);
	}

	public void clickonEuropeLink() {
		clickUsingJavaScript(HomePageLocators.getEuropePageLink());
	}

	public void browseHotelsBy_Reviewscore() throws Exception {
		clickUsingJavaScript(BookingLocators.getHotelsBy_Reviewscore());
		waitForElement(5);
		boolean status=driver.findElement(BookingLocators.gethotelBrowseOptions()).isDisplayed();
		System.out.println("Staus is"+ status);
		Assert.assertTrue(status);
	}

	public void browseHotelsBy_Price() {
		clickUsingJavaScript(BookingLocators.getHotelsBy_Price());
		boolean status=driver.findElement(BookingLocators.gethotelBrowseOptions()).isDisplayed();
		System.out.println("Staus is"+ status);
		Assert.assertTrue(status);
	}

	public void browseHotelsBy_Name() {
		clickUsingJavaScript(BookingLocators.getHotelsBy_Name());
		boolean status=driver.findElement(BookingLocators.gethotelBrowseOptions()).isDisplayed();
		System.out.println("Staus is"+ status);
		Assert.assertTrue(status);
	}

	public void validateTravlByTrain() {
		clickUsingJavaScript(BookingLocators.getChangeTravelByButton());
		boolean status=driver.findElement(By.xpath("(//input[@id='xradioTrans1'])[1]")).isSelected();
		System.out.println("Staus is"+ status);
		Assert.assertTrue(status);
	}

	public void clickOnTopDealsLink() {
		clickUsingJavaScript(BookingLocators.getTopDealsButton());
	}

	public void validateTopDealsPage() {
		boolean status=driver.findElement(BookingLocators.getTopDealsPageHeading()).isDisplayed();
		System.out.println("Top Deals Page Status is"+ status);
		Assert.assertTrue(status);
	}

	public void validateTopDealsList() {
		boolean flag=false;
		if(driver.findElements(BookingLocators.getTopDealsPageList()).size()>0){
				flag=true;	
		}
		System.out.println("Top Deals List Status is"+ flag);
		Assert.assertTrue(flag);
		//driver.navigate().back();
		//driver.navigate().refresh();
	}

	public void validateHighLights() {
		boolean status=driver.findElement(BookingLocators.gethighLightOptions()).isDisplayed();
		System.out.println("Highlight Options:"+ status);
		Assert.assertTrue(status);
	}

	public String selectFromVacationPackageIdeas() {
		String selectedPackage = driver.findElement(BookingLocators.getSelectVacationIdeas()).getText();
	    System.out.println(selectedPackage);
		clickUsingJavaScript(BookingLocators.getSelectVacationIdeas());
	    return selectedPackage;
		
	}

	public void clicktoReorderCities() {
		clickUsingJavaScript(BookingLocators.getClickonReorderCities());
	}

	public void fillLeavingFromDetails_BYOPage(String leavingFrom) throws Exception {
		clearAndSetValues(BookingLocators.getleavingTextboxBYO_Page(), leavingFrom);
	}
	
	public  String selectValueFromCalendar_BYOPackage(int AdditionalDays) {
		clickOnElement(BookingLocators.getarriveDateDropdown_BYOPage());
		
		String newDate = selectNewDateFromCalendar(AdditionalDays);
		String[] newDateDay = newDate.split("/");
         String selectedDate= newDateDay[1];
		List<WebElement> columns = driver.findElements(BookingLocators.getArriveDateCalender());
		for (WebElement cell : columns) {
			if (cell.getText().equals(selectedDate)) {
				cell.findElement(By.linkText(selectedDate)).click();
				//test.log(LogStatus.INFO, "User selects '" + newDate + "' as Arriving_On Date");
				break;
			}
		}
		return newDate;
	}

	public void selectGuestDetails_BYOPage(String guestInfo) throws Exception {
		clickUsingJavaScript(BookingLocators.getselectGuestRoomOptionsDrpdown_BYOPage());
		driver.findElement(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li)[11]")).click();
		
	}

	public void selectAdultForRoom1_BYOPage(String numOfAdults) {
		clickUsingJavaScript(BookingLocators.getselectAdult_Room1_BYOPage());
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('xiAdults')[0].value='1'");
		//clickUsingJavaScript(driver.findElement(By.cssSelector("input[id='xiAdults']")));
		driver.findElement(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li)[15]")).click();
		 
	}

	public void selectChildForRoom1_BYOPage(String numOfChild) {
		clickUsingJavaScript(BookingLocators.getselectChild_Room1_BYOPage());
		driver.findElement(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li)[22]")).click();
	}

	public void enterChildAge_BYOPage(String childAge) throws Exception {
		clearAndSetValues(BookingLocators.getChildAgeTextbox(), childAge);
	}

	public void clickToContinue_BYOPage() {
		clickUsingJavaScript(BookingLocators.getclickOnContinueButton_BYO());

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement element = driver.findElement(By.id("nTXMLSession"));
//		js.executeScript("arguments[0].setAttribute('type', '')",element);
//		System.out.println(driver.findElement(By.id("nTXMLSession")).getAttribute("value"));

	}

	public void validateErrorMessage_MandatoryFields() {
		boolean flag=false;
		if(driver.findElements(BookingLocators.getvalidateErrorOnPAXDetails()).size()>0){
				flag=true;	
		}
		System.out.println("Error Message Status is"+ flag);
		Assert.assertTrue(flag);		
	}

	public void selectGuestDetails_BYOPageOneRoom(String string) {
		clickUsingJavaScript(BookingLocators.getselectGuestRoomOptionsDrpdown_BYOPage());
		driver.findElement(By.xpath("(//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li)[2]")).click();
	}

	public void fillLeavingFromDetails_FirstPckg(String leavingFrom) throws Exception {
		clearAndSetValues(BookingLocators.getleavingTextboxFirstPckg(), leavingFrom);
	}

	public String selectValueFromCalendar_FirstPckg(int AdditionalDays,int n) throws InterruptedException {
		clickOnElement(BookingLocators.getarriveDateDropdown_FirstPckg());
		if(n>=2) {
			for(int i=0;i<=n;i++)
			{
			clickOnElement(BookingLocators.getnavMonth());
			}
			}else if(n<1) {
			clickOnElement(BookingLocators.getnavMonth_prev());
			}
			String newDate = selectNewDateFromCalendar(AdditionalDays);
			String[] newDateDay = newDate.split("/");
			String selectdate=newDateDay[1]; 
			List<WebElement> columns = driver.findElements(BookingLocators.getArriveDateCalender());
			for (WebElement cell : columns) {
			if (cell.getText().equals(selectdate)) {
			Thread.sleep(20000);
			cell.findElement(By.linkText(selectdate)).click();
			
			break;
			}
			}
			return newDate;
			}

	public void selectGuestDetails_FirstPckgOneRoom(String guestInfo) {
		selectOptionByValue(BookingLocators.getselectGuestDrpdown_FirstPackage(), guestInfo);
	}

	//Web Method
//	public void clickOnViewPrice() {
//		clickUsingJavaScript(BookingLocators.getClickOnViewPriceButton());
//	}

	public void clickToRemoveSecondCityHotel() {
		clickUsingJavaScript(BookingLocators.getClickToRemoveScndCityHotel());
	}

	public void clickToYesOnDialogBox() {
		clickUsingJavaScript(BookingLocators.getselectDialogBox());
	}

	public void clickOnRemoveBtnScndCity() {
		clickUsingJavaScript(BookingLocators.getselectRemoveCityBtn());
	}
	public void deleteSecondCity(){
	clickUsingJavaScript(BookingLocators.getsecondremovecitylink());
	}

	public boolean isSecondremovecitydisplayed() {
		 try {
		        driver.findElement(By.xpath("//span//*[text()='Galway']"));
		        return true;
		    } catch (org.openqa.selenium.NoSuchElementException e) {
		        return false;
		    }
	}

	public void selectChngeTransByCar() {
		clickUsingJavaScript(BookingLocators.getChangeTravelByButton());
		clickUsingJavaScript(BookingLocators.getSelectButtonCar());
	}

	public String selectFirstHighLightOption() {
		String expectedValue=driver.findElement(By.xpath("(//div[@class='startHighlight']//div//a)[1]//h3")).getText();
		System.out.println("expec"+expectedValue);
		clickUsingJavaScript(BookingLocators.getSelectHighLightOption());
		return expectedValue;
	}

	public void validateHighlightOption(String value) {
		String actualValue=driver.findElement(By.xpath("(//div[@class='dvBGpageTitle']//div)[1]")).getText();
		System.out.println("actual"+actualValue);
		//Assert.assertTrue(actualValue.contains(value.trim()));
		
	}

	public String getFirstDealTxtclickonCustomize() {
		String expectedVal=driver.findElement(By.xpath("(//div[@id='DealsContainer']//div//a//div)[1]")).getText();
		System.out.println("expected value" +expectedVal);
		clickUsingJavaScript(BookingLocators.getClickOnCustomiseBtn());
		return expectedVal;
	}

	public void validateFirstDealPage(String expectedVal) {
		boolean flag=false;
		if(driver.getPageSource().contains(expectedVal)){
			System.out.println("actual result is"+(driver.getPageSource().contains(expectedVal)));
			flag=true;
		}
		Assert.assertTrue(flag);
	}

	public void selectNumberOfChild_TopDealPage(String numOfChild, String ageOfChild, String childType) throws Exception {
		
		if (childType.equals("Child2")) {
			selectOptionByValue(BookingLocators.getselectChildDrpdown2_dealsPage(), numOfChild);
			clearAndSetValues(BookingLocators.getenterAgeofChild(), ageOfChild);
		}
		
	}

	public String browseHotelsButton_EuropePage() throws Exception {
		waitForElement(5);
		clickUsingJavaScript(BookingLocators.getBrowseHotelsLink_TopDealsPage());
		waitForElement(2);
		if(!TestBase.flag_Mob){
			String actualhotel = driver.findElement(BookingLocators.getFirstHotel()).getText();
			System.out.println(actualhotel);
			return actualhotel;
			}
		else{
			String actualhotel = driver.findElement(BookingLocators.getfirstHoteliOS()).getText();
			return actualhotel;
		}
	}

	public void browseHotelsBy_Star() {
		clickUsingJavaScript(BookingLocators.getHotelsBy_Star());
		boolean status=driver.findElement(BookingLocators.gethotelBrowseOptions()).isDisplayed();
		System.out.println("Staus is"+ status);
		Assert.assertTrue(status);
		
	}

	public String getSessionID() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("nTXMLSession"));
		js.executeScript("arguments[0].setAttribute('type', '')",element);
		System.out.println(driver.findElement(By.id("nTXMLSession")).getAttribute("value"));
		String sessionValue=driver.findElement(By.id("nTXMLSession")).getAttribute("value");
		return sessionValue;
		
	}

	public void clickOnRemoveBtnThirdCity() {
		clickUsingJavaScript(BookingLocators.getselectRemoveThirdCityBtn());
	}
	
	public String exploreList() {
		WebElement e = driver.findElement(By.xpath("(//p[@class='pMproduct']/a)[1]"));
			String listname = e.getText();
			System.out.println("list name is "+ listname);
			return listname;
	}
	
	public  void getexploreLink() throws Exception {
		if (TestBase.flag_Mob)
			PageBase.waitForElement(5);
			clickUsingJavaScript(BookingLocators.getexploreLink());
			scrollDownForMob(1);
			PageBase.waitForElement(5);
	}
	
	public void fillLeavingonExplorepage(String leavingFrom) throws Exception {
		clearAndSetValues(BookingLocators.getLeavingTxtbox(), leavingFrom);
		WebElement select = driver.findElement(By.xpath("(//span[@class='highlight boldText'])[1]"));
		select.click();

	}
	
	public void clickOnViewPrice() {
		clickUsingJavaScript(BookingLocators.getViewPricebtn());
	}
	
	public void removeSecondCityHotel() throws Exception {
		if(TestBase.flag_Mob) {
			scrollDownForMob(2);
		}
	    secondCityHotel = driver.findElement(BookingLocators.getsecondCityhotelName()).getText();
		System.out.println("name of the hotel is "+ secondCityHotel);
		clickUsingJavaScript(BookingLocators.getremoveSecondCityHotel());
		clickUsingJavaScript(BookingLocators.getremoveSecondCityHotelYesBtn());
		scrollDownForMob(2);
		
	}
	
	public void validateSecondCityHotel() {
		boolean flag = true;
	if(driver.getPageSource().contains(secondCityHotel)) {
		 flag = false;
		Assert.assertFalse(flag);
	}
   }
}
