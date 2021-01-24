package webpages;

import Hooks.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AskaDoubt extends Base {
    @FindBy(xpath = "//a[@id='nav-a-three']")
    public WebElement Asknavlink;
    @FindBy(xpath = "//select[@id='ask_product']")
    public WebElement selectpro;
    @FindBy(xpath = "//select[@id='ask_subject'][@class='form-control sel-dropdown']")
    public WebElement selectsub;
    @FindBy(xpath = "//textarea[@id=\"question\"][@class=\"form-control ask-input-txt\"]")
    public WebElement Doubttextfield;
    @FindBy(xpath = "//button[@id='askbutton']")
    public WebElement Asksubmitbtn;




}
