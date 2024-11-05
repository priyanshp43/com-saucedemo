package browsertesting;

/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTesting {

    public static void main(String[] args) {
        String baseUrl ="https://www.saucedemo.com/";

        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);

        // Print the title of the page
        System.out.println("Title of the page is : " + driver.getTitle());

        // Print the current URL
        System.out.println("Current URL is : " + driver.getCurrentUrl());


        // Print the page source.
        System.out.println("Page souce is : " + driver.getPageSource());

        //  Enter the email in the email field.
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("priyanshp904@gmail.com");

        // Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("12345678");

        // Click on the Login Button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Print the current URL
        System.out.println("Current URL is after login: " + driver.getCurrentUrl());

        // Navigate to baseurl
        driver.navigate().to(baseUrl);

        // Refresh the page
        driver.navigate().refresh();

        // Close the browser
         driver.quit();
    }
}
