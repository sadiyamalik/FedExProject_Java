package BaseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory extends PropertyFileReader {
    public static WebDriver driver;
    protected static PropertyFileReader config = new PropertyFileReader();

    public void setupBrowser()  {
        try{
            String browser = config.getBrowser();
            //String path =  Cfr_obj.getDriverPath();

            if (browser.equalsIgnoreCase("firefox")) {
                System.out.println("*********** BrowserName:::"+browser + "***************");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                System.out.println("***********  Starting  Gecko driver****************************");
            }
            else if(browser.equalsIgnoreCase("edge"))
            {
                System.out.println("***********  BrowserName:::"+browser + "  *********** ");
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                System.out.println("*********** Starting of Edge driver****************************");

            }
            else if(browser.equalsIgnoreCase("chrome"))
            {
                System.out.println("BrowserName:::"+browser);
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.setAcceptInsecureCerts(true);
                options.addArguments("--disable-extensions");
                options.addArguments("--disable-notifications");
                options.addArguments("--disable-infobars");
                options.addArguments("--disable-popup-blocking");
                options.addArguments("incognito");
                driver = new ChromeDriver(options);
                System.out.println("*********** Starting of chrome driver****************************");
            }

        }catch(Exception e){
            System.out.println("Error occurred in getBrowser method");
            e.printStackTrace();
        }
    }
}
