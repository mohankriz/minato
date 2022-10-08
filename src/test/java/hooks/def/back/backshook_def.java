package hooks.def.back;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import suppot.files.automation_object_manger;
import ultility.orignal.co.Base_Proutil;

public class backshook_def extends Base_Proutil {
	public static WebDriver driver =hooks_runner.driver;
	public static automation_object_manger manager = new automation_object_manger(driver);
	
	@Before
	public void click_signin() {
		get_url("http://automationpractice.com/index.php");
	}
	@After
	public void logout() {
	
  click(manager.getLogin().getOlogout());
    driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	  @Given("user Launch The Website")
	  public void user_launch_the_website() {
		  System.out.println(driver);
			//get_url("http://automationpractice.com/index.php");

	  click(manager.getLogin().getOlogin());
	 
}
	@When("user Enter The username In Username Flield")
	public void user_enter_the_username_in_username_flield() {
		  send_Keys(manager.getLogin().getMailid(), "holcola@gmail.com");

	}
	@When("user Enter The password In Passworld Flield")
	public void user_enter_the_password_in_passworld_flield() {
		  send_Keys(manager.getLogin().getPassword(), "mugeevara"); }
		 
	@Then("user Clicks The SignIn button It Navigate To Myaccount Page")
	public void user_clicks_the_sign_in_button_it_navigate_to_myaccount_page() {
		click(manager.getLogin().getLogin());
	}
	@Then("user Mouseover To Dresses It Shows A Dropdown")
	public void user_mouseover_to_dresses_it_shows_a_dropdown() {
		mouseover_element("(//a[text()='Dresses'])[2]");
	}
	@Then("user Select Casualdress It Navigates To Casualdress Section")
	public void user_select_casualdress_it_navigates_to_casualdress_section() {
		click(manager.getAccount().getCasual());
	}
	@Then("user Clicks On Printeddress Image It Navigate To Frame")
	public void user_clicks_on_printeddress_image_it_navigate_to_frame() {
		click(manager.getDress().getImg());
		
	}
	@Then("user Enters Quantity in Quantity Field")
	public void user_enters_quantity_in_quantity_field() {
		single_frame(manager.getFa().getFrame());
		clear_data(manager.getFa().getQuantity());
		send_Keys(manager.getFa().getQuantity(), "3");
	}
	@Then("user Enters Size In Size Field")
	public void user_enters_size_in_size_field() {
		select_index(manager.getFa().getSize(), 2);
	}
	@Then("user Clicks Addto Cart button It Navigates To Product Added To Your Cart Popup")
	public void user_clicks_addto_cart_button_it_navigates_to_product_added_to_your_cart_popup() {
		click(manager.getFa().getAddtocart());
		
	}
	@Then("user Clicks Procced to checkout button it navigates to summary field")
	public void user_clicks_procced_to_checkout_button_it_navigates_to_summary_field() {
		driver.switchTo().defaultContent();
		click(manager.getPr1().getProceed());
	}
	@Then("user Clicks Procced to checkout button it navigates to address field")
	public void user_clicks_procced_to_checkout_button_it_navigates_to_address_field() {
		click(manager.getPr2().getProceed());

	}
	@Then("user Clicks Procced to checkout button it navigates to shipping field")
	public void user_clicks_procced_to_checkout_button_it_navigates_to_shipping_field() {
		click(manager.getPr3().getProceed());

	}
	@Then("user Agrees The Terms condition")
	public void user_agrees_the_terms_condition() {
		click(manager.getPr4().getRadio());

	}
	@Then("user Clicks Procced To Checkout button it Navigates To Payment Method Field")
	public void user_clicks_procced_to_checkout_button_it_navigates_to_payment_method_field() {
		click(manager.getPr4().getProceed());

	}
	@Then("user Clicks Pay By Wire Method Box it Open To you Bankwire Payment")
	public void user_clicks_pay_by_wire_method_box_it_open_to_you_bankwire_payment() {
		click(manager.getPay().getPay());

	}
	@Then("user Clicks  Confirm Order It Navigate to Your Order On My Store Is Complete Field")
	public void user_clicks_confirm_order_it_navigate_to_your_order_on_my_store_is_complete_field() {
		click(manager.getOk().getConfom());

	}
	@When("user Mouseover To Dresses It Shows A Dropdowno")
	public void user_mouseover_to_dresses_it_shows_a_dropdowno() {
		mouseover_element("(//a[text()='Dresses'])[2]");

	}
	@Then("user Select summerdress It Navigates To summerdress Sectiono")
	public void user_select_summerdress_it_navigates_to_summerdress_sectiono() {
		click(manager.getAccount().getDress());

	}
	@Then("user Clicks On Printeddress Image It Navigate To Frameo")
	public void user_clicks_on_printeddress_image_it_navigate_to_frameo() {
		click(manager.getDress().getImg());

	    }
	@Then("user Enters Quantity in Quantity Fieldo")
	public void user_enters_quantity_in_quantity_fieldo() {
		single_frame(manager.getFa().getFrame());
		clear_data(manager.getFa().getQuantity());
		send_Keys(manager.getFa().getQuantity(), "3");
	}
	@Then("user Enters Size In Size Fieldo")
	public void user_enters_size_in_size_fieldo() {
		select_index(manager.getFa().getSize(), 2);

	}
	@Then("user Clicks Addto Cart button It Navigates To Product Added To Your Cart Popupo")
	public void user_clicks_addto_cart_button_it_navigates_to_product_added_to_your_cart_popupo() {
		click(manager.getFa().getAddtocart());

	}
	@Then("user Clicks Procced to checkout button it navigates to summary fieldo")
	public void user_clicks_procced_to_checkout_button_it_navigates_to_summary_fieldo() {
		driver.switchTo().defaultContent();
		click(manager.getPr1().getProceed());
	}
	@Then("user Clicks Procced to checkout button it navigates to address fieldo")
	public void user_clicks_procced_to_checkout_button_it_navigates_to_address_fieldo() {
		click(manager.getPr2().getProceed());

	}
	@Then("user Clicks Procced to checkout button it navigates to shipping fieldo")
	public void user_clicks_procced_to_checkout_button_it_navigates_to_shipping_fieldo() {
		click(manager.getPr3().getProceed());

	}
	@Then("user Agrees The Terms conditiono")
	public void user_agrees_the_terms_conditiono() {
		click(manager.getPr4().getRadio());

	}
	@Then("user Clicks Procced To Checkout button it Navigates To Payment Method Fieldo")
	public void user_clicks_procced_to_checkout_button_it_navigates_to_payment_method_fieldo() {
		click(manager.getPr4().getProceed());

	}
	@Then("user Clicks Pay By Wire Method Box it Open To you Bankwire Paymento")
	public void user_clicks_pay_by_wire_method_box_it_open_to_you_bankwire_paymento() {
		click(manager.getPay().getPay());

	}
	@Then("user Clicks  Confirm Order It Navigate to Your Order On My Store Is Complete Fieldo")
	public void user_clicks_confirm_order_it_navigate_to_your_order_on_my_store_is_complete_fieldo() {
	    
		click(manager.getOk().getConfom());

	}
}


