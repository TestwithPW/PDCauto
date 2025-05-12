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


@Listeners(Utilities.Test_listener.class)
public class Medical_profile_Notifylist  extends Baseclass {
	
	@Test()
	public void provider_login() throws IOException {
		
		loginpg lgp = new loginpg(driver);
		lgp.enter_username(driver);
		lgp.enter_password();
		lgp.signin_click();
	}
	
	@Test(priority=1)
	public void dashboard() throws InterruptedException{
		Dashboard db = new Dashboard(driver);
		db.patientsclick();
		Thread.sleep(5000);

	}
	
	@Test(priority=2)
	public void Add_members_Notify_list() throws InterruptedException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		pd.patientid_click();
		Thread.sleep(2000);
		pd.medical_profile_click();
		pd.notify_list_click();
		pd.Add_new_click();
		pd.Add_by_email();
		pd.Check_to_Add_new_click();
		Thread.sleep(2000);
		pd.Save_list_click();
		Thread.sleep(2000);
		pd.Save_cancle_click();
		Thread.sleep(2000);
		pd.Save_list_click();
		Thread.sleep(2000);
		pd.Save_ok_click();
	}
	
	@Test(priority=3)
	public void remove_notify_list() throws InterruptedException {
	
		Patient_details_Medical_profile pd = new Patient_details_Medical_profile(driver);
		pd.remove_click();
		Thread.sleep(2000);
		pd.remove_cancle_click();
		Thread.sleep(2000);
		pd.remove_click();
		Thread.sleep(2000);
		pd.remove_cnf_click();
		driver.quit();
		
	}
	
	
}
