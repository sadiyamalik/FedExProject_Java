Feature:Change the language

  @ChangeLang
  Scenario: Change the language on the home page.
    Given Open the Fedex homepage using Language "ENGLISH"
    When  Select the "Netherlands" language homepage footer detail
    Then  Validate the URl contain NL