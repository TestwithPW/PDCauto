package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;
import Base.Baseclass;
import POM.BillingDownloadPage;
import POM.BillingInformationPage;
import POM.Dashboard;
import POM.loginpg;
import Utilities.Screenshot;


@Listeners(Utilities.Test_listener.class)

public class TC_BillingInformation  extends Baseclass {
	
	
	
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
		db.billing_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
	}
	
	
	@Test(priority=2)
	public void BillingInfo() throws InterruptedException, IOException, AWTException {
		BillingInformationPage bill = new BillingInformationPage(driver); 
		
		bill.getColumnValues(1);
		Screenshot ss = new Screenshot();
		Thread.sleep(3000);
		ss.captureScreenshot(driver, null);
		driver.quit();
	}
	
	
	
}
