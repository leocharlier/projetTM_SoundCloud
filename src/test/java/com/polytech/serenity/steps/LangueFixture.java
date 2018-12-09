package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class LangueFixture {

    @Steps
    UtilisateurSteps utilisateur;
    
    @Quand("^l'utilisateur modifie la langue$")
    public void l_utilisateur_modifie_la_langue() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quand("^l'utilisateur selectionne \"([^\"]*)\"$")
    public void l_utilisateur_selectionne(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("^le site devrait être en anglais$")
    public void le_site_devrait_être_en_anglais() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
}
