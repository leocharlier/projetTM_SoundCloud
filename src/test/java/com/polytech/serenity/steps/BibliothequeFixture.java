package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class BibliothequeFixture {

    @Steps
    UtilisateurSteps utilisateur;
    
    @Quand("^l'utilisateur recherche \"([^\"]*)\"$")
    public void l_utilisateur_recherche(String recherche) throws Exception {
    	utilisateur.saisit_recherche(recherche);
    }

    @Alors("^il devrait voir le titre \"([^\"]*)\"$")
    public void il_devrait_voir_le_titre(String arg1) throws Exception {

    }

    @Alors("^il devrait voir apparaître le message \"([^\"]*)\"$")
    public void il_devrait_voir_apparaître_le_message(String arg1) throws Exception {

    }
    
    @Quand("^l'utilisateur clique sur le filtre d'artiste$")
    public void l_utilisateur_clique_sur_le_filtre_d_artiste() throws Exception {
    	utilisateur.filtre_artiste();
    }

    @Alors("^il devrait voir l'artiste \"([^\"]*)\"$")
    public void il_devrait_voir_l_artiste(String arg1) throws Exception {

    }

    @Quand("^l'utilisateur clique sur le filtre d'album$")
    public void l_utilisateur_clique_sur_le_filtre_d_album() throws Exception {
    	utilisateur.filtre_album();
    }

    @Alors("^il devrait voir apparaître l'album \"([^\"]*)\"$")
    public void il_devrait_voir_apparaître_l_album(String arg1) throws Exception {

    }
    
}
