@tag
Feature: Creating User

  Scenario: Creating a User Creds for Wallmart Canada site
    Given Consumer has the required details to create a User
  
  @script
  Scenario Outline: Validate searching/sorting of Apples by price

    Given User is at homepage of walmart <url> website
    When User search for "Apples"
    Then Apples should display on product list page(PLP) with various sorting options
    And User sorts the list by price
    Then The list get sorted as per price
    
    Examples:
    |url                                     |
    |https://www.walmart.ca/en/grocery/N-117 |