package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  private WebDriver driver;

  private By HeaderLinksWrapper = By.className("header-links-wrapper");
  private By LoginNav = By.className("ico-login");
  private By EmailInput = By.id("Email");
  private By PasswordInput = By.id("Password");
  private By RememberMe = By.id("RememberMe");
  private By LoginSubmit = By.className("login-button");

  public LoginPage(WebDriver _driver) {
    driver = _driver;
  }

  public void clickOnHeaderLinksWrapper() {
    driver.findElement(HeaderLinksWrapper).click();
  }

  public void clickOnLoginLink() {
    driver.findElement(LoginNav).click();
  }

  public void setEmail(String email) {
    driver.findElement(EmailInput).sendKeys(email);
  }

  public void setPassword(String password) {
    driver.findElement(PasswordInput).sendKeys(password);
  }

  public void clickOnRememberMe() {
    driver.findElement(RememberMe).click();
  }

  public void loginSubmit() {
    driver.findElement(LoginSubmit).click();
  }

  public void login() {
    clickOnHeaderLinksWrapper();
    clickOnLoginLink();
    setEmail("xeucinneiviwoi-7958@yopmail.com");
    setPassword("kosilicazatravu123123");
    clickOnRememberMe();
    loginSubmit();
  }
}