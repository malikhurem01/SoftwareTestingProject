package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
  private WebDriver driver;

  private By HeaderLinksWrapper = By.className("header-links-wrapper");
  private By LogoutNav = By.className("ico-logout");
  private By WishListNav = By.className("ico-wishlist");
  private By PhonesCategory = By.linkText("Mobilni telefoni");
  private By Iphone14Card = By.linkText("Apple iPhone 12 64GB Blue");
  private By SearchBar = By.id("small-searchterms");
  private By SearchItem = By.className("instant-search-item");
  private By MainCart = By.className("cart-trigger");
  private By CartButton = By.className("add-to-cart-button");
  private By CartContent = By.className("content");
  private By NewsletterEmail = By.id("newsletter-email");
  private By SubscribeButton = By.id("newsletter-subscribe-button");
  private By SubscribeResultContent = By.id("newsletter-result-block");
  private By SearchButton = By.className("search-box-button");
  //By.xpath("//div[@data-productid='47872']//div[@class='details']//div[@class='add-info']//div[@class='buttons-lower']//div[@class='button-2']");

  public HomePage(WebDriver _driver) {
    driver = _driver;
  }

  public void clickOnHeaderLinksWrapper() {
    driver.findElement(HeaderLinksWrapper).click();
  }

  public void clickOnLogout() {
    driver.findElement(LogoutNav).click();
  }

  public void clickOnPhonesCategory() {
    driver.findElement(PhonesCategory).click();
  }

  public void clickOnMobilePhone() {
    driver.findElement(Iphone14Card).click();
  }

  public void clickOnCartButton() {
    driver.findElement(CartButton).click();
  }

  public void clickOnSearchBar() {
    driver.findElement(SearchBar).click();
  }

  public void clickOnMainCart() {
    driver.findElement(MainCart).click();
  }

  public void setSearchText(String searchText) {
    driver.findElement(SearchBar).sendKeys(searchText);
  }

  public void clickOnSearchItem() {
    driver.findElement(SearchItem).click();
  }

  public void clickOnWishList() {
    driver.findElement(WishListNav).click();
  }

  public Boolean isItemAddedToCart() {
    String text = driver.findElement(CartContent).getText();
    return text.length() > 0;
  }

  public void setNewsletterEmail(String newsletterEmail) {
    driver.findElement(NewsletterEmail).sendKeys(newsletterEmail);
  }

  public void clickOnSubscribeButton() {
    driver.findElement(SubscribeButton).click();
  }

  public Boolean isSubscriptionFailed() {
    return driver.findElement(SubscribeResultContent).getText().trim().equals("Enter valid email");
  }

  public void clickOnSearchButton() {
    driver.findElement(SearchButton).click();
  }


}