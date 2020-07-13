package SeleniumReview.InterviewPagePreparer;

import SeleniumReview.TestBase;
import SeleniumReview.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

public class PhotoMerger extends TestBase {

    @Test
    public void pdfToPhoto() throws IOException {
        driver.get("file:///C:/Users/muham/Desktop/SDET/Interwiew%20Prep/00%20-%20Interview%20Prep%20updated%20by%20Alberto.pdf");
        //System.exit(1);
        driver.findElement(By.id("input")).click();
        driver.findElement(By.id("input")).sendKeys("3" + Keys.ENTER);


        BrowserUtils.getScreenshot("1");
    }

    @Test
    public void ofoct() {


           // String photoPath = "C:\\Users\\muham\\Desktop\\SDET\\Interwiew Prep\\AlbertoPhoto\\00 - Interview Prep updated by Alberto-"+ String.format("%03d",i) +".jpg";
        String photoPath = "C:\\Users\\muham\\Desktop\\SDET\\Interwiew Prep\\AlbertoPhoto\\00 - Interview Prep updated by Alberto-001.jpg";

        driver.findElement(By.xpath("//span[@aria-hidden=\"true\"]")).click();
            //BrowserUtils.scrollToElement(driver.findElement(By.xpath("//span[contains(text(),'Upload')]")));
            //JavascriptExecutor executor = (JavascriptExecutor)driver;
           // executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[contains(text(),'Upload')]")));

          //  driver.findElement(By.xpath("//span[contains(text(),'Upload')]")).sendKeys(photoPath);
            BrowserUtils.waitFor(1);
            driver.findElement(By.id("mergebtn")).click();
            BrowserUtils.waitFor(3);
            driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
    }
}
