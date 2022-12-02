package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.UtilitiesAmazon;

import java.util.List;

public class AmazonTest extends UtilitiesAmazon {
    @Before
    public void setUp() throws InterruptedException{
        Thread.sleep(1000);
        openBrowser("https://www.amazon.co.uk/");
    }
    @Test
    public void searchResults()throws InterruptedException{
        //accept alert
        Thread.sleep(1000);
        clickOnElement(By.xpath("//input[@id='sp-cc-accept']"));
        Thread.sleep(1000);
        //send text to the search bar
        sendTextToElement(By.xpath("//input[@id='twotabsearchtextbox']"),"Dell Laptop");
        Thread.sleep(1000);
        //click submit
        hoverOverAndClickOnElement(By.xpath("//input[@id='nav-search-submit-button']"));
        Thread.sleep(1000);
        //click dell
        clickOnElement(By.xpath("//div[5]/ul[1]/li[1]//span[1]/a[1]/div[1]/label[1]/i[@class='a-icon a-icon-checkbox']"));
        Thread.sleep(1000);
        //get number of elements
        int actualNumPerPage = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).size();
        //print number of elements
        System.out.println(actualNumPerPage);
        //define expected
        int expectedNumPerPage = 22;
        Thread.sleep(1000);
        //verify expected is equal to actual
        Assert.assertEquals("not 31",expectedNumPerPage,actualNumPerPage);
        //print all elements
        List<WebElement> listProducts = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement lists : listProducts){
            System.out.println(lists.getText());
        }


    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
