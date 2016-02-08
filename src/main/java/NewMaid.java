import org.openqa.selenium.By;

/**
 * Created by Nick on 07.02.2016.
 */
public class NewMaid {

    private final By firstTab = By.xpath(".//*[@id='ASPxFormLayout1_PC_0_AT0T']/span");
    private final By secondTab = By.xpath(".//*[@id='ASPxFormLayout1_PC_0_T1T']/span");
    private final By thirdTab = By.xpath(".//*[@id='ASPxFormLayout1_PC_0_T2T']/span");
    private final By forthTab = By.xpath(".//*[@id='ASPxFormLayout1_PC_0_T3T']");
    private final By fifthTab = By.xpath(".//*[@id='ASPxFormLayout1_PC_0_T4T']/span");

    private final By field1_tab1 = By.xpath(".//*[@id='ASPxFormLayout1_PC_0_tbxName_I']");



    public By getFirstTab() {
        return firstTab;
    }

    public By getSecondTab() {
        return secondTab;
    }

    public By getThirdTab() {
        return thirdTab;
    }

    public By getForthTab() {
        return forthTab;
    }

    public By getFifthTab() {
        return fifthTab;
    }

    public By getField1_tab1() {
        return field1_tab1;
    }
}
