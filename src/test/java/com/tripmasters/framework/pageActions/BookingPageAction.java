package com.tripmasters.framework.pageActions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	String secondCityHotel ;
	
	public BookingPageAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void fillLeavingFromDetails(String leavingFrom) throws Exception{
		clearAndSetValues(BookingLocators.getLeavingTxtbox(), leavingFrom);
		//Logs.info("User entered '" + leavingFrom + "' into leaving from field");
		//test.log(LogStatus.INFO, "User entered '" + leavingFrom + "' into leaving from field");
	}
	
	
	public void fillLeavingonExplorepage(String leavingFrom) throws Exception {
		clearAndSetValues(BookingLocators.getLeavingTxtbox(), leavingFrom);
		WebElement select = driver.findElement(By.xpath("(//span[@class='highlight boldText'])[1]"));
		select.click();

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
	
	public void clickonContinue() {
		WebElement e = driver.findElement(BookingLocators.getnoMoreCitiesBtn());
		e.click();
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

		//	clickUsingJavaScript(HomePageLocators.getSelectPremiumEconomy());
		//	clickUsingJavaScript(BookingLocators.getdoneButton());

		//	clickUsingJavaScript(HomePageLocators.getSelectPremiumEconomy());
			//clickUsingJavaScript(BookingLocators.getdoneButton());

			//Logs.info("User select '" + guestInfo + "' from Guest list");
			//test.log(LogStatus.INFO, "User select '" + guestInfo + "' from Guest list");
		} else {
			selectOptionByValue(BookingLocators.getselectGuestDrpdown(), guestInfo);
			//Logs.info("User select '" + guestInfo + "' from Guest list");
			//test.log(LogStatus.INFO, "User select '" + guestInfo + "' from Guest list");
		}
	}
	

	
	public  void selectGuestDetails_dealsPage(String guestInfo) throws Exception {

		if (TestBase.flag_Mob) {
			WebElement w = driver.findElement(BookingLocators.selectGuestRoomOptions_viewpage());
			w.click();
			
			
			clickUsingJavaScript(BookingLocators.getselectGuestRoomOptionsDrpdown());
			WebElement wb = driver.findElement(BookingLocators.getoptionListForGuestsAndRooms())
					.findElement(By.xpath(".//li[@id='" + guestInfo + "']"));
			clickUsingJavaScript(wb);

		//	clickUsingJavaScript(HomePageLocators.getSelectPremiumEconomy());
		//	clickUsingJavaScript(BookingLocators.getdoneButton());
			clickUsingJavaScript(BookingLocators.selectguestminus());
			//clickUsingJavaScript(HomePageLocators.getSelectPremiumEconomy());
			//clickUsingJavaScript(BookingLocators.getdoneButton());
			
			
			// selectNumberOfAdult("1", BookingLocators.getselectAdultRoom2Drpdown());
			 selectnumberofadultsRoom_2iOS();
			//Logs.info("User select '" + guestInfo + "' from Guest list");
			//test.log(LogStatus.INFO, "User select '" + guestInfo + "' from Guest list");
		} else {
			selectOptionByValue(BookingLocators.getselectGuestDrpdown(), guestInfo);
			//Logs.info("User select '" + guestInfo + "' from Guest list");
			//test.log(LogStatus.INFO, "User select '" + guestInfo + "' from Guest list");
		}
	}

	
	
	
	
	
	
	public String selectPremiumEconomy()
	{
	String actualCabin=null;
	if(TestBase.flag_Mob)
	{

	actualCabin = driver.findElement(HomePageLocators.getSelectPremiumEconomy()).getText();
	clickUsingJavaScript(HomePageLocators.getSelectPremiumEconomy());

	}  

	return actualCabin;

	}
	
	public  String selectedcabinAssert() {
        String selectedcabin = null;
if (!TestBase.flag_Mob)
{
selectedcabin = driver.findElement(BookingLocators.getFirstpremiumOption()).getText();
 
}
return selectedcabin;
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
		PageBase.waitForElement(8);
	}
	
	
	//Get Session id
	public String getSessionid() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("nTXMLSession"));
		js.executeScript("arguments[0].setAttribute('type', '')",element);
		System.out.println(driver.findElement(By.id("nTXMLSession")).getAttribute("value"));
		String value = driver.findElement(By.id("nTXMLSession")).getAttribute("value");
		System.out.println("value is "+ value);
		return value;
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
	
	public void clickOncheaperFlights() throws Exception {
	//	isElementDisplayed(BookingLocators.getcheaperFlightsLink());
		scrollDown();
		PageBase.waitForElement(3);
		clickUsingJavaScript(BookingLocators.getcheaperFlightsLink());
		
	}
	
	public void selectOnCheaperFlightPage()
	{
		clickUsingJavaScript(BookingLocators.getSelectOncheaperFlightsPage());
		
	}
	
	public void selectCabin() throws Exception {
		scrollDown();
	//	isElementDisplayed(BookingLocators.getCabinbtn());
		
		PageBase.waitForElement(3);
		clickUsingJavaScript(BookingLocators.getCabinbtn());
		
	}
	
	
	
	public  String selectCheaperFlights() throws Exception {
		String flightvalue = null;
		if (TestBase.flag_Mob) {
			flightvalue = selectCheaperFlights_Mob();
			
			
		} else {
			clickUsingJavaScript(BookingLocators.getcheaperFlightsLink());
			flightvalue = driver.findElement(BookingLocators.getexpectedFlight()).getText();
			clickUsingJavaScript(BookingLocators.getselectFlightOption());
			clickUsingJavaScript(BookingLocators.getselectButtonInFlightOption1());
			clickUsingJavaScript(BookingLocators.getcontinueLink());
			//return flightvalue;
		}
		return flightvalue;

	}//===========Satyam==========
	//Divide cheaperflight button method into small units we are returning and verifying
	//more then one values here.
	
	//===============CheaperFlightbutton ==============
	public void cheaperFlightbutton() throws Exception {
		isElementDisplayed(BookingLocators.getcheaperFlightsLink());
		scrollDown();
		PageBase.waitForElement(3);
		clickUsingJavaScript(BookingLocators.getcheaperFlightsLink());
		
		clickUsingJavaScript(BookingLocators.getselectFlightOption());
		clickUsingJavaScript(BookingLocators.getselectbutton());
		isElementDisplayed(BookingLocators.getcontinueLink());
		scrollDown();
		scrollDown();
		scrollDown();
		clickUsingJavaScript(BookingLocators.getcontinueLink());
		
	}
	

	public  String selectCheaperFlights_Mob() throws Exception {
		
		isElementDisplayed(BookingLocators.getcheaperFlightsLink());
		scrollDown();
		PageBase.waitForElement(3);
		clickUsingJavaScript(BookingLocators.getcheaperFlightsLink());
		String expectflightvalue = driver.findElement(BookingLocators.getexpectedFlight()).getText();
		System.out.println("expected flight is "+expectflightvalue);
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
	{
	
      selectOptionByValue(element, numOfAdults);
	}
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
	
	public  void selectNumberOfChild_dealsPage(String numOfChild, String ageOfChild, String childType) throws Exception
	{
		
		
	if(TestBase.flag_Mob)
	{
	    if(childType.equals("Child1"))
			{
				clickUsingJavaScript(BookingLocators.getselectfirstRoomChildPlus());
				PageBase.waitForElement(3);
			
				driver.findElement(BookingLocators.getfirstChildDropdowniOS_deals()).click();
				PageBase.waitForElement(3);
				
					driver.findElement(BookingLocators.getselectChildAgeDropdownMob_elevendeals()).click();	
			}
	
			}
	
	}
	
	public  void selectNumberOfChild(String numOfChild, String ageOfChild, String childType) throws Exception
	{
		
		
	if(TestBase.flag_Mob)
	{
	    if(childType.equals("Child1"))
			{
				// clickUsingJavaScript(BookingLocators.getselectfirstRoomAdultPlus());
				clickUsingJavaScript(BookingLocators.getselectfirstRoomChildPlus());
				PageBase.waitForElement(3);
				//Thread.sleep(20000);
				driver.findElement(BookingLocators.getfirstChildDropdowniOS()).click();
				PageBase.waitForElement(3);
				
					//driver.findElement(BookingLocators.getselectChildAgeDropdownMob_eleven()).click();
				
				
				
					driver.findElement(BookingLocators.getselectChildAgeDropdownMob()).click();
				PageBase.waitForElement(2);
			} 
	    
	    else if(childType.equals("newageeleven")) {
	    	
	    	clickUsingJavaScript(BookingLocators.getselectfirstRoomChildPlus());
			PageBase.waitForElement(3);
			//Thread.sleep(20000);
			driver.findElement(BookingLocators.getfirstChildDropdowniOS()).click();
			PageBase.waitForElement(3);
			
				driver.findElement(BookingLocators.getselectChildAgeDropdownMob_eleven()).click();
			
			
			
				//driver.findElement(BookingLocators.getselectChildAgeDropdownMob()).click();
			PageBase.waitForElement(2);
	    	
	    	
	    }
	    
else if(childType.equals("europepage")) {
	    	
	    	clickUsingJavaScript(BookingLocators.getselectfirstRoomChildPlus());
			PageBase.waitForElement(3);
			//Thread.sleep(20000);
			driver.findElement(BookingLocators.getfirstChildDropdowniOS()).click();
			PageBase.waitForElement(3);
			
				driver.findElement(BookingLocators.getselectChildAgeDropdowneurope_elevendeals()).click();
			
			
			
				//driver.findElement(BookingLocators.getselectChildAgeDropdownMob()).click();
			PageBase.waitForElement(2);
	    	
	    	
	    }
	    
	    
	    
else if(childType.equals("newageseven")) {
	    	
	clickUsingJavaScript(BookingLocators.getselectsecondRoomChildPlus());
	PageBase.waitForElement(3);
	driver.findElement(BookingLocators.getsecondRoomChildDropdowniOS()).click();
	PageBase.waitForElement(3);
	driver.findElement(BookingLocators.getselectRoomtwoChildAgeseven()).click();
	PageBase.waitForElement(2);
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    else {
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
			//	Logs.info("User entered number of child'" + numOfChild + "' ");
				Select option = new Select(driver.findElement(By.xpath("//select[@id='xiChild1']")));
				option.selectByValue(ageOfChild);
				
			//	Logs.info("User entered age of child'" + ageOfChild + "' ");
			} else {
				selectOptionByValue(BookingLocators.getselectChildRoom2Drpdown(), numOfChild);
				//Logs.info("User entered number of child'" + numOfChild + "' ");
				Select option = new Select(driver.findElement(By.xpath("//select[@id='xRoom2_iChild1']")));
				option.selectByValue(ageOfChild);
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
		scrollDown();
		clickUsingJavaScript(BookingLocators.getTripInclusionContinueButtonmob());
		}
		else if(TestBase.flag_Mob)  {
			boolean isElementDisplayed = true;
			if (driver.findElement(BookingLocators.getTripInclusionContinueButtonmob()).isDisplayed()) {
				isElementDisplayed = false;
				System.out.println("Selected Flight is not available on given date.");
			}
		
		}
	}

	public  void getWithoutButton() {

		clickUsingJavaScript(BookingLocators.getWithoutAirButton());
	}


	public  String browseHotelsButton() throws Exception {
		if(TestBase.flag_Mob) {
			scrollDownForMob(2);
		}
		
		clickUsingJavaScript(BookingLocators.getBrowseHotelsLink());
			String actualhotel = driver.findElement(BookingLocators.getfirstHoteliOS()).getText();
			System.out.println("*******"+actualhotel);
			//clickUsingJavaScript(BookingLocators.getBrowseHotelsLink());
			return actualhotel;
		}
	
		

	
	public void selectFirstHotel(){
		clickUsingJavaScript(BookingLocators.getselectFirstHotel());
	}
	

	public  String browseSelectHotel() {
		String expectedhotel = driver.findElement(BookingLocators.getExpectedHotel()).getText();
		return expectedhotel;
	}
	
	//==============Satyam==============//
	public String secondCityHotelName() throws Exception {
		PageBase.waitForElement(10);
		Thread.sleep(5000);
		String expectedHotelName = driver.findElement(BookingLocators.getSecondCityHotel()).getText();
		System.out.println("on last page hotel name" + expectedHotelName);
		return expectedHotelName;
	}
	
	public String browseHotelSecondCity() throws Exception {
		if(TestBase.flag_Mob) {
			scrollDownForMob(2);
		}
		clickUsingJavaScript(BookingLocators.getbrowseHotelsForSecondCity());
		if(!TestBase.flag_Mob){
			return null;
			}
		else{
			Thread.sleep(10000);
			String actualhotel = driver.findElement(BookingLocators.getfirstHoteliOS()).getText();
			System.out.println("*******n"+actualhotel);
			return actualhotel;
		}
		
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
	
	

	public  void getContinueLink() {
		clickUsingJavaScript(BookingLocators.getcontinueLink());
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

	public  void selectWithoutAir() {
		clickUsingJavaScript(BookingLocators.getwithoutAir());

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
		clickUsingJavaScript(BookingLocators.getsecondremovecitylink());

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

//	public  String selectValueFromCalendar(int additionaldays,int n) throws Exception {
//		clickOnElement(BookingLocators.getArriveDateDropdown());
//		
//		if(n>=2) {
//		for(int i=0;i<n;i++)
//		{
//			clickOnElement(BookingLocators.getnavMonth());
//	//		clickOnElement(BookingLocators.clickondate());
//		}
//		}else if(n==1) {
//			clickOnElement(BookingLocators.getnavMonth_prev());
//		}
//		clickOnElement(BookingLocators.clickondate());
//		//.sleep(20000);
//		String newDate = selectNewDateFromCalendar(additionaldays);
//		String[] newDateDay = newDate.split("/");
//	String selectdate=newDateDay[1];	
//	
//	List<WebElement> columns = driver.findElements(BookingLocators.getArriveDateCalender());
//		for (WebElement cell : columns) {
//			if (cell.getText().equals(selectdate)) {
//				Thread.sleep(20000);
//				cell.findElement(By.linkText(selectdate)).click();
//	//			Thread.sleep(10000);
//				//test.log(LogStatus.INFO, "User selects '" + newDate + "' as Arriving_On Date");
//				break;
//			}
//		}
//	//	WebElement e = driver.findElement(By.xpath("//button[contains(.,'Done')]"));
//	//	e.click();
//		return newDate;
//	}
	
	
	public Object newValue(String selectdate){
		char achar=0;
	if(selectdate.startsWith("0")){
		achar=selectdate.charAt(1);
		return achar;
	}
	else {
		return selectdate;
	  }
	}
	public  String selectValueFromCalendar(int additionaldays,int n) throws Exception {
		char achar = 0;
		clickOnElement(BookingLocators.getArriveDateDropdown());
		if(n>=2) {
		for(int i=0;i<n;i++)
		{
		clickOnElement(BookingLocators.getnavMonth());
		}
		}else if(n==1) {
		clickOnElement(BookingLocators.getnavMonth_prev());
		}
		String newDate = selectNewDateFromCalendar(additionaldays);
		String[] newDateDay = newDate.split("/");
		String selectdate=newDateDay[1]; 
		Object date=newValue(selectdate);	
		List<WebElement> columns = driver.findElements(BookingLocators.getArriveDateCalender());
		for (WebElement cell : columns) {
			String val=cell.getText();
			String dateString=date.toString();
		if (val.equals(dateString)) {
		Thread.sleep(20000);
		clickOnElement(BookingLocators.getdate(dateString));
		break;
		}
		}
		return newDate;
		}
	
	
	
	
	
	
	
	public  String selectValueFromCalendar_1(int additionaldays) throws Exception {
		clickOnElement(BookingLocators.getArriveDateDropdown());
		WebElement e = driver.findElement(BookingLocators.getArriveDateCalender());
		
		Thread.sleep(20000);
		String newDate = selectNewDateFromCalendar(additionaldays);
		String[] newDateDay = newDate.split("/");
	String selectdate=newDateDay[1];	
	Thread.sleep(5000);
	
	List<WebElement> columns = driver.findElements(BookingLocators.getArriveDateCalender());
		for (WebElement cell : columns) {
			if (cell.getText().equals(selectdate)) {
				Thread.sleep(20000);
				cell.findElement(By.linkText(selectdate)).click();
				Thread.sleep(10000);
				//test.log(LogStatus.INFO, "User selects '" + newDate + "' as Arriving_On Date");
				break;
			}
		}
		
		return newDate;
	}
	
	

	public  void selectCabinClass(String cabinclass) {
		if(!TestBase.flag_Mob)
			
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

	
	
	    public String verifycabinAssert() {
		if(TestBase.flag_Mob)
		{
		   
		String expectedcabin = driver.findElement(BookingLocators.getVerifyPremiumEconomy()).getText();
		return expectedcabin;
		}
		else
		{
		    String expectedcabin = driver.findElement(BookingLocators.getSecondpremiumOption()).getText();
		     return expectedcabin;
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
           // System.out.println("PageTitle is" +PageTitle.trimFromEnd(PageTitle,"\r\n" +" from $957*"));
			System.out.println("Actual title is " + driver.getTitle().trim());
			boolean value=driver.getTitle().contains("Arenal Volcano - Guanacaste Beaches");
		    System.out.println("Value is"+value);
			Assert.assertTrue(value);

		}
	}

	public  void oldArriveDate() {
		boolean actualdate = driver.findElement(BookingLocators.getArriveDate()).isEnabled();
		Assert.assertTrue(actualdate);
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

	public void validateTripPage() {
	  if(TestBase.flag_Mob)
	  {
	  if (driver.getTitle().contains("Itinerary - Review"))
	  {
	  System.out.println("Title is "+ driver.getTitle());

	  boolean flag = true;
	  Assert.assertTrue(flag);
	  }

	  }
	  }
	
	
	
	public  void validateTripIncluisonPage() {
		
		boolean flag = false;
		System.out.println("Title is "+ driver.getTitle());
		if (driver.getTitle().contains("ItineraryDetails"))
			flag = true;
		else if(driver.getTitle().contains("Itinerary"))
			flag = true;
		else
			flag = false;

		Assert.assertTrue(flag);
	}

	public  void selectStayingTimeThree(String stayingTimeThree) {

		selectOptionByValue(BookingLocators.getstayingDrpdownthree(), stayingTimeThree);
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
	
	
	
	
	/**
	 * click On Europe Page Vacation Drop Down on mobile browser
	 * 
	 * @author Satyam
	 * @throws Exception 
	 */
	public  void geteuropecreateVacationDrpDown() throws Exception {
		if (TestBase.flag_Mob)
			PageBase.waitForElement(5);
		clickOnElement(BookingLocators.geteuropecreateVacationDrpDown());
	}
	
	public  void getexploreLink() throws Exception {
		if (TestBase.flag_Mob)
			PageBase.waitForElement(5);
			clickUsingJavaScript(BookingLocators.getexploreLink());
			scrollDownForMob(1);
			PageBase.waitForElement(5);
	}
	

	public String exploreList() {
		WebElement e = driver.findElement(By.xpath("(//p[@class='pMproduct']/a)[1]"));
			String listname = e.getText();
			System.out.println("list name is "+ listname);
			return listname;
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
//satyam
	public void clickOnViewPrice() {
		clickUsingJavaScript(BookingLocators.getViewPricebtn());
		
	}
	//===========Methods By Vaishali===========
	public boolean isTravelByDisplayed()
	{
		boolean result = false;
		if(driver.findElement(BookingLocators.getTravelBy()).isDisplayed()){
			result = true;
		}
		return result;
	}
	
//	public String clickOnPackageDisplayedUnderSuggestedVacationPackageOption() throws Exception {
//		scrollDownForMob(3);
//		clickUsingJavaScript(HomePageLocators.getPackageDisplayedUnderSuggestedVacationPackageOption());
//	WebElement e = driver.findElement(HomePageLocators.getpackagename());
//	String packagename = e.getText();
//	System.out.println("Name of package is "+packagename);
//	return packagename;
//	}
	
	public void clickOnReorderCitiesLink() throws Exception {
		scrollDownForMob(2);
		clickUsingJavaScript(BookingLocators.getreorderCitiesLink());
		
	}
	
	public void fillLeavingFromDetailsOnEuropePage(String leavingFrom) throws Exception {
		clearAndSetValues(BookingLocators.getleavingtextBoxOnEuropePage(), leavingFrom);
		//logs.info("User entered '" + leavingFrom + "' into leaving from field");
		WebElement select = driver.findElement(By.xpath("(//span[@class='highlight boldText'])[1]"));
		select.click();

	
	}
	
	
	
	
	public  void selectNumberOfChildNewPage(String numOfChild, String ageOfChild, String childType) throws Exception
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
				
				
				
			WebElement e = driver.findElement(BookingLocators.getfirstChildDropdowniOS());
			e.sendKeys("4");	
			PageBase.waitForElement(2);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//WebElement select = driver.findElement(By.xpath("//li[@id='ui-id-21']"));
				//select.click();

				
				
				//driver.findElement(BookingLocators.getselectChildAgeDopdownMobNewPage()).click();
				PageBase.waitForElement(2);
				
				
//				clearAndSetValues(BookingLocators.getleavingtextBoxOnEuropePage(), leavingFrom);
//				//logs.info("User entered '" + leavingFrom + "' into leaving from field");
//				WebElement select = driver.findElement(By.xpath("(//span[@class='highlight boldText'])[1]"));
//				select.click();

				
				
				
				
			} else {
				clickUsingJavaScript(BookingLocators.getselectsecondRoomChildPlus());
				PageBase.waitForElement(3);
				driver.findElement(BookingLocators.getsecondRoomChildDropdowniOS()).click();
				PageBase.waitForElement(3);
				
				
				WebElement e = driver.findElement(BookingLocators.getsecondRoomChildDropdowniOS());
				e.sendKeys("3");
				
			//	clearAndSetValues(BookingLocators.getsecondRoomChildDropdowniOS(), ageOfChild);
			//	PageBase.waitForElement(2);
				//WebElement select = driver.findElement(By.xpath("//li[@id='ui-id-23']"));
				//select.click();

			
				
				//driver.findElement(BookingLocators.getselectRoomTwoChildAgeDropDownMobNEWPage()).click();
				PageBase.waitForElement(2);
			}
	}


	}
	public void clickToRemoveGalwayCityLink() {
		clickUsingJavaScript(BookingLocators.getremoveGalwayCitylinkOnRoomPage());
	}
	
	public void deleteGalwayCity()  {
		clickUsingJavaScript(BookingLocators.getsecondremovecitylink());
	}

	public void clickToRemoveLimerickCityLink() {
		clickUsingJavaScript(BookingLocators.getremoveLimerickCitylinkOnRoomPage());
	}
	
public void deleteLimrickCity()  {
		
		clickUsingJavaScript(BookingLocators.getsecondremovecitylink());
	}

public  void validateremovedGalwaycity() {
	boolean flag = false;
	try {
		driver.findElement(BookingLocators.getsecondremovecitylink());
		flag = false;
	} catch (Exception NoSuchElementException) {
		flag = true;
	}
	Assert.assertTrue(flag);
}

public void selectCarFromTransportation() throws Exception {
	
	driver.findElement(BookingLocators.getselectTravelByCarClickFirst()).click();
	PageBase.waitForElement(2);
	driver.findElement(BookingLocators.getselectTravelCarClickSecond()).click();
	
}

public boolean verifyTravelByTrain() {
	boolean result = false;
	if(driver.findElement(BookingLocators.getverifyTravelByTrain()).isDisplayed()){
		result = true;
	}
	return result;
}
}
