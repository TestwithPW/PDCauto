package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver; 
import Base.Baseclass;
import POM.Add_POP_pg;
import POM.Add_Patient_pg;
import POM.Dashboard;
import POM.PCT_tab;
import POM.loginpg;


@Listeners(Utilities.Test_listener.class)
public class Add_Patient  extends Baseclass {
	
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
	public void patient_Tab() {
		
		Add_Patient_pg pat = new Add_Patient_pg(driver);
		pat.Add_patient_click();
		
	}
	@Test (priority=3)
	public void select_POP() throws IOException {
		
		Add_Patient_pg pat = new Add_Patient_pg(driver);
		pat.select_POP_click(driver);
		
		
	
	}
	@Test (priority=4)
	public void add_pat_details1() throws IOException, InterruptedException {
		
		Add_Patient_pg pat = new Add_Patient_pg(driver);

		
		pat.patient_details(driver);
		
	
	}
	@Test (priority=5)
	public void add_Emergency_details1() throws IOException, InterruptedException {
		
		Add_Patient_pg pat = new Add_Patient_pg(driver);
		
		
		pat.emergency_contact_details(driver);
		
	
	}
	@Test (priority=6)
	public void confirm_details1() throws IOException {
		
		Add_Patient_pg pat = new Add_Patient_pg(driver);
		
		
		pat.cofirm_checks_click();
	
	}
	@Test (priority=7)
	public void save_details() throws InterruptedException  {
		
		Add_Patient_pg pat = new Add_Patient_pg(driver);
		pat.Save_button();
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	
}
