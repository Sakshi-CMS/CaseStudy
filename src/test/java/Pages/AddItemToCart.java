package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;


public class AddItemToCart extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	WebElement addItem1;
	
	@FindBy(xpath="//a[normalize-space()='Add to cart']")
	WebElement addItemCart1;
	
	@FindBy(xpath="//a[contains(text(),'Nexus 6')]")
	WebElement addItem2;
	
	@FindBy(xpath="//a[normalize-space()='Add to cart']")
	WebElement addItemCart2;
	
	@FindBy(id="cartur")
	WebElement GoToCart;
	
	@FindBy(id="logout2")
	WebElement logout;
	
	
	public AddItemToCart() {
		PageFactory.initElements(driver, this);
	}
	public void AddIteam1() throws InterruptedException  {
		Thread.sleep(2000);
		addItem1.click();
		
	
	}
	public void AddIteamcart1() throws InterruptedException {
	
		Thread.sleep(3000);
		addItemCart1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.navigate().back();
	
	}
	public void AddIteam2() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
		addItem2.click();
		
	}
    public void AddIteamcart2() throws InterruptedException {
    	addItemCart2.click();
    	Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
     }
    public void goToCart() throws InterruptedException {
    	Thread.sleep(2000);
    	GoToCart.click();
    }
    public void LogOut() throws InterruptedException {
    	Thread.sleep(2000);
    	logout.click();
   }
}