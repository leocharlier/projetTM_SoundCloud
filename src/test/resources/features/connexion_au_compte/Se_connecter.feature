# language: fr
Fonctionnalité: Se connecter à son compte
  En tant qu'utilisateur
  Je souhaite me connecter à mon compte
  Afin de profiter des avantages d'un utilisateur

  Scénario: Se connecter
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur se connecte
    Et l'utilisateur saisit l'identifiant "leo.charlier.music@gmail.com"
    Et l'utilisateur saisit son mot de passe "leo210596"
    Alors il accède à son espace utilisateur
    
  Scénario: Saisir un mauvais identifiant
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur se connecte
    Et l'utilisateur saisit l'identifiant "qsdfqsd"
    Alors le message "Cette URL de profil n'existe pas" apparaît
