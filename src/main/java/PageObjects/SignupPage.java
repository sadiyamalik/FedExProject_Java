package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {

    WebDriver driver;
    By SignInLoginIcon = By.xpath("//span[@class='fxg-user-options__sign-in-text']");
    By CreateAccountLink = By.xpath("//div[contains(@class,'wlgnlink-class bound')]//a[contains(@title,'OPEN AN ACCOUNT')][normalize-space()='OPEN AN ACCOUNT']");
    By CreateAccountBtn = By.xpath("//a[@class='fxg-button fxg-button--orange fxg-mobile--hide fxg-align-left']");
    By CreateAccountPage = By.xpath("//h1[contains(text(),'Welcome to FedEx. Let’s get started.')]");
    By FirstName = By.xpath("//input[@id='first-name']");
    By LastName = By.xpath("//input[@id='last-name']");
    By Country = By.xpath("//select[@id='country']");
    By Address = By.xpath("//input[@id='address']");
    By PostCode = By.xpath("//input[@id='postal-code']");
    By City = By.xpath("//input[@id='city']");
    By Phone = By.xpath("//input[@id='phone']");
    By Email = By.xpath("//input[@id='email']");
    By EnterLoginDetails = By.xpath("//button[normalize-space()='Enter login details'] ");

    By UserId = By.xpath("//body/reg-app[1]/main[1]/app-register-user-feature[1]/app-signup-details-step[1]/app-signup-form[1]/form[1]/app-text-input[1]/div[1]");
    By Password = By.xpath("//input[@id='password']");
    By ConfirmPassword = By.xpath("//input[@id='confirmPassword']");

    By ConfirmPrivacy = By.xpath("//label[@id='PP_AND_TAC-label']");
    By CreateUserIdBtn = By.xpath("//button[normalize-space()='Create my User ID']");
    By UseEmailAsUserID = By.xpath("//label[normalize-space()='Use my email as my User ID']");
    By SaveText = By.xpath("//h1[@class ='heading ng-star-inserted']");
    By PrivacyText = By.xpath(" //div[contains(text(),'Please accept the fedex.com Terms of Use via the c')]");
   By PageBody = By.xpath("//body[@class ='has-cookie-consent']");
    public SignupPage(WebDriver driver){

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

    public void CreateAccountLinkClick() {
        try {
            driver.findElement(CreateAccountLink).click();

        } catch (Exception e) {
            System.out.println("Error occurred in CreateAccountLinkClick method");
            e.printStackTrace();
        }
    }

    public void CreateAccountBtnClick() {
        try {
            driver.findElement(CreateAccountBtn).click();

        } catch (Exception e) {
            System.out.println("Error occurred in CreateAccountLinkClick method");
            e.printStackTrace();
        }
    }

    public String getCreateAccountPageText () {
        return driver.findElement(CreateAccountPage).getText();
    }

    public void EnterFirstName(String FirstNameVal) {
     driver.findElement(FirstName).sendKeys(FirstNameVal);
    }
    public void EnterLastName(String LastNameVal) {
        driver.findElement(LastName).sendKeys(LastNameVal);
    }

    public void EnterCountry(String CountryVal) {
        driver.findElement(Country).sendKeys(CountryVal);
    }
    public void EnterAddress(String AddressVal) {
        driver.findElement(Address).sendKeys(AddressVal);
    }
    public void EnterPostCode(String PostCodeVal) {
        driver.findElement(PostCode).sendKeys(PostCodeVal);
    }
    public void EnterCity(String CityVal) {
        driver.findElement(City).sendKeys(CityVal);
    }
    public void EnterPhone(String PhoneVal) {
        driver.findElement(Phone).sendKeys(PhoneVal);
    }
    public void EnterEmail(String EmailVal) {
        driver.findElement(Email).sendKeys(EmailVal);
    }

    public void EnterLoginDetailsClick() {
        try {
            driver.findElement(EnterLoginDetails).click();

        } catch (Exception e) {
            System.out.println("Error occurred in EnterLoginDetailsClick method");
            e.printStackTrace();
        }
    }

    public String getUserIdText () {
        return driver.findElement(UserId).getText();
                //getAttribute("value");
    }

    public void EnterPassword(String PasswordVal) {
        driver.findElement(Password).sendKeys(PasswordVal);
    }
    public void EnterConfirmPassword(String ConfirmPasswordVal) {
        driver.findElement(ConfirmPassword ).sendKeys(ConfirmPasswordVal);
    }
    public void ClickConfirmPrivacy() {
        driver.findElement(ConfirmPrivacy ).click();
    }
    public void ClickCreateUserIdBtn() {
        driver.findElement(CreateUserIdBtn ).click();
    }

    public WebElement UseEmailAsUserIDEle() {
      return   driver.findElement(UseEmailAsUserID);
    }

    public String getSaveText () {
        return driver.findElement(SaveText).getText();
    }

    public String getPrivacyText () {
        return driver.findElement(PrivacyText).getText();
    }

    public void ClickPageBody() {
        driver.findElement(PageBody).sendKeys(Keys.ENTER);
    }

}
