package SeleniumReview.pages;

import SeleniumReview.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzPage {
    public AmzPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchbox;
    @FindBy(xpath = "//span[contains(text(),'results for')]")
    public WebElement resultText;


    public String getNumber(String str){
        searchbox.sendKeys(str + Keys.ENTER);
        String all=resultText.getText();
        String[] split=all.split(" ");
        return split[2];
    }
}
