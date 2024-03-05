package runner.browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver","/home/mint/COSAS MIAS/JAVA/drivers/chromedriver-linux64/chromedriver");
        driver=new ChromeDriver();

    }


}
