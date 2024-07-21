package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObjet.Produit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class SelectionDesProduits {
	
	WebDriver driver= SetUp.driver;
	Produit Product = new Produit(driver);
	
	
	@Given("Clicquer sur Products")
	public void clicquer_sur_products() {
		Product.clicquer_sur_products();
		
	}

	@Given("Ajouter {string} au panier")
	public void ajouter_au_panier(String string) {
		Product.ajouter_au_panier(string);
		
	}

	@Given("cliquer sur continue shopping")
	public void cliquer_sur_continue_shopping() {
		Product.cliquer_sur_continue_shopping();
		
	}

	@Given("Cliquuer sur  View Cart")
	public void cliquuer_sur_view_cart() {
		Product.cliquuer_sur_view_cart();
		
	}
	@When("cliquer sur passer a la caisse")
	public void cliquer_sur_passer_a_la_caisse() {
		Product.cliquer_sur_passer_a_la_caisse();
		
	}

	@When("cliquer passer la commande")
	public void cliquer_passer_la_commande() {
		Product.cliquer_passer_la_commande();
		
	}

	@Given("taper {string}")
	public void taper2(String string) {
		Product.taper2(string);
	}
	

	@When("Taper {string}")
	public void taper1(String string) {
		Product.taper1(string);
	}

	
	@When("tappper {string}")
	public void tappper(String string) {
		Product.tappper(string);
		
	}

	@When("tAper {string}")
	public void t_aper(String string) {
		Product.t_aper(string);
	}

	@When("tapper {string}")
	public void tapper(String string) {
		Product.tapper(string);
	}
	@When("cliquer sur payer et confirmer")
	public void cliquer_sur_payer_et_confirmer() {
		Product.cliquer_sur_payer_et_confirmer();
		
	}

}
