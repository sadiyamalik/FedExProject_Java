Feature: Land on home page

  @homepage
  Scenario: Land on home page
    Given  Open  the Fedex homepage
    When   Select  Language "ENGLISH"
    Then   Verify FedEx Logo on home page
    And    Verify label of hero image "Where now meets next."
