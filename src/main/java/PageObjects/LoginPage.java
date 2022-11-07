package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By SignInLoginIcon = By.xpath("//span[@class='fxg-user-options__sign-in-text']");
    By LoginLink = By.xpath("//a[normalize-space()='LOG IN']");
    By EmailIdTxtBox = By.xpath("//input[@id='userId']");
    By PasswordTxtBox = By.xpath("//input[@id='password']");
    By LoginBtn = By.xpath("//button[@id='login-btn']");
    By ErrorOfLogin = By.xpath("//p[@class = 'fdx-u-font-size--h5']");

    public LoginPage(WebDriver driver) {

        this.driver = driver;

    }

    public void SignInLoginIconClick() {
        try {
            driver.findElement(SignInLoginIcon).click();

        } catch (Exception e) {
            System.out.println("Error occurred in SignInLoginIconClick method");
            e.printStackTrace();
        }
    }

    public void LoginLinkClick() {
        try {
            driver.findElement(LoginLink).click();

        } catch (Exception e) {
            System.out.println("Error occurred in LoginLinkClick method");
            e.printStackTrace();
        }
    }

    public void EnterEmailId(String EmailVal) {
        try {
            driver.findElement(EmailIdTxtBox).sendKeys(EmailVal);


        } catch (Exception e) {
            System.out.println("Error occurred in EnterEmailIdAndPassword method");
            e.printStackTrace();
        }

    }

    public void EnterPassword(String PasswordVal) {
        try {
            driver.findElement(PasswordTxtBox).sendKeys(PasswordVal);
        } catch (Exception e) {
            System.out.println("Error occurred in EnterEmailIdAndPassword method");
            e.printStackTrace();
        }

    }

    public void LoginBtnClick() {
        try {
            driver.findElement(LoginBtn).click();

        } catch (Exception e) {
            System.out.println("Error occurred in LoginBtnClick method");
            e.printStackTrace();
        }
    }

    public String getErrorOfLoginText () {
        return driver.findElement(ErrorOfLogin).getText();
    }
}
