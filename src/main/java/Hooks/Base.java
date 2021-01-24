package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.AShot;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base {
    public static WebDriver driver;

    public Base() {
        PageFactory.initElements(driver, this);
    }

    @Before
    public void lauch() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Uk//Desktop//Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://m-tutor.com/");
    }

    @After
    public void quite() {
        driver.quit();
    }


//---------------------Needed Methods---------------------------------------------//
    public WebDriverWait wait;

    public void waitForVisibility(WebElement e) {
        wait = new WebDriverWait (driver, 60);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public void implicitwaittime() {
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }
    public void elementtobeclickable(WebElement e) {
        wait = new WebDriverWait (driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(e));
    }
    public void click(WebElement e){
        waitForVisibility(e);
        e.click();
    }
    public void clickifclickable(WebElement e){
        waitForVisibility(e);
        e.click();
    }

    public void getDropdownvalue(WebElement e, int index){
        Select s=new Select(e);
        s.selectByIndex(index);
    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
//Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File DestFile=new File(fileWithPath);
//Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }

    public void scrolltillelement(WebElement e) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
        Thread.sleep(1000);
    }
    public void javaclcik(WebElement e) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", e);
    }


}

