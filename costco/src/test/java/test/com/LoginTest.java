/*Using page object*/
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    private static WebDriver driver;
    private String baseUrl;

    public LoginTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // implicit wait// it wait until 30 sec
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
       // driver.close();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

   @Test(priority = 1)
    public void executeLoginPageModule() throws Exception {
        
        driver.manage().window().maximize();
        System.out.println("hello 1");
        CostcoLoginPage loginpage = PageFactory.initElements(driver, CostcoLoginPage.class);
        loginpage.LoginToCostco("archita.singh16@gmail.com", "!Archishri123");

    }
   // @Test(priority=2)
    public void executeLogoutPage() throws Exception {
                System.out.println("hello 2");

        CostcoLogoutPage logout = PageFactory.initElements(driver, CostcoLogoutPage.class);
        // Thread.sleep(2000);
        //Advisable to use explicit wait to pause the driver.
        // logout.logoutPage();
        Thread.sleep(2000);
    }
}