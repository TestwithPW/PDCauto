package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {
	

	@FindBy(xpath ="//span[contains(text(),'Primary Care Team')]")private WebElement Primary_Care_teamtab;
	@FindBy(xpath ="//span[contains(text(),'Patients')]")private WebElement patientstab;
	@FindBy(xpath ="//span[contains(text(),'Nurses')]")private WebElement Nursetab;
	@FindBy(xpath ="//span[contains(text(),'Staff')]")private WebElement stafftab;
	@FindBy(xpath ="//span[contains(text(),'Allotted Devices')]")private WebElement Allotted_devicestab;
	@FindBy(xpath ="//span[contains(text(),'Billing')]")private WebElement billingtab;
	@FindBy(xpath ="//span[contains(text(),'Requests')]")private WebElement requeststab;
	@FindBy(xpath ="//span[contains(text(),'Activity Logs')]")private WebElement activityLogs;
	
	public Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void PCTclick() {
		Primary_Care_teamtab.click();
	}
	
	public void patientsclick() {
		patientstab.click();
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
	
	public void activityLogsTab() {
		activityLogs.click();
	}


}
