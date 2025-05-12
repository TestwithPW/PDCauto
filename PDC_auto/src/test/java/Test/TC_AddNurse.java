package Test;

import org.testng.annotations.Listeners;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.IOException;
//import java.util.List;

import Base.Baseclass;
//import POM.AddNurse;
import POM.AddNurseButton;
import POM.AddNursePage;
//import POM.BillingInformation;
import POM.Dashboard;
import POM.loginpg;


@Listeners(Utilities.Test_listener.class)

public
class TC_AddNurse  extends Baseclass {
	
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
		db.nurseclick();
		Thread.sleep(3000);

	}

	
	@Test(priority=2)
	public void AddNurseTab() {
		AddNurseButton nurs = new AddNurseButton(driver);
		nurs.nurseClick();
		System.out.println("Clicked on Add Staff Tab");
	}	
	
	@Test(priority=3)
	public void AddNurseFlow() throws IOException, AWTException, InterruptedException {
		System.out.println("Nurse Onboarding");
		AddNursePage nurse = new AddNursePage(driver);
		nurse.nurseOnboard();
		driver.quit();
	}	
	
		
	
	
}
