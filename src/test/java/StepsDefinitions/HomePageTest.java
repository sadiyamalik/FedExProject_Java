package StepsDefinitions;
import PageObjects.HomePage;
import org.junit.Assert;
import BaseClasses.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest extends DriverUtil {


    public HomePage PageObj= new HomePage(driver);

    public HomePageTest(){
        super();
    }

    @Given("Open  the Fedex homepage")
    public void open_the_fedex_homepage() {
        try{
            String ActualURL = getURL();
            System.out.println("*********Print Current URL**********" + ActualURL);
            Assert.assertEquals(ActualURL, config.getpropurl());

        }catch(Exception e){
            System.out.println("Error occurred in open_the_fedex_homepage method" );
            e.printStackTrace();
        }


    }

    @When("Select  Language {string}")
    public void select_language(String language) {

        try{

             String lang =   PageObj.getlangtext();;
             PageObj.LanguageClick();
             Assert.assertEquals(lang, language);
             PageObj.AcceptCookies();

        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }


    }

    @Then("Verify FedEx Logo on home page")
    public void verify_fed_ex_logo_on_home_page() {
        try{
            String logotext=  PageObj.verifylogo();
            System.out.println("********Logo  text*********:" + logotext );
            String[] logotxt = logotext.split(" ");
            for (String txt :logotxt){
                System.out.println("****Text after split:" +txt);
                if (txt.contains("FedEx") ){
                    System.out.println(" **************** logo showing the correct value: " + txt);
                   Assert.assertEquals("FedEx",txt);
                   break;
                    // Assert.assertTrue(logotext,true);
                }
            }

        } catch (Exception e){
            System.out.println("Error occurred in erify_fed_ex_logo_on_home_page" );
            e.printStackTrace();
            //System.out.println(e.getLocalizedMessage()+ "Not showing the correct value" );
            //Assert.assertTrue(false);

        }

    }

    @Then("Verify label of hero image {string}")
    public void verify_label_of_hero_image(String string) {

        try{
             String HeroLabel = PageObj.getHomePageHeroText() ;
              System.out.println("*********Print Hero Label of Home Page**********" + HeroLabel);
              Assert.assertEquals(string,HeroLabel);

        }catch(Exception e){
            System.out.println("Error occurred in verify_label_of_hero_image method" );
            e.printStackTrace();
        }

    }



}
