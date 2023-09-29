/*Using page object*/
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
        
        ChromeOptions options = new ChromeOptions(); 
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu"); 
        options.addArguments("--window-size=1400,800");
 
        WebDriver driver = new ChromeDriver(options);
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
