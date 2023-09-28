//using page object
package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CostcoLogoutPage {

    WebDriver driver;

    public CostcoLogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = ".//*[contains(text(),'top-button-title')]")
    private WebElement account;

    @FindBy(xpath = ".//*[contains(text(),'signOutBtn')]")
    private WebElement logoutPage;

    public void CostcologoutPage() throws Exception {
        try {
            account.click();
            logoutPage.click();
// Logout logout = new Logout(driver);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
