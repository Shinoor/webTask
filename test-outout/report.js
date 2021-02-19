$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/org/example/features/infoUpdates.feature");
formatter.feature({
  "line": 1,
  "name": "Personal information updates",
  "description": "",
  "id": "personal-information-updates",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14289146100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Update personal Information",
  "description": "",
  "id": "personal-information-updates;update-personal-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application Page Tittle automation practice",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Application_Home_Page()"
});
formatter.result({
  "duration": 15911174200,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.application_Page_Tittle_automation_practice()"
});
formatter.result({
  "duration": 291331500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.close_the_Browser()"
});
formatter.result({
  "duration": 583202000,
  "status": "passed"
});
formatter.after({
  "duration": 12567069500,
  "status": "passed"
});
});