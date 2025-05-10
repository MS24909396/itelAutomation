Feature: User Authentication



Feature: ITEL Web Application - Core Functionalities

  This feature covers key user flows in the ITEL platform including authentication, test case generation, classification, management, and import/export.


  Background:
    Given the user launches the browser
    And navigates to the home page


  # --- User Authentication ---


  Scenario: TC1 - User is in login page
    When user is in the Home page


  Scenario Outline: User signup with valid data
    When the user clicks on the Signup button
    And enters valid credentials and submits the "<Email>" and "<Password>" in form
    Then the user should be redirected to the dashboard
    Examples:
    | Email | Password |
    | test@test5.com | 123 |

  Scenario: User login with invalid credentials
    When the user attempts to login with incorrect credentials
    Then an error message should be displayed

  Scenario: User login with valid credentials
    When the user clicks on the Login button
    And enters valid email and password
    Then the dashboard should be displayed



  # --- Test Case Generation ---

  Scenario: Generate test cases from a URL
    When the user provides a valid URL to the generator
    Then the system should extract UI elements from the HTML
    And generate test cases automatically

  Scenario: Generate test cases from screenshot
    Given the user is on the test case generation page
    When the user uploads a screenshot
    Then the system should extract UI components using OCR
    And generate test cases based on recognized elements

  # --- Test Case Classification ---

  Scenario: Classify test cases automatically
    Given a test case has been created or uploaded
    When the system processes the test case description
    Then the system should assign it to a relevant category
    And display its classification

  # --- Test Case Management ---

  Scenario: Search test cases by keyword
    Given the user is on the test case management page
    When the user enters a keyword in the search bar
    Then matching test cases should be displayed

  Scenario: Edit a test case
    Given a test case is listed
    When the user selects it and updates its content
    Then the changes should be saved

  Scenario: Delete a test case
    Given a test case is listed
    When the user deletes it
    Then the test case should no longer be visible in the system

  # --- Export and Import ---

  Scenario: Export test cases in JSON format
    Given the user is viewing the test case list
    When the user clicks the Export button and selects JSON
    Then the test cases should be downloaded as a JSON file

  Scenario: Import test cases from CSV
    Given the user is on the Import page
    When the user uploads a valid CSV file
    Then test cases should be added to the system
