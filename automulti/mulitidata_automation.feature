Feature: Purchasing Dresses In Automation Site
Scenario Outline: Purchasing Casual Dresses
    Given user Launch The Website
    When user Enter The "<Username>" In Username Flield
    And user Enter The "<Passworld>" In Passworld Flield
   # When user Enter The "bloa" In Username Flield #//---> for single data transfer
   #  And user Enter The "12467d" In Passworld Flield
   
    Then user Clicks The SignIn button It Navigate To Myaccount Page
     And user Mouseover To Dresses It Shows A Dropdown
    Then user Select Casualdress It Navigates To Casualdress Section
    And user Clicks On Printeddress Image It Navigate To Frame
    And user Enters Quantity in Quantity Field
    And user Enters Size In Size Field
    Then user Clicks Addto Cart button It Navigates To Product Added To Your Cart Popup
    Then user Clicks Procced to checkout button it navigates to summary field
    Then user Clicks Procced to checkout button it navigates to address field
     Then user Clicks Procced to checkout button it navigates to shipping field
     And user Agrees The Terms condition
      Then user Clicks Procced To Checkout button it Navigates To Payment Method Field
     And user Clicks Pay By Wire Method Box it Open To you Bankwire Payment
     Then user Clicks  Confirm Order It Navigate to Your Order On My Store Is Complete Field
    
    
     @ad2
     Scenario: Purchasing Casual Dresses
      When user Mouseover To Dresses It Shows A Dropdowno
    Then user Select summerdress It Navigates To summerdress Sectiono
    And user Clicks On Printeddress Image It Navigate To Frameo
    And user Enters Quantity in Quantity Fieldo
    And user Enters Size In Size Fieldo
    Then user Clicks Addto Cart button It Navigates To Product Added To Your Cart Popupo
    Then user Clicks Procced to checkout button it navigates to summary fieldo
    Then user Clicks Procced to checkout button it navigates to address fieldo
     Then user Clicks Procced to checkout button it navigates to shipping fieldo
     And user Agrees The Terms conditiono
      Then user Clicks Procced To Checkout button it Navigates To Payment Method Fieldo
     And user Clicks Pay By Wire Method Box it Open To you Bankwire Paymento
     Then user Clicks  Confirm Order It Navigate to Your Order On My Store Is Complete Fieldo
     
     
   Examples:
   |Username|Passworld|
   |123456  |hoodddd |
   |shifu6  |wifu    |
   
     