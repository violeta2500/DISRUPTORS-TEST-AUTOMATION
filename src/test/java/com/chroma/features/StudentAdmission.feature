Feature: This feature file contains Student Admission Test Scenarios

  Scenario: Student Admission
    Given a CTSMS user is on the home page "https://mexil.it/chroma_tech_academy/test/site/login"
    When the user logs in with valid credentials username "general@teacher.com" and password "123456"
    And navigates to Student Information module
    And navigates to Student Admission submodule
    And enters student admission number "5614654"
    And selects Class "SDET" and Section "Java 11 for Cool People"
    And enters first name "Chroma" and last name "Tech"
    And selects gender "Male"
    And enters Date of Birth "04/01/1990"
    And enters email address "chroma@test.com"
    And enters mobile number "7036875816"
    And enters father name "CHROMA FATHER"
    And enters father phone number "703-687-5816"
    And enters father occupation "Software Engineer"
    And enters mother name "CHROMA MOTHER"
    And enters mother phone number "703-687-5816"
    And enters mother occupation "Project Manager"
    And clicks on Father radio button
    Then student is succesfully admitted
    Then student record is succesfully deleted with class "SDET" and section "Java 11 for Cool People" and admission number "5614654"

  @StudentAdmission
  Scenario Outline: Student Admission
    Given a CTSMS user is on the home page "<URL>"
    When the user logs in with valid credentials username "<USERNAME>" and password "<PASSWORD>"
    And navigates to Student Information module
    And navigates to Student Admission submodule
    And enters student admission number "<STUDENT ADMISSION NUMBER>"
    And selects Class "<CLASS>" and Section "<SECTION>"
    And enters first name "<FIRST NAME>" and last name "<LAST NAME>"
    And selects gender "<GENDER>"
    And enters Date of Birth "<DOB>"
    And enters email address "<EMAIL ADDRESS>"
    And enters mobile number "<MOBILE NUMBER>"
    And enters father name "<FATHER NAME>"
    And enters father phone number "<FATHER PHONE NUMBER>"
    And enters father occupation "<FATHER OCCUPATION>"
    And enters mother name "<MOTHER NAME>"
    And enters mother phone number "<MOTHER PHONE NUMBER>"
    And enters mother occupation "<MOTHER OCCUPATION>"
    And clicks on Father radio button
    Then student is succesfully admitted
    Then student record is succesfully deleted with class "<CLASS>" and section "<SECTION>" and admission number "<STUDENT ADMISSION NUMBER>"

    Examples: 
      | URL                                                  | USERNAME            | PASSWORD | STUDENT ADMISSION NUMBER | CLASS | SECTION                 | FIRST NAME | LAST NAME | GENDER | DOB        | EMAIL ADDRESS   | MOBILE NUMBER | FATHER NAME   | FATHER PHONE NUMBER | FATHER OCCUPATION | MOTHER NAME   | MOTHER PHONE NUMBER | MOTHER OCCUPATION |
      | https://mexil.it/chroma_tech_academy/test/site/login | general@teacher.com |   123456 |                  5614654 | SDET  | Java 11 for Cool People | Chroma     | Tech      | Male   | 04/01/1990 | chroma@test.com |    7036875816 | CHROMA FATHER |        703-687-5816 | Software Engineer | CHROMA MOTHER |        703-687-5816 | Project Manager   |
      | https://mexil.it/chroma_tech_academy/test/site/login | general@teacher.com |   123456 |                  5614654 | SDET  | Java 11 for Cool People | Alex       | Ott       | Male   | 01/01/1989 | alex@test.com   |    7036875816 | CHROMA FATHER |        703-687-5816 | Software Engineer | CHROMA MOTHER |        703-687-5816 | Project Manager   |
