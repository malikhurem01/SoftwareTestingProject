package tests.RegressionTestSuite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class WishListDisplay_02 {

  WebDriver driver;
  HomePage homePage;

  public WishListDisplay_02() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    homePage = new HomePage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://www.genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      homePage.clickOnHeaderLinksWrapper();
      homePage.clickOnWishList();
      assertEquals(driver.getCurrentUrl(), "https://genelec.ba/wishlist");
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

}