package StepsDefinitions;

import BaseClasses.DriverUtil;
import PageObjects.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginTest extends DriverUtil {

    public LoginPage PageObj= new LoginPage(driver);
    public LoginTest(){
        super();
    }

    @When("Login with valid Username {string} and Password {string}")
    public void login_with_valid_username_and_password(String userName, String password) {
        try{
            PageObj.SignInLoginIconClick();
            PageObj.LoginLinkClick();
            PageObj.EnterEmailId(userName);
            PageObj.EnterPassword(password);
            PageObj.LoginBtnClick();
        }catch(Exception e){
            System.out.println("Error occurred in login_with_valid_username_and_password  method" );
            e.printStackTrace();
        }
    }

    @Then("Validate the successful Login with message {string}")
    public void validate_the_successful_login_with_message(String string) {
        try{
          String text = PageObj.getErrorOfLoginText();
          System.out.println("After Login Error message === " + text);
            Assert.assertEquals(string,text);
        }catch(Exception e){
            System.out.println("Error occurred in validate_the_successful_login_with_message method" );
            e.printStackTrace();
        }
    }
}
