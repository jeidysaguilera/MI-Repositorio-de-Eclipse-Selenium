package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }


    public void clic(By locator) throws Exception {

        try {
            driver.findElement(locator).click();
        }catch ( Exception e ){
            throw new Exception("No se pudo hacer clic en el elemento" + locator);
        }
    }

    public boolean isDisplay(By locator){

      return   driver.findElement(locator).isDisplayed();
    }

    public String getText(By locator){

      return   driver.findElement(locator).getText();
    }

    public String getTitle(){

       return driver.getTitle();
    }



}
