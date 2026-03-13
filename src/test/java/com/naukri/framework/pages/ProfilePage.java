package com.naukri.framework.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Locators
    By viewProfile = By.xpath("//a[@href='/mnjuser/profile']");
    By updateResume = By.xpath("//input[@value='Update resume']");
    By uploadFile = By.xpath("//input[@type='file']");

    // Open profile page
    public void openProfile() {
        wait.until(ExpectedConditions.elementToBeClickable(viewProfile)).click();
    }

    // Click update resume
    public void clickUpdateResume() {
        wait.until(ExpectedConditions.elementToBeClickable(updateResume)).click();
    }

    // Upload resume
    public void uploadResume(String filePath) {
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadFile)).sendKeys(filePath);
    }
}