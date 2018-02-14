Feature: Folders menu styling

  Scenario: Folder "Odebrane" is bold while others are not
    When ziutek is logged in
    Then Folder "Odebrane" is bold
    And Folders other then "Odebrane" is not bold