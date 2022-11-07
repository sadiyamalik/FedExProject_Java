package StepsDefinitions;

import BaseClasses.DriverUtil;
import PageObjects.ShipWithOutAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ShipWithOutAccountTest extends DriverUtil  {

    public ShipWithOutAccountPage PageObj= new ShipWithOutAccountPage(driver);
    public ShipWithOutAccountTest(){
        super();
    }

    @When("User select the option Ship without account from ship menu")
    public void user_select_the_option_ship_without_account_from_ship_menu() {
        try{

        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @Then("User  Enter the  Address Information From_Name From_CountryFrom_AddressFrom_PostCodeFrom_CityFrom_PhoneTo_NameTo_CountryTo_PostCodeTo_CityTo_Phone")
    public void user_enter_the_address_information_from_name_from_country_from_address_from_post_code_from_city_from_phone_to_name_to_country_to_post_code_to_city_to_phone() {
        try{

        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @When("Select FedEx Tube option from shipment details")
    public void select_fed_ex_tube_option_from_shipment_details() {
        try{

        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }

    @Then("Validate the amount displayed")
    public void validate_the_amount_displayed() {
        try{

        }catch(Exception e){
            System.out.println("Error occurred in select_language method" );
            e.printStackTrace();
        }
    }
}
