package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest {

    private static WebDriver driver;
    private String baseUrl;

    public SignInTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {

    }

   @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://www.costco.com/");
        driver.findElement(By.id("header_sign_in")).click();
        driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_567/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=DM_PersistentCookieCreated%3Dtrue%26URL%3D%5BSSO%5Dhttps%3A%2F%2Fwww.costco.com%2F%3Fstate%3DusrClk%253dtrue%2526URL%253d%255bSSO%255dhttps%253a%252f%252fwww.costco.com%252f%253fstate%253dusrClk%25253Dtrue%252526URL%25253D%25255BSSO%25255Dhttps%25253A%25252F%25252Fwww.costco.com%25252FLinkYourMembershipInterruptView%25253Fddkey%25253Dhttp%2525253AOAuthLogonCmd%25255BSSO%25255D%255bSSO%255d%5BSSO%5D&nonce=p9b0NH4J9wmOul81&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
        driver.findElement(By.id("body-content")).click();
        driver.findElement(By.id("signInName")).click();
        driver.findElement(By.id("signInName")).clear();
        driver.findElement(By.id("signInName")).sendKeys("archita.singh16@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("!Archishri123");
        driver.findElement(By.id("next")).click();
        driver.get("https://signin.costco.com/");
        driver.get("https://www.costco.com/");
    }
    
    
    // @Test
  public void testLoginLogout() throws Exception {
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("header_sign_in")).click();
    driver.get("https://signin.costco.com/e0714dd4-784d-46d6-a278-3e29553483eb/B2C_1A_SSO_WCS_signup_signin_567/oauth2/v2.0/authorize?ClientName=USBC&ui_locales=en-US&scope=openid+offline_access&response_type=code+id_token&redirect_uri=https%3A%2F%2Fwww.costco.com%2FOAuthLogonCmd&state=URL%3D%5BSSO%5D%2F%5BSSO%5D&nonce=TCnWpArShntVqFhw&client_id=4900eb1f-0c10-4bd9-99c3-c59e6c1ecebf&TC=0&response_mode=form_post");
    driver.findElement(By.id("signInName")).clear();
    driver.findElement(By.id("signInName")).sendKeys("archita.singh16@gmail.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("!Archishri123");
    driver.findElement(By.id("next")).click();
    driver.get("https://www.costco.com/?langId=-1&krypto=%2BV4DgGNk0kGCYHx4qBOivjSJCtnPg8xf9YUGvgD0cPM2WMh%2B8I0ANKxsFB3p6mBTonTsDeskzBcVBNWp0B%2B%2BFcKNX5BD0MPGXbuV2GFZI2jJUTcQIEzZhVL8j7%2F9VNycJ%2BtaPT5gJQQa6OJB8YWRm5cT4imIswfbO89ZITGKJPvnnewNPATDgTNMclybiPlWYM4MBTrmrcU3LGhnoV4dPfl04jokauBTdAGoGvtc98L2%2Fwy0BV5iVmMQJ5lBFJG9aSLO4iABSBjwUt0kOfpNBA%3D%3D");
  }
}
