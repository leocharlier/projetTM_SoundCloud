package com.polytech.serenity.steps.serenity;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertTrue;

import com.polytech.serenity.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class UtilisateurSteps {

    HomePage home;
    
    @Step
    public void est_sur_la_homepage() {
        home.open();
    }
    
    @Step
    public void se_connecte() {
        home.se_connecter();
    }
    
    @Step
    public void saisit_identifiant(String id) {
        home.entrer_identifiant(id);
    }
    
    @Step
    public void saisit_mdp(String mdp) {
        home.entrer_mdp(mdp);
    }

    @Step
    public void est_dant_espace() {
        assertTrue(home.etre_dans_espace_perso());
    }
    
    @Step
    public void a_saisi_un_mauvais_id(String message) {
        assertTrue(home.renvoyer_erreur_connexion(message));
    }
    
    @Step
    public void lance_chanson_aleatoire() {
        home.lancer_chanson_aleatoire();
    }
    
    @Step
    public void lance_chanson(String titre) {
        home.lancer_chanson(titre);
    }

    @Step
    public void doit_voir_la_definition(String definition) {
        //assertThat(dictionnaire.rechuperer_definitions(), hasItem(containsString(definition)));
    }

    

    @Step
    public void recherche(String motCle) {
        //saisit_mot(motCle);
        //lance_la_recherche();
    }
}