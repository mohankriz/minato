package ultility.orignal.co;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Proutil {
	
public static WebDriver driver;
public static String value;
	public static   WebDriver get_Browser(String type) {
		
   if (type.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
   }else if (type.equalsIgnoreCase("firefox")) {
	System.out.println("not present");
    }
  driver.manage().window().maximize();
	return driver;
	}
	
	public static WebDriver get_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void  get_url(String url) {
                  driver.get(url);
                  driver.manage().window().maximize();
                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
	
	
	public static String send_Keys(WebElement a,String data) {
		a.sendKeys(data);
		return data;
	}
	public static void single_frame(WebElement e)
	{
		driver.switchTo().frame(e);
	}
	public static void click(WebElement search) {
		search.click();
	}
	
	public static void clear_data(WebElement c) {
    c.clear();
	}
	
	public static void al_accept(Alert a) {
    a.accept();
	}
	
	public static void al_dissmis(Alert a) {
	    a.dismiss();
	}

	public static String select_value(WebElement y,String x) {
       Select s= new Select(y);
       s.selectByValue(x);
       return x;
    		   
	}
	public static String select_text(WebElement y,String x) {
	       Select s= new Select(y);
	       s.selectByVisibleText(x);
	       return x;
	
	}
	public static int select_index(WebElement y,int x) {
	        Select s= new Select(y);
	        s.selectByIndex(x);
	        return x;
	   	
	   	}
		public static  void accept_Alert() {
         driver.switchTo().alert().accept();
         
		}
		public static  void dismiss_Alert(){
	      driver.switchTo().alert().dismiss();
	      }
		
		public static void screenShot(String path) throws IOException {

			TakesScreenshot shoot = (TakesScreenshot) driver;  //downcasting
			File source = shoot.getScreenshotAs(OutputType.FILE); //stores in jvm
			File desti= new File(path); //reroating to destined file
			FileUtils.copyFile(source, desti);
		}
		
		public static void Robot_action() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		public static void window_switch(WebDriver driver,int i)
		{
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(all_id);
		System.out.println(a.get(i));

		}
		//mouse action (no context click)
		public static void mouseover_element(String bro) {
			 Actions hoho = new Actions(driver);
				WebElement women = driver.findElement(By.xpath(bro));
				 hoho.moveToElement(women).build().perform();
		}
		public static void dragDrop(String drag,String drop){		
			Actions act = new Actions(driver);
			WebElement source = driver.findElement(By.xpath(drag));
		WebElement destination = driver.findElement(By.xpath(drop));
		 act.dragAndDrop(source, destination).build().perform();
		}

		  public static WebDriver chromemode(String mode)
		  { ChromeOptions pop = new ChromeOptions();
			//driver = new ChromeDriver(pop);
		  if (mode.equalsIgnoreCase("headless")) {
		  pop.addArguments("headless");
		  }else if (mode.equalsIgnoreCase("incognito"))
		  {
		  pop.addArguments("incognito"); }
		  return driver; 
		  }
		  public static String particular_data(String path, int row, int cell) throws IOException {
				File f = new File (path);
				FileInputStream input = new FileInputStream(f);
				Workbook wb = new XSSFWorkbook(input);
				Sheet s = wb.getSheetAt(0);
				Row r = s.getRow(row);
				Cell c = r.getCell(cell);
				CellType type = c.getCellType();
				if(type.equals(CellType.STRING))
				{
					 value = c.getStringCellValue();
				}
				else if (type.equals(CellType.NUMERIC))
				{
					double d = c.getNumericCellValue();
					// double to int 
					
					long a = (long) d;
					
					// int  to String 
					
					value = String.valueOf(a);
				}
				wb.close();
				return value;
			}
}
