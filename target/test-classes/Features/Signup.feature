Feature: Signup new account
@Signup
 Scenario Outline: Signup new account using Use my email as my User ID option
   Given Open the Fedex homepage using Language "ENGLISH"
    When  Select Open an Account option on fedEx home page
    Then  Validate the Open an Account Page
     And  Enter details  "<FirstName>" "<LastName>" "<Country>" "<Address>" "<PostalCode>" "<City>" "<PhoneNum>" "<Email>"
     When Click on the button Enter the login details and redirect to other page
     Then Validate Email id Displayed in User ID field
     Then Enter password "<Password>" and confirm password "<ConfirmPassword>"
     And  Select the private policy option
     When Select account type personal
     And  Validate the message User is created

   Examples:
     | FirstName |LastName  |Country     | Address               |PostalCode | City     |PhoneNum |Email | Password| ConfirmPassword |
     | testFname |TestLName |Netherlands | Amsterdam, Netherlands|1078mt     | Amsterdam |1234567 |test@hotmail.com | NewTest123| NewTest123 |


  @SignupWithOutPrivacy
  Scenario Outline: Signup new account with out selecting private policy
    Given Open the Fedex homepage using Language "ENGLISH"
    When  Select Open an Account option on fedEx home page
    Then  Validate the Open an Account Page
    And  Enter details  "<FirstName>" "<LastName>" "<Country>" "<Address>" "<PostalCode>" "<City>" "<PhoneNum>" "<Email>"
    When  Click on the button Enter the login details and redirect to other page
    Then  Validate Email id Displayed in User ID field
    Then  Enter password "<Password>" and confirm password "<ConfirmPassword>"
    And   Create a User with out selecting private policy option
    And   Validate the message for private policy "Please accept the fedex.com Terms of Use via the checkbox and click Create my user ID to proceed."


    Examples:
      | FirstName |LastName  |Country     | Address |PostalCode | City     |PhoneNum |Email | Password| ConfirmPassword |
      | testFname |TestLName |Netherlands | AddTest |1078mt     | Amsterdam |1234567 |test@hotmail.com | NewTest123| NewTest123 |