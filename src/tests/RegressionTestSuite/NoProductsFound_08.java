package tests.RegressionTestSuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.ShopPage;

public class NoProductsFound_08 {

  WebDriver driver;
  HomePage homePage;
  ShopPage shopPage;

  public NoProductsFound_08() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
    shopPage = new ShopPage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      homePage.clickOnSearchBar();
      homePage.setSearchText("blablabla");
      homePage.clickOnSearchButton();
      Thread.sleep(3000);
      assertTrue(shopPage.noResults());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

}