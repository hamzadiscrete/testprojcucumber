package runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions
(
        plugin = {"json:target/positive/cucumber.json", "pretty", "html:target/positive/cucumber.html"},
        features = "src/main/java",
        glue = "Featuredefs",
        tags = { "@test2,@JunitScenario,@TestngScenario" }
        )

public class a2runnerr extends AbstractTestNGCucumberTests{
	
	

	
	public static Properties config2 = null;
    public static WebDriver driver2 = null;

    
    public void LoadConfigProperty12() throws IOException {
        config2 = new Properties();
        FileInputStream ip2 = new FileInputStream(
                System.getProperty("user.dir") + "\\src\\main\\java\\config.properties");
        config2.load(ip2);
    }
    
    public void configureDriverPath12() throws IOException {
        if(System.getProperty("os.name").startsWith("Windows")) {
            String firefoxDriverPath = System.getProperty("user.dir") + "\\src\\main\\java\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
            String chromeDriverPath = System.getProperty("user.dir") + "\\src\\main\\java\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        }
        else
        {
            System.out.println("No Driver");
        }
        
    }
        public void openBrowser12() throws Exception {
            // loads the config options
            LoadConfigProperty12();
            // configures the driver path
            configureDriverPath12();
            if (config2.getProperty("browserType").equals("firefox")) {
                driver2 = new FirefoxDriver();
            } else if (config2.getProperty("browserType").equals("chrome")) {
                ChromeOptions options2 = new ChromeOptions();
//    			
                driver2 = new ChromeDriver(options2);
            }
        
    }
    
    	public void setEnv12() {
			  // LoadConfigProperty();
          String baseUrl = config2.getProperty("siteUrl");
          driver2.get(baseUrl);
			
		}

         @BeforeSuite(alwaysRun = true)
         public void setUp() throws Exception {
             openBrowser12();
            // maximizeWindow();
            // implicitWait(30);
//             deleteAllCookies();
         }
         @AfterSuite(alwaysRun = true)
         public void quit() throws IOException, InterruptedException {
             driver2.quit();
         }

	
    
    
    
    
}
