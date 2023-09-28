//Using page object
//you set web driver in constructor
//waht are the elements you are going to interect you will put them in @ annotation @findBy id, name xpath etc
//1 business method login,shipping, order payment, get me grade,....
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CostcoLoginPage {

    WebDriver driver;

    public CostcoLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"header_sign_in\"]")
    private WebElement register;

    @FindBy(xpath = "//*[@id=\"signInName\"]")
    //@FindBy(id = "signInName")
    private WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"password\"]")
   // @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"next\"]")
   // @FindBy(id = "next")
    private WebElement login;

    public void LoginToCostco(String email, String pWord)
            throws Exception {
        try {
            driver.get("https://costco.com/");
            register.click();
            emailAddress.sendKeys(email);
            password.sendKeys(pWord);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"next\"]")));
            login.click();
            CostcoLoginPage login = new CostcoLoginPage(driver);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
