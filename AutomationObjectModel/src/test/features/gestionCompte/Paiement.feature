@page_de_paiement
Feature: paiement

  Background: 
    Given acceder sur URL "https://automationexercise.com/"
    When cliquer sur s inscrir
    And sasir le mail "test5xccsqd4514df8t@test.com " et le mot de passe "sjqcoscksqjok"
    And cliquer sur LOGIN
    And Clicquer sur Products
    And Ajouter " Blue Top " au panier
    And cliquer sur continue shopping
    And Ajouter " Men Tshirt " au panier
    And Cliquuer sur  View Cart
    And cliquer sur passer a la caisse
    And cliquer passer la commande

  @information_carte
  Scenario Outline: test Card
    Given taper "<le nom du porteur>"
    When Taper "<le numero de la carte>"
    When tAper "<le mois d expiration>"
    When tappper "<l annee d expiration>"
    When tapper "<cvv>"
    And cliquer sur payer et confirmer

    Examples: 
      | le nom du porteur  | le numero de la carte | le mois d expiration | l annee d expiration | cvv |
      | Julienne Talbot    |      4974595189475265 |                   06 |                   30 | 975 |
      | Shousei Bernardino |      4979177499371727 |                   08 |                   27 | 583 |
      | Kevin Bryan        |      4979205025889043 |                   12 |                   28 | 428 |
