package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver; 
import Base.Baseclass;
import POM.Add_POP_pg;
import POM.Dashboard;
import POM.PCT_tab;
import POM.Patient_details_Medical_profile;
import POM.loginpg;
import Utilities.Screenshot;

@Listeners(Utilities.Test_listener.class)

public class View_patient_profile  extends Baseclass {
	
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
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void View_patient_details() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.patientid_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
//		pd.medical_profile_click();
//		Thread.sleep(5000);
//		ss.captureScreenshot(driver, null);
//		Thread.sleep(5000);
//		pd.results_click();
//		Thread.sleep(5000);
//		ss.captureScreenshot(driver, null);
//		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void medical_profile() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
	
		pd.medical_profile_click();	
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=4)
	public void resutls() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.results_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=5)
	public void notes() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.notes_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
		
	}
	@Test(priority=6)
	public void devices() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.devices_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=7)
	public void patient_profile() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.patient_profile_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=8)
	public void patient_care_team() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
	
		pd.patient_care_team_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=9)
	public void activity_timeline() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.activity_timeline_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
	}
	@Test(priority=10)
	public void requests() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.requests_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		driver.quit();
	}
	
}
