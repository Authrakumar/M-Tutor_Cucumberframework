package webpages;

import Hooks.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Base{
  @FindBy(xpath = "//h1[contains(text(),'Welcome Home')]")
    public WebElement hometitle;
  public void setHometitle(){
      click(hometitle);
  }
}
