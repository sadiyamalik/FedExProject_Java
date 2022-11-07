package StepsDefinitions;

import BaseClasses.DriverUtil;
import PageObjects.SignupPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;

public class SignupTest extends DriverUtil {

    public SignupPage PageObj= new SignupPage(driver);
    public SignupTest(){
        super();
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;
    @When("Select Open an Account option on fedEx home page")
    public void select_open_an_account_option_on_fed_ex_home_page() {
        try{
            PageObj.SignInLoginIconClick();
            PageObj.CreateAccountLinkClick();
            PageObj.CreateAccountBtnClick();
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @Then("Validate the Open an Account Page")
    public void validate_the_open_an_account_page() {
        try{
           String text = PageObj.getCreateAccountPageText();
           System.out.println("Create Account Page Validation === " + text);
            Assert.assertEquals("Welcome to FedEx. Let’s get started.",text);

        }catch(Exception e){
            System.out.println("Error occurred in validate_the_open_an_account_page method" );
            e.printStackTrace();
        }
    }

    @Then("Enter details  {string} {string} {string} {string} {string} {string} {string} {string}")
    public void enter_details(String FName, String LName, String country, String Address, String PostCode, String City, String Phone , String EmailId) {
        try{
            PageObj.EnterFirstName(FName);
            PageObj.EnterLastName(LName);
            PageObj.EnterCountry(country);
            PageObj.EnterAddress(Address);
            PageObj.EnterPostCode(PostCode);
            PageObj.EnterCity(City);
            PageObj.EnterPhone(Phone);
            PageObj.EnterEmail(EmailId);
            Thread.sleep(2000);

        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @When("Click on the button Enter the login details and redirect to other page")
    public void click_on_the_button_enter_the_login_details_and_redirect_to_other_page() {
        try{
            PageObj.EnterLoginDetailsClick();
            PageObj.ClickPageBody();
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @Then("Validate Email id Displayed in User ID field")
    public void validate_email_id_displayed_in_user_id_field() {
        try{
           String text = PageObj.getUserIdText();
           System.out.println("After Enter Details User Id ====" + text);
           Assert.assertEquals("USER ID",text);
        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @Then("Enter password {string} and confirm password {string}")
    public void enter_password_and_confirm_password(String Password, String ConfirmPassword) {
        try{
            PageObj.EnterPassword(Password);
            PageObj.EnterConfirmPassword(ConfirmPassword);
        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @Then("Select the private policy option")
    public void select_the_private_policy_option() {
        try{
                PageObj.ClickConfirmPrivacy();

        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @When("Select account type personal")
    public void select_account_type_personal() {
        try{
            js.executeScript("window.scrollBy(0,250)", "");
            PageObj.ClickCreateUserIdBtn();
            Thread.sleep(2000);

        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @When("Validate the message User is created")
    public void validate_the_message_user_is_created() {
        try{
           String txt = PageObj.getSaveText();
           String Actxt = "Looks like we’re having trouble connecting. Please refresh the page.";
           Assert.assertEquals(Actxt,txt);
        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @Then("Create a User with out selecting private policy option")
    public void create_a_user_with_out_selecting_private_policy_option() {
        try{

            PageObj.ClickCreateUserIdBtn();
            js.executeScript("window.scrollBy(0,100)", "");
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println("Error occurred in create_a_user_with_out_selecting_private_policy_option method" );
            e.printStackTrace();
        }
    }

    @Then("Validate the message for private policy {string}")
    public void validate_the_message_for_private_policy(String text) {
        try{
            String txt = PageObj.getPrivacyText();
            Assert.assertEquals(text,txt);
        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

}
