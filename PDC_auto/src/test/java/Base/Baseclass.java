package Base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	
	public static WebDriver  driver;
	
	public static Properties pr = new Properties();
	
	public static FileReader fr;
	
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
			
		if(driver==null) {
			FileReader fr = new FileReader("C:\\Users\\prasa\\eclipse-workspace\\PDC_auto\\src\\test\\resources\\Properties\\config.properties");
			
			pr.load(fr);	
		}
			if (pr.getProperty("Browser").equalsIgnoreCase("chrome")) {
				
				ChromeOptions options = new ChromeOptions();		
				
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("use-fake-device-for-media-stream");
				options.addArguments("use-fake-ui-for-media-stream");
				
				driver = new ChromeDriver();
				driver.get(pr.getProperty("URL_lgn"));
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
			}
			else if(pr.getProperty("Browser").equalsIgnoreCase("edge")) {
				
				
				
	//			WebDriverManager.edgedriver().setup();
	//			EdgeOptions options = new EdgeOptions();
	//			options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	//			List<String> args = Arrays.asList("use-fake-ui-for-media-stream", "use-fake-device-for-media-stream");
	//			Map<String, Object> map = new HashMap<>();
	//			map.put("args", args);
	//			options.setCapability("ms:edgeOptions", map);
				
				EdgeOptions options = new EdgeOptions();
		        options.addArguments("use-fake-ui-for-media-stream");
		        options.addArguments("--disable-notifications");
				
				driver =new EdgeDriver(options);
				driver.get(pr.getProperty("URL_dis"));
				driver.manage().window().maximize();
			    driver.manage().deleteAllCookies();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
			}
	
		}

}
