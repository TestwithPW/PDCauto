package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver; 
import Base.Baseclass;
import POM.Add_ECP_pg;
import POM.Add_POP_pg;
import POM.Dashboard;
import POM.PCT_tab;

import POM.loginpg;
import Utilities.Screenshot;

@Listeners(Utilities.Test_listener.class)

public class Add_ECP  extends Baseclass {
	
	@Test()
	public void provider_login() throws IOException {
		Screenshot ss = new Screenshot();
		loginpg lgp = new loginpg(driver);
		lgp.enter_username(driver);
		lgp.enter_password();
		lgp.signin_click();
	}
	
	@Test(priority=1)
	public void dashboard() throws InterruptedException{
		Dashboard db = new Dashboard(driver);
		db.PCTclick();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void ECP_Tab() {
		
		PCT_tab pctt = new PCT_tab(driver);
		pctt.ECP_tab_click();
		pctt.AddECP_click();
		
	}
	
	@Test(priority=3)
	public void Add_ECP_details() throws IOException, InterruptedException {
		
		Add_ECP_pg ecppg = new Add_ECP_pg(driver);
		Screenshot ss = new Screenshot();
		ecppg.ecp_details(driver);

		ss.captureScreenshot(driver, null);
		
		ecppg.Save_button();
		Thread.sleep(5000);
		
		ss.captureScreenshot(driver, null);
		driver.quit();
		
	}
	
	
}
