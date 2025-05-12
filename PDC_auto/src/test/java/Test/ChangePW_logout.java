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
import POM.Profilepage;
import POM.loginpg;
import Utilities.Screenshot;

@Listeners(Utilities.Test_listener.class)

public class ChangePW_logout  extends Baseclass {
	
	@Test()
	public void provider_login() throws IOException {
		
		loginpg lgp = new loginpg(driver);
		lgp.enter_username(driver);
		lgp.enter_password();
		lgp.signin_click();
	}
	
	@Test(priority=1)
	public void change_pw() throws InterruptedException, IOException{
		Profilepage pf =new Profilepage(driver);
		Screenshot ss = new Screenshot();
		pf.profile_icon_click();
		ss.captureScreenshot(driver, null);
		Thread.sleep(2000);
		pf.my_profile_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(2000);
		pf.security_setting_click();
		Thread.sleep(2000);
		ss.captureScreenshot(driver, null);
		Thread.sleep(2000);
		pf.Current_pw();
		pf.new_pw();
		pf.confirm_pw();
		ss.captureScreenshot(driver, null);
		pf.change_pw_click();
		ss.captureScreenshot(driver, null);
		Thread.sleep(4000);	
		ss.captureScreenshot(driver, null);
	}
	
	@Test(priority=2)
	public void logout() throws IOException, InterruptedException {
		
		loginpg lgp = new loginpg(driver);
		Profilepage pf =new Profilepage(driver);
		Screenshot ss = new Screenshot();
		lgp.enter_username(driver);
		lgp.enter_password();
		lgp.signin_click();
		Thread.sleep(5000);
		pf.profile_icon_click();
		ss.captureScreenshot(driver, null);
		Thread.sleep(2000);
		pf.my_profile_click();
		ss.captureScreenshot(driver, null);
		Thread.sleep(5000);
		pf.logout_click();
		Thread.sleep(5000);
		ss.captureScreenshot(driver, null);
		driver.quit();
	}
	
	
}
