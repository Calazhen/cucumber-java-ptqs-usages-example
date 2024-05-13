package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.LoginPage;

import java.util.Map;

public class LoginSteps {
    private LoginPage loginPage;
    private String usuario;

    @Before
    public void inicializaTeste() {
        Driver.inicializaDriver();
    }

    @Dado("que esteja na pagina da login")
    public void que_esteja_na_pagina_da_login() {
        Driver.getDriver().get("http://165.227.93.41/lojinha-web/v2/");
        loginPage = new LoginPage();
    }

    @Quando("o login for realizado com os seguintes dados")
    public void o_login_for_realizado_com_os_seguintes_dados(Map<String, String> map) {
        loginPage.realizarLogin(map.get("usuario"), map.get("senha"));
        String[] loginCompletoComPalavrasDivididasEmLista = map.get("usuario").split(" ");
        usuario = loginCompletoComPalavrasDivididasEmLista[0];

    }

    @Entao("valido que o login foi realizado")
    public void valido_que_o_login_foi_realizado() {
        Assert.assertEquals("Boas vindas, " + usuario + "!", loginPage.getBoasVindas());
    }

    @After
    public void encerraTeste() {
        Driver.getDriver().quit();
    }
}
