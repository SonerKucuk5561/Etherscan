package com.Etherscan.step_definitions;

import com.Etherscan.pages.Etherscan;
import com.Etherscan.utilities.ConfigurationReader;
import com.Etherscan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Etherscan_Step_Def {
    Etherscan etherscan =new Etherscan();

    @Given("the user navigate to the given page")
    public void the_user_navigate_to_the_given_page() {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user writes one item on the search box")
    public void the_user_writes_one_item_on_the_search_box() {
        etherscan.searchbox.sendKeys("Nexo");
    }

    @When("the user clicks the search button")
    public void the_user_clicks_the_search_button() {
        etherscan.searchboxbutton.click();
    }

    @Then("the URL should be changed")
    public void the_URL_should_be_changed() {

        String ActualUrl = Driver.get().getCurrentUrl();
        String ExpectedUrl = "https://etherscan.io/token/0xb62132e35a6c13ee1ee0f84dc5d40bad8d815206";
        Assert.assertEquals(ActualUrl,ExpectedUrl);
    }

    @When("the user writes a new user name on the Username box")
    public void the_user_writes_a_new_user_name_on_the_Username_box() {
        etherscan.Username.sendKeys("Soner");

    }

    @When("the user writes a valid e-mail on the Email Address box")
    public void the_user_writes_a_valid_e_mail_on_the_Email_Address_box() {
        etherscan.EmailAddress.sendKeys("sonerkucuk@msn.com");

    }

    @When("the user writes a valid password on the Password box")
    public void the_user_writes_a_valid_password_on_the_Password_box() {
        etherscan.Password.sendKeys("etherscan2015.");

    }

    @When("the user writes a same password on the Confirm Password box")
    public void the_user_writes_a_same_password_on_the_Confirm_Password_box() {
        etherscan.ConfirmPassword.sendKeys("etherscan2015.");

    }

    @When("the user accepts conditions button")
    public void the_user_accepts_conditions_button() {
        etherscan.checkbox.click();

    }

    @When("the user clicks on the Create an Account button")
    public void the_user_clicks_on_the_Create_an_Account_button() {
        etherscan.createAccount.click();

    }

    @Then("the user should be able to give a error message")
    public void the_user_should_be_able_to_give_a_error_message() {
        Assert.assertTrue(etherscan.message.isDisplayed());
    }

}
