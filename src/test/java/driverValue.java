import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class driverValue {

        protected WebDriver driver;
        //public static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
        //public static final String CHROME_DRIVER_LOCATION = "src\\test\\WebDrivers\\chromedriver.exe";
      //  String browser;
        @BeforeClass
        @Parameters("browser")
       // public void setUp() {
          //  System.setProperty(CHROME_DRIVER_PROPERTY, CHROME_DRIVER_LOCATION);
           // driver = new ChromeDriver();
            public void setup(String browser) throws Exception{
                //Check if parameter passed from TestNG is 'firefox'
                if(browser.equalsIgnoreCase("firefox")){
                    //create firefox instance
                    System.setProperty("webdriver.gecko.driver", "src\\test\\WebDrivers\\geckodriver.exe");
                    driver = new FirefoxDriver();
                }
                //Check if parameter passed as 'chrome'
                else if(browser.equalsIgnoreCase("chrome")){
                    //set path to chromedriver.exe
                    System.setProperty("webdriver.chrome.driver","src\\test\\WebDrivers\\chromedriver.exe");
                    //create chrome instance
                    driver = new ChromeDriver();
                }
                //Check if parameter passed as 'Edge'
                else if(browser.equalsIgnoreCase("Edge")){
                    //set path to Edge.exe
                    System.setProperty("webdriver.edge.driver","src\\test\\WebDrivers\\msedgedriver.exe");
                    //create Edge instance
                    driver = new EdgeDriver();
                }
                else{
                    //If no browser passed throw exception
                    throw new Exception("Browser is not correct");
                }
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("https://stag.route.optimiser.app/");
                driver.manage().window().maximize();
            }

        }


