package tests.SmokeTestSuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.RegisterPage;

public class SmokeRegister_01 {

  private WebDriver driver;
  private RegisterPage registerPage;

  public SmokeRegister_01() {

  }

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:/Users/Administrator/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    registerPage = new RegisterPage(driver);
  }

  @Test
  public void Run() {
    driver.get("https://www.genelec.ba");
    try {
      Thread.sleep(6000);
      driver.manage().window().maximize();
      registerPage.clickOnHeaderLinksWrapper();
      registerPage.clickOnRegisterLink();
      registerPage.clickOnGenderMale();
      registerPage.setFirstName("Selenium");
      registerPage.setLastName("WebDriver");
      registerPage.setEmail("woinneubrowecreu-3335@yopmail.com");
      registerPage.setCompany("IUS");
      registerPage.setStreetAddress("Hrasnička cesta");
      registerPage.setZipPostalCode("71210");
      registerPage.setCity("Sarajevo");
      registerPage.setPhone("033 957-101");
      registerPage.clickOnNewsletter();
      registerPage.setPassword("kosilicazatravu123123");
      registerPage.setConfirmPassword("kosilicazatravu123123");
      registerPage.clickConfirmButton();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}