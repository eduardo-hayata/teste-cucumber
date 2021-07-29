package cucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",  // Caso a feature esteja em Pacotes diferentes, deve-se informar a localizacao
		
		glue = "cucumber.steps",  // Caso os Steps estejam em Pacotes diferentes, deve-se informar a localizacao
		
		plugin = "pretty",   // Para voltar a mostrar mais informacoes no Console
		
		monochrome = true,   // Para melhorar a legibilidade, tirar caracteres especiais que mostram no Console
		
		snippets = SnippetType.CAMELCASE,   // Nome do Metodo: primeira letra de cada palavra em Maiuscula
		
		dryRun = false,      // Valor: FALSE (default). Executa os testes normalmente
  		                     // Valor: TRUE. NAO executa os testes, apenas Valida se o Mapeamento esta Correto. Deixa Steps como "Skipped" 
		
		strict = false,      // Valor: FALSE (default). Se estiver faltando implementacao p/ algum Step, JUnit acusa como "Skipped"
		                     // valor TRUE. Se estiver faltando implementacao p/ algum Step, JUnit acusa como "Erro"
		
		tags = "@unitarios"    // Executar apenas os Cenarios/Features com a tag especificada
		)
public class RunnerTest {

}
