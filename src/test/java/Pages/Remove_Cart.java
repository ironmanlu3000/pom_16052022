package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Remove_Cart {
 WebDriver driver;
  public Remove_Cart(WebDriver driver) {
	  this.driver = driver;
		PageFactory.initElements(driver,this);
  }
  
   public void Removecart(String iteamname) {
	   cartshow1();
	   deleteiteam(iteamname);
   }
  
    @FindBy(xpath="//*[@id=\"mini-cart\"]/div[1]/span[1]/i")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/div[2]/div/div/a")
	WebElement cartshow;
	
	@FindBy(xpath = "//tr[@class=\"cart_item\"]")
	List<WebElement> alliteam;
	
	@FindBy(xpath="//tr[@class=\"cart_item\"][1]/td[1]/div/a[2]")
	WebElement delete;

	
	public void cartshow1(){
		cart.click();
		cartshow.click();
	}
	
	public void deleteiteam(String iteamname) {
		int count = 1;
		for (@SuppressWarnings("unused") WebElement iteam : alliteam) {
			String iteamName = driver.findElement(By.xpath("//tr[@class=\"cart_item\"][" + count + "]/td[2]/a"))
					.getText();
			if (iteamName.equalsIgnoreCase(iteamname)) {
				delete.click();
			} else {
				System.out.println("Iteam is not present");
			}
			count++;
		}
	}
}
