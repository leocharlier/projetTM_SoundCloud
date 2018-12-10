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
    public void a_lance_musique_aleatoire() {
    	assertTrue(home.verifier_chanson_aleatoire_lance());
    }
    
    @Step
    public void saisit_recherche(String recherche) {
        home.entrer_recherche(recherche);
        home.lancer_recherche();
    }
    
    @Step
    public void filtre_artiste() {
        home.filtrer_artiste();
    }
    
    @Step
    public void filtre_album() {
        home.filtrer_album();
    }
    
    @Step
    public void modifie_langue() {
        home.modifier_langue();
    }
    
    @Step
    public void choisit_langue(String langue) {
        home.appliquer_langue(langue);
    }
    
    @Step
    public void voit_site_en_anglais() {
        assertTrue(home.etre_en_anglais());
    }

}