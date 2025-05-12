package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNurseButton {
@FindBy(xpath ="//button[@data-testid='add-nurse-button-id']")private WebElement addNurseButton;
	
	
	public AddNurseButton(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	
	public void nurseClick() {
		addNurseButton.click();
	}
	/*public void request_click(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(requeststab));
		
		requeststab.click();
	*/
}
