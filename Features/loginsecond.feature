Feature: Facebook login
  Scenario: loginpage
    Given Open Facebook and launch the application
    |AAA|Ruby|
    |BBB|Shamili|
    When Enter the Username and Password
    |Username|Password|Gender|
    |AAA|MaheshDeva|Male|
    |BBB|Manikandan|Male|
    |CCC|Karthika|Female|
    And Sample & annotation method
    Then Close the browser
    But Sample conjuction annotation method