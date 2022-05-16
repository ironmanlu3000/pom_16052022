package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
  WebDriver driver;
  public  Logout(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this); 
  }
  
  @FindBy(linkText = "Logout")
  WebElement logout1;
  
  public void hlogout() {
	  logout1.click();
  }
}
