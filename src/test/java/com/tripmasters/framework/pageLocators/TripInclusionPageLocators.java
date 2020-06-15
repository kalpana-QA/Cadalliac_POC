package com.tripmasters.framework.pageLocators;

import org.openqa.selenium.By;

public class TripInclusionPageLocators {

	private static By tripInclusionDetailsHeader = By.xpath("//span[contains(.,'TRIP INCLUSION DETAILS')]");
	private static By verifyTripinclusionPage = By.xpath("//div[@class='mainDiv']//span[contains(text(),'TRIP INCLUSION DETAILS')]");
	private static By tripSummaryButton = By.xpath("//span[text()='Trip Summary']");

	public static By gettripInclusionDetailsHeader() {
		return tripInclusionDetailsHeader;
	}
	
	public static By toVerifyTripinclusionPage() {
		return verifyTripinclusionPage;
	}

	public static By getTripSummaryButton() {
		return tripSummaryButton;
	}
}
