import org.openqa.selenium.By;

/**
 * Created by Nick on 07.02.2016.
 */
public class AdminPage {

    //private final By agentGridRow = By.xpath(".//*[@id='AgentsGrid_DXDataRow2']/td[4]");
    private final By agentGridRow = By.xpath("//tr[@id='AgentsGrid_DXDataRow2']/td[4]");

    //private final By viewAgent = By.xpath("//div[@id='OfficesToolbarMenu_DXI1_T']/span");
    //private final By viewAgent = By.cssSelector("#OfficesToolbarMenu_DXI1_T/span");
    private final By newMaid = By.xpath(".//*[@id='ToolbarMenu_DXI0_T']/span");

    public final By viewAgent = By.xpath(".//li[@id='OfficesToolbarMenu_DXI1_']/div/span/");



    public By getAgentGridRow() {
        return agentGridRow;
    }

    public By getViewAgent() {
        return viewAgent;
    }

    public By getNewMaid() {
        return newMaid;
    }
}
