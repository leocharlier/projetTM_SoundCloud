package com.polytech.serenity.steps;

import com.polytech.serenity.steps.serenity.UtilisateurSteps;

import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Quand;
import cucumber.api.java.fr.Soit;
import net.thucydides.core.annotations.Steps;

public class CompteFixture {

    @Steps
    UtilisateurSteps utilisateur;
    
    @Soit("^un utilisateur sur son espace personnel$")
    public void un_utilisateur_sur_son_espace_personnel() throws Exception {

    }

    @Quand("^l'utilisateur accède à sa collection$")
    public void l_utilisateur_accède_à_sa_collection() throws Exception {

    }

    @Alors("^il devrait accéder à sa collection$")
    public void il_devrait_accéder_à_sa_collection() throws Exception {

    }

    @Quand("^l'utilisateur accède à ses favoris$")
    public void l_utilisateur_accède_à_ses_favoris() throws Exception {

    }

    @Quand("^l'utilisateur accède à l'onglet collection$")
    public void l_utilisateur_accède_à_l_onglet_collection() throws Exception {

    }

    @Alors("^il devrait accéder à ses favoris$")
    public void il_devrait_accéder_à_ses_favoris() throws Exception {

    }

    @Quand("^l'utilisateur accède à ses favoris sur la page d'accueil$")
    public void l_utilisateur_accède_à_ses_favoris_sur_la_page_d_accueil() throws Exception {

    }

    @Quand("^l'utilisateur ajoute un titre en favori$")
    public void l_utilisateur_ajoute_un_titre_en_favori() throws Exception {

    }

    @Alors("^il devrait se connecter$")
    public void il_devrait_se_connecter() throws Exception {

    }

    @Alors("^le titre devrait être ajouter en favori$")
    public void le_titre_devrait_être_ajouter_en_favori() throws Exception {

    }

    @Quand("^l'utilisateur accède à ses paramètres$")
    public void l_utilisateur_accède_à_ses_paramètres() throws Exception {

    }

    @Quand("^l'utilisateur modifie son mois de naissance$")
    public void l_utilisateur_modifie_son_mois_de_naissance() throws Exception {

    }

    @Alors("^son mois de naissance devrait être modifié$")
    public void son_mois_de_naissance_devrait_être_modifié() throws Exception {

    }

    @Quand("^l'utilisateur demande un mail de réinitialisation de son mot de passe$")
    public void l_utilisateur_demande_un_mail_de_réinitialisation_de_son_mot_de_passe() throws Exception {

    }

    @Alors("^un mail de réinitialisation de son mot de passe devrait être envoyé$")
    public void un_mail_de_réinitialisation_de_son_mot_de_passe_devrait_être_envoyé() throws Exception {

    }

    @Quand("^l'utilisateur suit un artiste$")
    public void l_utilisateur_suit_un_artiste() throws Exception {

    }

    @Alors("^l'artiste devrait être suivi$")
    public void l_artiste_devrait_être_suivi() throws Exception {

    }
    
}
