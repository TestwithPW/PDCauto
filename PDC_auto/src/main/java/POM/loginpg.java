package POM;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpg {
	
	@FindBy(xpath ="//input[@data-testid='login-username-input-id']")private WebElement email_ph;
	@FindBy(xpath ="//input[@data-testid='login-password-input-id']")private WebElement password;
	@FindBy(xpath ="//button[@data-testid='signin-button-id']")private WebElement login;
	
	
	
	
	
	
	public loginpg(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void enter_username(WebDriver driver) throws IOException {
		
	
		email_ph.sendKeys("testeng682+stgpro@gmail.com");
	}
	
	public void enter_password() {
		password.sendKeys("Test@1234");
	}
	
	public void signin_click() {
		login.click();
	}
	

}
