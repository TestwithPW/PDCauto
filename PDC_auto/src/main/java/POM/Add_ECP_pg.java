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



public class Add_ECP_pg {
	
	@FindBy(xpath ="//input[@data-testid='external-care-provider-first-name-input-id']")private WebElement first_name;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-last-name-input-id']")private WebElement last_name;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-specialty-input-id']")private WebElement sepciality;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-phone-input-id']")private WebElement phone_no;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-email-input-id']")private WebElement emailid;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-npi-input-id']")private WebElement NPI_id;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-clinic-name-input-id']")private WebElement clinic;
	
	@FindBy(xpath ="//button[@data-testid='create-ecp-button-id']")private WebElement save_btn;
	@FindBy(xpath ="//button[@data-testid='cancel-create-ecp-button-id']")private WebElement cancel_btn;
	@FindBy(xpath ="/html/body/div/div/div/div/main/div/div[2]/form/div/div[2]/div[5]/div/div[2]/div/div/div/div/span[1]/input")private WebElement gender_dropdown;
	@FindBy(xpath ="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/div")private WebElement male;

	public static Properties pr = new Properties();
	
	public static FileReader fr;
	
	
	
	
	public Add_ECP_pg(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void ecp_details(WebDriver driver) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\ECP.properties");
		pr.load(fr);
		
		first_name.sendKeys(pr.getProperty("First_Name"));
		last_name.sendKeys(pr.getProperty("Last_Name"));
		sepciality.sendKeys(pr.getProperty("sepciality"));
		emailid.sendKeys(pr.getProperty("emailid"));
		phone_no.sendKeys(pr.getProperty("Phone_no"));	
		NPI_id.sendKeys(pr.getProperty("NPI"));
		clinic.sendKeys(pr.getProperty("Clinic_title"));
	
			
	}
	
	
	public void Save_button() {
		save_btn.click();
	}
	
	public void cancel_click() {
		cancel_btn.click();
	}
}
