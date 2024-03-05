package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComicsPage extends  BasePage{

    public ComicsPage(WebDriver driver) {
        super(driver);
    }
   private By mensageText=By.cssSelector("h2.wp-block-query-title");
   private String mensajeEsperado="Category: comics";


public boolean PaginaComic(){

   return  this.isDisplay(mensageText) && this.getText(mensageText).equals(mensajeEsperado);
}

}
