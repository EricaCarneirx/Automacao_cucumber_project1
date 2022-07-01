package steps;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class PesquisaProdutosSteps {

	@Dado("^que acesso a página principal do e-commerce \"(.*?)\"$")
	public void acessarPaginaPrincipal(String url) {
		System.setProperty("webdriver.chrome.driver",
			    System.getProperty("user.dir") + File.separator +
			    "drivers" + File.separator + "chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.navigate().to(url);
	}

	@Quando("^é realizado uma pesquisa de um produto \"(.*?)\"$")
	public void pesquisarProduto(String produto) {
		throw new io.cucumber.java.PendingException();
	}

	@Então("^deve ser exibido o produto$")
	public void verificarProduto() {
		throw new io.cucumber.java.PendingException();
	}

	@E("deve ser exibido com o preço correto {string}")
	public void deve_ser_exibido_com_o_preço_correto(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Então("deve ser exibido {int} resultados")
	public void deve_ser_exibido_resultados(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@E("^deve ser exibida a mensagem de alerta \"(.*?)\"$")
	public void deve_ser_exibida_a_mensagem_de_alerta_no_results_were_found_for_your_search_teste() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
}
