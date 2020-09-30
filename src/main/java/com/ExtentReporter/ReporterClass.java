package com.ExtentReporter;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReporterClass {
	
	static ExtentReports eR;
	
	public static ExtentReports initializeReport()
	{

		
		String reportPath = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter esp = new ExtentSparkReporter(reportPath);
		
		esp.config().setReportName("TestNG and ExtentReport");
		esp.config().setDocumentTitle("Test Automation Execution Results");
		
		eR= new ExtentReports();
		eR.attachReporter(esp);
		eR.setSystemInfo("Tester","PoornaChandraRao");
		
		return eR;
	}
	

public String getScreenshot(String TestCaseName,WebDriver driver) throws IOException
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File sourceImage = ts.getScreenshotAs(OutputType.FILE);
	String destPath = System.getProperty("user.dir")+"\\Screenshots"+TestCaseName+".png";
	File destScreenshot = new File(destPath);
	FileUtils.copyFile(sourceImage, destScreenshot);
	return destPath;
	
}

}
