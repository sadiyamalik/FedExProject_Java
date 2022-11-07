package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By label_eng =By.cssSelector(".fxg-geo-locator__link-label");
    By accept_cokkiesbtn =By.cssSelector(".fxg-cookie-consent__accept");
    //By applogo =By.cssSelector(".fxg-header__logo");
    By applogovalue =By.xpath("//a[@class='fxg-header__logo_wrapper fxg-keyboard']/span[1]/img");

    By homepagehero =By.xpath("//h1[contains(text(),'Where  now meets next.')]");

    By PageClose=By.cssSelector("g > path:nth-child(2)");

    public HomePage(WebDriver driver){

        this.driver = driver;
       // PageFactory.initElements(driver, this);

    }
    public String  getlangtext(){
        return driver.findElement(label_eng).getText();

    }

    public void LanguageClick() {
        try {
            driver.findElement(label_eng).click();

        } catch (Exception e) {
            System.out.println("Error occurred in LanguageClick method");
            e.printStackTrace();
        }
    }

    public void  AcceptCookies(){
        driver.findElement(accept_cokkiesbtn).click();
    }

    public String verifylogo(){
        return   driver.findElement(applogovalue).getAttribute("alt");

    }

    public String  getHomePageHeroText(){
        return driver.findElement(homepagehero).getText();

    }

    public void PageCloseClick() {
        try {
            driver.findElement(PageClose).click();

        } catch (Exception e) {
            System.out.println("Error occurred in PageCloseClick method");
            e.printStackTrace();
        }
    }


}
