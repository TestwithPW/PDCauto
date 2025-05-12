package Test;

import org.testng.annotations.Listeners;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;

import Base.Baseclass;
import POM.AddStaffButton;
import POM.Dashboard;
import POM.ProviderStaffPage;
import POM.loginpg;
//import utilities.ScreenShot;

@Listeners(Utilities.Test_listener.class)

public class TC_AddProviderStaff  extends Baseclass {
	
	
	
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
		Thread.sleep(3000);
		db.staffclick();   
		Thread.sleep(3000);
	}

	
	@Test(priority=2)
	public void AddStaffButtonClick() {
		AddStaffButton stf = new AddStaffButton(driver);
		stf.staffclick();
		System.out.println("Clicked on Add Staff Tab");
	}	
	
	@Test(priority=3)
	public void AddStaffFlow() throws IOException, AWTException, InterruptedException {
		ProviderStaffPage staff = new ProviderStaffPage(driver);
		staff.staffOnboard();
		System.out.println("Nurse Onboarding");
		Thread.sleep(10000);
		driver.quit();
	}	
	
		
	
	
}
