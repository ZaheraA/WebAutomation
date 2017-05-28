package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by Zahera on 5/18/2017.
 */

public class HomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#navigation-dropdown")
    public static WebElement selectionMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"WC_CategoriesSidebarDisplayf_links_3_1\"]")
    public static WebElement selectionMenuElectronics;

    @FindBy(how = How.CSS, using = "#WC_CategoriesSidebarDisplayf_links_3_2")
    public static WebElement selectionMenuComputers;

    @FindBy(how = How.CSS, using = "#WC_CategoriesSidebarDisplayf_links_3_3")
    public static WebElement selectionMenuAppliances;

    @FindBy(how = How.CSS, using = "#WC_CategoriesSidebarDisplayf_links_3_4")
    public static WebElement selectionMenuFurniture;


    public WebElement getSelectionMenuWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return selectionMenu;
    }

    //--------------------------Selection Menu------------------------------//
    public WebElement getSelectionMenu() {
        return selectionMenu;
    }

    public void clickOnSelectionMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSelectionMenuWebElement().click();
    }

    //-----------------------Electronics-------------------------------------------//
    public WebElement getSelectionMenuElectronics() {
        return selectionMenuElectronics;
    }

    public void clickOnElectronicsSelection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSelectionMenuElectronics().click();
    }

    public void goToElectronicsSelection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSelectionMenu();
        clickOnElectronicsSelection();
    }

    //-------------------------------Computers----------------------------------------------------------------/
    public WebElement getSelectionMenuComputers() {
        return selectionMenuComputers;
    }

    public void clickOnComputersSelection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSelectionMenuComputers().click();
    }

    public void goToComputersSelection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSelectionMenu();
        clickOnComputersSelection();
    }


    //-------------------------------Appliances----------------------------------------------------------------/
    public WebElement getSelectionMenuAppliances() {
        return selectionMenuAppliances;
    }

    public void clickOnApplianceSelection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSelectionMenuAppliances().click();
    }

    public void goToAppliancesSelection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSelectionMenu();
        clickOnApplianceSelection();
    }

    //-------------------------------Furniture----------------------------------------------------------------/
    public WebElement getSelectionMenuFurniture() {
        return selectionMenuFurniture;
    }

    public void clickOnFurnitureSelection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSelectionMenuFurniture().click();
    }

    public void goToFurnitureSelection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSelectionMenu();
        clickOnFurnitureSelection();
    }

}

