package Test;

import org.testng.annotations.Listeners;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;
//import java.util.List;

//import javax.swing.text.Utilities;

import Base.Baseclass;
//import POM.AddNurse;
//import POM.BillingInformation;

//import POM.BillingInformationPage;
import POM.Dashboard;

import POM.PatientProfileEnrollment;
import POM.Patient_details_Medical_profile;
//import POM.PatientDetailedViewPage;
import POM.clickOnPatientID;
import POM.loginpg;
import Utilities.Screenshot;


@Listeners(Utilities.Test_listener.class)

public class TC_PatientDetailedView  extends Baseclass {
	
	
	
	@Test()
	public void provider_login() throws IOException {
		
		loginpg lgp = new loginpg(driver);
		lgp.enter_username(driver);
		lgp.enter_password();
		lgp.signin_click();
	}
	
	@Test(priority=1)
	public void dashboard() throws InterruptedException, IOException{
		Dashboard db = new Dashboard(driver);
		db.patientsclick();
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);

	}
	
	
	@Test(priority=2)
	public void patientTab() throws InterruptedException, IOException, AWTException {
		clickOnPatientID pat = new clickOnPatientID(driver);
		pat.getColumnValues(1);
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		
	}
	
	@Test(priority=3)
	public void clickOnPatientProfileTab() throws InterruptedException, IOException, AWTException {
		Patient_details_Medical_profile pat1 = new Patient_details_Medical_profile(driver);
		pat1.patient_profile_click();
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
	
	}
	@Test(priority=4)
	public void medical_profile() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
	
		pd.medical_profile_click();	
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=5)
	public void resutls() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.results_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=6)
	public void notes() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.notes_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
		
	}
	@Test(priority=7)
	public void devices() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.devices_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=8)
	public void patient_profile() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.patient_profile_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=9)
	public void patient_care_team() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
	
		pd.patient_care_team_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=10)
	public void activity_timeline() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.activity_timeline_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=11)
	public void requests() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.requests_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		driver.quit();
	}
	
	
	
}
