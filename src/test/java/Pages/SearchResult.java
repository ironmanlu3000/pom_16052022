package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResult {
 WebDriver driver;
  public SearchResult(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver, this);  
  }
  
  public void searchIteam(String searchiteam) {
	  search(searchiteam);
  }
  
  @FindBy(css = "input[id=yith-s]")
  WebElement searchele;
  
  public void search(String searchiteam) {
	  searchele.sendKeys(searchiteam);
	  searchele.sendKeys(Keys.ENTER);
  }
  
  public boolean searchvarify(String searchiteam,String checkresult) {
     try {
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
   	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText(searchiteam)));
	  WebElement searchresultpresent = driver.findElement(By.partialLinkText(searchiteam)); 
	  String SearchText = searchresultpresent.getText();
	  return SearchText.equalsIgnoreCase(checkresult);
     }catch(Exception e) {
    	 return false;
     }
  }
}
