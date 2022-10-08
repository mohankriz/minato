package pom.automation.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class evning_Dress {
	public static WebDriver driver;
	public evning_Dress(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);
	}
		 @FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
		 private WebElement frame;
		public WebElement getFrame() {
			return frame;
		}
}
