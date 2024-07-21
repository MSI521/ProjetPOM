package PageObjet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Produit {
	public  WebDriver driver;
	
	public  Produit(WebDriver driver)  {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy (xpath = "//a[@href='/products' and contains(., 'Products')]")
	 public WebElement Products;
	
	@FindBy (xpath ="//a[@data-product-id='1' and @class='btn btn-default add-to-cart' and contains(., 'Add to cart')]")
	public WebElement produit_1;
	
	@FindBy(xpath ="//button[normalize-space()='Continue Shopping']")
	public WebElement Continue_Shopping;
	
	@FindBy (xpath ="//a@[data-product-id='2']")
	public WebElement produit_2;
	
	@FindBy (xpath ="//u[text()='View Cart']")
	public WebElement view_cart;
	
	@FindBy (xpath ="//a[normalize-space()='Proceed To Checkout']")
	public WebElement passer_a_la_caisse;
	
	@FindBy (xpath ="//a[normalize-space()='Place Order']")
	public WebElement passer_la_commande;
	
	@FindBy (xpath ="//input[@name='name_on_card']")
	public WebElement nom_carte; 
	
	@FindBy (xpath ="//input[@name='card_number']")
	public WebElement num_carte;
	
	@FindBy (xpath ="//input[@placeholder='ex. 311']")
	public WebElement cvv;
	
	@FindBy (xpath ="//input[@placeholder='MM']")
	public WebElement mois;
	
	@FindBy (xpath ="//input[@placeholder='YYYY']")
	public WebElement annee;
	
	@FindBy (xpath ="//button[@id='submit']")
	public WebElement payer; 
	
	  public void clicquer_sur_products() {
		  Products.click();
		  
	  }
	  public void ajouter_au_panier(String string) {
		  produit_1.click();
		  
		  
	  }
	  public void  cliquer_sur_continue_shopping() {
		  Continue_Shopping.click();
		  
	  }
	
	  public void cliquuer_sur_view_cart() {
		  view_cart.click();
		  
	  }
	  public void cliquer_sur_passer_a_la_caisse() {
		  passer_a_la_caisse.click();
		  
	  }
	  public void cliquer_passer_la_commande() {
		  passer_la_commande.click();
		  
	  }
	  public void taper2(String string) {
		  nom_carte.sendKeys(string);
		  
	  }
	  public void taper1(String string) {
		  num_carte.sendKeys(string);
	  }
	  public void  tappper(String string) {
		  mois.sendKeys(string);
	  }
	  public void t_aper(String string) {
		  annee.sendKeys(string);
	  }
	  public void tapper(String string) {
		  cvv.sendKeys(string);
		 
	  }
	  public void  cliquer_sur_payer_et_confirmer() {
		  payer.click();
		  
	  }
}
