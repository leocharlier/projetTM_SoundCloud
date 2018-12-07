# language: fr
Fonctionnalité: Modifier la langue
  En tant qu'utilisateur
  Je souhaite modifier la langue du site
  Afin de comprendre le contenu du site

  Scénario: Modifier la langue via la page d'accueil
    Soit un utilisateur sur la page d'accueil utilisateur
    Quand l'utilisateur modifie la langue
    Et l'utilisateur selectionne "English (US)"
    Alors le site devrait être en anglais
    
  Scénario: Modifier la langue via les paramètres
    Soit un utilisateur sur la page d'accueil
    Quand l'utilisateur accède à ses paramètres
    Et l'utilisateur modifie la langue
    Et l'utilisateur selectionne "English (US)"
    Alors le site devrait être en anglais
