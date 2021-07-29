package cucumber.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaGoogleSteps {
	
	private WebDriver driver;
	
	//---------------------------------------------------------------------------------------------------------------
	// Cenario Outline 1 e 2
	
	private String assuntoPesquisa;
	
	@Dado("^que o usuario esta no site \"([^\"]*)\"$")
	public void queOUsuarioEstaNoSite(String nome_site) throws Throwable {
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		
		driver.get("https://www."+nome_site+".com.br/");
	}

	@Quando("^o usuario pesquisa \"([^\"]*)\"$")
	public void oUsuarioPesquisa(String assunto) throws Throwable {
		assuntoPesquisa = assunto;
		driver.findElement(By.xpath("//input[@title='Pesquisar']")).sendKeys(assunto);
	}
	
	@Quando("^o usuario clica no botao \"([^\"]*)\"$")
	public void oUsuarioClicaNoBotao(String botao) throws Throwable {
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='"+botao+"']")).click();
	}
	
	@Entao("^mostra os resultados com sucesso$")
	public void mostraOsResultadosComSucesso() throws Throwable {
		// Pega o assunto pesquisado anteriormente e compara com o texto do campo de Pesquisa, pra ver se são iguais
		Assert.assertEquals(assuntoPesquisa, driver.findElement(By.xpath("//div[@jsname='aJyGR']/..//input")).getAttribute("value"));
		driver.quit();
	}
	
	@Entao("^mostra a \"([^\"]*)\" principal do assunto pesquisado$")
	public void mostraAPrincipalDoAssuntoPesquisado(String url) throws Throwable {
		Assert.assertEquals(url, driver.getCurrentUrl());
		driver.quit();
	}

}
