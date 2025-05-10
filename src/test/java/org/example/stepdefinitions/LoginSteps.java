package org.example.stepdefinitions;

import org.example.pageobjects.LoginPage;
import org.example.utils.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("the user launches the browser")
    public void the_user_launches_the_browser() {
        // Driver is already initialized in DriverFactory
    }

    @Given("navigates to the home page")
    public void navigates_to_the_home_page() {
        driver.get("https://www.google.com/"); // Replace with your real login page URL

    }

    @When("user is in the Home page")
    public void user_in_thee_home_page() {
        loginPage.verifyHomePage();

    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLogin();
    }

    @Then("user should be navigated to the home page")
    public void user_should_be_navigated_to_the_home_page() {
        loginPage.verifyHomePage();
    }


    // ----- Signup and Login -----

    @When("the user clicks on the Signup button")
    public void the_user_clicks_on_signup() {
//        loginPage.clickSignupLink();
    }

    @When("enters valid credentials and submits the form")
    public void enters_valid_credentials_and_submits_the_form() {
//        loginPage.enterSignupDetails("testuser", "test@example.com", "Password123");
//        loginPage.submitSignup();
    }

    @Then("the user should be redirected to the dashboard")
    public void user_redirected_to_dashboard() {
//        loginPage.verifyDashboardVisible();
    }

    @Then("a welcome message should be shown")
    public void welcome_message_should_be_shown() {
//        loginPage.verifyWelcomeMessage();
    }

    @When("the user clicks on the Login button")
    public void the_user_clicks_on_login() {
//        loginPage.clickLoginLink();
    }

    @When("enters valid email and password")
    public void enters_valid_login_details() {
//        loginPage.login("test@example.com", "Password123");
    }
    @When("the dashboard should be displayed")
    public void enters_valid_login_adetails() {
//        loginPage.login("test@example.com", "Password123");
    }


    @When("the user attempts to login with incorrect credentials")
    public void user_login_with_invalid_credentials() {
//        loginPage.login("wrong@example.com", "WrongPassword");
    }

    @Then("an error message should be displayed")
    public void error_message_should_be_displayed() {
//        loginPage.verifyLoginError();
    }

    // ----- Test Case Generation -----

    @When("the user provides a valid URL to the generator")
    public void user_provides_url_to_generate() {
//        loginPage.enterUrl("https://example.com/form");
//        loginPage.submitUrl();
    }

    @Then("the system should extract UI elements from the HTML")
    public void system_extracts_ui_elements() {
//        loginPage.verifyUIElementsExtracted();
    }

    @Then("generate test cases automatically")
    public void generate_test_cases_automatically() {
//        loginPage.verifyGeneratedTestCasesDisplayed();
    }
    @When("the user is on the test case generation page")
    public void user_uploads_screenshotz() {
//        loginPage.uploadScreenshot("path/to/image.png");
    }

    @When("generate test cases based on recognized elements")
    public void user_uaploads_screenshot() {
//        loginPage.uploadScreenshot("path/to/image.png");
    }
    @When("the user uploads a screenshot")
    public void user_uploads_screenshot() {
//        loginPage.uploadScreenshot("path/to/image.png");
    }

    @Then("the system should extract UI components using OCR")
    public void system_extracts_ocr_elements() {
//        loginPage.verifyOCRSuccess();
    }

    // ----- Classification -----
    @When("a test case has been created or uploaded")
    public void system_aclassifies_test_case() {
//        loginPage.clickClassifyButton();
    }
    @When("display its classification")
    public void saystem_aclassifies_test_case() {
//        loginPage.clickClassifyButton();
    }


    @When("the system processes the test case description")
    public void system_classifies_test_case() {
//        loginPage.clickClassifyButton();
    }

    @Then("the system should assign it to a relevant category")
    public void assigned_category_displayed() {
//        loginPage.verifyClassificationResult();
    }

    // ----- Test Case Management -----

    @When("the user enters a keyword in the search bar")
    public void user_searches_test_case() {
//        loginPage.searchTestCases("login");
    }
    @When("the user is on the test case management page")
    public void usera_searches_test_case() {
//        loginPage.searchTestCases("login");
    }

    @Then("matching test cases should be displayed")
    public void matching_test_cases_displayed() {
//        loginPage.verifySearchResults("login");
    }

    @When("the user selects it and updates its content")
    public void user_edits_test_case() {
//        loginPage.editTestCase("Updated test description");
    }
    @When("a test case is listed")
    public void usesr_edits_test_case() {
//        loginPage.editTestCase("Updated test description");
    }

    @Then("the changes should be saved")
    public void changes_should_be_saved() {
//        loginPage.verifyUpdateSuccess();
    }

    @When("the user deletes it")
    public void user_deletes_test_case() {
//        loginPage.deleteTestCase();
    }

    @Then("the test case should no longer be visible in the system")
    public void test_case_deleted() {
//        loginPage.verifyDeletion();
    }

    // ----- Export / Import -----

    @When("the user clicks the Export button and selects JSON")
    public void export_test_cases_json() {
//        loginPage.exportTestCases("JSON");
    }
    @When("the user is viewing the test case list")
    public void export_test_cases_jsona() {
//        loginPage.exportTestCases("JSON");
    }

    @Then("the test cases should be downloaded as a JSON file")
    public void json_file_downloaded() {
//        loginPage.verifyFileDownload("testcases.json");
    }

    @When("the user uploads a valid CSV file")
    public void import_test_cases_csv() {
//        loginPage.importTestCases("testcases.csv");
    }

    @When("the user is on the Import page")
    public void import_testa_cases_csv() {
//        loginPage.importTestCases("testcases.csv");
    }

    @Then("test cases should be added to the system")
    public void imported_test_cases_should_appear() {
//        testCasePage.verifyImportSuccess();
    }
}

