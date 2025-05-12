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

public class Add_POP_pg {
	
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-first-name-input-id']")private WebElement first_name;
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-last-name-input-id']")private WebElement last_name;
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-birthday-date-picker-id']")private WebElement date;
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-phone-input-id']")private WebElement phone_no;
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-email-input-id']")private WebElement emailid;
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-npi-number-input-id']")private WebElement NPI_id;
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-job-title-input-id']")private WebElement job;
	@FindBy(xpath ="//textarea[@data-testid='primary-ordering-provider-address-line-1-input-id']")private WebElement Address1;
	@FindBy(xpath ="//textarea[@data-testid='primary-ordering-provider-address-line-2-input-id']")private WebElement Address2;
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-state-input-id']")private WebElement state;
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-city-input-id']")private WebElement city;
	@FindBy(xpath ="//input[@data-testid='primary-ordering-provider-zip-code-input-id']")private WebElement zip_code;
	@FindBy(xpath ="//button[@data-testid='create-pop-button-id']")private WebElement save_btn;
	@FindBy(xpath ="//button[@data-testid='create-pop-button-id']")private WebElement cancel_btn;
	@FindBy(xpath ="//*[@id=\"root\"]/div/div/div/main/div/div[2]/form/div/div[2]/div[5]/div/div[2]/div/div/div")private WebElement gender_dropdown;
	@FindBy(xpath ="//div[contains(text(),'Male')]")private WebElement male;
	
	@FindBy(xpath ="//a[@data-testid='pop-00052-link-id']")private WebElement Pop_details;
	@FindBy(xpath ="//button[@data-testid='update-user-status-button-id']")private WebElement deactivate;
	@FindBy(xpath ="//span[contains(text(),'Confirm')]")private WebElement confirm_De;
	@FindBy(xpath ="/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/button[1]/span")private WebElement cancel_De;
	
	@FindBy(xpath ="//button[@data-testid='update-user-status-button-id']")private WebElement reactivate;
	@FindBy(xpath ="//span[contains(text(),'Confirm')]")private WebElement confirm_Re;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement cancel_Re;
	
	@FindBy(xpath ="//button[@data-testid='archive-user-button-id']")private WebElement archieve;
	@FindBy(xpath ="/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]")private WebElement confirm_ar;
	@FindBy(xpath ="/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/button[1]")private WebElement cancel_ar;
	
	
	@FindBy(xpath ="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/div")private WebElement archive;
	
	
	
	public static Properties pr = new Properties();
	
	public static FileReader fr;
	
	
	
	
	public Add_POP_pg(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void POP_details(WebDriver driver) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\POP_details.properties");
		pr.load(fr);
		
		first_name.sendKeys(pr.getProperty("First_Name"));
		last_name.sendKeys(pr.getProperty("Last_Name"));
		date.click();
		date.sendKeys(pr.getProperty("Date"));
		phone_no.sendKeys(pr.getProperty("Phone_no"));
		emailid.sendKeys(pr.getProperty("emailid"));
		NPI_id.sendKeys(pr.getProperty("NPI"));
		job.sendKeys(pr.getProperty("Job_title"));
		Address1.sendKeys(pr.getProperty("Address1"));
		Address2.sendKeys(pr.getProperty("Address2"));
		state.sendKeys(pr.getProperty("State"));
		city.sendKeys(pr.getProperty("City"));
		zip_code.sendKeys(pr.getProperty("ZipCode"));
			
	}
	
	public void select_gender() throws InterruptedException {
		gender_dropdown.click();
		Thread.sleep(2000);
		male.click();
//		
	}
	
	public void Save_button() {
		save_btn.click();
	}
	
	public void cancel_click() {
		cancel_btn.click();
	}
	public void POP_details_click(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.visibilityOf(Pop_details));
//
//		List<WebElement> POPs = driver.findElements(By.xpath("/html/body/div/div/div/div/main/div/div/div[3]/div/div[2]/div/div/div/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/a/button"));
//		WebElement POP1 = POPs.get(0);
		Pop_details.click();
	}
	
	
	public void deactivate_button() {
		deactivate.click();
	}
	public void reactivate_button() {
		reactivate.click();
	}
	
	public void confirm_de_button() {
		confirm_De.click();
	}
	public void cancel_de_button() {
		cancel_De.click();
	}
	public void confirm_re_button() {
		confirm_Re.click();
	}
	public void cancel_re_button() {
		cancel_Re.click();
	}
	public void archieve_button() {
		archieve.click();
	}
	
	public void confirm_ar_button() {
		confirm_ar.click();
	}
	public void cancel_ar_button() {
		cancel_ar.click();
	}

}
