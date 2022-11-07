package StepsDefinitions;

import BaseClasses.DriverUtil;
import PageObjects.HomePage;
import PageObjects.LanguageChangePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


public class LanguageChangeTest extends DriverUtil {
    public HomePage PageObj= new HomePage(driver);
    public LanguageChangePage PageObj2= new LanguageChangePage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public LanguageChangeTest(){
        super();
    }

 @Given("Open the Fedex homepage using Language {string}")
    public void open_the_fedex_homepage_using_language(String language) {
     try{
         String lang =   PageObj.getlangtext();;
         PageObj.LanguageClick();
         Assert.assertEquals(lang, language);
         PageObj.AcceptCookies();
         PageObj.PageCloseClick();


     }catch(Exception e){
         System.out.println("Error occurred in select_language method" );
         e.printStackTrace();
     }
    }

    @When("Select the {string} language homepage footer detail")
    public void select_the_language_homepage_footer_detail(String Language){
        try{

            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            PageObj2.getLangDropDownVal();



        }catch(Exception e){
            System.out.println("Error occurred in select_the_language_homepage_footer_detail method" );
            e.printStackTrace();
        }
    }

    @Then("Validate the URl contain NL")
    public void validate_the_u_rl_contain_nl() {
        try{
            String ActualURL = getURL();
            System.out.println("*********Print Current URL**********" + ActualURL);
            String[] URLtext = ActualURL.split(".com");
            //https://www.fedex.com/nl-nl/home.html
            for (String txt :URLtext) {
                System.out.println("****Text of URL after split:" + txt);
                if (txt.contains("nl-nl")) {
                    System.out.println(" **************** URL showing the correct value: " + txt);
                    Assert.assertEquals("/nl-nl/home.html", txt);
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Error occurred in validate_the_u_rl_contain_nl method" );
            e.printStackTrace();
        }

    }

}
