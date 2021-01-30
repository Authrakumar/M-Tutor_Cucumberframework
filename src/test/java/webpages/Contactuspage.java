package webpages;

import Hooks.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Contactuspage extends Base {


    @FindBy(xpath = "//a[text()='Contact us']")
    public WebElement contacttitle;

    @FindBy(xpath = "//input[@id=\"first_name\"]")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id=\"last_name\"]")
    public WebElement Lastname;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement Email;

    @FindBy(xpath = "//input[@id=\"mobileno\"]")
    public WebElement Mobile;

    @FindBy(xpath = "//textarea[@id=\"message\"]")
    public WebElement Message;

    @FindBy(xpath = "//*[@class=\"selected-flag\"]\n")
    public WebElement Selectcountrycode;

    @FindBy(xpath = "//input[@class=\"btn_2 btn_orange\"][@type=\"submit\"]")
    public WebElement Submit;

    @FindBy(xpath ="//label[@id=\"first_name-error\"]")
    public WebElement firstnameerror;

    @FindBy(xpath ="//label[@id=\"last_name-error\"]")
    public WebElement Lastnameerror;

    @FindBy(xpath ="//label[@id=\"email-error\"]")
    public WebElement Emailerror;

    @FindBy(xpath ="//label[@id=\"mobileno-error\"]")
    public WebElement Mobilerror;

    @FindBy(xpath ="//label[@id=\"message-error\"]")
    public WebElement messageerror;

    @FindBy(xpath = "//p[text()='Thank you for contacting us. We will get back to you soon.']")
    public WebElement success;

    @FindBy(xpath = "//button[@class=\"confirm\"]")
    public WebElement successok;

    public String relativelocator(WebElement element){
        String e=driver.findElement(RelativeLocator.withTagName("label").below(element)).getText();
        return e;
    }


}
