package seleniumgluecode;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {


    private static WebDriver driver;
    private DriverManager driverManager;



   @Before
    public void setup(){

       driverManager=  DriverManagerFactory.getManager(DriverType.CHROME);
       driver= driverManager.getDriver();
        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After//para cuando ek metodo falle hacer una captura del error
    public void tearDow(Scenario scenario){
       if(scenario.isFailed()){
           byte[] screenshot=((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
           scenario.attach(screenshot,"image/png","image");

       }
       driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
       return driver;
    }
}
