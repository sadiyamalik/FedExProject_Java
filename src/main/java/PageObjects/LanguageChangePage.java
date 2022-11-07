package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LanguageChangePage {

    WebDriver driver;

    By DropDown =By.xpath("//button[@id='dropdownMenu']");
    By langDropDown =By.xpath("//a[contains(@href, 'https://www.fedex.com/nl-nl/home.html')]");



    public LanguageChangePage(WebDriver driver){

        this.driver = driver;

    }

public void getLangDropDownVal() {

    try {
        driver.findElement(DropDown).click();
        driver.findElement(langDropDown).click();

    } catch (Exception e) {
        System.out.println("Error occurred in getLangDropDownVal method");
        e.printStackTrace();
    }

}
}
