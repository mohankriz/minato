package pom.automation.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iframe_casual {
	
	public static WebDriver driver;
	public iframe_casual(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);
	}
		 @FindBy(xpath="//iframe")
		 private WebElement frame;
public WebElement getFrame() {
			return frame;
		}

		
@FindBy(xpath="//input[@id='quantity_wanted']")
private WebElement quantity;

@FindBy(xpath="//select[@id='group_1']")
private WebElement size;

@FindBy(xpath="//button[@name='Submit']")
private WebElement addtocart;

public WebElement getQuantity() {
	return quantity;
}

public WebElement getSize() {
	return size;
}

public WebElement getAddtocart() {
	return addtocart;
}


}
