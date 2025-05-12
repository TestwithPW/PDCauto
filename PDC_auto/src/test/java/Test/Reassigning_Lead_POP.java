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

public class Reassigning_Lead_POP  extends Baseclass {
	
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
//		Screenshot ss = new Screenshot();
		Thread.sleep(2000);
////		ss.captureScreenshot(driver, null);
////		Thread.sleep(5000);
	}
	@Test(priority=2)
	public void View_patient_details() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.patientid_click();
		Thread.sleep(2000);
//		ss.captureScreenshot(driver, null);
//		Thread.sleep(5000);
	}
	
	@Test(priority=3)
	public void patient_care_team() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
	
		pd.patient_care_team_click();
		Thread.sleep(2000);
//		ss.captureScreenshot(driver, null);
//		Thread.sleep(5000);
	}
	@Test(priority=4)
	public void Assign_lead_POP() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		pd.reassign_click();
		Thread.sleep(2000);
		pd.name_dropdown_click();
		Thread.sleep(2000);
		pd.select_pop_dd_click();
		pd.add_note_reassign_pop();
		
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		pd.cancle_pop_click();
		Thread.sleep(2000);
		
		pd.reassign_click();
		Thread.sleep(2000);
		pd.name_dropdown_click();
		
		pd.select_pop_dd_click();
		pd.add_note_reassign_pop();
		
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		pd.save_pop_click();
		
		Thread.sleep(15000);
		ss.captureScreenshot(driver, null);
	
	}
	@Test(priority=5)
	public void Assign_Sec_POP() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		
		pd.Assign_sec_pop_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		pd.Enter_pop_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		
		
		Thread.sleep(2000);
		
		pd.Select_sec_pop_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		pd.Cancle_sec_pop_click();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		
		pd.Assign_sec_pop_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		pd.Enter_pop_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		
		
		Thread.sleep(2000);
		
		pd.Select_sec_pop_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		pd.Save_sec_pop_click();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
	}
	
	@Test(priority=6)
	public void Unassign_Sec_POP() throws InterruptedException, IOException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		Screenshot ss = new Screenshot();
		
		Thread.sleep(5000);
		pd.Options_sec_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		
		pd.unassign_sec_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		pd.unassign_Cle_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		
		
		pd.Options_sec_click();
		Thread.sleep(2000);
		
		pd.unassign_sec_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		pd.unassign_OK_click();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		driver.quit();
	}

	
}
