package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * * 1. Set up Chrome browser.
 *  * 2. Open URL.
 *  * 3. Print the title of the page.
 *  * 4. Print the current URL.
 *  * 5. Print the page source.
 *  * 6. Enter the email in the email field.
 *  * 7. Enter the password in the password field.
 *  * 8. Click on the Login Button.
 *  * 9. Print the current URL.
 *  * 10. Navigate to baseUrl
 *  * 11. Refresh the page.
 *  * 12. Close the browser.
 */

public class MultiBrowserTesting {
    static String browser = "Firefox";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }


        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

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
