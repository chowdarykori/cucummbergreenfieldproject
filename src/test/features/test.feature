Feature:LoginFeature
  This feature deals with the loginfunctionality of the application
  Scenario: Login with correct username and password

    Given I navigate to the login page
   And I enter the username as admin and password as admin
   And  I click login
  Then  I should see the username and login
