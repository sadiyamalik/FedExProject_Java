Feature: Validate ship without account

  @FedexTube
  Scenario Outline: Validate Fedex Tube shipment detail option and amount
    Given Open the Fedex homepage using Language "ENGLISH"
    When  User select the option Ship without account from ship menu
    Then  User  Enter the  Address Information <From_Name> <From_Country><From_Address><From_PostCode><From_City><From_Phone><To_Name><To_Country><To_PostCode><To_City><To_Phone>
    When  Select FedEx Tube option from shipment details
    Then  Validate the amount displayed
    Examples:
      |From_Name | From_Country|From_Address|From_PostCode|From_City|From_Phone|To_Name|To_Country|To_PostCode|To_City|To_Phone|
      |From_Name | From_Country|From_Address|From_PostCode|From_City|From_Phone|To_Name|To_Country|To_PostCode|To_City|To_Phone|







