package webpages;

import Hooks.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Assessment extends Base {
    @FindBy(xpath = "//a[@id='nav-a-two']")
    public WebElement assessmentnav;

    public void subselect( String semname){
        WebElement e=driver.findElement(By.xpath("//h1[text()='"+semname+"']"));
        e.click();
    }
    public String semtitle(String semname){
        WebElement e=driver.findElement(By.xpath("//h1[text()='"+semname+"']"));
        String semtitle=e.getText();
        return semtitle;
    }
    public WebElement sub2select(String subjectname) throws InterruptedException {
        WebElement e=driver.findElement(By.xpath("//h1[@title='"+subjectname+"']"));
        javaclcik(e);
        return e;
    }
    public void sub3select( String testname){
        WebElement e=driver.findElement(By.xpath("//button[text()='"+testname+"']"));
        e.click();
    }
    @FindBy(xpath = "//a[@id=\"href_url_set\"]")
    public WebElement instbtn;

    @FindBy(xpath = "//span[@id=\"test_tq\"]")
    public WebElement count;

    @FindBy(xpath = "//div[@class=\"question_heading\"][@style=\"text-align:left\"]")
    public WebElement ques;

    @FindBy(xpath = "(//input[@id=\"optRadio\"])[1]")
    public WebElement ans;

    @FindBy(xpath = "(//input[@id=\"optRadio\"])[5]")
    public WebElement ans2;

    @FindBy(xpath = "//a[@id=\"nextquestion\"]")
    public WebElement submit;

    @FindBy(xpath = "//div[@class=\"question_heading\"][@style=\"text-align:left\"]")
    public WebElement Que2;

    @FindBy(xpath = "//div[@class=\"question_heading\"]")
    public WebElement Que1;

    @FindBy(xpath = "//h1[@class=\"blue_head_1\"]")
    public WebElement asstitle;

    @FindBy(xpath = "//img[@src=\"img/common/back_to_top.png\"]")
    public WebElement scrolltop;


}
