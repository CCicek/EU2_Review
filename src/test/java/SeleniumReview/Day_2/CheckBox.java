package SeleniumReview.Day_2;

import SeleniumReview.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBox extends TestBase {


    @Test
    public void checkBox() {
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
        driver.findElement(By.xpath("//input[2]")).click();
        driver.findElement(By.xpath("//input[1]")).click();

    }

    @Test
    public void checkBoxList() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();

        List<WebElement> checkboxes = driver.findElements(By.tagName("input"));
        for (WebElement checkbox : checkboxes) {
            Thread.sleep(2000);
            if (!checkbox.isSelected()){
                checkbox.click();
            }
        }
    }


    @Test
    public void radioButtons() throws InterruptedException {

        driver.findElement(By.xpath("//a[@href=\"/radio_buttons\"]")).click();
        driver.findElement(By.id("red")).click();
        driver.findElement(By.id("yellow")).click();


        List<WebElement> radiobuttons =driver.findElements(By.cssSelector("input[type='radio']"));

        for (WebElement radiobutton : radiobuttons) {

           // System.out.println("radiobutton.isSelected() = " + radiobutton.isSelected());
            //System.out.println("radiobutton.isEnabled() = " + radiobutton.isEnabled());

            radiobutton.click();
            Thread.sleep(200);
        }

    }

}

