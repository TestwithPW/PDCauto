package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProviderStaffPage {

	@FindBy(xpath ="//button[@data-testid='add-staff-button-id']")private WebElement addStaff;
	@FindBy(xpath ="//input[@data-testid='staff-first-name-input-id']")private WebElement firstName;
	@FindBy(xpath= "//input[@data-testid='staff-last-name-input-id']")private WebElement lastName;
	@FindBy(xpath ="//input[@data-testid='staff-phone-input-id']")private WebElement phNo;
	@FindBy(xpath = "//input[@data-testid='staff-email-input-id']")private WebElement emailID;
	@FindBy(xpath = "//input[@data-testid='staff-birthday-date-picker-id']")private WebElement dob;
	@FindBy(xpath = "//div[@data-testid='staff-gender-select-id']")private WebElement gender;
	@FindBy(xpath = "//input[@data-testid='staff-license-number-input-id']")private WebElement licenseNumber;
	@FindBy(xpath ="//div[@data-testid='staff-job-title-select-id']")private WebElement jobTitle;
	@FindBy(xpath = "//textarea[@data-testid='staff-address-line-1-input-id']")private WebElement addressLine1;
	@FindBy(xpath = "//textarea[@data-testid='staff-address-line-2-input-id']")private WebElement addressLine2;
	@FindBy(xpath = "//input[@data-testid='staff-state-input-id']")private WebElement state;
	@FindBy(xpath = "//input[@data-testid='staff-city-input-id']")private WebElement city;
	@FindBy(xpath = "//input[@data-testid='staff-zip-code-date-picker-id']")private WebElement zipCode;
	@FindBy(xpath ="//button[@data-testid='create-staff-button-id']")private WebElement submit;
	@FindBy(xpath ="//button[@data-testid='cancel-create-staff-button-id']")private WebElement cancel;
	
	public static Properties pr = new Properties();
	public static FileReader fr;
	
	
	public ProviderStaffPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	
	public void staffOnboard() throws IOException, AWTException, InterruptedException {
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\providerstaff.properties");
		pr.load(fr);
		addStaff.click();
		System.out.println("Clicked on Add Staff Tab");
		Thread.sleep(2000);
		
		firstName.sendKeys(pr.getProperty("FirstName"));
		lastName.sendKeys(pr.getProperty("LastName"));
		//dob.click();
		//dob.sendKeys(pr.getProperty("DOB"));
		Robot rb = new Robot();
		//rb.keyPress(KeyEvent.VK_DOWN);
		//rb.keyRelease(KeyEvent.VK_DOWN);
		gender.click();
		String gndr = pr.getProperty("Gender");
		if(gndr.equalsIgnoreCase("Male"))
		{
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		else if(gndr.equalsIgnoreCase("Female")) {
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		else if(gndr.equalsIgnoreCase("Others")) {
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
	/*	rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		gender.click();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER); */
		phNo.sendKeys(pr.getProperty("PhNo"));
		emailID.sendKeys(pr.getProperty("EmailID"));
		licenseNumber.sendKeys(pr.getProperty("LicenseNumber"));
		String title = pr.getProperty("JobTitle");
		System.out.println("JobTitle is "+title);
		jobTitle.click();
		if(title.equalsIgnoreCase("SubAdmin"))
		{
			System.out.println("JobTitle is "+title);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		else if(title.equalsIgnoreCase("Biller")) {
			System.out.println("JobTitle is "+title);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		else if(title.equalsIgnoreCase("Staff")) {
			System.out.println("JobTitle is "+title);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		
		
		//jobTitle.sendKeys(pr.getProperty("JobTitle"));
		addressLine1.sendKeys(pr.getProperty("AddressLine1"));
		addressLine2.sendKeys(pr.getProperty("AddressLine2"));
		state.sendKeys(pr.getProperty("State"));
		city.sendKeys(pr.getProperty("City"));
		Thread.sleep(2000);
		zipCode.sendKeys(pr.getProperty("ZipCode"));
		submit.click();
		
	}
	
	
}
