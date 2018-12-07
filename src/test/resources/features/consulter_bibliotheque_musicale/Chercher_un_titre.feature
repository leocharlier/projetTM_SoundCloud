# language: fr
Fonctionnalité: Chercher un titre
  En tant qu'amateur de musique
  Je souhaite rechercher un titre
  Afin d'accéder facilement à des musiques

  Scénario: Rechercher un titre
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur recherche "kikesa dimanche"
    Alors il devrait voir le titre "KIKESA - DIMANCHE (DDH#33)"
    
  Scénario: Rechercher un titre innexistant
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur recherche "vsdfopkvé_è"
    Alors il devrait voir apparaître le message "Sorry we didn't find any results for “vsdfopkvé_è”."
