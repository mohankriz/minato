package pom.automation.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.utility.nullability.NeverNull.ByDefault;

public class casual_dress {
	public static WebDriver driver;
	public casual_dress(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);
		 }
 @FindBy(xpath="//img[@itemprop='image']")
private WebElement img;

public WebElement getImg() {
	return img;
}}
