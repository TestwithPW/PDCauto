package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PCT_tab {
	
	@FindBy(xpath ="//button[@data-testid='add-primary-ordering-provider-button-id']")private WebElement Add_POP;
	@FindBy(xpath ="//div[@data-node-key='externalCareProviders']")private WebElement ECP_tab;
	@FindBy(xpath ="//button[@data-testid='add-external-care-provider-button-id']")private WebElement Add_ECP;
	
	@FindBy(xpath ="/html/body/div/div/div/header/div[1]/div[1]/div[3]/ul/li[4]")private WebElement Nursetab;
	@FindBy(xpath ="/html/body/div/div/div/header/div[1]/div[1]/div[3]/ul/li[5]")private WebElement stafftab;
	@FindBy(xpath ="/html/body/div/div/div/header/div[1]/div[1]/div[3]/ul/li[6]")private WebElement Allotted_devicestab;
	@FindBy(xpath ="/html/body/div/div/div/header/div[1]/div[1]/div[3]/ul/li[7]")private WebElement billingtab;
	@FindBy(xpath ="/html/body/div/div/div/header/div[1]/div[1]/div[3]/ul/li[8]")private WebElement requeststab;
	
	public PCT_tab(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void AddPOP_click() {
		Add_POP.click();
	}
	
	
	
	public void nurseclick() {
		Nursetab.click();
	}
	
	public void staffclick() {
		stafftab.click();
	}
	
	public void Allotted_device_click() {
		Allotted_devicestab.click();
	}
	
	public void billing_click() {
		billingtab.click();
	}
	
	public void request_click(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(requeststab));
		
		requeststab.click();
	}
	
	public void ECP_tab_click() {
		ECP_tab.click();
	}
	public void AddECP_click() {
		Add_ECP.click();
	}
	
	
	

}
