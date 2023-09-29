/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author vartr
 */
public class ProductTest {

    private WebDriver driver;//global driver for selenium
    private String baseUrl;

    public ProductTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {

        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");//geeko driver for google browser
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions(); 
        options.addArguments("--headless"); 
        options.addArguments("--disable-gpu"); 
        options.addArguments("--window-size=1400,800");
 
        WebDriver driver = new ChromeDriver(options);

        
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

     @Test
    public void testCostcoSearch() throws Exception {
    driver.manage().window().maximize();
    driver.get("https://www.costco.com/");
    driver.findElement(By.id("search-field")).click();
    driver.findElement(By.id("search-field")).clear();
    driver.findElement(By.id("search-field")).sendKeys("LG TV");
    driver.findElement(By.id("formcatsearch")).submit();
    driver.get("https://www.costco.com/televisions.html?refine=%7C%7CBrand_attr-LG&krypto=dw5q1KQ07dKt3sM3tIVWbEiO8jaEeGpgp5W0IU6ck5%2FseEIxgxTilnKbFCkpln0WJ%2FERPopf%2FLu4yMu7LiWf%2FQ%3D%3D");
    driver.findElement(By.xpath("//img[@alt='LG 65\" Class - OLED B2 Series - 4K UHD OLED TV - Allstate 3-Year Protection Plan Bundle Included for 5 Years of Total Coverage*']")).click();
    }

}
/* finally sucessfull*/
