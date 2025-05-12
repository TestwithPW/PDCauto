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

public class Patient_details_Medical_profile {
	
	@FindBy(xpath ="//a[@data-testid='pat-00137-link-id']")private WebElement patientID;
	@FindBy(xpath ="//div[@data-node-key='medicalProfile']")private WebElement Medical_profile_tab;
	@FindBy(xpath ="//div[@data-node-key='results']")private WebElement results_tab;
	@FindBy(xpath ="//div[@data-node-key='notes']")private WebElement notes_tab;
	@FindBy(xpath ="//div[@data-node-key='devices']")private WebElement devices_tab;
	@FindBy(xpath ="//div[@data-node-key='patientProfile']")private WebElement patient_profile_tab;
	@FindBy(xpath ="//div[@data-node-key='patientCareTeam']")private WebElement patient_care_team_tab;
	@FindBy(xpath ="//div[@data-node-key='requests']")private WebElement request_tab;
	@FindBy(xpath ="//div[@data-node-key='activityTimeline']")private WebElement activity_timeline_tab;

	@FindBy(xpath ="/html/body/div[1]/div/div/div/main/div/div[1]/div[2]/div/div/div/div[2]/div/button[1]")private WebElement cancel_btn;
	@FindBy(xpath ="/html/body/div/div/div/div/main/div/div[2]/form/div/div[2]/div[5]/div/div[2]/div/div/div/div/span[1]/input")private WebElement gender_dropdown;
	@FindBy(xpath ="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/div")private WebElement male;
	
	@FindBy(xpath ="//button[@data-testid='notify-list-button-id']")private WebElement notify_list_button;
	@FindBy(xpath ="//button[@data-testid='add-staff-button-id']")private WebElement Add_new_btn;
	@FindBy(xpath ="//table/tbody/tr[1]/td[4]/button[@data-testid='remove-member-button-id']")private WebElement remove_btn;
	@FindBy(xpath ="//button[2]/span[contains(text(),'Remove')]")private WebElement remove_cnf_btn;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement remove_cle_btn;
	@FindBy(xpath ="//input[@data-testid='medical-profile-add-members-external-email-button-id']")private WebElement Add_by_email;
	@FindBy(xpath ="//table/tbody/tr[1]/td[1]/label/span/input")private WebElement Check_to_Add;
	
	@FindBy(xpath ="//button[@data-testid='add-members-button-id']")private WebElement Save_list_btn;
	@FindBy(xpath ="//span[contains(text(),'OK')]")private WebElement Save_OK_btn;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement Save_cle_btn;
	
	//Reassign lead POP 
	@FindBy(xpath ="//button[@data-testid='primary-ordering-providers-button-id']")private WebElement reassign_pop;
	@FindBy(xpath ="//div[@data-testid='primary-ordering-provider-select-id']")private WebElement name_dropdown;
	//Need to update the xpath
	@FindBy(xpath ="/html/body/div[3]/div/div/div[2]/div/div/div/div[3]/div")private WebElement select_pop;
	@FindBy(xpath ="//textarea[@data-testid='primary-ordering-provider-note-select-id']")private WebElement add_note_pop;
	@FindBy(xpath ="//span[contains(text(),'Save')]")private WebElement reassign_save_btn;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement reassign_cle_btn;
	
	//Assign Secondory POP
	@FindBy(xpath ="//button[@data-testid='assign-pops-button-id']")private WebElement Assign_Sec_pop_btn;
	//change xpath
	@FindBy(xpath ="/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[1]/div/div[2]/div/div/div/div/span[1]/input")private WebElement enter_POP_name;
	@FindBy(xpath ="/html/body/div[3]/div/div/div[2]/div/div/div/div[2]")private WebElement select_name_pop;
	@FindBy(xpath ="//span[contains(text(),'Save')]")private WebElement Save_Sec_pop_btn;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement Cancle_Sec_pop_btn;
	
	//unassign secondory POP
	@FindBy(xpath ="//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div[1]/div[3]/div[2]/div/div/ul/li/button")private WebElement Options_Sec_pop;
	@FindBy(xpath ="//div[2]/div/ul/li[2]")private WebElement Unassign_Sec_pop_btn;
	@FindBy(xpath ="//span[contains(text(),'OK')]")private WebElement Unassign_OK_pop_btn;
	@FindBy(xpath ="//span[contains(text(),'Cancel')]")private WebElement Unassign_Cle_pop_btn;
	
	
	
	public Patient_details_Medical_profile(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	public void reassign_click() {
		reassign_pop.click();
	}
	public void name_dropdown_click() {
		name_dropdown.click();
	}
	public void select_pop_dd_click() {
		select_pop.click();
	}
	public void add_note_reassign_pop() {
		add_note_pop.sendKeys("Reassigning the POP");
	}
	public void save_pop_click() {
		reassign_save_btn.click();
	}
	public void cancle_pop_click() {
		reassign_cle_btn.click();
	}
	public void Assign_sec_pop_click() {
		Assign_Sec_pop_btn.click();
	}
	public void Enter_pop_click() {
		enter_POP_name.click();
//		enter_POP_name.sendKeys("Lance Sawyer");
	}
	public void Select_sec_pop_click() {
		select_name_pop.click();
	}
	public void Save_sec_pop_click() {
		Save_Sec_pop_btn.click();
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
	public void patientid_click() {
		patientID.click();
	}
	
	public void medical_profile_click() {
		Medical_profile_tab.click();
	}
	public void results_click() {
		results_tab.click();
	}
	public void notes_click() {
		notes_tab.click();
	}
	public void devices_click() {
		devices_tab.click();
	}
	public void patient_profile_click() {
		patient_profile_tab.click();
	}
	public void patient_care_team_click() {
		patient_care_team_tab.click();
	}
	public void requests_click() {
		request_tab.click();
	}
	public void activity_timeline_click() {
		activity_timeline_tab.click();
	}
	
	public void notify_list_click() {
		notify_list_button.click();
	}
	
	public void Add_new_click() {
		Add_new_btn.click();
	}
	public void Add_by_email() {
		Add_by_email.sendKeys("testeng682+newemail@gmail.com");
	}
	public void Check_to_Add_new_click() {
		Check_to_Add.click();
	}
	public void Save_list_click() {
		Save_list_btn.click();
	}
	public void Save_ok_click() {
		Save_OK_btn.click();
	}
	public void Save_cancle_click() {
		Save_cle_btn.click();
	}
	public void remove_click() {
		remove_btn.click();
	}
	public void remove_cnf_click() {
		remove_cnf_btn.click();
	}
	public void remove_cancle_click() {
		remove_cle_btn.click();
	}
	

}
