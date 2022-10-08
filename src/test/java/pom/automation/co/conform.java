package pom.automation.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class conform {
	public static WebDriver driver;
	public  conform(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);
	}
		 public WebElement getConfom() {
		return confom;
	}
	
		@FindBy(xpath="//span[text()='I confirm my order']") 
		private WebElement confom;

	}

