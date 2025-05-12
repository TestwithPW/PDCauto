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

public class AddingNotesToPatientPage {
	
	

	
	
	//private WebDriver driver;
	@FindBy(xpath = "//button[@data-testid='add-general-note-button-id']")private WebElement addGeneralNote;
	@FindBy(xpath = "//button[@data-testid='add-call-note-button-id']")private WebElement addCallNote;
	@FindBy(xpath = "//span[contains(text(),'Reading Notes')]")private WebElement viewReadingNote;
	@FindBy(xpath = "//span[contains(text(),'Call Notes')]")private WebElement viewCallNote;
	@FindBy(xpath = "//span[contains(text(),'General Notes')]")private WebElement viewGeneralNote;
	@FindBy(xpath = "//textarea[@data-testid='note-input-id']")private WebElement textNote;
	@FindBy(xpath = "//input[@data-testid='display-note-to-patient-checkbox-id']")private WebElement checkBox;
	@FindBy(xpath = "//input[@data-testid='display-note-to-patient-checkbox-id']")private WebElement checkBoxCallNote;	
	@FindBy(xpath = "//div[@data-testid='escalation-level-input-id']")private WebElement escalationLevel;
	@FindBy(xpath = "//div[@title='Standard']")private WebElement standard;
	@FindBy(xpath = "//div[@title='Moderate']")private WebElement moderate;
	@FindBy(xpath = "//div[@title='Emergency']")private WebElement Emergency;
	@FindBy(xpath = "//input[@data-testid='review-start-time-date-picker-id']")private WebElement startTime;
	@FindBy(xpath = "//input[@data-testid='review-end-time-date-picker-id']")private WebElement stopTime;	
	
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")private WebElement saveButton;
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")private WebElement cancelButton;
	
	
	
	public static Properties pr = new Properties();
	public static FileReader fr;
	
	public AddingNotesToPatientPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	
	public void addNewGeneralNote() throws IOException, InterruptedException{
		
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\addNotes.properties");
		pr.load(fr);
		addGeneralNote.click();
		//textNote.click();
		Thread.sleep(2000);
		textNote.sendKeys(pr.getProperty("GeneralNote"));
		Thread.sleep(1000);
		checkBox.click();
		saveButton.click();
		System.out.println("General Note added Successfully");
	}
	
	public void addNewCallNote() throws IOException, InterruptedException, AWTException{
		FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\addNotes.properties");
		pr.load(fr);
		//Thread.sleep(2000);
		addCallNote.click();
		//textNote.click();
		Thread.sleep(2000);
		textNote.sendKeys(pr.getProperty("CallNote"));
		escalationLevel.click();
		
		String escalation = pr.getProperty("EscalationLevel");
		if(escalation.equalsIgnoreCase("Standard")) {
			standard.click();
		}
		else if(escalation.equalsIgnoreCase("Moderate")) {
			moderate.click();
		}
		else if(escalation.equalsIgnoreCase("Emergency")) {
			Emergency.click();
		}
		
		Robot rb = new Robot();
		startTime.click();
		startTime.sendKeys("5/02/24 03:33");
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		stopTime.sendKeys("5/02/24 03:59");
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		checkBoxCallNote.click();
		saveButton.click();
		System.out.println("Call Note added Successfully");
	}
	
	
	public void viewNewReadingNote() throws IOException, InterruptedException{
		viewReadingNote.click();
		
	}
	
	public void viewNewCallNote() throws IOException, InterruptedException{
		viewCallNote.click();
		
	}
	
	public void viewdNewGeneralNote() throws IOException, InterruptedException{
		viewGeneralNote.click();
		
	}
	
}
