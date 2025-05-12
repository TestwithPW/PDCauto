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
import POM.BillingDownloadPage;
//import POM.BillingInformation;
//import POM.BillingInformation2;
import POM.Dashboard;
//import POM.PCT_tab;
import POM.loginpg;
//import utilities.ScreenShot;

@Listeners(Utilities.Test_listener.class)

public class TC_BillingPatientDownload  extends Baseclass {
	
	
	
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

		db.billing_click();
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority=2)
	public void Billing() throws InterruptedException, IOException, AWTException {
		BillingDownloadPage bill = new BillingDownloadPage(driver);
		Thread.sleep(5000);
		bill.chooseMonth();
		driver.quit();
	}
	
		
		
		
	
	
	
	
}
