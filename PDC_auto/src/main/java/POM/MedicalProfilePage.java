package POM;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalProfilePage {
	
	//private WebDriver driver;
		@FindBy(xpath = "//input[@data-testid='alert-limits-systolic-min-input-id']")private WebElement minSystolic;
		@FindBy(xpath = "//input[@data-testid='alert-limits-systolic-max-input-id']")private WebElement maxSystolic;
		@FindBy(xpath = "//input[@data-testid='alert-limits-diastolic-min-input-id']")private WebElement minDiastolic;
		@FindBy(xpath = "//input[@data-testid='alert-limits-diastolic-max-input-id']")private WebElement maxDiastolic;
		@FindBy(xpath = "//input[@data-testid='alert-limits-pulse-min-input-id']")private WebElement minHR;
		@FindBy(xpath = "//input[@data-testid='alert-limits-pulse-max-input-id']")private WebElement maxHR;
		@FindBy(xpath = "//textarea[@data-testid='alert-limits-note-input-id']")private WebElement alertNote;
		@FindBy(xpath = "//input[@data-testid='display-note-to-patient-checkbox-id']")private WebElement displayToPatientCheckBox;
		@FindBy(xpath = "//button[@data-testid='save-update-button-id']")private WebElement saveButton;
		@FindBy(xpath = "//span[contains(text(),'Yes')]")private WebElement yesButton;
		@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div[2]/button[1]")private WebElement noButton;
		
		
		public static Properties pr = new Properties();
		public static FileReader fr;
		
		public MedicalProfilePage(WebDriver driver) {
			PageFactory.initElements(driver, this);	
		}
		
		public void enterVitalLimits() throws IOException, InterruptedException{
			FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\medicalprofile.properties");
			pr.load(fr);
			
			//Set Personalized alerts
			minSystolic.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
			minSystolic.sendKeys(pr.getProperty("MinSystolic"));
			maxSystolic.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
			maxSystolic.sendKeys(pr.getProperty("MaxSystolic"));
			minDiastolic.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
			minDiastolic.sendKeys(pr.getProperty("MinDiastolic"));
			maxDiastolic.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
			maxDiastolic.sendKeys(pr.getProperty("MaxDiastolic"));
			minHR.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
			minHR.sendKeys(pr.getProperty("MinHR"));
			maxHR.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
			maxHR.sendKeys(pr.getProperty("MaxHR"));
			
			
			//Enter Alert note
			alertNote.sendKeys(pr.getProperty("AlertNote"));
			
			//Checkbox to display the Alert Note to Patient
			displayToPatientCheckBox.click();
			saveButton.click();
			Thread.sleep(3000);
			yesButton.click();
			System.out.println("Medical Profile is successfully set");
			
		}
   
	
}
