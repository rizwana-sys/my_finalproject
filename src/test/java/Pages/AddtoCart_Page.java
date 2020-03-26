package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddtoCart_Page {

	WebDriver dr;
	public AddtoCart_Page(WebDriver dr)
	{
		this.dr=dr;
	}
	
	
	public void SearchA2Z() {               // selecting = Price (low to high) 
		
		
		WebElement wb=dr.findElement(By.xpath("//select[@class='product_sort_container']"));        
		Select DD=new Select(wb);
		DD.selectByVisibleText("Price (low to high)");       //Name (A to Z)
		
	}
	
	
	public void Addtocart_btn() {          //  Clicking the Add to Cart Buttons                  
	
		
		for(int i=1;i<=6;i++)
		{
			dr.findElement(By.xpath("//div[@class='inventory_item']["+i+"]//following::button")).click();
		}
		
	}

}


