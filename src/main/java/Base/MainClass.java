package Base;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	//import org.openqa.selenium.firefox.FirefoxDriver;
	//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class MainClass {
		
	public static Properties Aprop;
		
	public static WebDriver driver;

		public void intialization() {
			try {
				Aprop = new Properties();
				FileInputStream fis = new FileInputStream("/Users/nanirambhujel/eclipse-workspace/QA_2022_BDD/src/main/java/properties/config.properties");
				Aprop.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String browserName = Aprop.getProperty("browser");
			
			if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty(Aprop.getProperty("chromeKey"), Aprop.getProperty("chromePath"));
			driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("ff")) {
			System.setProperty(Aprop.getProperty("ffKey"), Aprop.getProperty("ffPath"));
			driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty(Aprop.getProperty("ieKey"), Aprop.getProperty("iePath"));
			driver = new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(Aprop.getProperty("QAtestURL"));
		}
		
		public void tearDown() {
			driver.close();
		}
}





