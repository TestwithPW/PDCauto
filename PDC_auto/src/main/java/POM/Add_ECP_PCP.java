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

public class Add_ECP_PCP {
	
	//Assign new PCP
	@FindBy(xpath ="//button[@data-testid='assign-external-care-provider-button-id']")private WebElement Assign_new;
	@FindBy(xpath ="//button[@data-testid='reassign-pcp-button-id']")private WebElement reassign_pcp;
	@FindBy(xpath ="//div[@data-testid='external-care-provider-select-id']")private WebElement pcp_dropdown;       
	@FindBy(xpath ="/html/body/div[3]/div/div/div[2]/div[1]/div/div/div[2]/div")private WebElement select_pcp;
	@FindBy(xpath ="//span[contains(text(),'Save')]")private WebElement reassign_save_btn;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement reassign_cle_btn;
	
	//Add New 
	@FindBy(xpath ="//button[@data-testid='add-new-button-id']")private WebElement Add_new;
	
	// Add new PCP
	@FindBy(xpath ="//input[@data-testid='external-care-provider-first-name-input-id']")private WebElement First_name;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-last-name-input-id']")private WebElement Last_name;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-specialty-input-id']")private WebElement speciality;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-email-input-id']")private WebElement emailid;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-phone-input-id']")private WebElement phone_no;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-npi-input-id']")private WebElement NPI;
	@FindBy(xpath ="//input[@data-testid='external-care-provider-clinic-name-input-id']")private WebElement clinic;
	@FindBy(xpath ="//span[contains(text(),'Save')]")private WebElement save_ecp;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement cancel_ecp;
	@FindBy(xpath ="//button[@data-testid='assign-existing-button-id']")private WebElement assign_existing;
	
	
	@FindBy(xpath ="/html/body/div[3]/div/div/div[2]/div/div/div/div[2]")private WebElement select_name_pop;
	@FindBy(xpath ="//span[contains(text(),'Save')]")private WebElement Save_Sec_pop_btn;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement Cancle_Sec_pop_btn;
	
	//unassign secondary POP
	@FindBy(xpath ="/html/body/div/div/div/div/main/div/div[2]/div/div[1]/div[3]/div[2]/div/div/ul/li/button")private WebElement Options_Sec_pop;
	@FindBy(xpath ="//span[contains(text(),'Unassign')]")private WebElement Unassign_Sec_pop_btn;
	@FindBy(xpath ="//span[contains(text(),'OK')]")private WebElement Unassign_OK_pop_btn;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement Unassign_Cle_pop_btn;
	
	
	public static Properties pr = new Properties();
	public static FileReader fr;
	
	public Add_ECP_PCP(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	public void Aassign_click() {
		Assign_new.click();
	}
	public void reassign_pcp_click() {
		reassign_pcp.click();
	}
	public void pcp_dropdown_click() {
		pcp_dropdown.click();
	}
	public void select_pcp_from_dropdown() {
		select_pcp.click();
	}
	public void reassign_Save_pcp_click(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(reassign_save_btn));
		reassign_save_btn.click();
	}
	public void cancle_pcp_click() {
		reassign_cle_btn.click();
	}
	public void Add_new_PCP_click() {
		Add_new.click();
	}
	public void Add_PCP_ECP_details() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\ECP.properties");
		pr.load(fr);
		
		First_name.sendKeys(pr.getProperty("First_Name"));
		Last_name.sendKeys(pr.getProperty("Last_Name"));
		speciality.sendKeys(pr.getProperty("sepciality"));
		emailid.sendKeys(pr.getProperty("emailid"));
		phone_no.sendKeys(pr.getProperty("Phone_no"));
		NPI.sendKeys(pr.getProperty("NPI"));
		clinic.sendKeys(pr.getProperty("Clinic_title"));
		
	}
	public void Add_PCP_ECP_details2() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\ECP.properties");
		pr.load(fr);
		
		First_name.sendKeys(pr.getProperty("First_Name1"));
		Last_name.sendKeys(pr.getProperty("Last_Name1"));
		speciality.sendKeys(pr.getProperty("sepciality1"));
		emailid.sendKeys(pr.getProperty("emailid1"));
		phone_no.sendKeys(pr.getProperty("Phone_no1"));
		NPI.sendKeys(pr.getProperty("NPI1"));
		clinic.sendKeys(pr.getProperty("Clinic_title1"));
		
	}
	public void Save_pcp_click() {
		save_ecp.click();
	}
	public void Cel_pCP_click() {
		cancel_ecp.click();
	}
	public void Cancle_sec_pop_click() {
		Cancle_Sec_pop_btn.click();
	}
	public void Options_sec_click() {
		Options_Sec_pop.click();
	}
	public void unassign_sec_click() {
		Unassign_Sec_pop_btn.click();
	}
	public void unassign_OK_click() {
		Unassign_OK_pop_btn.click();
	}
	public void unassign_Cle_click() {
		Unassign_Cle_pop_btn.click();
	}

	

}
