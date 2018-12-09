package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import net.thucydides.core.annotations.Steps;

public class TitreFixture {

    @Steps
    UtilisateurSteps utilisateur;
    
    @Quand("^l'utilisateur lance une chanson aléatoire$")
    public void l_utilisateur_lance_une_chanson_aléatoire() throws Exception {
    	utilisateur.lance_chanson_aleatoire();
    }

    @Alors("^une musique devrait se lancer$")
    public void une_musique_devrait_se_lancer() throws Exception {
    	
    }

    @Quand("^l'utilisateur lance le titre \"([^\"]*)\"$")
    public void l_utilisateur_lance_le_titre(String titre) throws Exception {
    	utilisateur.lance_chanson(titre);
    }

    @Alors("^la musique \"([^\"]*)\" devrait se lancer$")
    public void la_musique_devrait_se_lancer(String arg1) throws Exception {

    }
    
}
