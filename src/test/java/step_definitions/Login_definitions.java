package step_definitions;

import Hooks.Base;
import Utilities.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import webpages.Homepage;
import webpages.Loginpage;

public class Login_definitions {
    Loginpage loginpage=new Loginpage();
    Base base=new Base();

    //Scenario 1
    @Given("^I am on Landing Page$")
    public void i_am_on_Landing_Page() throws Throwable {
        Assert.assertEquals(base.driver.getTitle(), Constants.landtitle);
    }

    @When("^Press Login Button$")
    public void press_Login_Button() throws Throwable {
        loginpage.landloginbtn();
    }

    @Then("^User Should Navigate to Login page$")
    public void user_Should_Navigate_to_Login_page() throws Throwable {
        Assert.assertEquals(base.driver.getTitle(), Constants.logintitle);
    }

    //Scenario 2
    @Given("^Press Landing Page Login Button then User should navigate to Login page$")
    public void press_Landing_Page_Login_Button_then_User_should_navigate_to_Login_page() throws Throwable {
        loginpage.landloginbtn();
        Assert.assertEquals(base.driver.getTitle(), Constants.logintitle);
    }

    @When("^Press Signup link Button$")
    public void press_Signup_link_Button() throws Throwable {
        loginpage.Signuplink();
    }

    @Then("^User Should Navigate to Signup page$")
    public void user_Should_Navigate_to_Signup_page() throws Throwable {
        Assert.assertEquals(base.driver.getTitle(), Constants.signuptitle);
    }

    //Scenario 3
    @Given("^Click Landing Page Login Button User Should Navigate to Login page$")
    public void click_Landing_Page_Login_Button_User_Should_Navigate_to_Login_page() throws Throwable {
        loginpage.landloginbtn();
        Assert.assertEquals(base.driver.getTitle(), Constants.logintitle);
    }

    @When("^Press Forgot link Button$")
    public void press_Forgot_link_Button() throws Throwable {
        loginpage.forgotpwdlink();
    }

    @Then("^User Should Navigate to Forgot page$")
    public void user_Should_Navigate_to_Forgot_page() throws Throwable {
        Assert.assertEquals(base.driver.getTitle(), Constants.forgottitle);
    }

    //Scenario 4
    @Given("^Landing Page Login Button clicks User Should Navigate to Login page$")
    public void Landing_Page_Login_Button_clicks() throws Throwable {
        loginpage.landloginbtn();
    }

    @When("^Enter Credentials as \"([^\"]*)\" & \"([^\"]*)\" then press Login Button$")
    public void enter_Credentials_as_then_press_Login_Button(String Mobile, String Password) throws Throwable {
        loginpage.entermob(Mobile);
        loginpage.enterpwd(Password);
        loginpage.pressloginbtn();
        base.implicitwaittime();
        try{
            base.clickifclickable(loginpage.Sessionkillbtn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("^IF User enters valid user credentials navigate to home page else error thrown \"([^\"]*)\"$")
    public void if_User_enters_valid_user_credentials_navigate_to_home_page_else_error_thrown(String type) throws Throwable {
            if (type.equals("valid")){
                System.out.println(base.driver.getTitle());
                Assert.assertEquals(Constants.hometitle,base.driver.getTitle());
            }else if(type.equals("Mobincorrect")){
                System.out.println(base.driver.getTitle());
                Assert.assertEquals(Constants.InvalidMoberror,loginpage.moberror());
            }
    }
}
