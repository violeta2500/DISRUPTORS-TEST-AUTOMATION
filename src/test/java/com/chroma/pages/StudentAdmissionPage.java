package com.chroma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class StudentAdmissionPage {

    /* STUDENT ADMISSION TEXT */
    @FindBy(xpath = "//h4[normalize-space()='Student Admission']")
    public WebElement studentAdmissionText;

    /* STUDENT ADMISSION NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@name='admission_no']")
    public WebElement studentAdmissionNumberTextBox;

    /* CLASS DROP DOWN */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    /* SECTION DROP DOWN */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    /* FIRST NAME TEXT BOX */
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;

    /* LAST NAME TEXT BOX */
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextBox;

    /* GENDER DROP DOWN */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    /* DATE OF BIRTH CALENDAR */
    @FindBy(xpath = "//input[@name='dob']")
    public WebElement dateOfBirthCalendar;

    /* EMAIL ADDRESS TEXT BOX */
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailAddressTextBox;

    /* MOBILE NUMBER TEXT BOX */
    @FindBy(xpath = "(//input[@id='custom_fields[students][1]'])[1]")
    public WebElement mobileNumberTextBox;

    /* FATHER NAME TEXT BOX */
    @FindBy(xpath = "//input[@name='father_name']")
    public WebElement fatherNameTextBox;

    /* FATHER PHONE NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@name='father_phone']")
    public WebElement fatherPhoneNumberTextBox;

    /* FATHER OCCUPATION TEXT BOX */
    @FindBy(xpath = "//input[@name='father_occupation']")
    public WebElement fatherOccupationTextBox;

    /* MOTHER NAME TEXT BOX */
    @FindBy(xpath = "//input[@name='mother_name']")
    public WebElement motherNameTextBox;

    /* MOTHER PHONE NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@name='mother_phone']")
    public WebElement motherPhoneNumberTextBox;

    /* MOTHER OCCUPATION TEXT BOX */
    @FindBy(xpath = "//input[@name='mother_occupation']")
    public WebElement motherOccupationTextBox;

    /* SAVE BUTTON */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* FATHER RADIO BUTTON */
    @FindBy(xpath = "//label[normalize-space()='Father']")
    public WebElement fatherRadioButton;

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
