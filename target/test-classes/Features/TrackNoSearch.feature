Feature: Test the functionality of homepage search box Track .

  @Tacking
  Scenario: Validate warning  message for searching invalid tracking number

    Given Open the Fedex homepage using Language "ENGLISH"
    When  User Search for invalid Track id using track number '213123123'
    And   Validate the displayed warning message

  @MultipleTracking
  Scenario Outline:Validate multiple tracking numbers functionality
    Given Open the Fedex homepage using Language "ENGLISH"
    When  Go to the link  "MULTIPLE TRACKING NUMBERS"
    Then  Validate multiple tracking numbers screen with message "Enter up to 30 FedEx tracking numbers"
    When  Search multiple tracking numbers "<TrackNums>"
    Then  Validate the displayed warning message

    Examples:
      | TrackNums |
      | 12233333  |
      | 12233333  |
      | 12233333  |