package electronics;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by Zahera on 5/18/2017.
 */
public class Electronics extends CommonAPI {

    @Test
    public void electronicsView(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        ElectronicsPage electronicsPage = PageFactory.initElements(driver, ElectronicsPage.class);
        electronicsPage.electronicsPageView();

        String electronicsLbl = getTextByXpath("//*[@id=\"search-results\"]/div[1]/div/div/div/h1");
        System.out.println(electronicsLbl);
        Assert.assertEquals(electronicsLbl, "Electronics");

        typeByCss("#search-field","TV");

        takeEnterKeys("#search-field");

        String tvSearch = getTextByXpath("//*[@id=\"filter-header\"]/span");
        System.out.println(tvSearch);
        Assert.assertEquals(tvSearch, "Filter Results");



    }
}
