package webpages;

import Hooks.Base;
import Utilities.Constants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends Base {
    public WebDriverWait wait= new WebDriverWait(driver,30);
    @FindBy(xpath = "//span[@class='mmr-txt-all text-blue loginbtn']")
    private WebElement LandLoginbtn;

    @FindBy(xpath = "//a[text()=' SignUp ']")
    private WebElement Signuplink;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement mailfield;

    @FindBy(xpath = "//input[@id='mobile']")
    public WebElement mobfield;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement pwdfield;

    @FindBy(xpath = "//input[@id='loginbtn']")
    public WebElement loginbtn;

    @FindBy(xpath = "//label[@id='email-error']")
    private WebElement emailerror;

    @FindBy(xpath = "//label[@id='mobile-error']")
    public WebElement moberror;

    @FindBy(xpath = "//label[@id='password-error']")
    public WebElement pwderror;

    @FindBy(xpath = "//p[text()='Uh-Oh! You have entered an invalid password']")
    public WebElement alertpopup;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement alertok;

    @FindBy(xpath = "//a[text()='Forgot password?']")
    public WebElement forgotpwdlink;

    @FindBy(xpath = "//*[contains(text(),'Yes, Continue')][contains(@class,'confirm')]")
    public WebElement Sessionkillbtn;

    public void landloginbtn(){
        clickifclickable(LandLoginbtn);
    }
    public Loginpage entermob(String mob){
        mobfield.sendKeys(mob);
        return this;
    }
    public Loginpage enterpwd(String pwd) {
        pwdfield.sendKeys(pwd);
        return this;
    }
    public Homepage pressloginbtn(){
        clickifclickable(loginbtn);
        return new Homepage();
    }
    public Forgotpasswordpage forgotpwdlink(){
        clickifclickable(forgotpwdlink);
        return new Forgotpasswordpage();
    }
    public Signuppage Signuplink(){
        clickifclickable(Signuplink);
        return new Signuppage();
    }
    public String emailerror(){
        String emailerrorText=emailerror.getText();
        return emailerrorText;
    }
    public String moberror(){
        String moberrorText=moberror.getText();
        return moberrorText;
    }
    public String pwderror(){
        String pwderrorText=pwderror.getText();
        return pwderrorText;
    }
    public String alertpoperror(){
        String alertpopupText=alertpopup.getText();
        return alertpopupText;
    }
    public Homepage presssessionbtn(){
        clickifclickable(Sessionkillbtn);
        return new Homepage();
    }
}
