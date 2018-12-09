package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class BibliothequeFixture {

    @Steps
    UtilisateurSteps utilisateur;
    
    @Quand("^l'utilisateur recherche \"([^\"]*)\"$")
    public void l_utilisateur_recherche(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("^il devrait voir le titre \"([^\"]*)\"$")
    public void il_devrait_voir_le_titre(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("^il devrait voir apparaître le message \"([^\"]*)\"$")
    public void il_devrait_voir_apparaître_le_message(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    @Quand("^l'utilisateur clique sur le filtre d'artiste$")
    public void l_utilisateur_clique_sur_le_filtre_d_artiste() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("^il devrait voir l'artiste \"([^\"]*)\"$")
    public void il_devrait_voir_l_artiste(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Quand("^l'utilisateur clique sur le filtre d'album$")
    public void l_utilisateur_clique_sur_le_filtre_d_album() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Alors("^il devrait voir apparaître l'album \"([^\"]*)\"$")
    public void il_devrait_voir_apparaître_l_album(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
}
