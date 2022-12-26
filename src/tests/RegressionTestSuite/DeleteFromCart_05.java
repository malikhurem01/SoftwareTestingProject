package tests.RegressionTestSuite;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CartPage;
import pages.LoginPage;

public class DeleteFromCart_05 {

  WebDriver driver;
  LoginPage loginPage;
  CartPage cartPage;

  public DeleteFromCart_05() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    loginPage = new LoginPage(driver);
    cartPage = new CartPage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://www.genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      loginPage.login();
      Thread.sleep(2000);
      driver.get("https://genelec.ba/cart");
      Thread.sleep(2000);
      cartPage.clickOnDeleteCheck();
      cartPage.clickOnUpdateCart();
      assertTrue(cartPage.isCartEmpty());
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }

}