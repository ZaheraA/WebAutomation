package appliances;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by Zahera on 5/18/2017.
 */
public class Appliances extends CommonAPI {

    @Test
    public void appliancesView(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        AppliancesPage appliancesPage = PageFactory.initElements(driver, AppliancesPage.class);
        appliancesPage.appliancesPageView();

        String appliancesLbl = getTextByXpath("//*[@id=\"search-results\"]/div[1]/div/div/div/h1");
        System.out.println(appliancesLbl);
        Assert.assertEquals(appliancesLbl, "Appliances");

        clickByCss("#search-results > div.c_11505 > div > div:nth-child(2) > div:nth-child(3) > a > h3");
        clickByCss("#accordion-filter_heading-3");

        String verBrand = getTextByCss("#accordion-filter_collapse-3 > div > div:nth-child(1) > label > span:nth-child(1)");
        System.out.println(verBrand);
        Assert.assertEquals(verBrand, "Samsung");


    }
}
