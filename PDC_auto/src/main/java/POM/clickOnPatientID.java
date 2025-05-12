package POM;


//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clickOnPatientID {
	
	//private WebDriver driver;
		@FindBy(xpath = "//*[@id='root']/div/div/div/main/div/div/div[3]/div[2]/div/div/div/div/div/table")private WebElement table;
		
		
		public static Properties pr = new Properties();
		public static FileReader fr;
		
		public clickOnPatientID(WebDriver driver) {
			PageFactory.initElements(driver, this);	
		}
		
		
	public List<WebElement> getColumnValues(int columnIndex) throws IOException, InterruptedException {
			
			FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\clickonpatientid.properties");
			pr.load(fr);
			
	        List<WebElement> columnElements = new ArrayList<>();
	        List<WebElement> rows = table.findElements(By.tagName("tr"));
	        for (WebElement row : rows) {
	            List<WebElement> cells = row.findElements(By.tagName("td"));
	            if (columnIndex >= 0 && columnIndex < cells.size()) {
	                WebElement cellValue = cells.get(columnIndex);
	                //System.out.println(cellValue);
	                columnElements.add(cellValue);
	            }
	        }
	        
	        String patID = pr.getProperty("PatientID");
	        //System.out.println("Value is "+patID);
	        for(WebElement value:columnElements) {
	        	//String pat = value.getText();
	        	//System.out.println("Values in the table "+pat);
	        	if(value.getText().equalsIgnoreCase(patID)) {
	        		//System.out.println("Value is "+value);
	        		Thread.sleep(2000);
	        		value.click();
	        		System.out.println("Clicked on the Patient "+patID);
	        		break;
	        	}
	        }
	        
	        return columnElements;
	    }
		
}
