package SeleniumReview.Day_2;

import SeleniumReview.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown extends TestBase {

    @Test
    public void dropdown() {

        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText("Option 2");

    }

    @Test
    public void dropdown2() {

        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByValue("MN");
    }

    @Test
    public void dropdown3() {

        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        Select select = new Select(driver.findElement(By.id("state")));
        select.selectByIndex(1);
    }

    @Test
    public void dropdown4() throws InterruptedException {

        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        Select select = new Select(driver.findElement(By.name("Languages")));

        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            Thread.sleep(1000);
            select.selectByVisibleText(option.getText());
        }

        for (WebElement option : options) {
            System.out.println("option.getText() = " + option.getText());
        }
        Thread.sleep(3000);

        select.deselectAll();

    }

    @Test

    public void dropdown5() throws InterruptedException {

        driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
        driver.findElement(By.id("dropdownMenuLink")).click();
        driver.findElement(By.xpath("//a[text()='Facebook']")).click();
        Thread.sleep(2000);
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }
}
