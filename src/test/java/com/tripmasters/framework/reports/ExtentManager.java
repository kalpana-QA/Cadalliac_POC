package com.tripmasters.framework.reports;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	 private static ExtentReports extent;
	 
	    public synchronized static ExtentReports getReporter() {
	        if (extent == null) {
	            //Set HTML reporting file location
	            String workingDir = System.getProperty("user.dir");
	            //if (System.getProperty("os.name").toLowerCase().contains("win")) {
	               String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	                extent = new ExtentReports(workingDir + "/target/ExtentReports/" + timeStamp + ".html", true);
	                extent.addSystemInfo("User Name", "MySystem");
	                extent.addSystemInfo("ProjectName", "TripMasters");
	                extent.addSystemInfo("Environment", "Android");
	                extent.addSystemInfo("HostOrg", "ImpactQA");
	           // }
//	            else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
//	                extent = new ExtentReports(workingDir + "/test-output/ExtentReportResults.html", true);
//	            }
	                
	        }
	        return extent;
	    }
}
