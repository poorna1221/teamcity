/*
 * package com.ExtentReporter;
 * 
 * import java.io.IOException;
 * 
 * import org.openqa.selenium.WebDriver; import org.testng.ITestContext; import
 * org.testng.ITestListener; import org.testng.ITestResult;
 * 
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.Status;
 * 
 * public class Listener extends ReporterClass implements ITestListener {
 * 
 * ExtentReports eR = ReporterClass.initializeReport(); ExtentTest eTObj;
 * private static ThreadLocal<ExtentTest> threadObj = new
 * ThreadLocal<ExtentTest>();
 * 
 * public void onTestStart(ITestResult result) { // TODO Auto-generated method
 * stub eTObj = eR.createTest(result.getMethod().getMethodName());
 * threadObj.set(eTObj);
 * 
 * }
 * 
 * public void onTestSuccess(ITestResult result) { // TODO Auto-generated method
 * stub threadObj.get().log(Status.PASS, "Successful"); }
 * 
 * public void onTestFailure(ITestResult result) { // TODO Auto-generated method
 * stub WebDriver driver = null; threadObj.get().fail(result.getThrowable());
 * 
 * Object testInstance = result.getInstance(); Class
 * currentExecutedClassInstance = result.getTestClass().getRealClass(); try {
 * driver = (WebDriver)
 * currentExecutedClassInstance.getDeclaredField("driver").get(testInstance); }
 * catch (Exception e1) { // TODO Auto-generated catch block }
 * 
 * try {
 * threadObj.get().addScreenCaptureFromPath(getScreenshot(result.getMethod().
 * getMethodName(), driver), result.getMethod().getMethodName()); } catch
 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * 
 * }
 * 
 * public void onTestSkipped(ITestResult result) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * public void onTestFailedButWithinSuccessPercentage(ITestResult result) { //
 * TODO Auto-generated method stub
 * 
 * }
 * 
 * public void onStart(ITestContext context) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * public void onFinish(ITestContext context) { // TODO Auto-generated method
 * stub eR.flush(); }
 * 
 * }
 */