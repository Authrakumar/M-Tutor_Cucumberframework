package step_definitions;

import Hooks.Base;
import Utilities.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import webpages.AskaDoubt;
import webpages.Assessment;
import webpages.Homepage;
import webpages.Loginpage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Assessment_definitions {
    Loginpage loginpage=new Loginpage();
    Homepage homepage=new Homepage();
    AskaDoubt askaDoubt=new AskaDoubt();
    Assessment assessment=new Assessment();
    Base base=new Base();
    @Given("^I am home page$")
    public void i_am_home_page() throws Throwable {
        loginpage.landloginbtn();
        Assert.assertEquals(base.driver.getTitle(), Constants.logintitle);
        loginpage.entermob("8667651940");
        loginpage.enterpwd("abc123");
        base.implicitwaittime();
        loginpage.pressloginbtn();
        Thread.sleep(2000);
        if(base.driver.getTitle()!=(Constants.hometitle)){
            loginpage.presssessionbtn();
            base.waitForVisibility(homepage.hometitle);
            Assert.assertEquals(homepage.hometitle.getText(), Constants.hometitle);
        }else{
            base.waitForVisibility(homepage.hometitle);
            Assert.assertEquals(homepage.hometitle.getText(), Constants.hometitle);
        }
    }

    @When("^Press Assessment navigation link$")
    public void press_Assessment_navigation_link() throws Throwable {
        assessment.assessmentnav.click();
    }

    @Then("^User Should Navigate to Assessment page$")
    public void user_Should_Navigate_to_Assessment_page() throws Throwable {
        System.out.println(base.driver.getTitle());
    }

    @Then("^Select Sem,Sub & Ass \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void select_Sem_Sub_Ass_and(String sem, String sub, String test) throws Throwable {
        assessment.subselect(sem);
        Thread.sleep(2000);
        assessment.sub2select(sub);
        Thread.sleep(2000);
        assessment.sub3select(test);
        Thread.sleep(2000);
        assessment.instbtn.click();
    }

    @Then("^Complete a Test$")
    public void complete_a_Test() throws Throwable {
        System.out.println(base.driver.getTitle());
        String c=assessment.count.getText();
        int count=Integer.parseInt(c);
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
                if(i == 1){
                    String s=assessment.Que1.getText();
                    System.out.println(s);
                    if(s.contains("â\u0080")||s.contains("Â"))   base.takeSnapShot(base.driver,"C://Users//Uk//Desktop//WFH//LOM//cucumber//M-Tutor_Cucumberframework//src//test//resources//Screenshot//"+assessment.asstitle.getText()+"//"+assessment.asstitle.getText()+"_ss_"+timestamp()+".png");
                        base.javaclcik(assessment.ans);
                        assessment.submit.click();
                } else{
                    String s=assessment.Que2.getText();
                    System.out.println(s);
                    if(s.contains("â\u0080")||s.contains("Â"))   base.takeSnapShot(base.driver,"C://Users//Uk//Desktop//WFH//LOM//cucumber//M-Tutor_Cucumberframework//src//test//resources//Screenshot//"+assessment.asstitle.getText()+"//"+assessment.asstitle.getText()+"_ss_"+timestamp()+".png");
                        base.javaclcik(assessment.ans2);
                        assessment.submit.click();
                    assessment.scrolltop.click();
                }
            }  catch (Exception e){
               e.getStackTrace();
            }
        }
        }

    public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}



