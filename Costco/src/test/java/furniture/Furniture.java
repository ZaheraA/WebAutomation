package furniture;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by Zahera on 5/18/2017.
 */
public class Furniture extends CommonAPI {

    @Test
    public void furnitureView(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        FurniturePage furniturePage = PageFactory.initElements(driver, FurniturePage.class);
        furniturePage.furniturePageView();

        String furnitureLbl = getTextByXpath("//*[@id=\"search-results\"]/div[1]/div/div/div/h1");
        System.out.println(furnitureLbl);
        Assert.assertEquals(furnitureLbl, "Furniture & Mattresses");

        typeByCss("#footer-search-field", "90210");
        takeEnterKeys("#footer-search-field");

        String verifyZipCodeSearch = getTextByXpath("//*[@id=\"warehouse-list\"]/tr[1]/td[2]/div/div[1]/a[1]");
        System.out.println(verifyZipCodeSearch);
        Assert.assertEquals(verifyZipCodeSearch, "Culver City");
    }

}

