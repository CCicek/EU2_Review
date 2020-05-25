package SeleniumReview.Day_2;

import SeleniumReview.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathLocator extends TestBase {

    @Test
    public void Test1() {
     //   driver.get("http://practice.cybertekschool.com/");
        System.out.println("driver.findElement(\"//a[@href=\\\"/drag_and_drop\\\"]\").getText() = " + driver.findElement(By.xpath("//a[@href='/drag_and_drop']")).getText());
    }


}
