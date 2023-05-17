package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.OrderDetails;
import Pages.AddItemToCart;
import Pages.DeleteItem;
import Pages.LoginToApp;
import base.TestBase;

public class PlaceOrderTest extends TestBase {

	LoginToApp logintoapp;
	AddItemToCart addItem;
	DeleteItem deleteitem;
	OrderDetails placeorderpage;
	
	
	@BeforeTest
	public void setup() {
		intialize();
		
	}
	@Test(priority=1)
	  public void LoginPage() throws InterruptedException {
		logintoapp=new LoginToApp();
		logintoapp.LoginButton();
		Thread.sleep(3000);
		logintoapp.username();
		logintoapp.Password();
		logintoapp.Lbutton();
	}	  
     @Test(priority=2)
     public void addItemTest() throws InterruptedException {
	  addItem=new AddItemToCart();
	  addItem.AddIteam1();
	  addItem.AddIteamcart1();
	  addItem.AddIteam2();
	  addItem.AddIteamcart2();
	  addItem.goToCart();
	  addItem.LogOut();
	
  }
 @Test(priority=3)
  public void DeleteItemFromcart() throws InterruptedException {
	 logintoapp=new LoginToApp();
		logintoapp.LoginButton();
		Thread.sleep(3000);
		logintoapp.username();
		logintoapp.Password();
		logintoapp.Lbutton();
		
		Thread.sleep(3000);
	    deleteitem=new DeleteItem();
	    deleteitem.ViewCart();
	    Thread.sleep(3000);
	    deleteitem.Deleteitem();
	    Thread.sleep(3000);
	    deleteitem.LogOut();
	    
	    
  }
 @Test(priority=4)
  public void PlaceOrderFromCart() throws InterruptedException {
	 logintoapp=new LoginToApp();
		logintoapp.LoginButton();
		Thread.sleep(3000);
		logintoapp.username();
		logintoapp.Password();
		logintoapp.Lbutton();
		
		Thread.sleep(3000);
		placeorderpage=new OrderDetails();
		placeorderpage.ViewCart();
		Thread.sleep(3000);
		placeorderpage.PlaceOrderButton();
		Thread.sleep(3000);
		placeorderpage.Name();
		placeorderpage.City();
		placeorderpage.Country();
		placeorderpage.Creditcard();
		placeorderpage.Month();
		placeorderpage.Year();
		placeorderpage.purchesButton();
		Thread.sleep(3000);
		placeorderpage.Tkalert();
		Thread.sleep(3000);
		placeorderpage.Thkyou();
		Thread.sleep(3000);
		placeorderpage.logout();
		
	  
  }
  @AfterTest
  public void teardown() {
	  CloseBrowser();
  }
}
