package step_definitions;

import Hooks.Base;
import Utilities.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;
import webpages.AskaDoubt;
import webpages.Homepage;
import webpages.Loginpage;
import webpages.QB;

public class Ask_definitions {
        Loginpage loginpage=new Loginpage();
        Homepage homepage=new Homepage();
        AskaDoubt askaDoubt=new AskaDoubt();
        Base base=new Base();
        WebDriverWait wait;
        @Given("^I am on Landing Page and press Login button$")
        public void i_am_on_Landing_Page_press_Login_button() throws Throwable {
            loginpage.landloginbtn();
            Assert.assertEquals(base.driver.getTitle(), Constants.logintitle);
        }
        @When("^Enter login valid Credentials \"([^\"]*)\" and \"([^\"]*)\"$")
        public void enter_login_valid_login_Credentials_and(String username, String password) throws Throwable {
            loginpage.entermob("8667651940");
            loginpage.enterpwd("uk123");
            base.implicitwaittime();
            loginpage.pressloginbtn();
            Thread.sleep(5000);
        }
        @Then("^User Should Navigate to the Home Page$")
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


    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
            System.out.println(base.driver.getTitle());
    }
    @When("^Press ask a Doubt navigation link$")
    public void press_ask_a_Doubt_navigation_link() throws Throwable {
        Thread.sleep(20000);
        askaDoubt.Asknavlink.click();
    }
    @Then("^User Should Navigate to ask a Doubt page$")
    public void user_Should_Navigate_to_ask_a_Doubt_page() throws Throwable {
        base.waitForVisibility(askaDoubt.Asksubmitbtn);
        System.out.println(base.driver.getTitle());
    }

    @Then("^Select product,subject & Doubt \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void select_product_subject_Doubt_and(String pro, String sub, String doubt) throws Throwable {
            int indexpro=Integer.parseInt(pro);
            int indexsub=Integer.parseInt(sub);
            base.getDropdownvalue(askaDoubt.selectpro,indexpro);
            Thread.sleep(2000);
            base.implicitwaittime();
            base.getDropdownvalue(askaDoubt.selectsub,indexsub);
            Thread.sleep(2000);
            askaDoubt.Doubttextfield.sendKeys(doubt);
            Thread.sleep(2000);
    }

    @Then("^Add attachment \"([^\"]*)\"$")
    public void add_attachment(String arg1) throws Throwable {
        System.out.println(base.driver.getTitle());
    }

    @Then("^Press Submit Button$")
    public void press_Submit_Button() throws Throwable {
           askaDoubt.Asksubmitbtn.click();
    }

}
