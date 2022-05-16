package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cart {
	WebDriver driver;
	
	public Add_Cart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void addcart() {
		viewsourcenav();
		additeam();
		submitbutton();
		cartshow1();
	}
	
	@FindBy(linkText = "View Store" )
	WebElement viewsource;
	
	@FindBy(xpath = "//a[@href=\"https://reetree.in/shop/health-personal-care/oxi9-multani-mitti-daisy-extracts-soap-75g-4-pcs-pack/\"]/div[@class=\"labels\"]" )
	WebElement iteam;
	
	@FindBy(xpath="//button[@type=\"submit\"][@name=\"add-to-cart\"]")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/div[1]/span[1]/i")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"mini-cart\"]/div[2]/div/div/a")
	WebElement cartshow;
	
	public void viewsourcenav(){
		viewsource.click();	
	}
	public void additeam(){
		iteam.click();
	}
	public void submitbutton(){
		submit.click();
	}
	public Logout  cartshow1(){
		cart.click();
		cartshow.click();
		return new Logout(driver);
	}
}
