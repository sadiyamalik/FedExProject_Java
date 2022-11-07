package BaseClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DriverUtil extends BrowserFactory{
    public WebDriver SetDriver() {
        try{

                launchApplication();
                SessionId s = ((RemoteWebDriver) driver).getSessionId();
                System.out.println("*********** Session id is :::"+ s + "***************");
                ApplicationTitle();

        }catch(Exception e) {
            System.out.println("Error occurred in SetDriver method");
            e.printStackTrace();
        }
        return driver;
    }





    public WebDriver launchApplication(){
        try{
            String Url = config.getpropurl();
            setupBrowser();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(config.getPageLoadTimeOut(), TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(config.getImplicitWait()   , TimeUnit.SECONDS);
            SetCookies();
            System.out.println("Driver is Started");
            driver.get(Url);

        }catch(Exception e) {
            System.out.println("Error occurred in launchApplication method");
            e.printStackTrace();
        }


        return driver;

    }

    public void SetCookies(){

        try{

            Set<Cookie> cookiesInstance1 = driver.manage().getCookies();
            System.out.println("Cookies = "+cookiesInstance1);
            for(Cookie cookie : cookiesInstance1)
            {
                driver.manage().addCookie(cookie);
            }

        }catch(Exception e) {
            System.out.println("Error occurred in SetCookies method");
            e.printStackTrace();
        }

    }
    public String ApplicationTitle() {
        String parentWindowTitle = driver.getTitle();

        System.out.println("Parent Window Title name ::::::::::::!!!!!!!!!!!!" + parentWindowTitle);

        return   parentWindowTitle;
    }

    public static void closeDriver() {

        try{

            if (driver != null) {
                try {
                    driver.close();
                    driver.quit();
                } catch (NoSuchMethodError nsme) { // in case quit fails
                } catch (NoSuchSessionException nsse) { // in case close fails
                } catch (SessionNotCreatedException snce) {} // in case close fails
                driver = null;
            }
        }catch(Exception e) {
            System.out.println("Error occurred in SetCookies method");
            e.printStackTrace();
        }

    }
public String getURL(){

        return driver.getCurrentUrl();
}



}
