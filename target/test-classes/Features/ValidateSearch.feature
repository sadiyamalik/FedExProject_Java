Feature: Validate the search the functionality

  @validateSearch
  Scenario: Validate the search functionality and select the option scrolling down the page
    Given Open the Fedex homepage using Language "ENGLISH"
    When  Search on the Fed app by entering the "test"
    Then  Select the option  "How to ship to Japan | Netherlands" by scrolling down the search result
    And   Validate "How to ship to Japan | Netherlands" page displayed

  @validateSearch2
  Scenario: Validate the search functionality and select the option scrolling down the page
    Given Open the Fedex homepage using Language "ENGLISH"
    When  Search on the Fed app by entering the "test"
    Then  Pagination to "Page 4" page from the search result





