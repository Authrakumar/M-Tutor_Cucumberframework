package step_definitions;


import Hooks.Base;
import Utilities.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webpages.Homepage;
import webpages.Loginpage;
import webpages.QB;

public class Qb_definitions {
    Loginpage loginpage=new Loginpage();
    QB qb=new QB();
    Homepage homepage=new Homepage();
    Base base=new Base();
    WebDriverWait wait;
    @Given("^I am on Landing Page & press Login button$")
    public void i_am_on_Landing_Page_press_Login_button() throws Throwable {
        loginpage.landloginbtn();
       Assert.assertEquals(base.driver.getTitle(), Constants.logintitle);
    }
    @When("^Enter login valid login Credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_login_valid_login_Credentials_and(String username, String password) throws Throwable {
            loginpage.entermob(username);
            loginpage.enterpwd(password);
            base.implicitwaittime();
            loginpage.pressloginbtn();
            Thread.sleep(2000);
    }
    @Then("^User Should Navigate to Home Page$")
    public void user_Should_Navigate_to_Home_Page() throws Throwable {
        if(base.driver.getTitle()!=(Constants.hometitle)){
            loginpage.presssessionbtn();
            base.waitForVisibility(homepage.hometitle);
            Assert.assertEquals(homepage.hometitle.getText(), Constants.hometitle);
        }else{
            base.waitForVisibility(homepage.hometitle);
            Assert.assertEquals(homepage.hometitle.getText(), Constants.hometitle);
        }
    }

}