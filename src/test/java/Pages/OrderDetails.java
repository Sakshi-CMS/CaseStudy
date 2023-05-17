package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;

public class OrderDetails extends TestBase{
	@FindBy(id="cartur")
	WebElement viewcart;
	
	@FindBy(xpath="//button[normalize-space()='Place Order']")
	WebElement placeorder;
	
	@FindBy(id ="name")
	WebElement name;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="card")
	WebElement creditcard;
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(css="button[onclick='purchaseOrder()']")
	WebElement puchesbtn;
	
	@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
	    WebElement thanku;
	
	 @FindBy(xpath="//button[contains(text(),'OK')]")
	     WebElement ok;

	 @FindBy(id="logout2")
	     WebElement logout;
	

	public OrderDetails (){
		PageFactory.initElements(driver, this);
	}
	 public void ViewCart() {
	    	viewcart.click();
     }
	 public void PlaceOrderButton() {
		 placeorder.click();
    }
		public void Name() {
			name.sendKeys("Sakshi");
			
	}
     public void Country() {
        country.sendKeys("india");
	
   }
     public void City() {
    		city.sendKeys("Pune");
    		
   }
    public void Creditcard() {
	   creditcard.sendKeys("4110523546");
	}
   public void Month() {
	   month.sendKeys("April");
	
   }
    public void Year() {
	     year.sendKeys("2023");
	
   }
    public void purchesButton() {
	   puchesbtn.click();
	 
   }
    public void Tkalert(){
    String act = thanku.getText();
      System.out.println("Message "+act);
      //Assert.assertEquals(act, "Thank you for your purchase!");
   }
    public void Thkyou() {
        ok.click();
    }
    public void logout() {
       logout.click();
}
}
