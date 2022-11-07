package BaseClasses;

import org.apache.log4j.Level;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {
    private Properties prop =null;

    private static String propertyFilePath = "src/test/resources/Configuration.properties";
    InputStream input = null;

    public PropertyFileReader() {
        prop = new Properties();
        try {

            InputStream input = new FileInputStream(propertyFilePath);
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Read Browser
    public String getBrowser()  {
        return prop.getProperty("browser_type");
    }

    public String getpropurl(){
        return prop.getProperty("App_url");
    }
    public int getPageLoadTimeOut() {
        return Integer.parseInt(prop.getProperty("Page_Load_wait"));
    }

    public int getImplicitWait() {
        return Integer.parseInt(prop.getProperty("implicit_wait_time"));
    }

    public Level getLoggerLevel() {

        switch (prop.getProperty("Logger.Level")) {

            case "DEBUG":
                return Level.DEBUG;
            case "INFO":
                return Level.INFO;
            case "WARN":
                return Level.WARN;
            case "ERROR":
                return Level.ERROR;
            case "FATAL":
                return Level.FATAL;
        }
        return Level.ALL;
    }



}
