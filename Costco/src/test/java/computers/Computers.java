package computers;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by Zahera on 5/18/2017.
 */
public class Computers extends CommonAPI {

    @Test
    public void computersView(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        ComputersPage computersPage = PageFactory.initElements(driver, ComputersPage.class);
        computersPage.electronicsPageView();

        String computersLbl = getTextByXpath("//*[@id=\"search-results\"]/div[1]/div/div/div/h1");
        System.out.println(computersLbl);
        Assert.assertEquals(computersLbl, "Computers");

        clickByCss("#search-results > div.c_23535 > div > div:nth-child(2) > div:nth-child(1) > a > h3");
        selectOptionByVisibleText(driver.findElement(By.xpath("//*[@id=\"sort_by\"]")),"Best Match");

    }

}
