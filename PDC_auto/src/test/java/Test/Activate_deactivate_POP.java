package Test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver; 
import Base.Baseclass;
import POM.Add_POP_pg;
import POM.Dashboard;
import POM.PCT_tab;
import POM.loginpg;


@Listeners(Utilities.Test_listener.class)
public class Activate_deactivate_POP  extends Baseclass {
	
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
		db.PCTclick();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void POP_Tab() {
		
		Add_POP_pg popdt = new Add_POP_pg(driver);
		popdt.POP_details_click(driver);	
	}
	@Test (priority=3)
	public void deactivate() throws IOException, InterruptedException {
		
		Add_POP_pg popdt = new Add_POP_pg(driver);
		popdt.deactivate_button();
		Thread.sleep(2000);
		popdt.cancel_de_button();
		Thread.sleep(2000);
		popdt.deactivate_button();
		Thread.sleep(2000);
		popdt.confirm_de_button();
		Thread.sleep(10000);
	}
	
	@Test (priority=4)
	public void reactivate() throws IOException, InterruptedException {
		
		Add_POP_pg popdt = new Add_POP_pg(driver);
		popdt.reactivate_button();
		Thread.sleep(2000);
		popdt.cancel_re_button();
		Thread.sleep(2000);
		popdt.reactivate_button();
		Thread.sleep(2000);
		popdt.confirm_re_button();
		Thread.sleep(10000);
	}
	@Test (priority=5)
	public void archive() throws IOException, InterruptedException {
		
		Add_POP_pg popdt = new Add_POP_pg(driver);
		popdt.deactivate_button();
		Thread.sleep(2000);
		popdt.confirm_de_button();
		Thread.sleep(10000);
		popdt.archieve_button();
		Thread.sleep(2000);
		popdt.cancel_ar_button();
		Thread.sleep(2000);
		popdt.archieve_button();
		Thread.sleep(2000);
		popdt.confirm_ar_button();
		driver.quit();
	}
	
	
	
}
