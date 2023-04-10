Feature: Sample Feature

  Scenario: Valid credentials login
    Given a CTSMS user is on the home page
    When the user logs in with valid credentials
    Then user is on the dashboard page

  @Test1 @Regression
  Scenario: Valid credentials login
    Given a CTSMS user is on the home page "https://mexil.it/chroma_tech_academy/test/site/login"
    When the user logs in with valid credentials username "general@teacher.com" and password "123456"
    Then user is on the dashboard page

  @Test2 @Regression
  Scenario: Valid credentials login
    Given a CTSMS user is on the home page "https://mexil.it/chroma_tech_academy/stage/site/login"
    When the user logs in with valid credentials
    Then user is on the dashboard page
 
  @Test3 @Regression
  Scenario: Valid credentials login
    Given a CTSMS user is on the home page "https://mexil.it/chroma_tech_academy/dev/site/login"
    When the user logs in with valid credentials
    Then user is on the dashboard page

  @Test4 @Regression
  Scenario: Valid credentials login
    Given a CTSMS user is on the home page properties file way
    When the user logs in with valid credentials
    Then user is on the dashboard page