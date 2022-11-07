Feature: Login to FedEx application user
  @Login
  Scenario Outline: Login FedEx with valid user
    Given Open the Fedex homepage using Language "ENGLISH"
    When  Login with valid Username "<UserName>" and Password "<Password>"
    Then  Validate the successful Login with message "We are having trouble establishing a connection. Please refresh the page."
    Examples:
      | UserName| Password |
      | sadiyamalik@hotmail.com|NewTest123|
