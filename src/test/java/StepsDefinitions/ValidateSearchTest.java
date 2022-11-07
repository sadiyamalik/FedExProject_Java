package StepsDefinitions;

import BaseClasses.DriverUtil;
import PageObjects.ValidateSearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class ValidateSearchTest extends DriverUtil  {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public ValidateSearchPage PageObj= new ValidateSearchPage(driver);
    public ValidateSearchTest(){
        super();
    }
    @When("Search on the Fed app by entering the {string}")
    public void search_on_the_fed_app_by_entering_the(String text) {
        try{
            PageObj.HomepageIconclick();
            Thread.sleep(500);
            PageObj.HomepageSearch(text);
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println("Error occurred in search_on_the_fed_app_by_entering_the method" );
            e.printStackTrace();
        }
    }

    @Then("Select the option  {string} by scrolling down the search result")
    public void select_the_option_by_scrolling_down_the_search_result(String string) {
        try{
            js.executeScript("window.scrollBy(0,925)", "");
            PageObj.SearchTextClick();
           driver.navigate().back();
        }catch(Exception e){
            System.out.println("Error occurred in select_the_option_by_scrolling_down_the_search_result method" );
            e.printStackTrace();
        }
    }

    @Then("Validate {string} page displayed")
    public void validate_page_displayed(String string) {
        try{
            String text = PageObj.getSearchText();
            System.out.println("Search result text validation ===== " + text );
            Assert.assertEquals(text, string);

        }catch(Exception e){
            System.out.println("Error occurred in validate_page_displayed method" );
            e.printStackTrace();
        }
    }

    @Then("Pagination to {string} page from the search result")
    public void pagination_to_page_from_the_search_result(String string) {
        try{
            js.executeScript("window.scrollBy(0,925)", "");
            PageObj.SelectPagination(string);
            Thread.sleep(2000);

        }catch(Exception e){
            System.out.println("Error occurred in pagination_to_page_from_the_search_resul method" );
            e.printStackTrace();
        }
    }
}
