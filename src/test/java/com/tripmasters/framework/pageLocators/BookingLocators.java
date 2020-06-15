package com.tripmasters.framework.pageLocators;

import org.openqa.selenium.By;

public class BookingLocators {
	private static By selectGuestRoomOptions = By.cssSelector("input[id='xcabinRoomPax']");
	private static By selectGuestRoomOptionsDrpdown = By.cssSelector("div[id='dvpaxRoom']");
	private static By optionListForGuestsAndRooms = By.cssSelector("div[id='dvpxroomlst'][style='display: block;']");
	private static By doneButton = By.xpath("//div[@class='dvMdialogDone']/p[text()='Done']");
	private static By selectFlightOption = By.xpath("(//a[@name='chkFlight'])[1] | //a[@id='chkFlightOpt1_UA|48|1']");
	//private static By selectButtonInFlightOption1 = By.xpath("(//img[contains(@src,'https://www.tripmasters.com/general/tripmasters/DefaultImages/Select1.png')])[1]");
	private static By selectButtonInFlightOption1 = By.xpath("//div[@id='dropShadow1']//tr//a//*[text()='Select']");
	private static By selectbutton = By.xpath("//div/a[contains(text(),'Select')]");
	private static By addCityBtn = By.xpath("//input[@id='inpAddCty'] | //span[text()='ADD DESTINATION']|//span[contains(.,'Add City')] | //p[@id='pMaddcity']");
	private static By noMoreCitiesBtn = By.xpath("//span[text()='Next'] | //input[@id='inpNoMore'] | //span[contains(.,'No more cities. Continue')] | //span[@class = 'spMnextbutt']");
	private static By continueBtn = By.xpath("//div[@class='dvContinueButton']//span[contains(.,'Continue')] | //p[@id='pMcont']/span[contains(.,'Continue')]");
	private static By continueLink = By.xpath("//a[@id='aContWithPriceValidation']");
	private static By continueImage = By.xpath("//img[@id='imgPriceIt'] | //img[contains(@src,'https://www.tripmasters.com/general/tripmasters/DefaultImages/btn_continue.png')]");
	private static By paymentContinueBtn = By.xpath("//a[contains(@id,'PriceValidation')]");
	private static By validatingPricesPopupText = By.xpath("//div[@id='divLoading']//div[contains(.,'Validating prices...')]");
	
	private static By EditContinueBtn = By.xpath("//div[a[contains(.,'Edit Itinerary')]]//a[contains(@id,'Continue')]");
	private static By FirstTravelerFirstNameTxtbox = By.xpath("//div[div[span[contains(.,'Traveler 1:')]]]//input[contains(@placeholder,'First and Middle Name')]");
	private static By FirstTravelerLastNameTxtbox = By.xpath("//div[div[span[contains(.,'Traveler 1:')]]]//input[contains(@placeholder,'Last Name')]");
	private static By SecondTravelerFirstNameTxtbox = By.xpath(
			"//div[div[span[contains(.,'Traveler 2:')]]]//input[contains(@placeholder,'First and Middle Name')]");
	private static By SecondTravelerLastNameTxtbox = By
			.xpath("//div[div[span[contains(.,'Traveler 2:')]]]//input[contains(@placeholder,'Last Name')]");
	private static By FirstTravelerGenderDropdown = By
			.xpath("//div[div[div[span[contains(.,'Traveler 1:')]]]]//div[contains(@class,'Gender')]//select");
	private static By FirstTravelerDOB = By
			.xpath("//div[div[div[span[contains(.,'Traveler 1:')]]]]//input[contains(@id,'txtPAX_DOB')]");
	private static By SecondTravelerGenderDropdown = By
			.xpath("//div[div[div[span[contains(.,'Traveler 2:')]]]]//div[contains(@class,'Gender')]//select");
	private static By SecondTravelerDOB = By
			.xpath("//div[div[div[span[contains(.,'Traveler 2:')]]]]//input[contains(@id,'txtPAX_DOB')]");
	private static By FormContinueBtn = By.xpath("//div[a[img[@name='continue_btn']]]//a");
	private static By USAndCanadaCreditCardsTxt = By
			.xpath("//strong[contains(.,'We only accept US and Canada credit cards')]");
	private static By europBestSellerslnk = By.xpath(
			"//div[a[div[contains(@class,'dvEachHighImg')]/following-sibling::h3[contains(.,'European BestSellers')]]]//a");
	private static By europeanBestsellersHeader = By
			.xpath("//div[contains(@class,'pageTitle')]/div[contains(.,'Europe - European Bestsellers')]");
	private static By passportDrpdownFirstTraveller = By.xpath("//select[@id='txtPAX_Nationality1']");

	private static By passportDrpdownSecondTraveller = By.xpath("//select[@id='txtPAX_Nationality2']");
	private static By passportDrpdownThirdTraveller = By.xpath("//select[@id='txtPAX_Nationality3']");
	private static By thirdTravelerFirstNameTxtbox = By.xpath(
			"//div[div[span[contains(.,'Traveler 3:')]]]//input[contains(@placeholder,'First and Middle Name')]");
	private static By thirdTravelerLastNameTxtbox = By
			.xpath("//div[div[span[contains(.,'Traveler 3:')]]]//input[contains(@placeholder,'Last Name')]");
	private static By thirdTravelerGenderDropdown = By
			.xpath("//div[div[div[span[contains(.,'Traveler 3:')]]]]//div[contains(@class,'Gender')]//select");
	private static By thirdTravelerDOB = By
			.xpath("//div[div[div[span[contains(.,'Traveler 3:')]]]]//input[contains(@id,'txtPAX_DOB')]");

	private static By verifyTraveler1Name = By
			.xpath("//div[@id='TravelerR1']//div[@class='cel-name' or @class='editvalgender font-weight-bold' or @class='editvalgender' or @class='cel-name col-6 mt-2' or @class='editvaldob']");
	private static By verifyTraveler2Name = By
			.xpath("//div[@id='TravelerR2']//div[@class='cel-name' or @class='cel-name col-6 mt-2' or @class='editvalgender' or @class='editvalgender font-weight-bold' or @class='editvaldob']");
	private static By verifyTraveler3Name = By
			.xpath("//div[@id='TravelerR3']//div[@class='cel-name' or @class='cel-name col-6 mt-2' or @class='editvalgender font-weight-bold' or @class='editvalgender' or @class='editvaldob']");
	private static By verifyTraveler4Name = By
			.xpath("//div[@id='TravelerR4']//div[@class='cel-name' or @class='cel-name col-6 mt-2' or @class='editvalgender font-weight-bold' or @class='editvalgender' or @class='editvaldob']");
	private static By selectChildTravelerDOB = By
			.xpath("//div[div[div[span[contains(.,'Traveler 2:')]]]]//input[contains(@id,'txtCPAX_DOB2')]");
	private static By selectChildTraveleraPassport = By.xpath("//select[@id='txtCPAX_Nationality2']");

	private static By selectWithoutAirButton = By.xpath("//*[@class='dvIntlFly']/child::span[text()='Without Air *']");
	private static By browseHotelslink = By.xpath("(//a[contains(.,'Browse ')])[1] | //a[@class='componentSSlink btnyellowcont mb-2 ml-auto mr-auto']");
	
	private static By selectFirstHotel = By.xpath("(//td[contains(@class,'RoomTypeHotelList')]//img[contains(@class,'m-srd-img1')])[1] | //a[@class='h-100 btnyellowcont pb-1 font-weight-bold'][1]");
	private static By selectFirstHotel_SingleCity=By.xpath("(//td[contains(@class,'RoomTypeHotelList')]//img[contains(@class,'m-srd-img2')])[1]");
	private static By firstHotel = By.xpath("//a[@class='hotelHeadTitle'][1]");
	private static By verifyHotel = By.xpath("(//a[contains(@class,'hotel')])[1] | //a[@id='Prod_173668' and @class='m-hotel']");
	private final static By firstFlightDetails = By.xpath("//div[@id='divSegmentDetails1']//tbody//td");
	private final static By actualFlightDetails = By
			.xpath("//div[@id='seg1flight1']//div[@class='divFligth-Bottom-Left textGrey10'] | //div[@id='segBottomInfo']//div[@class='col-12'][1]");
	private static By expectedFlight = By.xpath("(//div[@id='divSegmentDetails1']//td//span[@class='textGrey10'])[2] | //div[@class='col-12 pl-2 pt-1 pb-2']//span[@class='textGrey11 fontSize10'][1]");

	private static By selectWitoutAirOption = By.xpath("//form[@id='formBYO']//span[text()='Without Air *']");
	private static By browseHotelLink = By.xpath("//div[@class='changeHotel rbtn']//a");
	private static By selectHotelOption = By.xpath(
			"(//img[contains(@src,'https://www.tripmasters.com/general/tripmasters/DefaultImages/ui-select-btn-95x25.png')])[1]");
	private static By verifyTripInclusionHeader = By.xpath("//div[@class='mainDiv']//span[@class='spanMainTitle']");
	private static By selectHotelName = By.xpath("(//a[@class='hotelHeadTitle'])[1][1]");
	private static By verifyHotelName = By.xpath("//div[@id='toResize440']//a");
	private static By arriveDate = By.xpath("//div[contains(@id,'divDayOpt3')]//div[contains(@class,'divDayOptionDate')]");
	private static By withoutAirButton = By.xpath("//*[@class='dvIntlFly']/child::span[text()='Without Air *']");

	private static By searchBox = By.xpath("//form[@id='frmSearch']//input[@id='q']");
	private static By goButton = By.xpath("//input[@name='Go']");

	private static By secondremovecitylink = By.xpath("//span[@id='cty2'] | //span[@id='spClose2']");
	private static By thirdremoveCitylink = By.xpath("//div//span[@id='cty3'] | //span[@id='spClose3']");
	private static By edititinerary = By.xpath("//div//a[contains(text(),'Edit Itinerary')]");
	private static By goingToTextboxThird = By.xpath("//*[@id='qNACity3']");
	private static By stayingDrpdowntwo = By.xpath("//select[@id='qSTCity2']");
	private static By stayingDrpdownthree = By.xpath("//select[@id='qSTCity3']");
	private static By changedArriveDate = By.xpath("//div[contains(@id,'divDayOpt4')]//div[contains(@class,'divDayOptionDate')]");
	private static By pickCalendarData = By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td");

	private static By buildYourVacation_DropDown = By.xpath("//img[contains(@src,'createitinarary_')]/parent::p");

	private static By leavingTextbox = By.xpath("//input[@id='qLeaveNA']");
	private static By goingToTextbox = By.xpath("//input[contains(@id,'qNACity1')]");
	private static By stayingDrpdown = By.xpath("//select[@id='qSTCity1'] | //input[@id='qSTCity1Txt']");
	private static By selectGuestDrpdown = By.xpath("//select[@id='xiRoomsAndPax']");
	private static By selectChildDrpdown = By.xpath("//select[@id='xiChildren']");
	private static By selectChildRoom2Drpdown = By.xpath("//select[@id='xRoom2_iChildren']");
	private static By selectChildAgeRoom2Drpdown = By.xpath("//select[@id='xRoom2_iChild1']");

	private static By selectAdultDrpdown = By.xpath("//select[@id='xiAdults'] | //select[@id='AiAdults']");
	
	private static By selectAdultRoom2Drpdown = By.xpath("//select[@id='xRoom2_iAdults'] | //select[@id='ARoom2_iAdults']");
	public static By selectChildAgeDrpdown = By.xpath("//select[@id='xiChild1']");
	private static By cheaperFlightsLink = By.xpath("(//a[contains(.,'Find cheaper flights')])[1] | (//a[contains(.,'Browse all flights')])[1]");
	private static By goingToTextboxSecond = By.xpath("//*[@id='qNACity2']");

	private static By arriveDateDropdown = By.xpath("//input[contains(@id,'qArrDate')]");
	private static By arriveDateCalender = By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td");

	private static By cabinClassDropdown = By.xpath("//select[@id='qCabinOpt']");
	private static By verifycabinClassDropdown = By.xpath("//select[@id='xCabin']");
	private static By firstpremiumoption = By.xpath("//select[@id='qCabinOpt']//option[2]");
	private static By verifypremiumoption = By.xpath("(//div[@class='divFligth-Bottom-Right textGrey10']/text()[preceding-sibling::br])[2]//..");
	private static By backToItineraryOption=By.xpath("(//*[text()='Back to Itinerary'])[2]");

	private static By travelByOption=By.xpath("//p[@id='pTranspSel1-1']");
	private static By hotelsBy_Reviewscore=By.xpath("//a[text()='Review Score']");
	private static By hotelsBy_Price=By.xpath("//a[text()='Price']");
	private static By hotelsBy_Name=By.xpath("//a[text()='Name']");
	private static By hotelsBy_Star=By.xpath("//a[text()='Stars']");
	
	private static By hotelBrowseOptions=By.xpath("(//a[@class='ui-radio-selected'])");
	
	private static By changeTravelByButton=By.xpath("(//input[@class='buttontranspChange'])[1]");
	private static By topDealsButton=By.xpath("//a[text()='Top Deals']");
	private static By topDealsPageHeading=By.xpath("//div[text()='Deals of the week']//..//h3[text()='Top Deals - Vacation specials']");
	
	private static By topDealsPageList=By.xpath("//div//a//div[@class='Blue-Arial16']");
	private static By validatehighLightOptions=By.xpath("//div[@class='startHighlight']//div//a");
	private static By selectVacationIdeas=By.xpath("(//h1[text()='vacation packages ideas']//..//div//li//a)[1]");
	private static By clickonReorderCities=By.xpath("//img[@id='buttReorder']");
	
	private static By leavingTextboxBYO_Page = By.xpath("//input[@id='xtxtLeavingFrom']");
	private static By arriveDateDropdown_BYOPage = By.xpath("//input[contains(@id,'xtxtBYArriving')]");
	private static By selectGuestRoomOptionsDrpdown_BYOPage=By.cssSelector("input[id='xiRoomsAndPaxText']");
	private static By selectAdult_Room1_BYOPage=By.cssSelector("input[id='xiAdultsText']");
	private static  By selectChild_Room1_BYOPage=By.cssSelector("div[id='dvR1children']");
	private static  By ChildAgeTextbox_BYO=By.xpath("//input[@id='xiChild1']");
	private static By clickOnContinueButton_BYO=By.xpath("//input[@id='bContinue']");
	
	private static By selectCabinFromFlightOptions=By.xpath("(//a[contains(text(),'Select Cabin')])[1]");
	private static By validateErrorOnPAXDetails=By.xpath("//label[text()='This field is required.']");
	private static By leavingTextboxFirstPckg=By.xpath("//input[@id='sDepCity']");
	private static By arriveDateDropdown_FirstPckg=By.xpath("//input[@id='InDate1']");
	private static By selectGuestDrpdown_FirstPackage=By.xpath("//select[@id='iRoomsAndPax']");
	private static By clickOnViewPriceButton=By.xpath("//span[@id='imgPriceIt1']");
	private static By clickToRemoveScndCityHotel=By.xpath("//div[@data-cityno='2']//div//a[contains(text(),'Remove')]");
	private static By selectDialogBox=By.xpath("//div[text()='Yes']");
	private static By selectRemoveCityBtn=By.xpath("(//span[text()='Edit/Remove'])[1]");
	private static By selectButtonCar=By.xpath("(//p[@id='pCheckBox1']//input[@id='xradioTrans1'])[3]");
	private static By navMonth = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	private static By navMonth_prev = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']");
	private static By selectscndCabinFromFlightOptions=By.xpath("(//a[contains(text(),'Select Cabin')])[2]");
	private static By selectHighLightOption=By.xpath("(//div[@class='startHighlight']//div//a)[1]");
	private static By clickOnCustomiseBtn=By.xpath("(//div[@id='DealsContainer']//div//a//img)[2]");
	private static By selectChildDrpdown2_dealsPage=By.xpath("//select[@id='Room2_iChildren'] ");
	private static By enterAgeofChild=By.xpath("//input[@id='Room2_iChild1']");
	private static By browseHotelsLink_TopDealsPage=By.xpath("(//div[@class='changeHotel rbtn']//a)[1]");
	private static By getdate = By.xpath("(//table[@class='ui-datepicker-calendar']//tr//td[4]/a)[1]");
	private static By selectRemoveThirdCityBtn=By.xpath("(//span[text()='Edit/Remove'])[2]");



	// ======== Locators for Mobile ===============================================================================================

	private static By cabinSectionMob = By.cssSelector("div[id='dvMcabin']");
	private static By selectfirstRoomAdultPlus=By.xpath("//div[@id='dvroom1']/p/span[@id='adultMinus']");
	private static By SecondRoomadultPlus=By.xpath("//span[@id='adultPlus2']");
	private static By firstChildDropdowniOS = By.xpath("//input[@id='xiChild1']");
	private static By selectsecondRoomChildPlus = By.xpath("//span[@id='childrenPlus2']");
	private static By secondRoomChildDropdowniOS = By.xpath("//input[@id='xRoom2_iChild1']");
	private static By selectRoomtwoChildAgeDropdownMob = By.xpath("(//ul[@id='ui-id-3']//li)[2]");
	private static By selectChildAgeDropdownMob = By.xpath("(//ul[@id='ui-id-1']//li)[2]");
	private static By selectfirstRoomChildPlus=By.xpath("//span[@id='childrenPlus']");

	private static By tripInclusionContinueButtonmob=By.xpath("//a[@id='aContWithPriceValidationReview']");
	private static By firstTravelerFirstNameTextBoxiOS=By.xpath("//input[contains(@placeholder,'First and Middle Name') and @id='txtPFName1' ]");
	private static By thirdTravelerFirstNameTextBoxMob=By.xpath("//input[contains(@placeholder,'First and Middle Name') and @id='txtPFName3' ]");
	private static By thirdTravelerLastNameTxtboxMob = By.xpath("//input[contains(@placeholder,'Last Name') and @id='txtPLName3']");
	private static By secondTravelerFirstNameTextBoxiOS=By.xpath("//input[contains(@placeholder,'First and Middle Name') and @id='txtPFName2' ]");
	private static By firstTravelerLastNameTxtboxiOS = By.xpath("//input[contains(@placeholder,'Last Name') and @id='txtPLName1']");
	private static By secondTravelerLastNameTxtboxiOS = By.xpath("//input[contains(@placeholder,'Last Name') and @id='txtPLName2']");
	private static By thirdTravelerGenderDropdownMob = By.xpath("//select[@id='txtPAX_Gender3']");
	private static By firstTravelerGenderDropdowniOS = By.xpath("//select[@id='txtPAX_Gender1']");
	private static By secondTravelerGenderDropdowniOS = By.xpath("//select[@id='txtPAX_Gender2']");
	private static By firstTravelerDOBiOS = By.xpath("//input[@id='txtPAX_DOB1']");
	private static By thirdTravelerDOBMob = By.xpath("//input[@id='txtPAX_DOB3']");
	private static By secondTravelerDOBiOS = By.xpath("//input[@id='txtPAX_DOB2']");
	private static By verifyTraveler3NameMob =By.xpath("//div[@id='TravelerR3']//div[@class='cel-name col-6 mt-2' or @class='editvalgender font-weight-bold' or @class='editvaldob']");
	private static By verifyTraveler1NameiOS = By
			.xpath("//div[@id='TravelerR1']//div[@class='editvaldob' or @class='cel-name col-6 mt-2' or @class='editvalgender font-weight-bold']");
	private static By verifyTraveler2NameiOS = By
			.xpath("//div[@id='TravelerR2']//div[@class='editvaldob' or @class='editvalgender font-weight-bold' or @class='cel-name col-6 mt-2']");
	private static By verifyTraveler3NameiOS = By
			.xpath("//div[@id='TravelerR3']//div[@class='editvaldob' or @class='editvalgender font-weight-bold' or @class='cel-name col-6 mt-2']");
	private static By verifyTraveler4NameiOS = By
			.xpath("//div[@id='TravelerR4']//div[@class='editvaldob' or @class='editvalgender font-weight-bold' or @class='cel-name col-6 mt-2']");
	private static By firstHoteliOS = By.xpath("(//a[contains(@class,'hotelHeadTitle')]//h5)[1]");
	private static By verifyPremiumEconomy =By.xpath("//div[text()='Premium Economy']");
	private static By selectNumberOfAdultRoom1Mob = By.xpath("//span[@id='adultMinus']");
	private static By selectNumberOfAdultRoom2Mob = By.xpath("//span[@id='adultPlus2']");
	public static By slectNumberOfChildMob =By.xpath("//span[@id='childrenPlus']");
	public static By clickChildDropdownMob =By.xpath("//input[@id='xiChild1']");
	public static By secondTravelerFirstNameTextBoxMOb =By.xpath("//input[contains(@placeholder,'First and Middle Name') and @id='txtCFName2' ]");
	public static By secondTravelerLastNameTxtboxMob = By.xpath("//input[contains(@placeholder,'Last Name') and @id='txtCLName2']");
	public static By secondTravelerGenderDropdownMob = By.xpath("//select[@id='txtCPAX_Gender2']");
	public static By secondTravelerDOBMob = By.xpath("//input[@id='txtCPAX_DOB2']");
	public static By passportDrpdownSecondTravellerChildMob = By.xpath("//select[@id='txtCPAX_Nationality2']");
	private static By exploreLink = By.xpath("(//p[@class='pMproduct']/a)[1]");
	private static By viewPricebtn = By.xpath("//div[contains(text(),'View Price')]");
	private static By secondCityhotelName = By.xpath("(//div[@class='col-12 pl-0']/a)[4] | ((//div[@class='col-10'])[3]//a)[1]");
	private static By removeSecondCityHotel = By.xpath("(//div[@class='col-4']/a)[7] | (//div[@class='col-4']//a[contains(text(),Remove)])[3]");
	private static By removeSecondCityHotelYesBtn = By.xpath("//button[@id='remYes']");
	/**
	 * @return the emailId
	 */
	
    public static By getremoveSecondCityHotelYesBtn() {
		
		return removeSecondCityHotelYesBtn;
	}

	public static By getremoveSecondCityHotel() {
		return removeSecondCityHotel;
	}
	public static By getfirstChildDropdowniOS() {
		return firstChildDropdowniOS;
	}
    public static By getsecondCityhotelName() {
		
		return secondCityhotelName;
	}
	public static By getexploreLink() {
		return exploreLink;
	}
    public static By getViewPricebtn() {
		
		return viewPricebtn;
	}
	
	public static By getselectfirstRoomAdultPlus() {
		return selectfirstRoomAdultPlus;
	}
	
	
	public static By getverifyTraveler1NameiOS() {
		return verifyTraveler1NameiOS;
		
	}
	
	public static By getverifyTraveler2NameiOS() {
		return verifyTraveler2NameiOS;
	}

	public static By getfirstHoteliOS() {
		return firstHoteliOS;
	}
	
	public static By getLeavingTxtbox() {
		return leavingTextbox;
	}

	public static By getgoingToTextbox() {
		return goingToTextbox;
	}

	public static By getstayingDrpdown() {
		return stayingDrpdown;
	}

	public static By getselectGuestDrpdown() {
		return selectGuestDrpdown;
	}

	public static By getcheaperFlightsLink() {
		return cheaperFlightsLink;
	}

	public static By getselectFlightOption() {
		return selectFlightOption;
	}

	public static By getselectButtonInFlightOption1() {
		return selectButtonInFlightOption1;
	}

	public static By getgoingToTextboxSecond() {
		return goingToTextboxSecond;
	}

	public static By getpassportDrpdownFirstTraveller() {
		return passportDrpdownFirstTraveller;
	}

	public static By getpassportDrpdownSecondTraveller() {
		return passportDrpdownSecondTraveller;
	}

	public static By getpassportDrpdownThirdTraveller() {
		return passportDrpdownThirdTraveller;
	}

	public static By getaddCityBtn() {
		return addCityBtn;
	}

	public static By getnoMoreCitiesBtn() {
		return noMoreCitiesBtn;
	}

	public static By getthirdTravelerFirstNameTxtbox() {
		return thirdTravelerFirstNameTxtbox;
	}

	public static By getthirdTravelerLastNameTxtbox() {
		return thirdTravelerLastNameTxtbox;
	}

	public static By getthirdTravelerGenderDropdown() {
		return thirdTravelerGenderDropdown;
	}

	public static By getthirdTravelerDOB() {
		return thirdTravelerDOB;
	}

	public static By getcontinueImage() {
		return continueImage;
	}

	public static By getcontinueBtn() {
		return continueBtn;
	}

	public static By getcontinueLink() {
		return continueLink;
	}

	public static By getpaymentContinueBtn() {
		return paymentContinueBtn;
	}

	public static By getvalidatingPricesPopupText() {
		return validatingPricesPopupText;
	}


	public static By getEditContinueBtn() {
		return EditContinueBtn;
	}

	public static By getFirstTravelerFirstNameTxtbox() {
		return FirstTravelerFirstNameTxtbox;
	}

	public static By getFirstTravelerLastNameTxtbox() {
		return FirstTravelerLastNameTxtbox;
	}

	public static By getSecondTravelerFirstNameTxtbox() {
		return SecondTravelerFirstNameTxtbox;
	}

	public static By getSecondTravelerLastNameTxtbox() {
		return SecondTravelerLastNameTxtbox;
	}

	public static By getFirstTravelerGenderDropdown() {
		return FirstTravelerGenderDropdown;
	}

	public static By getFirstTravelerDOB() {
		return FirstTravelerDOB;
	}

	public static By getSecondTravelerGenderDropdown() {
		return SecondTravelerGenderDropdown;
	}

	public static By getSecondTravelerDOB() {
		return SecondTravelerDOB;
	}

	public static By getFormContinueBtn() {
		return FormContinueBtn;
	}

	public static By getUSAndCanadaCreditCardsTxt() {
		return USAndCanadaCreditCardsTxt;
	}

	public static By geteuropBestSellerslnk() {
		return europBestSellerslnk;
	}

	public static By geteuropeanBestsellersHeader() {
		return europeanBestsellersHeader;
	}

	public static By getverifyTraveler1Name() {
		return verifyTraveler1Name;
	}

	public static By getverifyTraveler2Name() {
		return verifyTraveler2Name;
	}

	public static By getverifyTraveler3Name() {
		return verifyTraveler3Name;
	}

	public static By getWithoutAirButton() {
		return withoutAirButton;
	}

	public static By getselectAdultDrpdown() {
		return selectAdultDrpdown;
	}

	public static By getselectChildDrpdown() {
		return selectChildDrpdown;
	}

	public static By getselectChildAgeDrpdown() {
		return selectChildAgeDrpdown;
	}

	public static By getselectChildTravelerDOB() {
		return selectChildTravelerDOB;
	}

	public static By getpassportDrpdownSecondChildTraveller() {
		return selectChildTraveleraPassport;
	}

	public static By getverifyTraveler4Name() {
		return verifyTraveler4Name;
	}

	public static By getselectAdultRoom2Drpdown() {
		return selectAdultRoom2Drpdown;
	}

	public static By getselectChildRoom2Drpdown() {
		return selectChildRoom2Drpdown;
	}

	public static By getselectChildAgeRoom2Drpdown() {
		return selectChildAgeRoom2Drpdown;
	}

	public static By getBrowseHotelsLink() {
		return browseHotelslink;
	}

	public static By getselectFirstHotel() {
		return selectFirstHotel;
	}

	public static By getFirstHotel() {
		return firstHotel;
	}

	public static By getExpectedHotel() {
		return verifyHotel;
	}

	public static By getfirstFlightDetails() {
		return firstFlightDetails;
	}

	public static By getactualFlightDetails() {
		return actualFlightDetails;
	}

	public static By getexpectedFlight() {
		return expectedFlight;
	}

	public static By getwithoutAir() {
		return selectWitoutAirOption;
	}

	public static By getBrowseHotelLink() {
		return browseHotelLink;
	}

	public static By getSelectHotelOption() {
		return selectHotelOption;
	}

	public static By getVerifyTripInclusionHeader() {
		return verifyTripInclusionHeader;
	}

	public static By getSelectHotelName() {
		return selectHotelName;
	}

	public static By getVerifyHotelName() {
		return verifyHotelName;
	}

	public static By getChangedArriveDate() {
		return changedArriveDate;
	}

	public static By getArriveDateDropdown() {
		return arriveDateDropdown;
	}

	public static By getArriveDateCalender() {
		return arriveDateCalender;
	}

	public static By getCabinClassDropdown() {
		return cabinClassDropdown;
	}

	public static By getVerifycabinClassDropdown() {
		return verifycabinClassDropdown;
	}

	public static By getFirstpremiumOption() {
		return firstpremiumoption;
	}

	public static By getSecondpremiumOption() {
		return verifypremiumoption;
	}

	public static By getArriveDate() {
		return arriveDate;
	}

	public static By getselectWithoutAirButton() {
		return selectWithoutAirButton;
	}

	public static By getSearchBox() {
		return searchBox;
	}

	public static By getGoButton() {
		return goButton;
	}

	public static By getstayingDrpdownthree() {
		return stayingDrpdownthree;
	}

	public static By getpickCalendarData() {
		return pickCalendarData;
	}

	public static By getsecondremovecitylink() {
		return secondremovecitylink;
	}

	public static By getedititinerary() {
		return edititinerary;
	}

	public static By getthirdremoveCitylink() {
		return thirdremoveCitylink;
	}

	public static By getgoingToTextboxThird() {
		return goingToTextboxThird;
	}

	public static By getstayingDrpdowntwo() {
		return stayingDrpdowntwo;
	}

	public static By getBuildYourVacationDropDown() {
		return buildYourVacation_DropDown;
	}

	public static By getselectGuestRoomOptions() {
		return selectGuestRoomOptions;
	}

	public static By getselectGuestRoomOptionsDrpdown() {
		return selectGuestRoomOptionsDrpdown;
	}

	public static By getoptionListForGuestsAndRooms() {
		return optionListForGuestsAndRooms;
	}

	public static By getdoneButton() {
		return doneButton;
	}

	public static By getselectbutton() {
		return selectbutton;
	}

	public static By getcabinSectionMob() {
		return cabinSectionMob;
	}

	public static By getTripInclusionContinueButtonmob() {
		
		return tripInclusionContinueButtonmob;
	}

	public static By getfirstTravelerFirstNameTextBoxiOS() {
		
		return firstTravelerFirstNameTextBoxiOS;
	}

	public static By getfirstTravelerLastNameTxtboxiOS() {
		
		return firstTravelerLastNameTxtboxiOS;
	}

	public static By getfirstTravelerGenderDropdowniOS() {
		
		return firstTravelerGenderDropdowniOS;
	}

	public static By getfirstTravelerDOBiOS() {
		
		return firstTravelerDOBiOS;
	}

	public static By getsecondTravelerFirstNameTextBoxiOS() {
		
		return secondTravelerFirstNameTextBoxiOS;
	}

	public static By getsecondTravelerLastNameTxtboxiOS() {
	
		return secondTravelerLastNameTxtboxiOS;
	}

	public static By getsecondTravelerGenderDropdowniOS() {
		
		return secondTravelerGenderDropdowniOS;
	}

	public static By getsecondTravelerDOBiOS() {
		
		return secondTravelerDOBiOS;
	}

	
	public static By getVerifyPremiumEconomy() {

	return verifyPremiumEconomy;
	}

	public static By getthirdTravelerFirstNameTextBoxMob()
   {
	   return thirdTravelerFirstNameTextBoxMob;
   }
   
   public static By getthirdTravelerLastNameTxtboxMob()
   {
	   return thirdTravelerLastNameTxtboxMob;
   }
   
   public static By getthirdTravelerGenderDropdownMob()
   {
	   return thirdTravelerGenderDropdownMob ;
   }
   
   public static By getthirdTravelerDOBMob()
   {
	   return thirdTravelerDOBMob ;
   }
   
   public static By getselectNumberOfAdultRoom1Mob()
   {
	   return selectNumberOfAdultRoom1Mob;
   }

public static By getselectNumberOfChildMob() {
	
	return slectNumberOfChildMob;
}

public static By getclickChildDropdownMob() {
	
	return clickChildDropdownMob ;
}

public static By getsecondTravelerFirstNameTextBoxMOb() {
	
	return secondTravelerFirstNameTextBoxMOb ;
}

public static By getsecondTravelerLastNameTxtboxMob() {
	
	return secondTravelerLastNameTxtboxMob;
}

public static By getsecondTravelerGenderDropdownMob() {
	
	return secondTravelerGenderDropdownMob;
}

public static By getsecondTravelerDOBMob() {
	
	return secondTravelerDOBMob;
}

public static By getpassportDrpdownSecondTravellerChildMob() {
	
	return passportDrpdownSecondTravellerChildMob;
}

    public static By getverifyTraveler3NameiOS() {
    	 
    	  return verifyTraveler3NameiOS;
     }
     
	public static By getverifyTraveler4NameiOS() {
		
		return verifyTraveler4NameiOS;
	}

	public static By getselectfirstRoomChildPlus() {
		
		return selectfirstRoomChildPlus;
	}

	public static By getselectChildAgeDropdownMob() {
		return selectChildAgeDropdownMob;
	}

	public static By getSecondRoomadultPlus() {
		return SecondRoomadultPlus;
	}

	public static By getselectsecondRoomChildPlus() {
		return selectsecondRoomChildPlus;
	}

	public static By getsecondRoomChildDropdowniOS() {
		return secondRoomChildDropdowniOS;
	}

	public static By getselectRoomtwoChildAgeDropdownMob() {
		return selectRoomtwoChildAgeDropdownMob;
	}

	public static By getselectNumberOfAdultRoom2Mob()
	{
		return selectNumberOfAdultRoom2Mob;
	}
	public static By getverifyTraveler3NameMob()
	{
		return verifyTraveler3NameMob;

	}
	public static By getselectFirstHotel_SingleCity(){
		
		return selectFirstHotel_SingleCity;
	}
	public static By getbackToItineraryOption(){
		
		return backToItineraryOption;
	}
    public static By validateTravelByOption(){
		
		return travelByOption;
	}

	public static By getHotelsBy_Reviewscore() {
		
		return hotelsBy_Reviewscore;
	}

	public static By getHotelsBy_Price() {
		
		return hotelsBy_Price;
	}

	public static By getHotelsBy_Name() {
		
		return hotelsBy_Name;
	}

	public static By gethotelBrowseOptions() {
		
		return hotelBrowseOptions;
	}

	public static By getChangeTravelByButton() {
		
		return changeTravelByButton;
	}

	public static By getTopDealsButton() {
		
		return topDealsButton;
	}

	public static By getTopDealsPageHeading() {
		
		return topDealsPageHeading;
	}

	public static By getTopDealsPageList() {
		
		return topDealsPageList;
	}

	public static By gethighLightOptions() {
		return validatehighLightOptions;
	}

	public static By getSelectVacationIdeas() {
		return selectVacationIdeas;
	}

	public static By getClickonReorderCities() {
		
		return clickonReorderCities;
	}
	
    public static By getleavingTextboxBYO_Page() {
		
		return leavingTextboxBYO_Page;
	}
    
    public static By getarriveDateDropdown_BYOPage() {
		
		return arriveDateDropdown_BYOPage;
	}

	public static By getselectGuestRoomOptionsDrpdown_BYOPage() {
		
		return selectGuestRoomOptionsDrpdown_BYOPage;
	}

	public static By getselectAdult_Room1_BYOPage() {
		
		return selectAdult_Room1_BYOPage;
	}

	public static By getselectChild_Room1_BYOPage() {
		
		return selectChild_Room1_BYOPage;
	}

	public static By getChildAgeTextbox() {
		return ChildAgeTextbox_BYO;
	}
	
	public static By getclickOnContinueButton_BYO() {
		return clickOnContinueButton_BYO;
	}

	public static By getselectCabinFromFlightOptions() {
		return selectCabinFromFlightOptions;
	}

	public static By getvalidateErrorOnPAXDetails() {
		return validateErrorOnPAXDetails;
	}

	public static By getleavingTextboxFirstPckg() {
		
		return leavingTextboxFirstPckg;
	}

	public static By getarriveDateDropdown_FirstPckg() {
		
		return arriveDateDropdown_FirstPckg;
	}

	public static By getselectGuestDrpdown_FirstPackage() {
		
		return selectGuestDrpdown_FirstPackage;
	}

	public static By getClickOnViewPriceButton() {
		return clickOnViewPriceButton;
	}

	public static By getClickToRemoveScndCityHotel() {
		return clickToRemoveScndCityHotel;
	}

	public static By getselectDialogBox() {
		return selectDialogBox;
	}
	
	public static By getselectRemoveCityBtn() {
		return selectRemoveCityBtn;
	}

	public static By getSelectButtonCar() {
		return selectButtonCar;
	}

	public static By getnavMonth() {
		// TODO Auto-generated method stub
		return navMonth;
	}

	public static By getnavMonth_prev() {
		// TODO Auto-generated method stub
		return navMonth_prev;
	}
	
	public static By getselectscndCabinFromFlightOptions() {
		// TODO Auto-generated method stub
		return selectscndCabinFromFlightOptions;
	}

	public static By getSelectHighLightOption() {
		// TODO Auto-generated method stub
		return selectHighLightOption;
	}

	public static By getClickOnCustomiseBtn() {
		// TODO Auto-generated method stub
		return clickOnCustomiseBtn;
	}

	public static By getselectChildDrpdown2_dealsPage() {
		// TODO Auto-generated method stub
		return selectChildDrpdown2_dealsPage;
	}

	public static By getenterAgeofChild() {
		// TODO Auto-generated method stub
		return enterAgeofChild;
	}

	public static By getBrowseHotelsLink_TopDealsPage() {
		// TODO Auto-generated method stub
		return browseHotelsLink_TopDealsPage;
	}

	public static By getHotelsBy_Star() {
		
		return hotelsBy_Star;
	}

	public static By clickondate() {
		return getdate;
	}
	
	public static By getselectRemoveThirdCityBtn() {
		return selectRemoveThirdCityBtn;
	}
	
	
}

