package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class informacoesUsuarioTest {
    @Test
    public void testAdicionarInformacaoAdicionalAoUsuario (){
        System.setProperty("webdriver.chrome.driver","c:\\drivers\\chromedriver.exe");

        WebDriver navegador = new ChromeDriver();

        navegador.get("https://www.bolttech.co.th/en/device-protection");

        navegador.findElement(By.id("selected")).click();

    }
}
