package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Add_Cart;
import Pages.Login;
import Pages.Logout;
import Pages.Remove_Cart;
import Pages.Navigation;
import Pages.RegisterUser;
import Pages.SearchResult;

import Utilities.DataProvider1;

public class TestCases extends BaseTest{
	
	@Test(dataProvider = "dataset_login", dataProviderClass = DataProvider1.class, description = "Login")
	public void dologin(String username,String password,String name) {
		driver.findElement(By.linkText("Login/Register")).click();
		Login login = new Login(driver);
		login.dolog(username, password);
		Assert.assertTrue(login.varifyresult());
		Logout logout = new Logout(driver);
		logout.hlogout();
	}
	
	@Test(dataProvider = "dataset_register", dataProviderClass = DataProvider1.class, description = "register")
	public void doregister(String username,String password,String name) {
		driver.findElement(By.linkText("Login/Register")).click();
		RegisterUser userreg = new RegisterUser(driver);
		userreg.doreg(username, password);
		Assert.assertTrue(userreg.varifypass());
		Logout logout = new Logout(driver);
		logout.hlogout();
	}
	
	@Test(dataProvider = "dataset_login", dataProviderClass = DataProvider1.class, description = "Addcart")
	public void add_cart(String username,String password,String name) {
		driver.findElement(By.linkText("Login/Register")).click();
		Login login = new Login(driver);
		login.dolog(username, password);
		System.out.println(login.varifyresult());
		Assert.assertTrue(login.varifyresult());
		if (login.varifyresult() == true) {
			Add_Cart add_cart = new Add_Cart(driver);
			add_cart.addcart();
			Logout logout = new Logout(driver);
			logout.hlogout();
			
		} else {
			System.out.println("Login creditentials are not OK");
		}
	}
	
	@Test(dataProvider = "RemoveCart", dataProviderClass = DataProvider1.class,description = "removercart1")
	public void remove_cart(String username,String password,String iteamname) throws InterruptedException {
		driver.findElement(By.linkText("Login/Register")).click();
		Login login = new Login(driver);
		login.dolog(username, password);
		Assert.assertTrue(login.varifyresult());
		if (login.varifyresult() == true) {
			Remove_Cart removeCart = new Remove_Cart(driver);
			removeCart.Removecart(iteamname);
			Logout logout = new Logout(driver);
			logout.hlogout();
		} else {
			System.out.println("Login creditentials are not OK");
		}	
	}
	
	/*@Test(dataProvider = "dataset_navigation", dataProviderClass = DataProvider1.class,description = "Navigate")
	public void Navigation(String locator,String name) {
		Navigation nav = new Navigation(driver);
		nav.navigate1(locator);
	}*/
	
	@Test(dataProvider = "Search", dataProviderClass = DataProvider1.class,description = "Search result")
	public void searchResult(String searchiteam,String checkresult) {
		SearchResult srch = new SearchResult(driver);
		srch.search(searchiteam);
		Assert.assertTrue(srch.searchvarify(searchiteam, checkresult));
	}
	
	
}
