$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Pratima Sharma/eclipse-workspace/cucumberProj/src/main/java/features/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#user demo"
    }
  ],
  "line": 2,
  "name": "Login google",
  "description": "",
  "id": "login-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "user login gmail",
  "description": "",
  "id": "login-google;user-login-gmail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#Scenario Outline: user login gmail"
    }
  ],
  "line": 7,
  "name": "user is on gmail page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user sign in",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "user1",
        "pwd"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user is navigated to gmail",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitionLogin.user_is_on_login_page()"
});
formatter.result({
  "duration": 8629398600,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionLogin.user_sign_in()"
});
formatter.result({
  "duration": 1563582400,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionLogin.user_enters_user_and_pass(DataTable)"
});
formatter.result({
  "duration": 2620202100,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionLogin.clicks_on_login_button()"
});
formatter.result({
  "duration": 72000,
  "status": "passed"
});
formatter.match({
  "location": "stepdefinitionLogin.user_is_navigated_to_gmail()"
});
formatter.result({
  "duration": 191600,
  "status": "passed"
});
});