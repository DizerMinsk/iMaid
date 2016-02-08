import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nick on 07.02.2016.
 */
public class TestLoginPage {

    WebDriver driver = new FirefoxDriver();
    LoginPage loginPage = new LoginPage();
    FirstPage firstPage = new FirstPage();
    AdminPage adminPage = new AdminPage();
    NewMaid newMaid = new NewMaid();

    @BeforeTest
    public void openPage ()
    {
        driver.get("http://maid.devperftests.com/Login.aspx");
        WebElement waiting = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(loginPage.getLoginName()));
//        driver.close();
    }

    @Test
    public void logging ()
    {
        driver.findElement(loginPage.getLoginName()).sendKeys("admin");
        driver.findElement(loginPage.getPassword()).sendKeys("123456");
        driver.findElement(loginPage.getSubmit()).click();
        WebElement waiting = (new WebDriverWait(driver,10)).until(ExpectedConditions.presenceOfElementLocated(firstPage.getToolBar14()));
        driver.findElement(firstPage.getToolBar14()).click();
        waiting = (new WebDriverWait(driver,10)).until(ExpectedConditions.visibilityOfElementLocated(adminPage.getAgentGridRow()));
        driver.findElement(adminPage.getAgentGridRow()).click();
        waiting = (new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(adminPage.getViewAgent()));
        waiting = (new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(adminPage.viewAgent));
        driver.findElement(adminPage.getViewAgent()).click();
        waiting = (new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(adminPage.getNewMaid()));
        driver.findElement(adminPage.getNewMaid()).click();
        waiting = (new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(newMaid.getFirstTab()));
        driver.findElement(newMaid.getFirstTab()).click();

        driver.findElement(newMaid.getField1_tab1()).sendKeys("22222222");


    }


    @AfterTest
    public void Page ()
    {
//        driver.get("http://maid.devperftests.com/Login.aspx");
//        driver.close();
    }


}
