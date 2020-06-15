package com.tripmasters.framework.pageLocators;

import org.openqa.selenium.By;

public class HomePageLocators {

	private static By moreHighlightsBtn = By.xpath("//button[contains(.,'More Highlights & Attractions')] | //*[contains(text(),'more highlights & attractions')]");
	private static By exploreEuropeLnk = By.xpath("(//section[h1[contains(.,'popular vacation packages')]]//div//a)[1] | //div[text()='Explore Europe']");
	private static By romeFlorenceVeniceByTrainLnk = By.xpath("(//div[contains(text(),'other vacation packages')]/../div/h2/a)[2]");
	private static By packageUnderOtherVacationPackageOption = By.xpath("//div[contains(text(),'other vacation packages')]/..//div[@class='swiper-slide swiper-slide-active']//a");
	private static By romeFlorenceVeniceByTrainHeader = By.xpath("//h1[contains(.,'Rome - Florence - Venice by Train')]");

	private static By searchBox = By.xpath("//form[@id='frmSearch']//input[@id='q'] | //input[@id='inpSearchAWS']");
	private static By goButton = By.xpath("//input[@name='Go'] | //img[contains(@onclick,'searchGO')]");
	private static By startagain = By.xpath("(//div[@class='dvtranspMainContainer']//span[@class='goToStartAgain']//u)[2] | //div[@class = 'dvMNext ']//span[text()='Start again']");
	private static By footer = By.xpath("//div[@class='dvCopy'] | //div[@class='dvfootWording']");
	private static By exploreLatinAmericaLnk = By.xpath("//section[h1[contains(.,'popular vacation packages')]]//h3/a[contains(.,'Latin America')] | //div[text()='Explore Latin America']");
	
	private static By asiaPagelink=By.xpath("(//a[text()='Asia, Pacific & Middle East'])[1]");
	private static By europePageLink=By.xpath("(//a[text()='Europe'])[1]");
	
	// ============= Locators for mobile =========================================================================================

	private static By SpotlightOnDrpDwn = By.cssSelector("div[id='dvSpot']");
	private static By firstOptionUnderSpotlightDrpDwn = By.xpath("(//div[@id='ContdvSpot'][@style='display: block;']//a)[1]");
	private static By selectPremiumEconomy = By.xpath("//span[text()='Premium Economy']");
	 
	public static By getmoreHighLightsBtn() {
		return moreHighlightsBtn;
	}

	public static By getTheLink(String linkText) {
		return By.xpath("//div[contains(@style,'display: block;')]//a[contains(.,'" + linkText + "')]");
	}

	
	public static By getExploreEuropeLnk() {
		return exploreEuropeLnk;
	}

	public static By getRomeFlorenceVeniceByTrainLnk() {
		return romeFlorenceVeniceByTrainLnk;
	}

	public static By getRomeFlorenceVeniceByTrainHeader() {
		return romeFlorenceVeniceByTrainHeader;
	}

	public static By getSearchBox() {
		return searchBox;
	}

	public static By getGoButton() {
		return goButton;
	}

	public static By getStartAgain() {
		return startagain;
	}

	public static By getFooter() {
		return footer;
	}

	public static By getExploreLatinAmericaLnk() {
		return exploreLatinAmericaLnk;
	}

	public static By getpackageDisplayedUnderOtherVacationPackageOption() {
		return packageUnderOtherVacationPackageOption;
	}

	public static By getSpotlightOnDrpDwn() {
		return SpotlightOnDrpDwn;
	}

	public static By getfirstOptionUnderSpotlightDrpDwn() {
		return firstOptionUnderSpotlightDrpDwn;
	}

	public static By getSelectPremiumEconomy() {

		return selectPremiumEconomy;
		}
	
	public static By getasiaPagelink(){
		 return asiaPagelink;
	}

	public static By getEuropePageLink() {
		
		return europePageLink;
	}
}
