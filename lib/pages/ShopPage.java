package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
  WebDriver driver;

  private By SortInput = By.id("products-orderby");
  private By ProductCartButton = By.className("product-box-add-to-cart-button");
  private By NoResultMsg = By.className("no-result");
  private By PriceSlider = By.id("slider");

  public ShopPage(WebDriver _driver) {
    driver = _driver;
  }

  public void clickOnSortInput() {
    driver.findElement(SortInput).click();
  }

  public void sortByDescendingNameOrder() {
    Select select = new Select(driver.findElement(SortInput));
    select.selectByValue("6");
  }

  public void clickOnAddToCartButton() {
    driver.findElement(ProductCartButton).click();
  }

  public void inputMinPrice(){
     JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("document.getElementById('slider').setAttribute('data-selectedfromvalue', '500')");
  }

    public void inputMaxPrice(){
     JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("document.getElementById('slider').setAttribute('data-selectedmaxvalue', '1000')");
  }

  public Boolean noResults() {
    return driver.findElement(NoResultMsg).getText().trim().equals("No products were found that matched your criteria.");
  }
}