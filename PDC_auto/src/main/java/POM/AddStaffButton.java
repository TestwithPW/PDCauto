package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddStaffButton {
@FindBy(xpath ="/html/body/div/div/div/div/main/div/div/div[3]/div[1]/div[2]/a[2]/button")private WebElement addStaff;
	
	
	public AddStaffButton(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	
	public void staffclick() {
		addStaff.click();
	}
	
	/*public void request_click(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		wait.until(ExpectedConditions.elementToBeClickable(requeststab));
		
		requeststab.click();
	*/
}
