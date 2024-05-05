package pages;

import core.Driver;
import maps.LoginMaps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends LoginMaps {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void realizarLogin(String usuario, String senha) {
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        inpLogin.sendKeys(usuario);
        inpSenha.sendKeys(senha);
        btnEntrar.click();
    }

    public String getBoasVindas() {
        return linkBoasVindas.getText();
    }
}
