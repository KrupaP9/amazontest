package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public void openBrowser(String baseUrl){
        //set property of key to driver
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        //create an instance of the Chromedriver class
        driver = new FirefoxDriver();
        //open the browser and launch the baseUrl
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //set implicit time to wait for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        //quit the browser
        driver.quit();
    }
}
