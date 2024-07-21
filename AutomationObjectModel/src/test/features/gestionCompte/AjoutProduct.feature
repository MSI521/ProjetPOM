
@ajout_de_produit

Feature: Ajouter des Produits 

 Background: 
 
    Given acceder sur URL "https://automationexercise.com/"
When cliquer sur s inscrir 
And sasir le mail "test5xccsqd4514df8t@test.com " et le mot de passe "sjqcoscksqjok"
And cliquer sur LOGIN

  @tag2
  Scenario Outline: Title of your scenario outline
  
    Given Clicquer sur Products
    And Ajouter " Blue Top " au panier 
    And cliquer sur continue shopping 
    And Ajouter " Men Tshirt " au panier 
    And Cliquuer sur  View Cart 
    

    	
