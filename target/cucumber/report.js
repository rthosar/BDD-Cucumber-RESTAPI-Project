$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search/RestApiSearch.feature");
formatter.feature({
  "name": "Search the Github Repositories",
  "description": "\tusing keyword...",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Search the Github Repositories",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open a github repo and search a repo with keyword \"\u003coption\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "verify if the http response code is \u003coutput\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "option",
        "output"
      ]
    },
    {
      "cells": [
        "java",
        "200"
      ]
    },
    {
      "cells": [
        "angular4",
        "200"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Search the Github Repositories",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open a github repo and search a repo with keyword \"java\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchRepoStepDef.open_a_github_repo_and_search_a_repo_with_keyword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if the http response code is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchRepoStepDef.verify_if_the_http_response_code_is(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search the Github Repositories",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open a github repo and search a repo with keyword \"angular4\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchRepoStepDef.open_a_github_repo_and_search_a_repo_with_keyword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify if the http response code is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchRepoStepDef.verify_if_the_http_response_code_is(Integer)"
});
formatter.result({
  "status": "passed"
});
});