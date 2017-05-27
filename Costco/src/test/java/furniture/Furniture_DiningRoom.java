package furniture;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by Zahera on 5/24/2017.
 */
public class Furniture_DiningRoom extends CommonAPI {

    @Test
    public void DiningRoom() {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        FurniturePage furniturePage = PageFactory.initElements(driver, FurniturePage.class);
        furniturePage.furniturePageView();

        String furnitureLbl = getTextByCss("#search-results > div.c_27004 > div > div > div > h1");
        System.out.println(furnitureLbl);
        Assert.assertEquals(furnitureLbl, "Furniture & Mattresses");

       clickByCss("#search-results > div.c_27005 > div > div:nth-child(2) > div:nth-child(4) > a > h3");
       clickByXpath(".//*[@id='search-results']/div[4]/div/div[2]/div[1]/a/h3");

    }
}
