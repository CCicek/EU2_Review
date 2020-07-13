package SeleniumReview.AmzTests;

import SeleniumReview.TestBase;
import SeleniumReview.utilities.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmzTest extends TestBase {


    @DataProvider
    public Object[][] dataprovider() {
        ExcelUtil deneme = new ExcelUtil("src\\test\\resources\\SampleData.xlsx","SalesOrders");
        String[][] denemelist = deneme.getDataArrayWithoutFirstRow();
        return denemelist;
    }

    @Test(dataProvider = "dataprovider")
    public void dpTest() {
        System.out.println(dataprovider().toString());
    }


    @Test
    public void test1() {

        System.out.println("action1");
    }

    @Test
    public void test2() {
        System.out.println("action2");
    }

}
class AmzTest2 extends TestBase{

    @Test
    public void test3() {
        System.out.println("action3");
    }

    @Test
    public void test4() {
        System.out.println("action4");
    }

    @Test
    public void test5() {

    }



}
