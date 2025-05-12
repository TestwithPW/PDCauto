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
public class Add_POP  extends Baseclass {
	
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
		
		PCT_tab pctt = new PCT_tab(driver);
		pctt.AddPOP_click();
//		pctt.POP_details_click(driver);	
	}
	@Test (priority=3)
	public void add_pop_details1() throws IOException {
		
		Add_POP_pg popdt = new Add_POP_pg(driver);

		popdt.POP_details(driver);

		
	}
	
	@Test (priority=4)
	public void select_gender() throws IOException, InterruptedException {
		
		Add_POP_pg popdt = new Add_POP_pg(driver);
		popdt.select_gender();
		
		popdt.Save_button();
		
		
	
	}
	@Test (priority=5)
	public void save_details() throws InterruptedException  {
		
		Add_POP_pg popdt = new Add_POP_pg(driver);
		popdt.Save_button();
		
		
		Thread.sleep(10000);
		driver.quit();
		
	
	}
	
	
	
}
