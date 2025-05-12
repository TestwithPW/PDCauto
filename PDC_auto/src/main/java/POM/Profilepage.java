package POM;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profilepage {
	
	@FindBy(xpath ="//button[@data-testid='profile-menu-button-id']")private WebElement profile_icon;
	@FindBy(xpath ="//span[contains(text(),'My Profile')]")private WebElement my_profile;            
	@FindBy(xpath ="/html/body/div[2]/div/ul/li[2]")private WebElement logout_navbar;
	@FindBy(xpath ="//span[contains(text(),'Security Settings')]")private WebElement security_settings;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/form/div/div[2]/div[1]/div/div[2]/div/div/span/input")private WebElement current_pw;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/form/div/div[2]/div[2]/div[1]/div[2]/div[1]/div/span/input")private WebElement new_pw;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div/div/form/div/div[2]/div[3]/div/div[2]/div/div/span/input")private WebElement confirm_pw;
	@FindBy(xpath ="//button[@data-testid='change-password-button-id']")private WebElement change_pw;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/aside/div/ul/li[4]")private WebElement logout_sidebar;
	
	public Profilepage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void profile_icon_click(){
		profile_icon.click();
	}
	
	public void my_profile_click() {
		my_profile.click();
	}
	
	public void logout_navbar_click() {
		logout_navbar.click();
	}
	public void security_setting_click() {
		security_settings.click();
	}
	public void Current_pw() {
		current_pw.sendKeys("Test@1234");
	}
	public void new_pw() {
		new_pw.sendKeys("Test@1234");
	}
	public void confirm_pw() {
		confirm_pw.sendKeys("Test@1234");
	}
	
	public void change_pw_click() {
		change_pw.click();
	}
	
	public void logout_click() {
		logout_sidebar.click();
	}
}
