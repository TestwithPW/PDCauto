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

public class TC_Unenroll_ReEnroll  extends Baseclass {
	
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
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		db.patientsclick();
		Thread.sleep(5000);	
	
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
		Thread.sleep(5000);
	
}
	
	@Test(priority=4, enabled=true)
	public void unEnrollPatient() throws InterruptedException, IOException, AWTException {
		PatientProfileEnrollment unenroll = new PatientProfileEnrollment(driver);
		unenroll.unEnrollPatientPage();
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		
		Thread.sleep(10000);
	
}
	
	@Test(priority=5)
	public void reEnrollPatient() throws InterruptedException, IOException, AWTException {
		PatientProfileEnrollment reenroll = new PatientProfileEnrollment(driver);
		reenroll.reEnrollPatientPage(driver);
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		driver.quit();
	
	}
	
}
