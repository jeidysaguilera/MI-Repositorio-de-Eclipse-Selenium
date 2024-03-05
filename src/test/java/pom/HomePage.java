package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

  private  String title="imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
   private  By linkText= By.linkText("The Little Tester comics");

   public boolean chekearTituloHome(){

    return this.getTitle().equals(title);
}

 public void clicLinkText() throws Exception {
       this.clic(linkText);
}

}
