package step_definitions;

import Hooks.Base;
import Utilities.Constants;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import webpages.Contactuspage;
import webpages.Loginpage;

public class Contactus_defnition {
    Loginpage loginpage=new Loginpage();
    Contactuspage  contactuspage=new Contactuspage();
    Base base=new Base();

    @Given("^I am on Index Page$")
    public void i_am_on_Index_Page() throws Throwable {
        Assert.assertEquals(base.driver.getTitle(), Constants.landtitle);
    }

    @When("^Press Contactus link in Headertab$")
    public void press_Contactus_link_in_Headertab() throws Throwable {
        contactuspage.contacttitle.click();

    }

    @Then("^User Should Navigate to Contactus Page$")
    public void user_Should_Navigate_to_Contactus_Page() throws Throwable {
        Assert.assertEquals(Constants.Contactustitle,base.driver.getTitle());
    }

    @Then("^Enter First,Last,Email,Mob & Message \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_First_Last_Email_Mob_Message_and(String fn, String ln, String mail, String mob, String msg) throws Throwable {
        contactuspage.firstname.sendKeys(fn);
        contactuspage.Lastname.sendKeys(ln);
        contactuspage.Email.sendKeys(mail);
        contactuspage.Mobile.sendKeys(mob);
        base.scrolltillelement(contactuspage.Message);
        contactuspage.Message.sendKeys(msg);
    }
    @Then("^Click Submit Button \"([^\"]*)\"$")
    public void click_Submit_Button(String Type) throws Throwable {
        if (Type=="Empty"){
            Thread.sleep(2000);
            contactuspage.Submit.click();
            Assert.assertEquals(Constants.Firstnameempty,contactuspage.firstnameerror.getText());
            Assert.assertEquals(Constants.Lastnameempty,contactuspage.Lastnameerror.getText());
            Assert.assertEquals(Constants.Emailempty,contactuspage.Emailerror.getText());
            Assert.assertEquals(Constants.Mobempty,contactuspage.Mobilerror.getText());
            Assert.assertEquals(Constants.Msgempty,contactuspage.messageerror.getText());
        }else if (Type=="Invalidemail"){
            Thread.sleep(2000);
            contactuspage.Submit.click();
            Assert.assertEquals(Constants.Invalidmail,contactuspage.Emailerror.getText());
        }else if (Type=="InvalidMob"){
            Thread.sleep(2000);
            contactuspage.Submit.click();
            Assert.assertEquals(Constants.Invalidmob,contactuspage.Mobilerror.getText());
        }else if(Type=="Invalidconcode"){
            Thread.sleep(2000);
            base.getDropdownvalue(contactuspage.Selectcountrycode,1);
            contactuspage.Submit.click();
            Assert.assertEquals(Constants.Invalidmob,contactuspage.Mobilerror.getText());
        }else if(Type=="msg1000chars"){
            Thread.sleep(2000);
            contactuspage.Submit.click();
            Assert.assertEquals(Constants.consuccess,contactuspage.success.getText());
            contactuspage.successok.click();
        }else if(Type=="Valid"){
            Thread.sleep(2000);
            contactuspage.Submit.click();
            Assert.assertEquals(Constants.consuccess,contactuspage.success.getText());
            contactuspage.successok.click();
        }
        Thread.sleep(2000);
    }
}

