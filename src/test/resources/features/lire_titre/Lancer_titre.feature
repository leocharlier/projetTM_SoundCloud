# language: fr
Fonctionnalité: lancer un titre
  En tant qu'amateur de musique
  Je souhaite lancer une musique
  Afin de l'écouter

  Scénario: Lancer un titre aléatoire
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur lance une chanson aléatoire
    Alors une musique devrait se lancer
    
  Scénario: Lancer un titre recherché
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur recherche "je suis une licorne"
    Et l'utilisateur lance le titre "Je suis une Licorne"
    Alors la musique "Je suis une Licorne" devrait se lancer
