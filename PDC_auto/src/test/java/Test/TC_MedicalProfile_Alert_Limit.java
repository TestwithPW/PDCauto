package Test;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;


import Base.Baseclass;

import POM.Dashboard;
import POM.MedicalProfilePage;
import POM.Patient_details_Medical_profile;
import POM.clickOnPatientID;
import POM.loginpg;
import Utilities.Screenshot;


@Listeners(Utilities.Test_listener.class)

public class TC_MedicalProfile_Alert_Limit  extends Baseclass {
	
	
	
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
		pat1.medical_profile_click();
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
	
	}		
	
	@Test(priority=4)
	public void personalizedMedicalProfile() throws InterruptedException, IOException, AWTException {
		MedicalProfilePage medicalProfile = new MedicalProfilePage(driver);
		medicalProfile.enterVitalLimits();
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		driver.quit();
	
	}
	
}
