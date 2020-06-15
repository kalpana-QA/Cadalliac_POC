package com.tripmasters.framework.pageActions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tripmasters.framework.base.PageBase;
import com.tripmasters.framework.base.TestBase;
import com.tripmasters.framework.pageLocators.BookingLocators;
import com.tripmasters.framework.pageLocators.PassengerInformationLocators;


public class PassengerInfoPageAction extends PageBase {

	
	ExtentTest test;
	public PassengerInfoPageAction(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public List<String> fillFirstTravellerDetails(String fname, String lname, String gender, String dateOfBirth,String passportInfo) throws Exception {
		List<String> list = new ArrayList<String>();
		if(TestBase.flag_Mob){
			String firstName=clearAndSetValues(BookingLocators.getfirstTravelerFirstNameTextBoxiOS(), fname);
	    	String secondName=clearAndSetValues(BookingLocators.getfirstTravelerLastNameTxtboxiOS(), lname);
	    	String fullName=firstName +" "+ secondName;
	    	list.add(fullName);
		    list.add(selectOptionByText(BookingLocators.getfirstTravelerGenderDropdowniOS(), gender));
		    scrollDown();
			list.add(clearAndSetValues(BookingLocators.getfirstTravelerDOBiOS(), dateOfBirth));
			selectOptionByValue(BookingLocators.getpassportDrpdownFirstTraveller(), passportInfo);
	    	return list;
		}
		else {
			String firstName = clearAndSetValues(BookingLocators.getFirstTravelerFirstNameTxtbox(), fname);
			String secondName = clearAndSetValues(BookingLocators.getFirstTravelerLastNameTxtbox(), lname);
			String fullName = firstName + " " + secondName;
			list.add(fullName);
			list.add(selectOptionByText(BookingLocators.getFirstTravelerGenderDropdown(), gender));
			list.add(clearAndSetValues(BookingLocators.getFirstTravelerDOB(), dateOfBirth));
			selectOptionByValue(BookingLocators.getpassportDrpdownFirstTraveller(), passportInfo);
			return list;
		}
	}

	public List<String> fillSecondTravellerDetails(String fname, String lname, String gender, String dateOfBirth,String passportInfo, String travelerType) throws Exception {
		List<String> list = new ArrayList<String>();
		if(TestBase.platform.equalsIgnoreCase("iOS")){
			 String firstName=clearAndSetValues(BookingLocators.getsecondTravelerFirstNameTextBoxiOS(), fname);
			 String secondName=clearAndSetValues(BookingLocators.getsecondTravelerLastNameTxtboxiOS(), lname);
			 String fullName=firstName +" "+ secondName;
			 list.add(fullName);
			 list.add(selectOptionByText(BookingLocators.getsecondTravelerGenderDropdowniOS(), gender));
			 if(travelerType.equals("Child")){
			 list.add(clearAndSetValues(BookingLocators.getsecondTravelerDOBiOS(), dateOfBirth));
			 selectOptionByValue(BookingLocators.getpassportDrpdownSecondTraveller(), passportInfo);
			 }
			 else{
				 
				 //===========Write code for different traveller type=====================
			 }
			return list;
		}
		else if(TestBase.platform.equalsIgnoreCase("Windows")){
			String firstName = clearAndSetValues(BookingLocators.getSecondTravelerFirstNameTxtbox(), fname);
			String secondName = clearAndSetValues(BookingLocators.getSecondTravelerLastNameTxtbox(), lname);
			String fullName = firstName + " " + secondName;
			list.add(fullName);
			list.add(selectOptionByText(BookingLocators.getSecondTravelerGenderDropdown(), gender));
			if (travelerType.equals("Child")) {
				list.add(clearAndSetValues(BookingLocators.getselectChildTravelerDOB(), dateOfBirth));
				selectOptionByValue(BookingLocators.getpassportDrpdownSecondChildTraveller(), passportInfo);
			} else {
				list.add(clearAndSetValues(BookingLocators.getSecondTravelerDOB(), dateOfBirth));
				selectOptionByValue(BookingLocators.getpassportDrpdownSecondTraveller(), passportInfo);
			}
			return list;
		}
		else
		{
			 String firstName=clearAndSetValues(BookingLocators.getsecondTravelerFirstNameTextBoxMOb(), fname);
			 String secondName=clearAndSetValues(BookingLocators.getsecondTravelerLastNameTxtboxMob(), lname);
			 String fullName=firstName +" "+ secondName;
			 list.add(fullName);
			 list.add(selectOptionByText(BookingLocators.getsecondTravelerGenderDropdownMob(), gender));
			 if(travelerType.equals("Child")){
			 list.add(clearAndSetValues(BookingLocators.getsecondTravelerDOBMob(), dateOfBirth));
			 selectOptionByValue(BookingLocators.getpassportDrpdownSecondTravellerChildMob(), passportInfo);
		}
		return list;
		}
	}
	
	public List<String> fillThirdTravellerDetails(String fname, String lname, String gender, String dateOfBirth,String passportInfo) throws Exception {
	   if(TestBase.flag_Mob)
	   {
		   List<String> list = new ArrayList<String>();
		   String firstName=clearAndSetValues(BookingLocators.getthirdTravelerFirstNameTextBoxMob(), fname);
	    	String secondName=clearAndSetValues(BookingLocators.getthirdTravelerLastNameTxtboxMob(), lname);
	    	String fullName=firstName +" "+ secondName;
	    	list.add(fullName);
		    list.add(selectOptionByText(BookingLocators.getthirdTravelerGenderDropdownMob(), gender));
		    scrollDown();
			list.add(clearAndSetValues(BookingLocators.getthirdTravelerDOBMob(), dateOfBirth));
			selectOptionByValue(BookingLocators.getpassportDrpdownThirdTraveller(), passportInfo);
	    	return list;
	   }
	   else
	   { 
		List<String> list = new ArrayList<String>();
		String firstName = clearAndSetValues(BookingLocators.getthirdTravelerFirstNameTxtbox(), fname);
		String secondName = clearAndSetValues(BookingLocators.getthirdTravelerLastNameTxtbox(), lname);
		String fullName = firstName + " " + secondName;
		list.add(fullName);
		list.add(selectOptionByText(BookingLocators.getthirdTravelerGenderDropdown(), gender));
		list.add(clearAndSetValues(BookingLocators.getthirdTravelerDOB(), dateOfBirth));
		selectOptionByValue(BookingLocators.getpassportDrpdownThirdTraveller(), passportInfo);
		return list;
	   }
	}

	public List<String> fillTravellerDetailsForMultipleRooms(String RoomTravelerInfo) throws Exception {
		List<String> list = new ArrayList<String>();
	   if (RoomTravelerInfo.equalsIgnoreCase("Room1Traveller1")) {
			String firstNameR1T1 = clearAndSetValues(PassengerInformationLocators.getfnameR1T1(), "yury");
			String secondNameR1T1 = clearAndSetValues(PassengerInformationLocators.getlnameR1T1(), "darwin");
			String fullNameR1T1 = firstNameR1T1 + " " + secondNameR1T1;
			list.add(fullNameR1T1);
			if(TestBase.flag_Mob) {
				list.add(selectOptionByText(PassengerInformationLocators.getR1T1genderiOS(), "Male"));
			}else {
				list.add(selectOptionByText(PassengerInformationLocators.getgenderR1T1(), "Male"));
			}
			list.add(clearAndSetValues(PassengerInformationLocators.getdobR1T1(), "01/01/2000"));
			selectOptionByValue(PassengerInformationLocators.getpassportR1T1(), "237|US");
	   }
	   else if(RoomTravelerInfo.equalsIgnoreCase("Room1Traveller2"))
		{
			String firstNameR1T2 = clearAndSetValues(PassengerInformationLocators.getfnameR1T2(), "Larry");
			String secondNameR1T2 = clearAndSetValues(PassengerInformationLocators.getlnameR1T2(), "darwin");
			String fullNameR1T2 = firstNameR1T2 + " " + secondNameR1T2;
			list.add(fullNameR1T2);
			if(TestBase.flag_Mob) {
				list.add(selectOptionByText(PassengerInformationLocators.getR1T2genderiOS(), "Male"));
			}else {
				list.add(selectOptionByText(PassengerInformationLocators.getgenderR1T2(), "Male"));
			}
			list.add(clearAndSetValues(PassengerInformationLocators.getdobR1T2(), "01/01/2000"));
			selectOptionByValue(PassengerInformationLocators.getpassportR1T2(), "237|US");
		}
	   else if(RoomTravelerInfo.equalsIgnoreCase("Room2Traveller1"))
		{
			if(TestBase.flag_Mob) {
				String firstNameR2T1 = clearAndSetValues(PassengerInformationLocators.getfnameR2T1iOS(), "Hanna");
				String secondNameR2T1 = clearAndSetValues(PassengerInformationLocators.getlnameR2T1iOS(), "darwin");
				String fullNameR2T1 = firstNameR2T1 + " " + secondNameR2T1;
				list.add(fullNameR2T1);
				list.add(selectOptionByText(PassengerInformationLocators.getR2T1genderiOS(), "Male"));
				list.add(clearAndSetValues(PassengerInformationLocators.getdobR2T1iOS(), "01/01/2000"));
			}else {
				String firstNameR2T1 = clearAndSetValues(PassengerInformationLocators.getfnameR2T1(), "Hanna");
				String secondNameR2T1 = clearAndSetValues(PassengerInformationLocators.getlnameR2T1(), "darwin");
				String fullNameR2T1 = firstNameR2T1 + " " + secondNameR2T1;
				list.add(fullNameR2T1);
				list.add(selectOptionByText(PassengerInformationLocators.getgenderR2T1(), "Male"));
				list.add(clearAndSetValues(PassengerInformationLocators.getdobR2T1(), "01/01/2000"));
		 	    }
				selectOptionByValue(PassengerInformationLocators.getpassportR2T1(), "237|US");
		}
	   else if(RoomTravelerInfo.equalsIgnoreCase("Room2Traveller2"))
	   {
			if(TestBase.flag_Mob) {
				String firstNameR2T2 = clearAndSetValues(PassengerInformationLocators.getfnameR2T2iOS(), "Erwin");
				String secondNameR2T2 = clearAndSetValues(PassengerInformationLocators.getlnameR2T2iOS(), "George");
				String fullNameR2T2 = firstNameR2T2 + " " + secondNameR2T2;
				list.add(fullNameR2T2);
				list.add(selectOptionByText(PassengerInformationLocators.getR2T2genderiOS(), "Male"));
				list.add(clearAndSetValues(PassengerInformationLocators.getdobR2T2iOS(), "01/01/2000"));
			}else {
				String firstNameR2T2 = clearAndSetValues(PassengerInformationLocators.getfnameR2T2(), "Erwin");
				String secondNameR2T2 = clearAndSetValues(PassengerInformationLocators.getlnameR2T2(), "George");
				String fullNameR2T2 = firstNameR2T2 + " " + secondNameR2T2;
				list.add(fullNameR2T2);
				list.add(selectOptionByText(PassengerInformationLocators.getgenderR2T2(), "Male"));
				list.add(clearAndSetValues(PassengerInformationLocators.getdobR2T2(), "01/01/2000"));
			}
			selectOptionByValue(PassengerInformationLocators.getpassportR2T2(), "237|US");
	   }
	   else if(RoomTravelerInfo.equalsIgnoreCase("Room1Child1"))
	   {
			if(TestBase.flag_Mob) {
				String firstNameR1C1 = clearAndSetValues(PassengerInformationLocators.getfnameR1C1Mob(), "Erwin");
				String secondNameR1C1 = clearAndSetValues(PassengerInformationLocators.getlnameR1C1Mob(), "George");
				String fullNameR1C1 = firstNameR1C1 +" "+ secondNameR1C1;
				list.add(fullNameR1C1);
				list.add(selectOptionByText(PassengerInformationLocators.getgenderR1C1Mob(), "Male"));
				list.add(clearAndSetValues(PassengerInformationLocators.getdobR1C1Mob(), "01/01/2000"));
			}
			else {
			String firstNameR1C1 = clearAndSetValues(PassengerInformationLocators.getfnameR1C1(), "Erwin");
			String secondNameR1C1 = clearAndSetValues(PassengerInformationLocators.getlnameR1C1(), "George");
			String fullNameR1C1 = firstNameR1C1 + " " + secondNameR1C1;
			list.add(fullNameR1C1);
			list.add(selectOptionByText(PassengerInformationLocators.getgenderR1C1(), "Male"));
			list.add(clearAndSetValues(PassengerInformationLocators.getdobR1C1(), "01/01/2010"));
			}
			selectOptionByValue(PassengerInformationLocators.getpassportR1C1(), "237|US");
	   }
	   else if(RoomTravelerInfo.equalsIgnoreCase("Room2Child1"))
	   {
			String firstNameR2C1 = clearAndSetValues(PassengerInformationLocators.getfnameR2C1(), "Elvin");
			String secondNameR2C1 = clearAndSetValues(PassengerInformationLocators.getlnameR2C1(), "George");
			String fullNameR2C1 = firstNameR2C1 + " " + secondNameR2C1;
			list.add(fullNameR2C1);
			list.add(selectOptionByText(PassengerInformationLocators.getgenderR2C1(), "Male"));
			list.add(clearAndSetValues(PassengerInformationLocators.getdobR2C1(), "01/01/2000"));
			selectOptionByValue(PassengerInformationLocators.getpassportR2C1(), "237|US");
	   }
	   else if(RoomTravelerInfo.equalsIgnoreCase("Room1Child1SingleTravlr"))
		{
			String firstNameR1C1SingleTravlr=clearAndSetValues(PassengerInformationLocators.getfnameR1C1SingleTrvlr(), "Erwin");
        	String secondNameR1C1SingleTravlr=clearAndSetValues(PassengerInformationLocators.getlnameR1C1SingleTrvlr(), "George");
        	String fullNameR1C1SingleTravlr=firstNameR1C1SingleTravlr +" "+ secondNameR1C1SingleTravlr;
        	list.add(fullNameR1C1SingleTravlr);
    	    list.add(selectOptionByText(PassengerInformationLocators.getgenderR1C1SingleTrvlr(), "Male"));
    		list.add(clearAndSetValues(PassengerInformationLocators.getdobR1C1(), "01/01/2000"));
    		selectOptionByValue(PassengerInformationLocators.getpassportR1C1(), "237|US");
		}
	   else if (RoomTravelerInfo.equalsIgnoreCase("Room2Child1SingleTravlr"))
	  {
		String firstNameR2C1SingleTravlr=clearAndSetValues(PassengerInformationLocators.getfnameR2C1SingleTrvlr(), "Erwin");
    	String secondNameR2C1SingleTravlr=clearAndSetValues(PassengerInformationLocators.getlnameR2C1SingleTrvlr(), "George");
    	String fullNameR2C1SingleTravlr=firstNameR2C1SingleTravlr +" "+ secondNameR2C1SingleTravlr;
    	list.add(fullNameR2C1SingleTravlr);
	    list.add(selectOptionByText(PassengerInformationLocators.getgenderR2C1SingleTrvlr(), "Male"));
		list.add(clearAndSetValues(PassengerInformationLocators.getdobR2C1SingleTrvlr(), "01/01/2000"));
		selectOptionByValue(PassengerInformationLocators.getpassportR2C1SingleTrvlr(), "237|US");
	}
		return list;
	}

	public List<String> fillThirdTravellerDetails_Child(String fnameChild, String lnameChild, String gender, String dobChild,
			String passportInfo) throws Exception {
		List<String> list = new ArrayList<String>();
		String firstName = clearAndSetValues(PassengerInformationLocators.getfnameChild(), fnameChild);
		String secondName = clearAndSetValues(PassengerInformationLocators.getlnameChild(), lnameChild);
		String fullName = firstName + " " + secondName;
		list.add(fullName);
		list.add(selectOptionByText(PassengerInformationLocators.getgenderChild(), gender));
		list.add(clearAndSetValues(PassengerInformationLocators.getdobChild(), dobChild));
		selectOptionByValue(PassengerInformationLocators.getpassportChild(), passportInfo);
		return list;
	
	}

}
