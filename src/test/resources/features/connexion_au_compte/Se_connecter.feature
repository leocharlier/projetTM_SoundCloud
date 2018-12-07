# language: fr
Fonctionnalité: Se connecter à son compte
  En tant qu'utilisateur
  Je souhaite me connecter à mon compte
  Afin de profiter des avantages d'un utilisateur

  Scénario: Se connecter
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur se connecter
    Et l'utilisateur saisit son identifiant "id"
    Et l'utilisateur saisit son mot de passe "mdp"
    Alors il accède à son espace utilisateur
    
  Scénario: Saisir un mauvais identifiant
    Soit un utilisateur sur la page de connexion
    Quand l'utilisateur se connecter
    Et l'utilisateur saisit l'identifiant "qsdfqsd"
    Alors le message "Cette URL de profil n'existe pas" apparaît
