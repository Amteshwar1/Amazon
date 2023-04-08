package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseAmazonClass {

	public static Properties prop=new Properties();
	
	public static WebDriver driver; 
	
	public BaseAmazonClass() {
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\AmzazonWebsite\\src\\test\\java\\environmentvariables\\Config.properties");
		prop.load(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException a) {
			a.printStackTrace();}
		}
		
		public static void initiation() {
		String browsername=	prop.getProperty("browser");
		
		if (browsername.equals("FireFox")) {

	       
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver-v0.32.2-win32 (2)\\geckodriver.exe");
			driver=new FirefoxDriver();}
			
			else if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
				driver=new ChromeDriver();
			}
				
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		}
		
	
}
