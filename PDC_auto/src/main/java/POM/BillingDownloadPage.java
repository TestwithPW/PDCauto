package POM;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingDownloadPage {
	
@FindBy(xpath = "//li[@data-menu-id='rc-menu-uuid-56585-4-billing']")private WebElement billingTab;
	
	@FindBy(xpath ="//input[@placeholder='Select month']")private WebElement calendar;
	@FindBy(xpath = "//div[contains(text(),'Jan')]")private WebElement january;
	@FindBy(xpath = "//div[contains(text(),'Feb')]")private WebElement February;
	@FindBy(xpath = "//div[contains(text(),'Mar')]")private WebElement March;
	@FindBy(xpath = "//div[contains(text(),'Apr')]")private WebElement April;
	@FindBy(xpath = "//div[contains(text(),'May')]")private WebElement May;
	@FindBy(xpath = "//div[contains(text(),'Jun')]")private WebElement June;
	@FindBy(xpath = "//div[contains(text(),'Jul')]")private WebElement July;
	@FindBy(xpath = "//div[contains(text(),'Aug')]")private WebElement August;
	@FindBy(xpath = "//div[contains(text(),'Sep')]")private WebElement September;
	@FindBy(xpath = "//div[contains(text(),'Oct')]")private WebElement October;
	@FindBy(xpath = "//div[contains(text(),'Nov')]")private WebElement November;
	@FindBy(xpath = "//div[contains(text(),'Dec')]")private WebElement December;
	
	@FindBy(xpath = "//button[@data-testid='add-patient-button']")private WebElement download;
	
	
	public static Properties pr = new Properties();
	public static FileReader fr;
	
	
	public BillingDownloadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	
	
	public void chooseMonth() throws IOException, InterruptedException {
		
		
		calendar.click();
		
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\billing.properties");
		pr.load(fr);
		
		Thread.sleep(2000);
		String month = pr.getProperty("Month");
		if(month.equalsIgnoreCase("January")) {
			january.click();
		}
		else if(month.equalsIgnoreCase("February")) {
			February.click();
		} 
		else if(month.equalsIgnoreCase("March")) {
			March.click();
		}
		else if(month.equalsIgnoreCase("April")) {
			April.click();
		}
		else if(month.equalsIgnoreCase("May")) {
			May.click();
		}
		
		Thread.sleep(2000);
		download.click();
		
	}
	/*public void request_click(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(requeststab));
		
		requeststab.click();
	*/
}
