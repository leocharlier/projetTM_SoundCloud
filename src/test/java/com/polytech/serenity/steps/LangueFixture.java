package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class LangueFixture {

    @Steps
    UtilisateurSteps utilisateur;
    
    @Quand("^l'utilisateur modifie la langue via la page d'accueil$")
    public void l_utilisateur_modifie_la_langue_via_la_page_d_accueil() throws Exception {
    	utilisateur.modifie_langue();
    }
    
    @Quand("^l'utilisateur modifie la langue via les paramètres$")
    public void l_utilisateur_modifie_la_langue_via_les_parametres() throws Exception {
    	
    }

    @Quand("^l'utilisateur selectionne \"([^\"]*)\"$")
    public void l_utilisateur_selectionne(String langue) throws Exception {
    	utilisateur.choisit_langue(langue);
    }

    @Alors("^le site devrait être en anglais$")
    public void le_site_devrait_être_en_anglais() throws Exception {
    	utilisateur.voit_site_en_anglais();
    }
    
}
