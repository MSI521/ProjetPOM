@authentification 

Feature: se connecter
je veux me connecter sur le site 

@tag1

Scenario: se connecter 

Given acceder sur URL "https://automationexercise.com/"
When cliquer sur s inscrir 
And sasir le mail "test5xccsqd4514df8t@test.com " et le mot de passe "sjqcoscksqjok"
And cliquer sur LOGIN
Then Verfier le profil de l utilisateur "test" est afficher 

 

