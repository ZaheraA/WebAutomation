package furniture;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by Zahera on 5/22/2017.
 */
public class Furniture_LivingRoom extends CommonAPI {

    @Test
    public void LivingRoom(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        FurniturePage furniturePage = PageFactory.initElements(driver, FurniturePage.class);
        furniturePage.furniturePageView();

        String furnitureLbl = getTextByCss("#search-results > div.c_27004 > div > div > div > h1");
        System.out.println(furnitureLbl);
        Assert.assertEquals(furnitureLbl, "Furniture & Mattresses");

        clickByCss("#search-results > div.c_27005 > div > div:nth-child(2) > div:nth-child(1) > a > h3");
        clickByCss("#search-results > div.c_87505 > div > div:nth-child(3) > div:nth-child(1) > a > h3");
        selectOptionByVisibleText(driver.findElement(By.cssSelector("#sort_by")),"Price (Low to High)");











    }


}
