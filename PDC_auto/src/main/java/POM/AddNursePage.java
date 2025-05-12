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

public class AddNursePage {

	@FindBy(xpath ="//button[@data-testid='add-nurse-button-id']")private WebElement addNurseButton;
	@FindBy(xpath ="//input[@data-testid='nurse-first-name-input-id']")private WebElement firstName;
	@FindBy(xpath= "//input[@data-testid='nurse-last-name-input-id']")private WebElement lastName;
	@FindBy(xpath ="//input[@data-testid='nurse-phone-input-id']")private WebElement phNo;
	@FindBy(xpath = "//input[@data-testid='nurse-email-input-id']")private WebElement emailID;
	@FindBy(xpath = "//input[@data-testid='nurse-birthday-date-picker-id']")private WebElement dob;
	@FindBy(xpath = "//div[@data-testid='nurse-gender-select-id']")private WebElement gender;
	@FindBy(xpath = "//input[@data-testid='nurse-license-number-input-id']")private WebElement licenseNumber;
	@FindBy(xpath ="//input[@data-testid='nurse-job-title-input-id']")private WebElement jobTitle;
	@FindBy(xpath = "//textarea[@data-testid='nurse-address-line-1-input-id']")private WebElement addressLine1;
	@FindBy(xpath = "//textarea[@data-testid='nurse-address-line-2-input-id']")private WebElement addressLine2;
	@FindBy(xpath = "//input[@data-testid='nurse-state-input-id']")private WebElement state;
	@FindBy(xpath = "//input[@data-testid='nurse-city-input-id']")private WebElement city;
	@FindBy(xpath = "//input[@data-testid='nurse-zip-code-input-id']")private WebElement zipCode;
	@FindBy(xpath ="//button[@data-testid='create-nurse-button-id']")private WebElement submit;
	@FindBy(xpath ="//button[@data-testid='cancel-create-nurse-button-id']")private WebElement cancelButton;
	
	public static Properties pr = new Properties();
	public static FileReader fr;
	
	
	public AddNursePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void addNurseButton() {
		addNurseButton.click();
	}
	
	public void nurseOnboard() throws IOException, AWTException, InterruptedException {
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\addnurse.properties");
		pr.load(fr);
		
		
		Robot rb = new Robot();
		Thread.sleep(2000);
		firstName.sendKeys(pr.getProperty("FirstName"));
		lastName.sendKeys(pr.getProperty("LastName"));
		dob.click();
		dob.sendKeys(pr.getProperty("DOB"));
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
		//rb.keyPress(KeyEvent.VK_DOWN);
		//rb.keyRelease(KeyEvent.VK_DOWN);
		String gndr = pr.getProperty("Gender");
		gender.click();
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
		phNo.sendKeys(pr.getProperty("PhNo"));
		emailID.sendKeys(pr.getProperty("EmailID"));
		licenseNumber.sendKeys(pr.getProperty("LicenseNumber"));
	/*	String title = pr.getProperty("JobTitle");
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
		*/
		
		jobTitle.sendKeys(pr.getProperty("JobTitle"));
		
		//jobTitle.sendKeys(pr.getProperty("JobTitle"));
		addressLine1.sendKeys(pr.getProperty("AddressLine1"));
		addressLine2.sendKeys(pr.getProperty("AddressLine2"));
		state.sendKeys(pr.getProperty("State"));
		city.sendKeys(pr.getProperty("City"));
		Thread.sleep(2000);
		zipCode.sendKeys(pr.getProperty("ZipCode"));
		submit.click();
		System.out.println("Nurse Onboarded Successfully");
		
		
		
		
	}
	
	
}
