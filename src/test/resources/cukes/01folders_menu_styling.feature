Feature: Folders menu styling

  Scenario: Folder "Kosz" is not bold
    When ziutek is logged in
    Then Folder "Kosz" is bold

  Scenario: Folder "Odebrane" is bold while others are not
    When ziutek is logged in
    Then Folder "Odebrane" is bold
    And Folders other than "Odebrane" are not bold