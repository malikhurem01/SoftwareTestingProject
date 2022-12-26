package tests.RegressionTestSuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.ShopPage;

public class AddToCardFromShopPage_04 {

  WebDriver driver;
  ShopPage shopPage;
  HomePage homePage;

  public AddToCardFromShopPage_04() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    shopPage = new ShopPage(driver);
    homePage = new HomePage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://genelec.ba/notebookc-106");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      shopPage.clickOnAddToCartButton();
      Thread.sleep(2000);
      assertTrue(homePage.isItemAddedToCart());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

}