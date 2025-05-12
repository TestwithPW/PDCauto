package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver; 
import Base.Baseclass;
import POM.Add_ECP_PCP;
import POM.Add_POP_pg;
import POM.Dashboard;
import POM.PCT_tab;
import POM.Patient_details_Medical_profile;
import POM.loginpg;
import Utilities.Screenshot;

@Listeners(Utilities.Test_listener.class)

public class Reassigning_PCP_ECP  extends Baseclass {
	
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
	@Test(priority=4,  enabled=true)
	public void Assign_new_ECP_by_Add_new() throws InterruptedException, IOException {
	
		Add_ECP_PCP ecp = new Add_ECP_PCP(driver);
		Screenshot ss = new Screenshot();
		ecp.Aassign_click();
		Thread.sleep(2000);
		ecp.Add_new_PCP_click();
		
		Thread.sleep(2000);
		ecp.Add_PCP_ECP_details();
		
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		ecp.Save_pcp_click();
		
		
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
	
	}
	@Test(priority=5,  enabled=true)
	public void Reassign_PCP_existing() throws InterruptedException, IOException {
	
		Add_ECP_PCP ecp = new Add_ECP_PCP(driver);
		Screenshot ss = new Screenshot();
		
		ecp.reassign_pcp_click();
		Thread.sleep(2000);
		ecp.pcp_dropdown_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		ecp.select_pcp_from_dropdown();
		Thread.sleep(2000);
		ecp.reassign_Save_pcp_click(driver);
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		
	
		
	}
	@Test(priority=6, enabled=true)
	public void Reassign_PCP_Add_new() throws InterruptedException, IOException {
	
		Add_ECP_PCP ecp = new Add_ECP_PCP(driver);
		Screenshot ss = new Screenshot();
		
		ecp.reassign_pcp_click();
		Thread.sleep(2000);
		ecp.Add_new_PCP_click();
		ss.captureScreenshot(driver, null);
		Thread.sleep(2000);
		ecp.Add_PCP_ECP_details2();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		ecp.Save_pcp_click();
		driver.quit();
	
		
	}
	
	

	
}
