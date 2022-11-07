package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TrackNoSearchPage {
    WebDriver driver;

    By TrackTextBox =By.id("trackingnumber");
    By TrackBtn =By.xpath("//button[@id='btnSingleTrack']");
    By WarningIcon =By.cssSelector(".trk-shared-icon-warning");

    By WarningMsg =By.xpath("//div[@class ='fdx-u-color--text fdx-u-line-height--large fdx-u-mt--2 text-left']");
    By MultiTrackNumLabel =By.xpath("(//a[normalize-space()='MULTIPLE TRACKING NUMBERS'])[1]");
    By ThirtyTrackingLabel = By.xpath("//h2[normalize-space()='Enter up to 30 FedEx tracking numbers']");
    By MultiTrackBtn =By.xpath ("//button[@id='btnMultiTrack']");
    public TrackNoSearchPage(WebDriver driver){

        this.driver = driver;

    }

    public void EnterTrackNum (String txt) {
        try {
            driver.findElement(TrackTextBox).sendKeys(txt);
        } catch (Exception e) {
            System.out.println("Error occurred in EnterTrackNum method");
            e.printStackTrace();
        }
    }
    public void TrackBtnClick() {
        try {
            driver.findElement(TrackBtn).click();

        } catch (Exception e) {
            System.out.println("Error occurred in TrackBtnClick method");
            e.printStackTrace();
        }
    }

    public WebElement ValidateTrackResult() {

        return driver.findElement(WarningIcon);
    }

    public String  getWarningMsg() {

        return driver.findElement(WarningMsg).getText();
    }

    public void MultiTrackNumClick() {
        try {
            driver.findElement(MultiTrackNumLabel).click();

        } catch (Exception e) {
            System.out.println("Error occurred in MultiTrackNumClick method");
            e.printStackTrace();
        }
    }

    public String  getMultiTrackLabelText() {

        return driver.findElement(MultiTrackNumLabel).getText();
    }

    public String  getThirtyTrackingLabel() {

        return driver.findElement(ThirtyTrackingLabel).getText();
    }

    public void enterTrackingNumbers(String TrackId){

        try{

            for(int i=1;i<4;i++)

            {

                By MultiTracks = By.xpath( "//form/div[" + i +"]/div/input");
                System.out.println("Track id inside enterTrackingNumbers " + TrackId);
                driver.findElement(MultiTracks).sendKeys(TrackId);

            }


        }catch (Exception e){

            System.out.println();

            e.printStackTrace();

        }

    }
    public void MultiTrackBtnClick() {
        try {
            driver.findElement(MultiTrackBtn).click();

        } catch (Exception e) {
            System.out.println("Error occurred in MultiTrackNumClick method");
            e.printStackTrace();
        }
    }

}
