package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilitiesAmazon extends BaseTest {
    public void clickOnElement(By by){
        //define link
       WebElement link = driver.findElement(by);
       //click on link
       link.click();
    }
    public String getTextFromElement(By by){
        //define the location of where the text is
        WebElement textElement = driver.findElement(by);
        //return the text of that element
        return textElement.getText();
    }
    public void sendTextToElement(By by,String text){
        //define the location of the textbox
        WebElement field = driver.findElement(by);
        //send text to that element
        field.sendKeys(text);
    }
    public void selectByVisibleTextFromDropdown(By by, String text){
        //method to select a webelement based on the visible text
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
    public void selectByValue(By by, String text){
        //method to select a webelement based on the value
        WebElement value = driver.findElement(by);
        Select select = new Select(value);
        select.selectByValue(text);
    }
    public void selectByIndex(By by, int num){
        //method to select a webelement based on the index number
        WebElement index = driver.findElement(by);
        Select select = new Select(index);
        select.selectByIndex(num);
    }
    //----------alert methods---------
    public void switchToAlert(){
        //switch to alert method
        driver.switchTo().alert();
    }
    public void acceptAlert(){
        //accept the popup
        driver.switchTo().alert().accept();
    }
    public void dismissAlert(){
        //dismiss the popup
        driver.switchTo().alert().dismiss();
    }
    public String getTextFromAlert(By by){
        //get text from the alert
        return driver.switchTo().alert().getText();
    }
    public void sendTextToAlert(By by, String text){
        driver.switchTo().alert().sendKeys(text);
    }
    //---------hover methods----------
    public void hoverOverElement(By by){
        //create an object
        Actions actions = new Actions(driver);
        //define location 1
        WebElement text1 = driver.findElement(by);
        //define location 2
        WebElement text2 = driver.findElement(by);
        //move from text1 to text2
        actions.moveToElement(text1).moveToElement(text2).build().perform();
    }
    public void hoverOverAndClickOnElement(By by){
        //create an object
        Actions actions = new Actions(driver);
        //define location 1
        WebElement location1 = driver.findElement(by);
        //define location 2
        WebElement location2 = driver.findElement(by);
        //move from location1 to location2
        actions.moveToElement(location1).moveToElement(location2).click().build().perform();

    }
}
