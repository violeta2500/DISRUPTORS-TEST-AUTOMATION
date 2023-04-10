package com.chroma.stepDefinitions;

import org.openqa.selenium.By;

import com.chroma.applicationConstants.ApplicationConstants;
import com.chroma.pages.LoginPage;
import com.chroma.utils.ConfigReader;
import com.chroma.utils.CucumberLogUtils;
import com.chroma.web.CommonUtils;
import com.chroma.web.WebDriverUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("a CTSMS user is on the home page")
    public void a_CTSMS_user_is_on_the_home_page() {
        WebDriverUtils.driver.get(ApplicationConstants.CTSMS_TEST_URL);
    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        WebDriverUtils.driver.findElement(By.xpath("//input[@id='form-username']")).sendKeys("general@teacher.com");
        WebDriverUtils.driver.findElement(By.xpath("//input[@id='form-password']")).sendKeys("123456");
        WebDriverUtils.driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
    }

    @Then("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        String actualURL = WebDriverUtils.driver.getCurrentUrl();
        String expectedURL = "https://mexil.it/chroma_tech_academy/test/admin/admin/dashboard";
        CommonUtils.assertEquals(actualURL, expectedURL);
        CommonUtils.sleep(5000);
    }

    @Given("a CTSMS user is on the home page {string}")
    public void a_CTSMS_user_is_on_the_home_page(String url) {
        WebDriverUtils.driver.get(url);
        CucumberLogUtils.logExtentScreenshot();
    }

    @Given("a CTSMS user is on the home page properties file way")
    public void a_CTSMS_user_is_on_the_home_page_properties_file_way() {
        WebDriverUtils.driver.get(ConfigReader.getPropertyValue("url"));
    }

    @When("the user logs in with valid credentials username {string} and password {string}")
    public void the_user_logs_in_with_valid_credentials_username_and_password(String username, String password) {
       
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logScreenShot();
        // CucumberLogUtils.logExtentScreenshot();
        loginPage.signInButton.click();
        
    }

}