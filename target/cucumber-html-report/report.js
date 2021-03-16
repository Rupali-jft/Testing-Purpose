$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In Gmail",
  "description": "",
  "id": "sign-in-gmail",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Entering the login credentials",
  "description": "",
  "id": "sign-in-gmail;entering-the-login-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on the login page of Gmail",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Entering the valid Credentials username and password",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Step_Def.i_am_on_the_login_page_of_Gmail()"
});
formatter.result({
  "duration": 6189977900,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step_Def.entering_the_valid_Credentials_username_and_password()"
});
formatter.result({
  "duration": 1209358400,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step_Def.click_on_Login_button()"
});
formatter.result({
  "duration": 5389824000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Compose Function",
  "description": "",
  "id": "sign-in-gmail;compose-function",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on Gmail Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Click on Compose icon",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Enter email address in To field",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Subject in the subject field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Write the body of the mail",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on Send button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Step_Def.i_am_on_Gmail_Home_Page()"
});
formatter.result({
  "duration": 6806505700,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step_Def.click_on_Compose_icon()"
});
formatter.result({
  "duration": 248787500,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step_Def.enter_email_address_in_To_field()"
});
formatter.result({
  "duration": 146185700,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step_Def.subject_in_the_subject_field()"
});
formatter.result({
  "duration": 153482500,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step_Def.write_the_body_of_the_mail()"
});
formatter.result({
  "duration": 237446800,
  "status": "passed"
});
formatter.match({
  "location": "Login_Step_Def.click_on_Send_button()"
});
formatter.result({
  "duration": 136707500,
  "status": "passed"
});
});