package StepsDefinitions;

import BaseClasses.DriverUtil;
import PageObjects.TrackNoSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class TrackNoSearchTest extends DriverUtil {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public TrackNoSearchPage PageObj= new TrackNoSearchPage(driver);
    public TrackNoSearchTest(){
        super();
    }
    @When("User Search for invalid Track id using track number {string}")
    public void user_search_for_invalid_track_id_using_track_number(String string) {
        try{

            PageObj.EnterTrackNum(string);
            PageObj.TrackBtnClick();

        }catch(Exception e){
            System.out.println("Error occurred in user_search_for_invalid_track_id_using_track_number method" );
            e.printStackTrace();
        }
    }

    @When("Validate the displayed warning message")
    public void validate_the_displayed_warning_message() {
        try{
            Assert.assertTrue(PageObj.ValidateTrackResult().isDisplayed());
            String text = PageObj.getWarningMsg();
            System.out.println("Tracking Result Message ====" + text);
            String[] words= text.split(".");
            System.out.println("Split text ==" + words);
        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @When("Go to the link  {string}")
    public void go_to_the_link(String string) {
        try{
            String text = PageObj.getMultiTrackLabelText();
            System.out.println("Multi Tracking label ==" + text);
            if (text.equals(string)){
            PageObj.MultiTrackNumClick();}

        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @Then("Validate multiple tracking numbers screen with message {string}")
    public void validate_multiple_tracking_numbers_screen_with_message(String string) {
        try{
            String text =PageObj.getThirtyTrackingLabel();
            System.out.println("Multi Tracking Block Title label ==" + text);
            Assert.assertEquals(string,text);
        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @When("Search multiple tracking numbers {string}")
    public void search_multiple_tracking_numbers(String trackNum) {
        try{
            js.executeScript("window.scrollBy(0,300)", "");
            PageObj.enterTrackingNumbers(trackNum);
            PageObj.MultiTrackBtnClick();
        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }



}
