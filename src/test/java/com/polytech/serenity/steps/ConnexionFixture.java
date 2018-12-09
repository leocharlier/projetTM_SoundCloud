package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class ConnexionFixture {

    @Steps
    UtilisateurSteps utilisateur;
    
    @Soit("^un utilisateur sur la page d'accueil$")
    public void un_utilisateur_sur_la_page_d_accueil() throws Exception {
    	utilisateur.est_sur_la_homepage();
    }
    
    @Quand("^l'utilisateur se connecte$")
    public void l_utilisateur_se_connecte() throws Exception {
        utilisateur.se_connecte();
    }

    @Quand("^l'utilisateur saisit l'identifiant \"([^\"]*)\"$")
    public void l_utilisateur_saisit_l_identifiant(String id) throws Exception {
    	utilisateur.saisit_identifiant(id);
    }

    @Quand("^l'utilisateur saisit son mot de passe \"([^\"]*)\"$")
    public void l_utilisateur_saisit_son_mot_de_passe(String mdp) throws Exception {
    	utilisateur.saisit_mdp(mdp);
    }

    @Alors("^il accède à son espace utilisateur$")
    public void il_accède_à_son_espace_utilisateur() throws Exception {
    	utilisateur.est_dant_espace();
    }

    @Alors("^le message \"([^\"]*)\" apparaît$")
    public void le_message_apparaît(String message) throws Exception {
    	utilisateur.a_saisi_un_mauvais_id(message);
    }
    
}
