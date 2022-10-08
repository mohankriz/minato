package suppot.files;

import org.openqa.selenium.WebDriver;

import pom.automation.co.casual_dress;
import pom.automation.co.conform;
import pom.automation.co.evning_Dress;
import pom.automation.co.iframe_casual;
import pom.automation.co.login_mystore;
import pom.automation.co.my_account;
import pom.automation.co.pay_by;
import pom.automation.co.proceed_co1;
import pom.automation.co.proceed_co2;
import pom.automation.co.proceed_co3;
import pom.automation.co.proceed_co4;

public class automation_object_manger {
	public WebDriver driver;
	private casual_dress dress;
	private login_mystore  login ;
	private my_account account;
	private iframe_casual fa ;
	private proceed_co1 pr1;
	private proceed_co2 pr2;
	private proceed_co3 pr3;
	private proceed_co4 pr4;
	private pay_by pay;
	private conform ok;
	private evning_Dress evn;
	public automation_object_manger(WebDriver driver2) {
       this.driver=driver2;
	}
	public evning_Dress getEvn() {
		if (evn==null) {
			evn = new evning_Dress(driver);
		}
		return evn;
	}
	public casual_dress getDress() {
		if (dress==null) {
			dress = new casual_dress(driver);
		}
		return dress;
	}
	public login_mystore getLogin() {
		if (login ==null) {
			login = new login_mystore(driver);
		}
		return login;
	}
	public my_account getAccount() {
		if (account==null) {
			account = new my_account(driver);
		}
		return account;
	}
	public iframe_casual getFa() {
if (fa==null) {
	 fa =new iframe_casual(driver);	
		}
return fa;
	}
	public proceed_co1 getPr1() {
if (pr1==null) {
	pr1 = new proceed_co1(driver);	
		}return pr1;
	}
	public proceed_co2 getPr2() {
if (pr2==null) {
	pr2 = new proceed_co2(driver);
		}return pr2;
	}
	public proceed_co3 getPr3() {
if (pr3==null) {
	pr3= new proceed_co3(driver);	
		}return pr3;
	}
	public proceed_co4 getPr4() {
if (pr4==null) {
	 pr4= new proceed_co4(driver);
		}return pr4;
	}
	public pay_by getPay() {
if (pay==null) {
	pay = new pay_by(driver);
		}return pay;
	}
	public conform getOk() {
if (ok==null) {
	 ok = new conform(driver);	
		}return ok;
	}
	
	
	}

