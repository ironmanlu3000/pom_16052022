package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Navigation {
	WebDriver driver;

	public Navigation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
   
public void navigate1(String locator) {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(locator));
		action.moveToElement(element).build().perform();
		element.click();
		// To Show Parent Window
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		driver.switchTo().window(parentwindow);
  }
}
