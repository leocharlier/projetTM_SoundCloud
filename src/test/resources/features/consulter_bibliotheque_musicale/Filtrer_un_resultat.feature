# language: fr
Fonctionnalité: Filtrer un résultat
  En tant qu'amateur de musique
  Je souhaite filtrer un résultat de recherche
  Afin de préciser ma recherche

  Scénario: Filtrer par artiste
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur recherche "kikesa"
    Et l'utilisateur clique sur le filtre d'artiste
    Alors il devrait voir l'artiste "KIKESA"
    
  Scénario: Filtrer par album
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur recherche "kikesa"
    Et l'utilisateur clique sur le filtre d'album
    Alors il devrait voir apparaître l'album " Kikesa Niyukie"
