# language: fr
Fonctionnalité: Modifier mes paramètres
  En tant qu'utilisateur
  Je souhaite modifier certains paramètres
  Afin de changer mes informations personnelles

  Scénario: Modifier ma date de naissance
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur accède à ses paramètres
    Et l'utilisateur modifie son mois de naissance
    Alors son mois de naissance devrait être modifié
    
  Scénario: Envoyer un mail de réinitialisation de son mot de passe
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur accède à ses paramètres
    Et l'utilisateur demande un mail de réinitialisation de son mot de passe
    Alors un mail de réinitialisation de son mot de passe devrait être envoyé
