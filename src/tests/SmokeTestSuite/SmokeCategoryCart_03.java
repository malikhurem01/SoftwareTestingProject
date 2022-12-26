package tests.SmokeTestSuite;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class SmokeCategoryCart_03 {
  private WebDriver driver;
  private HomePage homePage;

  public SmokeCategoryCart_03() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
  }

  @After
  public void clear() {
    try {
      Thread.sleep(2000);
      driver.quit();
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

  @Test
  public void Run() {
    driver.get("https://www.genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      homePage.clickOnPhonesCategory();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,19000)");
      homePage.clickOnMobilePhone();
      homePage.clickOnCartButton();
      Thread.sleep(2000);
      assertTrue(homePage.isItemAddedToCart());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }
}