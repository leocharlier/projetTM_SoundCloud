# language: fr
Fonctionnalité: Suivre un artiste
  En tant qu'amateur de musique
  Je souhaite suivre un artiste
  Afin de suivre son actualité

  Scénario: Suivre un artiste en tant que visiteur
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur suit un artiste
    Alors il devrait se connecter
    
  Scénario: Suivre un artiste en tant qu'utilisateur
    Soit un utilisateur sur son espace personnel
    Quand l'utilisateur suit un artiste
    Alors l'artiste devrait être suivi
