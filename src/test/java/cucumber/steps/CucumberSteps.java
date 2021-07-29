package cucumber.steps;
import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CucumberSteps {
	
	//-----------------------------------------------------------------------------------------------------------------
	// Cenario 1
	
	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("Dado");
	}

	@Quando("^executa-lo$")
	public void executaLo() throws Throwable {
		System.out.println("Quando");
	}

	@Entao("^deve finalizar com sucesso$")
	public void deveFinalizarComSucesso() throws Throwable {
		System.out.println("Entao");
	}
	
	//-----------------------------------------------------------------------------------------------------------------
	// Cenario 2, Cenario 3
	private int contador = 0;
	
	@Dado("^que o valor do contador eh (\\d+)$")  // Está usando Expressão Regular (Regex)
	                                              // (\d+): Qualquer dígito, 1 ou mais vezes
	public void queOValorDoContadorEh(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Entao("^o valor do contador sera (\\d+)$")
	public void oValorDoContadorSera(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);
	}
	
	//-----------------------------------------------------------------------------------------------------------------
	
}
