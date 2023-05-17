package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DeleteItem extends TestBase{
	
	@FindBy(id="cartur")
	WebElement viewcart;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/a[1]")
	WebElement deleteItem;

	@FindBy(id="logout2")
	WebElement logout;

	public DeleteItem(){
		PageFactory.initElements(driver, this);
		
	 }
    public void ViewCart() {
    	viewcart.click();
    }
    public void Deleteitem() throws InterruptedException {
    	deleteItem.click();
    }
    public void LogOut() throws InterruptedException {
    	logout.click();
   }
}