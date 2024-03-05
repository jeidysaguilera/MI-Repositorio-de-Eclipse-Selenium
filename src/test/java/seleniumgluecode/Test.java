package seleniumgluecode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Test extends TestBase {



    @Given("el usuario se encuentra en la pagina Home")
    public void el_usuario_se_encuentra_en_la_pagina_home() {

        Assert.assertTrue(homePage.chekearTituloHome());
    }

    @When("hace clic sobre el boton de littletestcomics")
    public void hace_clic_sobre_el_boton_de_littletestcomics() throws Exception {
       homePage.clicLinkText();

    }
    @Then("se debe redirigir a la pantalla de comics")
    public void se_debe_redirigir_a_la_pantalla_de_comics() {

        Assert.assertTrue("No se redirecciono a la pagina solicitada",comicsPage.PaginaComic());


    }

}
