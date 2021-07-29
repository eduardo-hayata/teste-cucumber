package cucumber.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class GmailSteps {
	
	private WebDriver driver;
	
	//-----------------------------------------------------------------------------------------------------------------
	// Cenario 1
	
	@Dado("^que o usuario esta no Gmail$")
	public void queOUsuarioEstaNoGmail() throws Throwable {
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
	}

	@Quando("^o usuario escreve o email vazio$")
	public void oUsuarioEscreveOEmailVazio() throws Throwable {
		driver.findElement(By.xpath("//input[@name='identifier']")).click(); // Clique no campo, sem escrever nada
	}

	@Quando("^o usuario clica no botao Proxima$")
	public void oUsuarioClicaNoBotaoProxima() throws Throwable {
		driver.findElement(By.xpath("//span[.='Próxima']")).click();
	}

	@Entao("^aparece uma mensagem de erro$")
	public void apareceUmaMensagemDeErro() throws Throwable {
		Assert.assertEquals("Digite um e-mail ou número de telefone", driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText());
		driver.quit();
	}
	
	
}
