$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Creating User",
  "description": "",
  "id": "creating-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Validate searching/sorting of Apples by price",
  "description": "",
  "id": "creating-user;validate-searching/sorting-of-apples-by-price",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@script"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is at homepage of walmart \u003curl\u003e website",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User search for \"Apples\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Apples should display on product list page(PLP) with various sorting options",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User sorts the list by price",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "The list get sorted as per price",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "creating-user;validate-searching/sorting-of-apples-by-price;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 17,
      "id": "creating-user;validate-searching/sorting-of-apples-by-price;;1"
    },
    {
      "cells": [
        "https://www.walmart.ca/en/grocery/N-117"
      ],
      "line": 18,
      "id": "creating-user;validate-searching/sorting-of-apples-by-price;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Validate searching/sorting of Apples by price",
  "description": "",
  "id": "creating-user;validate-searching/sorting-of-apples-by-price;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 7,
      "name": "@script"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is at homepage of walmart https://www.walmart.ca/en/grocery/N-117 website",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User search for \"Apples\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Apples should display on product list page(PLP) with various sorting options",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User sorts the list by price",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "The list get sorted as per price",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.walmart.ca/en/grocery/N-117",
      "offset": 31
    }
  ],
  "location": "StepDef.launch(String)"
});
formatter.result({
  "duration": 31259095978,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apples",
      "offset": 17
    }
  ],
  "location": "StepDef.search(String)"
});
formatter.result({
  "duration": 13230161189,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.sortOption()"
});
formatter.result({
  "duration": 5100211183,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.sortPrice()"
});
formatter.result({
  "duration": 5154793043,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.validateSortPrice()"
});
formatter.result({
  "duration": 69888295,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[1]/div[2]/div/div[1]/div[4]/section[3]/div[3]/div/article[1]/div/a/div[4]/span/div[2]/div[1]\"}\n  (Session info: chrome\u003d80.0.3987.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027WKMIN4524753\u0027, ip: \u0027fe80:0:0:0:c2d:4ab6:cc1a:8bed%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.116, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: /var/folders/fq/hrvpn2ds0c1...}, goog:chromeOptions: {debuggerAddress: localhost:56472}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 28f6ac5fadc3d28fda11d1b00489e987\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div[1]/div[2]/div/div[1]/div[4]/section[3]/div[3]/div/article[1]/div/a/div[4]/span/div[2]/div[1]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat page.SearchPage.validatePriceSorting(SearchPage.java:86)\n\tat stepDefinition.StepDef.validateSortPrice(StepDef.java:48)\n\tat ✽.Then The list get sorted as per price(Login.feature:14)\n",
  "status": "failed"
});
});