$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/loginsecond.feature");
formatter.feature({
  "name": "Facebook login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "loginpage",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open Facebook and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStepsSecond.open_facebook_and_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStepsSecond.enter_the_Username_and_Password()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.LoginPageStepsSecond.enter_the_Username_and_Password(LoginPageStepsSecond.java:26)\r\n\tat ✽.Enter the Username and Password(Features/loginsecond.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepsSecond.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});