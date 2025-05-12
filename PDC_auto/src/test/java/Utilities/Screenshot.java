package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
		
		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("YYYY-MM-d, HH-mm-ss");
		LocalDateTime datetime = LocalDateTime.now();
		String d = DTF.format(datetime);
		
		
        // Take screenshot and save it to a file
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

      
        // Save the screenshot to the desired location
        File destination = new File("D:\\Automation Project\\PDC\\PDC ScreenShots\\ss" +" "+ d +".jpg" ); 	
        
        //COpy the SS file from JAVA memory to local memory
       FileHandler.copy(source, destination);
            
        
    }
}