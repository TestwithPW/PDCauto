package POM;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientProfileEnrollment {
	//private WebDriver driver;
		@FindBy(xpath = "//button[@data-testid='change-enrollment-status-button-id']")private WebElement unEnrollButton;
		@FindBy(xpath = "//textarea[@data-testid='change-patient-enrollment-note-input-id']")private WebElement notesUnenroll;
		@FindBy(xpath = "//span[contains(text(),'Confirm')]")private WebElement confirmButton;
		@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div[3]/button[1]/span")private WebElement cancelButton;
		@FindBy(xpath = "//button[@data-testid='change-enrollment-status-button-id']")private WebElement reEnrollButton;
		@FindBy(xpath = "//span[contains(text(),'No, request new device')]")private WebElement requestNewDeviceRadioButton;
		@FindBy(xpath = "//span[contains(text(),'Yes, use existing PDC device')]")private WebElement useExistingDeviceRadioButton;

		
		public static Properties pr = new Properties();
		public static FileReader fr;
		
		public PatientProfileEnrollment(WebDriver driver) {
			PageFactory.initElements(driver, this);	
		}
		
		
		public void unEnrollPatientPage() throws IOException, InterruptedException{
			unEnrollButton.click();
			Thread.sleep(3000);
			notesUnenroll.sendKeys("Note added for Unenrollment");
			confirmButton.click();
			System.out.println("The Patient is Unenrolled");
			
		}
		
		public void reEnrollPatientPage(WebDriver driver) throws IOException, InterruptedException{
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
			wait.until(ExpectedConditions.elementToBeClickable(reEnrollButton));
			reEnrollButton.click();
			Thread.sleep(3000);
			requestNewDeviceRadioButton.click();
			
			confirmButton.click();
			System.out.println("The Patient is Reenrolled");
			
		}
}
