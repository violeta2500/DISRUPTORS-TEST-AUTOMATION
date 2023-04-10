package com.chroma.stepDefinitions;

import com.chroma.pages.DashboardPage;
import com.chroma.pages.StudentAdmissionPage;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.JavascriptUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAdmissionStepDef {

    DashboardPage dashboardPage = new DashboardPage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @When("navigates to Student Information module")
    public void navigates_to_Student_Information_module() {
        CommonUtils.waitForVisibility(dashboardPage.studentInformationModule);
        dashboardPage.studentInformationModule.click();
    }

    @When("navigates to Student Admission submodule")
    public void navigates_to_Student_Admission_submodule() {
        CommonUtils.waitForVisibility(dashboardPage.studentAdmissionSubModule);
        dashboardPage.studentAdmissionSubModule.click();
        boolean isStudentAdmissionTextDisplayed = studentAdmissionPage.studentAdmissionText.isDisplayed();
        CommonUtils.assertTrue(isStudentAdmissionTextDisplayed);
    }

    @When("enters student admission number {string}")
    public void enters_student_admission_number(String admissionNumber) {
        studentAdmissionPage.studentAdmissionNumberTextBox.sendKeys(admissionNumber);
    }

    @When("selects Class {string} and Section {string}")
    public void selects_Class_and_Section(String className, String sectionName) {
        CommonUtils.selectDropDownValue(className, studentAdmissionPage.classDropDown);
        CommonUtils.selectDropDownValue(sectionName, studentAdmissionPage.sectionDropDown);
    }

    @When("enters first name {string} and last name {string}")
    public void enters_first_name_and_last_name(String firstName, String lastName) {
        studentAdmissionPage.firstNameTextBox.sendKeys(firstName);
        studentAdmissionPage.lastNameTextBox.sendKeys(lastName);
    }

    @When("selects gender {string}")
    public void selects_gender(String gender) {
        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderDropDown);
    }

    @When("enters Date of Birth {string}")
    public void enters_Date_of_Birth(String dateOfBirth) {
        JavascriptUtils.selectDateByJS(studentAdmissionPage.dateOfBirthCalendar, dateOfBirth);
        CommonUtils.sleep(2000);
    }

    @When("enters email address {string}")
    public void enters_email_address(String emailAddress) {
        studentAdmissionPage.emailAddressTextBox.sendKeys(emailAddress);
    }

    @When("enters mobile number {string}")
    public void enters_mobile_number(String mobileNumber) {
        studentAdmissionPage.mobileNumberTextBox.sendKeys(mobileNumber);
    }

    @When("enters father name {string}")
    public void enters_father_name(String fatherName) {
        studentAdmissionPage.fatherNameTextBox.sendKeys(fatherName);
    }

    @When("enters father phone number {string}")
    public void enters_father_phone_number(String fatherPhoneNumber) {
        studentAdmissionPage.fatherPhoneNumberTextBox.sendKeys(fatherPhoneNumber);
    }

    @When("enters father occupation {string}")
    public void enters_father_occupation(String fatherOccupation) {
        studentAdmissionPage.fatherOccupationTextBox.sendKeys(fatherOccupation);
    }

    @When("enters mother name {string}")
    public void enters_mother_name(String motherName) {
        studentAdmissionPage.motherNameTextBox.sendKeys(motherName);
    }

    @When("enters mother phone number {string}")
    public void enters_mother_phone_number(String motherPhoneNumber) {
        studentAdmissionPage.motherPhoneNumberTextBox.sendKeys(motherPhoneNumber);
    }

    @When("enters mother occupation {string}")
    public void enters_mother_occupation(String motherOccupation) {
        studentAdmissionPage.motherOccupationTextBox.sendKeys(motherOccupation);
    }

    @Then("student is succesfully admitted")
    public void student_is_succesfully_admitted() {
        CommonUtils.scrollIntoView(studentAdmissionPage.saveButton);
        studentAdmissionPage.saveButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.sleep(1000);
    }

    @When("clicks on Father radio button")
    public void clicks_on_Father_radio_button() {
        studentAdmissionPage.fatherRadioButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CommonUtils.sleep(1000);
    }

}
