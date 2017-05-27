package electronics;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by Zahera on 5/23/2017.
 */
public class Electronics_Cameras extends CommonAPI {

    @Test
    public void Cameras() {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        ElectronicsPage electronicsPage = PageFactory.initElements(driver, ElectronicsPage.class);
        electronicsPage.electronicsPageView();

        String electronicsLbl = getTextByXpath("//*[@id=\"search-results\"]/div[1]/div/div/div/h1");
        System.out.println(electronicsLbl);
        Assert.assertEquals(electronicsLbl, "Electronics");

        clickByCss("#search-results > div.c_27006 > div > div:nth-child(2) > div:nth-child(4) > a > h3");
        clickByCss("#search-results > div.c_24058 > div > div:nth-child(2) > div:nth-child(1) > a > h3");




    }

    }
