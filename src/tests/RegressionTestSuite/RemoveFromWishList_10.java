package tests.RegressionTestSuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CartPage;
import pages.LoginPage;
import pages.WishlistPage;

public class RemoveFromWishList_10 {

  WebDriver driver;
  LoginPage loginPage;
  CartPage cartPage;
  WishlistPage wishlistPage;

  public RemoveFromWishList_10() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    loginPage = new LoginPage(driver);
    cartPage = new CartPage(driver);
    wishlistPage = new WishlistPage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      loginPage.login();
      Thread.sleep(2000);
      driver.get("https://genelec.ba/wishlist");
      Thread.sleep(2000);
      cartPage.clickOnDeleteCheck();
      wishlistPage.clickOnUpdateWishlistButton();
      assertTrue(wishlistPage.isWishlistEmpty());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

}