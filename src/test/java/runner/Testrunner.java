package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)

@CucumberOptions(

    features ="src/test/java/features/",
        glue = ("seleniumgluecode"),
        plugin = {"json:target/cucumber.json"},
        snippets = CAMELCASE
)


public class Testrunner {

@AfterClass
    public static void finich(){
    try {
System.out.println("Generando reporte");
String[] cmd={"cmd.exe","/c","npm run report"};
Runtime.getRuntime().exec(cmd);
        System.out.println("Reporte generado correctamente");
    }catch (Exception e){
e.printStackTrace();
    }
}



}
