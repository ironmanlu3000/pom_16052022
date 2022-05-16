package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser {
	WebDriver driver;

	public RegisterUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id = "reg_email")
	 WebElement uEmail;
	
	 @FindBy(id = "reg_password")
	 WebElement uPass;
	 
	 @FindBy(name = "register")
	 WebElement uSubmit;
	 
	 @FindBy(css = "//input[@value=\"customer\"]")
	 WebElement customer;
	 
	 @FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/form/p[2]/span/div")
	 WebElement checkpass;
	 
	 
		public void doreg(String userName,String userPass) {
			//checkbox();
			username(userName);
			password(userPass);
			Login1();	
		}
		
		public void checkbox() {
			customer.click();
		}

		public void username(String userName) {
			uEmail.clear();
			uEmail.sendKeys(userName);
		}

		public void password(String userPass) {
			uPass.clear();
			uPass.sendKeys(userPass);
		}

		public Logout Login1() {
			if (checkpass.getText().equalsIgnoreCase("Medium") || checkpass.getText().equalsIgnoreCase("Strong")==true){
				uSubmit.click();
				return new Logout(driver);
			}
			else {
				return null;
			}
		}
		
		public boolean varifypass() {
			try {
				return driver.findElement(By.linkText("Logout")).isDisplayed();
			}catch(Exception e){
				return false;
			}
		}	
}
