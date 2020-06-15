package com.tripmasters.framework.pageLocators;

import org.openqa.selenium.By;

public class PassengerInformationLocators {
	 private static By fnameR1T1=By.xpath("(//div[div[*[contains(.,'Room 1')]]]//input[contains(@placeholder,'First and Middle Name')])[1] |//input[@id='1_txtCFName1']");
	 private static By fnameR1T2=By.xpath("(//div[div[*[contains(.,'Room 1')]]]//input[contains(@placeholder,'First and Middle Name')])[2]");
	 private static By fnameR2T1=By.xpath("(//div[div[span[contains(.,'Room 2')]]]//input[contains(@placeholder,'First and Middle Name')])[1]");
	 private static By fnameR2T2=By.xpath("(//div[div[span[contains(.,'Room 2')]]]//input[contains(@placeholder,'First and Middle Name')])[2]");
	
	 private static By lnameR1T1=By.xpath("(//div[div[span[contains(.,'Room 1')]]]//input[contains(@placeholder,'Last Name')])[1] | //input[@id='1_txtCLName1']");
	 private static By lnameR1T2=By.xpath("(//div[div[span[contains(.,'Room 1')]]]//input[contains(@placeholder,'Last Name')])[2]");
	 private static By lnameR2T1=By.xpath("(//div[div[span[contains(.,'Room 2')]]]//input[contains(@placeholder,'Last Name')])[1]");
	 private static By lnameR2T2=By.xpath("(//div[div[span[contains(.,'Room 2')]]]//input[contains(@placeholder,'Last Name')])[2]");
     
	 private static By genderR1T1=By.xpath("(//div[div[div[span[contains(.,'Room 1')]]]]//div[contains(@class,'Gender')]//select)[1]");
     private static By genderR1T2=By.xpath("(//div[div[div[span[contains(.,'Room 1')]]]]//div[contains(@class,'Gender')]//select)[2]");
     private static By genderR2T1=By.xpath("(//div[div[div[span[contains(.,'Room 2')]]]]//div[contains(@class,'Gender')]//select)[1]");
     private static By genderR2T2=By.xpath("(//div[div[div[span[contains(.,'Room 2')]]]]//div[contains(@class,'Gender')]//select)[2]");

     private static By dobR1T1=By.xpath("(//div[div[div[span[contains(.,'Room 1')]]]]//input[contains(@id,'txtPAX_DOB')])[1]");
     private static By dobR1T2=By.xpath("(//div[div[div[span[contains(.,'Room 1')]]]]//input[contains(@id,'txtPAX_DOB')])[2]");
     private static By dobR2T1=By.xpath("(//div[div[div[span[contains(.,'Room 2')]]]]//input[contains(@id,'txtPAX_DOB')])[1]");
     private static By dobR2T2=By.xpath("(//div[div[div[span[contains(.,'Room 2')]]]]//input[contains(@id,'txtPAX_DOB')])[2]");

     private static By passportR1T1=By.xpath("//select[@id='1_txtPAX_Nationality1']");
     private static By passportR1T2=By.xpath("//select[@id='1_txtPAX_Nationality2']");
     private static By passportR2T1=By.xpath("//select[@id='2_txtPAX_Nationality1']");
     private static By passportR2T2=By.xpath("//select[@id='2_txtPAX_Nationality2']");
     
     private static By fnameR1C1SingleTrvlr=By.xpath("(//div[div[span[contains(.,'Room 1')]]]//input[contains(@placeholder,'First and Middle Name')])[2] | //input[@id='1_txtCFName1']");
     private static By lnameR1C1SingleTrvlr=By.xpath("(//div[div[span[contains(.,'Room 1')]]]//input[contains(@placeholder,'Last Name')])[2] | //input[@id='1_txtCLName1']");
     private static By genderR1C1SingleTrvlr=By.xpath("(//div[div[div[span[contains(.,'Room 1')]]]]//div[contains(@class,'Gender')]//select)[2] | //select[@id='1_txtCPAX_Gender1']");
  
     private static By fnameR2C1SingleTrvlr=By.xpath("(//div[div[span[contains(.,'Room 2')]]]//input[contains(@placeholder,'First and Middle Name')])[2] | //input[@id='2_txtCFName1']");
     private static By lnameR2C1SingleTrvlr=By.xpath("(//div[div[span[contains(.,'Room 2')]]]//input[contains(@placeholder,'Last Name')])[2] | //input[@id='2_txtCLName1']");
     private static By genderR2C1SingleTrvlr=By.xpath("(//div[div[div[span[contains(.,'Room 2')]]]]//div[contains(@class,'Gender')]//select)[2] | //select[@id='2_txtCPAX_Gender1']");
     private static By dobR2C1SingleTrvlr=By.xpath("//input[@id='2_txtCPAX_DOB1']");
     private static By passportR2C1SingleTrvlr=By.xpath("//select[@id='2_txtCPAX_Nationality1']");
     
     private static By fnameR1C1=By.xpath("(//div[div[span[contains(.,'Room 1')]]]//input[contains(@placeholder,'First and Middle Name')])[3]");
     private static By lnameR1C1=By.xpath("(//div[div[span[contains(.,'Room 1')]]]//input[contains(@placeholder,'Last Name')])[3]");
     private static By genderR1C1=By.xpath("(//div[div[div[span[contains(.,'Room 1')]]]]//div[contains(@class,'Gender')]//select)[3]");
     private static By dobR1C1=By.xpath("//input[@id='1_txtCPAX_DOB1']");
     private static By passportR1C1=By.xpath("//select[@id='1_txtCPAX_Nationality1']");
     
     private static By fnameR2C1=By.xpath("(//div[div[span[contains(.,'Room 2')]]]//input[contains(@placeholder,'First and Middle Name')])[4]");
     private static By lnameR2C1=By.xpath("(//div[div[span[contains(.,'Room 2')]]]//input[contains(@placeholder,'Last Name')])[4]");
     private static By genderR2C1=By.xpath("(//div[div[div[span[contains(.,'Room 2')]]]]//div[contains(@class,'Gender')]//select)[4]");
     private static By dobR2C1=By.xpath("//input[@id='2_txtCPAX_DOB2']");
     private static By passportR2C1=By.xpath("//select[@id='2_txtCPAX_Nationality2']");
     
     private static By fnameChild=By.xpath("//input[@id='txtCFName3']");
     private static By lnameChild=By.xpath("//input[@id='txtCLName3']");
     private static By genderChild=By.xpath("//select[@id='txtCPAX_Gender3']");
     private static By dobChild=By.xpath("//input[@id='txtCPAX_DOB3']");
     private static By passportChild=By.xpath("//select[@id='txtCPAX_Nationality3']");
   
     
//================================Mobile Locators========================================================================================
     private static By R1T1genderiOS=By.xpath("//select[@id='1_txtPAX_Gender1']");
     private static By R1T2genderiOS=By.xpath("//select[@id='1_txtPAX_Gender2']");
     private static By R2T1genderiOS=By.xpath("//select[@id='2_txtPAX_Gender1']");
     private static By R2T2genderiOS=By.xpath("//select[@id='2_txtPAX_Gender2']");
     
     private static By fnameR2T1iOS=By.xpath("//input[@id='2_txtPFName1']");
     private static By lnameR2T1iOS=By.xpath("//input[@id='2_txtPLName1']");	 
     

	private static By fnameR2T2iOS = By.xpath("//input[@id='2_txtPFName2']");
	private static By lnameR2T2iOS = By.xpath("//input[@id='2_txtPLName2']");

	private static By dobR2T1iOS = By.xpath("//input[@id='2_txtPAX_DOB1']");
	private static By dobR2T2iOS = By.xpath("//input[@id='2_txtPAX_DOB2']");

	private static By fnameR1C1Mob = By.xpath("//input[@id='1_txtCFName1' and @name ='1_txtCFName1']");
	private static By lnameR1C1Mob = By.xpath("//input[@id='1_txtCLName1' and @name ='1_txtCLName1']");
	private static By genderR1C1Mob = By.xpath("//select[@id='1_txtCPAX_Gender1']");
	private static By dobR1C1Mob = By.xpath("//input[@id='1_txtCPAX_DOB1']");
    			 
    	 
	public static By getfnameR1T1() {
		return fnameR1T1;
	}

	public static By getfnameR1T2() {
		return fnameR1T2;
	}

	public static By getfnameR2T1() {
		return fnameR2T1;
	}

	public static By getfnameR2T2() {
		return fnameR2T2;
	}

	public static By getlnameR1T1() {
		return lnameR1T1;
	}

	public static By getlnameR1T2() {
		return lnameR1T2;
	}

	public static By getlnameR2T1() {
		return lnameR2T1;
	}

	public static By getlnameR2T2() {
		return lnameR2T2;
	}
	
	public static By getgenderR1T1() {
		return genderR1T1;
	}
	
	public static By getgenderR1T2() {
		return genderR1T2;
	}
	
	public static By getgenderR2T1() {
		return genderR2T1;
	}
	
	public static By getgenderR2T2() {
		return genderR2T2;
	}
	
	public static By getdobR1T1() {
		return dobR1T1;
	}
	
	public static By getdobR1T2() {
		return dobR1T2;
	}
	
	public static By getdobR2T1() {
		return dobR2T1;
	}
	
	public static By getdobR2T2() {
		return dobR2T2;
	}
	
	public static By getpassportR1T1() {
		return passportR1T1;
	}
	
	public static By getpassportR1T2() {
		return passportR1T2;
	}
	
	public static By getpassportR2T1() {
		return passportR2T1;
	}
	
	public static By getpassportR2T2() {
		return passportR2T2;
	}
	
	public static By getfnameR1C1() {
		return fnameR1C1;
	}
	
	public static By getlnameR1C1() {
		return lnameR1C1;
	}
	
	public static By getgenderR1C1() {
		return genderR1C1;
	}
	
	
	public static By getdobR1C1() {
		return dobR1C1;
	}
	
	public static By getpassportR1C1() {
		return passportR1C1;
	}
	
	public static By getfnameR2C1() {
		return fnameR2C1;
	}
	
	public static By getlnameR2C1() {
		return lnameR2C1;
	}
	
	public static By getgenderR2C1() {
		return genderR2C1;
	}
	
	
	public static By getdobR2C1() {
		return dobR2C1;
	}
	
	public static By getpassportR2C1() {
		return passportR2C1;
	}

	public static By getfnameR1C1SingleTrvlr() {

		return fnameR1C1SingleTrvlr;
	}

	public static By getlnameR1C1SingleTrvlr() {

		return lnameR1C1SingleTrvlr;
	}

	public static By getgenderR1C1SingleTrvlr() {
		return genderR1C1SingleTrvlr;
	}

	public static By getfnameR2C1SingleTrvlr() {
		return fnameR2C1SingleTrvlr;
	}

	public static By getgenderR2C1SingleTrvlr() {
		return genderR2C1SingleTrvlr;
	}

	public static By getpassportR2C1SingleTrvlr() {
		return passportR2C1SingleTrvlr;
	}

	public static By getR2T1genderiOS() {
		return R2T1genderiOS;
	}

	public static By getdobR2T2iOS() {
		return dobR2T2iOS;
	}

	public static By getlnameR2C1SingleTrvlr() {

		return lnameR2C1SingleTrvlr;
	}

	public static By getdobR2C1SingleTrvlr() {
		return dobR2C1SingleTrvlr;
	}

	public static By getR1T1genderiOS() {
		return R1T1genderiOS;
	}

	public static By getR1T2genderiOS() {
		return R1T2genderiOS;
	}

	public static By getR2T2genderiOS() {
		return R2T2genderiOS;
	}

	public static By getfnameR2T1iOS() {

		return fnameR2T1iOS;
	}

	public static By getlnameR2T1iOS() {

		return lnameR2T1iOS;
	}

	public static By getfnameR2T2iOS() {

		return fnameR2T2iOS;
	}

	public static By getlnameR2T2iOS() {

		return lnameR2T2iOS;
	}

	public static By getdobR2T1iOS() {
		return dobR2T1iOS;
	}

	public static By getfnameR1C1Mob() {
		return fnameR1C1Mob;
	}

	public static By getlnameR1C1Mob() {

		return lnameR1C1Mob;
	}

	public static By getgenderR1C1Mob() {
		return genderR1C1Mob;
	}

	public static By getdobR1C1Mob() {

		return dobR1C1Mob;
	}

	public static By getfnameChild() {

		return fnameChild;
	}

	public static By getlnameChild() {

		return lnameChild;
	}

	public static By getgenderChild() {
		return genderChild;
	}
	public static By getdobChild() {
		return dobChild;
	}
	public static By getpassportChild() {
		return passportChild;
	}
}