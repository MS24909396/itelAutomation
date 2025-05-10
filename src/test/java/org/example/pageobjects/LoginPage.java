package org.example.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.Assert.assertTrue;

public class LoginPage {
    WebDriver driver;

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("login");
    private final By homePageElement = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/header/h1"); // Example element
    private final By usernotfoundElement = By.xpath("//*[@id=\"root\"]/div/div/main/div/div[1]/div/div/p");
    //*[@id="root"]/div/div/main/div/div[1]/div/div/p

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void verifyHomePage() {
        assertTrue(driver.findElement(homePageElement).isDisplayed());
    }

    public void clickSignupLink() {
        WebElement signupbtn = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li/button"));
        signupbtn.click();
    }



    public void enterSignupDetails(String email, String password) throws InterruptedException {
        WebElement emailfield = driver.findElement(By.xpath("//*[@id=\"signup-email\"]"));
        emailfield.sendKeys(email);
        Thread.sleep(3000);
        WebElement passwordfield = driver.findElement(By.xpath("//*[@id=\"signup-password\"]"));
        passwordfield.sendKeys(password);
    }

    public void enterloginpDetails() throws InterruptedException {
        WebElement emailfield = driver.findElement(By.xpath("//*[@id=\"signin-email\"]"));
        emailfield.sendKeys("test@test2.com");
        Thread.sleep(3000);
        WebElement passwordfield = driver.findElement(By.xpath("//*[@id=\"signin-password\"]"));
        passwordfield.sendKeys("123");
    }

    public void enterwrongloginpDetails() throws InterruptedException {
        WebElement emailfield = driver.findElement(By.xpath("//*[@id=\"signin-email\"]"));
        emailfield.sendKeys("123@123");
        Thread.sleep(3000);
        WebElement passwordfield = driver.findElement(By.xpath("//*[@id=\"signin-password\"]"));
        passwordfield.sendKeys("321");
    }



    public void verifyLoginError() {
        assertTrue(driver.findElement(usernotfoundElement).isDisplayed());
    }


    public void selectRole() throws InterruptedException {
        WebElement roledropdown = driver.findElement(By.xpath("//*[@id=\"signup-role\"]"));
        roledropdown.click();
        Thread.sleep(3000);
        try {
            // Create instance of Robot
            Robot robot = new Robot();

            // Delay to ensure browser is ready (optional)
            robot.delay(1000);

            // Press Down Arrow key
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);

            // Optional delay between actions
            robot.delay(500);

            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);

            // Optional delay between actions
            robot.delay(500);

            // Press Enter key
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep(3000);
    }

    public void submitSignup() throws InterruptedException {
        WebElement signupsubmit = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/div/div/form/button"));
        signupsubmit.click();
        Thread.sleep(3000);
    }

    public void submitlogin() throws InterruptedException {
        WebElement signinsubmit = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[1]/div/div/form/button"));
        signinsubmit.click();
        Thread.sleep(3000);
    }


    public void verifyDashboardVisible() {
        assertTrue(driver.findElement(homePageElement).isDisplayed());
    }



}
