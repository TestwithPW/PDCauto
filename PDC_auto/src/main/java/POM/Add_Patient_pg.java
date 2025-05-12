package POM;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Patient_pg {
	
@FindBy(xpath ="//button[@data-testid='add-patient-button-id']")private WebElement Add_pat_btn;
	
	// /html/body/div[1]/div/div/div/main/div/div[2]/form/div[1]/div/div[1]/div[2]/div[1]/div/div/div/span[1]/input
	
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div[2]/form/div[1]/div/div[1]/div[2]/div[1]/div/div/div/span[1]/input")private WebElement select_POP;
	@FindBy(xpath ="//div[contains(text(),'Grace Penningtone')]")private WebElement Adam;
	// /html/body/div[2]/div/div/div[2]/div/div/div/div[1]/div
	@FindBy(xpath ="//input[@data-testid='patient-first-name-input-id']")private WebElement first_name;
	@FindBy(xpath ="//input[@data-testid='patient-last-name-input-id']")private WebElement last_name;
	@FindBy(xpath ="//input[@data-testid='patient-birthday-date-picker-id']")private WebElement date;
	@FindBy(xpath ="//div[@data-testid='patient-gender-select-id']")private WebElement gender_dropdown;
	@FindBy(xpath ="//div[contains(text(),'Male')]")private WebElement male;
	@FindBy(xpath ="//input[@data-testid='patient-phone-input-id']")private WebElement phone_no;
	@FindBy(xpath ="//input[@data-testid='patient-email-input-id']")private WebElement emailid;
	@FindBy(xpath ="//textarea[@data-testid='patient-address-line-1-input-id']")private WebElement Address1;
	@FindBy(xpath ="//textarea[@data-testid='patient-address-line-2-input-id']")private WebElement Address2;
	@FindBy(xpath ="//input[@data-testid='patient-state-input-id']")private WebElement state;
	@FindBy(xpath ="//input[@data-testid='patient-city-input-id']")private WebElement city;
	@FindBy(xpath ="//input[@data-testid='patient-zip-code-input-id']")private WebElement zip_code;
	@FindBy(xpath ="//input[@data-testid='guardian-first-name-input-id']")private WebElement Emergency_first_name;
	@FindBy(xpath ="//input[@data-testid='guardian-last-name-input-id']")private WebElement Emergency_last_name;
	@FindBy(xpath ="//div[@data-testid='guardian-patient-relation-select-id']")private WebElement Emergency_gender;
	@FindBy(xpath ="/html/body/div[5]/div/div/div[2]/div/div/div/div[1]/div")private WebElement Emergency_legal_gaurdian;
	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div[2]/form/div[3]/div[2]/div[4]/div/div[2]/div/div/div/input")private WebElement Emergency_phone_no;
	
	@FindBy(xpath ="//input[@data-testid='enrolment-confirm-remote-bpm']")private WebElement confirm_check1;
	@FindBy(xpath ="//input[@data-testid='enrolment-confirm-remote-bpm-receive']")private WebElement confirm_check2;
	@FindBy(xpath ="//input[@data-testid='enrolment-confirm-add-patient-regardless-billing']")private WebElement confirm_check3;

	@FindBy(xpath ="//button[@data-testid='create-patient-button-id']")private WebElement save_btn;
	@FindBy(xpath ="//button[@data-testid='cancel-create-patient-button-id']")private WebElement cancel_btn;

	public static Properties pr = new Properties();
	public static FileReader fr;
	
	public Add_Patient_pg(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	public void select_POP_click(WebDriver driver) {
		
		
		select_POP.click();
		Adam.click();
	}
	
	public void patient_details(WebDriver driver) throws IOException, InterruptedException {
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\Patient.properties");
		pr.load(fr);
		
//		select_POP.sendKeys(pr.getProperty("POP"));
		first_name.sendKeys(pr.getProperty("First_Name"));
		last_name.sendKeys(pr.getProperty("Last_Name"));
//		date.click();  
		date.sendKeys(pr.getProperty("Date"));
		emailid.sendKeys(pr.getProperty("emailid"));
		phone_no.sendKeys(pr.getProperty("Phone_no"));	
		Address1.sendKeys(pr.getProperty("Address1"));
		Address2.sendKeys(pr.getProperty("Address2"));
		state.sendKeys(pr.getProperty("State"));
		city.sendKeys(pr.getProperty("City"));
		zip_code.sendKeys(pr.getProperty("ZipCode"));
		gender_dropdown.click();
		Thread.sleep(2000);
		male.click();
		
			
	}
	public void emergency_contact_details(WebDriver driver) throws IOException, InterruptedException {
		FileReader fr = new FileReader("D:\\Automation New\\Workspace\\ProviderPortalAuto\\src\\test\\resources\\Properties\\Patient.properties");
		pr.load(fr);
		
		
		Emergency_first_name.sendKeys(pr.getProperty("E_First_name"));
		Emergency_last_name.sendKeys(pr.getProperty("E_last_name"));
		Emergency_phone_no.sendKeys(pr.getProperty("E_phone_no"));
		Emergency_gender.click();
		Thread.sleep(2000);
		Emergency_legal_gaurdian.click();			
	}
	
	
	
	public void cofirm_checks_click() {
		confirm_check1.click();
		confirm_check2.click();
		confirm_check3.click();
	}
	
	public void Add_patient_click() {
		Add_pat_btn.click();
	}
	
	
	public void Save_button() {
		save_btn.click();
	}
	
	public void cancel_click() {
		cancel_btn.click();
	}
	
}
