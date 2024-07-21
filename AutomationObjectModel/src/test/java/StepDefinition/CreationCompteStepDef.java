package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObjet.PageHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreationCompteStepDef {
	
	WebDriver driver= SetUp.driver;
	PageHome home = new PageHome(driver);
	
	
	@Given("acceder sur URL {string}")
	public void acceder_sur_url(String string) {
		home.GetUrl(string);
		
	}
	@When("cliquer sur s inscrir  login boutton")
	public void cliquer_sur_s_inscrir_login_boutton() {
		home.Cliquer_sur_bt_signlogin();
	}
	@When("saisir un nom {string} et taper l email  {string}")
	public void saisir_un_nom_et_taper_l_email(String string, String string2) {
		home.signup_name(string);
		home.signup_email(string2);
		
	}
	@When("cliquer sur login")
	public void cliquer_sur_login() {
		home.login_boutton();
		
	}

	@When("choisir MR ou MMe")
	public void choisir_mr_ou_m_me() {
		home.choisir_mr_ou_mme();
		
		
	}
	@When("saisr un MDP {string}")
	public void saisr_un_mdp(String string) {
		home.saisr_un_mdp(string);
		
		
	}
	@When("choisir la date de naissance {string} , {string} , {string}")
	public void choisir_la_date_de_naissance(String string, String string2, String string3) {
	home.choisir_la_date_de_naissance(string, string2, string3);
	
	}
	@When("saisir un prenom {string} et le nom de famille {string}")
	public void saisir_un_prenom_et_le_nom_de_famille(String string, String string2) {
		home.saisir_un_nom(string);
		home.saisir_un_prenom(string2);
	}
	@When("saisir une adresse postale {string}")
	public void saisir_une_adresse_postale(String string) {
		home.saisir_une_adresse_postale(string);
		
	}

	@When("choisir le pays {string}")
	public void choisir_le_pays(String string) {
		home.choisir_le_pays(string);
		
	 
	}
	@When("saisr l etat {string}")
	public void saisr_l_etat(String string) {
		home.saisr_l_etat(string);
	}

	@When("saisir la ville {string}")
	public void saisir_la_ville(String string) {
		home.saisir_la_ville(string);
		

	}
	@When("code postale {string}")
	public void code_postale(String string) {
		home.code_postale(string);
	   
	}
	@When("saisir numero de portable {string}")
	public void saisir_numero_de_portable(String string) {
		home.saisir_numero_de_portable(string);
		
	}

	@When("cliquer sur creation du compte")
	public void cliquer_sur_creation_du_compte() {
		home.cliquer_sur_creation_du_compte();
		
	
	}
	@Then("Verification que le message {string} est affiche")
	public void verification_que_le_message_est_affiche(String string) {
		Assert.assertEquals(string,home.textAffiche());	
		
	}
	@When("cliquer sur s inscrir")
	public void cliquer_sur_s_inscrir() {
		home.Cliquer_sur_bt_signlogin();
	    
	}

	@When("sasir le mail {string} et le mot de passe {string}")
	public void sasir_le_mail_et_le_mot_de_passe(String string, String string2) {
		home.sasir_le_mail_mot_de_passe(string, string2);
		
	    
	}
	@When("cliquer sur LOGIN")
	public void cliquer_sur_login1() {
		home.cliquer_sur_login1();
		
	    
	}
	@Then("Verfier le profil de l utilisateur {string} est afficher")
	public void verfier_le_profil_de_l_utilisateur_est_afficher(String string) {
     
		Assert.assertEquals(string, home.profilaffiche());
		
	}
}