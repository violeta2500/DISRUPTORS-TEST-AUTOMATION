package com.chroma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chroma.web.WebDriverUtils;

public class BulkDeletePage {

    /* CLASS DROP DOWN */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    /* SECTION DROP DOWN */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    /* SEARCH BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    /* DELETE BUTTON */
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public WebElement deleteButton;

    /**
     * USE THIS METHOD TO DYNAMICALLY LOCATE RECORDS IN BULK DELETE PAGE
     * @param admissionNumber
     * @return
     */
    public WebElement studentAdmissionCheckBoxDynamicLocator(String admissionNumber) {
        return WebDriverUtils.driver
                .findElement(By.xpath("//*[contains(text(),'" + admissionNumber + "')]//parent::tr/td/input"));

    }

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
