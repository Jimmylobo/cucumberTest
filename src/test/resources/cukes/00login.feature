Feature: Log into WP's mail account

  Scenario: Successfully log into the mail account
    Given browser is opened
    And WP mail login page is opened
    When "login lub email" field is populated with "ziutek2137"
    And "hasło" field is populated with "qweasd123"
    And button "Zaloguj" is clicked
#    Then mail home page is displayed