package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;

import Base.Baseclass;

import POM.AddingNotesToPatientPage;

import POM.Dashboard;

import POM.PatientProfileEnrollment;
import POM.Patient_details_Medical_profile;

import POM.clickOnPatientID;
import POM.loginpg;
import Utilities.Screenshot;


@Listeners(Utilities.Test_listener.class)

public class TC_ViewNotesAdded  extends Baseclass {
	
	
	
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
	public void clickOnNotesTab() throws InterruptedException, IOException, AWTException {
		Patient_details_Medical_profile pat1 = new Patient_details_Medical_profile(driver);
		pat1.notes_click();
		Thread.sleep(3000);
	
}
	
	@Test(priority=4)
	public void viewNotes() throws InterruptedException, IOException, AWTException {
		AddingNotesToPatientPage notes = new AddingNotesToPatientPage(driver);
		notes.viewNewReadingNote();
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		notes.viewNewCallNote();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		notes.viewdNewGeneralNote();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
	
	driver.quit();
	}
	
}
