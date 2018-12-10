package com.polytech.serenity.pages;

import java.util.stream.Collectors;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://soundcloud.com/")
public class HomePage extends PageObject {

    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]/div/div/div[3]/button[1]")
    private WebElementFacade signInButton;
    
    @FindBy(name="username")
    private WebElementFacade idField;
    
    @FindBy(className="signinForm__checkIdentifierCTA")
    private WebElementFacade signInContinueButton;
    
    @FindBy(name="password")
    private WebElementFacade pwField;
    
    @FindBy(xpath="//*[@id=\"overlay_268\"]/div/div/form/div/div[2]/div/button")
    private WebElementFacade signInSubmitButton;
    
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div[2]/div[2]/ul/li[1]/div/div[1]/a/div/div/span")
    private WebElementFacade randomSong;
    
    @FindBy(xpath="//*[@id=\"content\"]/div/div[4]/div/div[2]/div[2]/div/div/div[1]/a")
    private WebElementFacade playRandomSong;
    
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div[1]/span/form/input")
    private WebElementFacade searchField;
    
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div[1]/span/form/button")
    private WebElementFacade searchButton;
    
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div/div/div/ul/li[4]/a")
    private WebElementFacade artistFilterButton;
    
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div/div[1]/div/ul/li[5]/a")
    private WebElementFacade albumFilterButton;
    
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[6]/div/a[13]")
    private WebElementFacade languageButton;
    
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div[2]/div[1]")
    private WebElementFacade englishCheck;
    
    public void se_connecter() {
    	signInButton.click();
    }
    
    public void entrer_identifiant(String identifiant) {
    	idField.type(identifiant);
    	signInContinueButton.click();
    }
    
    public void entrer_mdp(String mdp) {
    	pwField.type(mdp);
    	signInSubmitButton.click();
    }
    
    public boolean etre_dans_espace_perso() {
    	WebElementFacade espace = find(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[2]/div/ul/li[1]/div/div[1]/h2"));
    	return espace.getText() == "Ce que vous adorez";
    }
    
    public boolean renvoyer_erreur_connexion(String message) {
    	WebElementFacade erreur_connexion = find(By.xpath("//*[@id=\"validation_371\"]"));
    	return erreur_connexion.getText() == message;
    }
    
    public void lancer_chanson_aleatoire() {
    	randomSong.click();
    	playRandomSong.click(); 
    }
    
    public boolean verifier_chanson_aleatoire_lance() {
    	WebElementFacade music_played =find(By.xpath("//*[@id=\"content\"]/div/div[4]/div/div[2]/div[2]/div/div/div[1]/a"));
    	return music_played.getText() == "Mettre en pause";
    }
    
    public void lancer_chanson(String titre) {
    	
    }
    
    public void entrer_recherche(String recherche) {
    	searchField.type(recherche);
    }
    
    public void lancer_recherche() {
    	searchButton.click();
    }
    
    public void filtrer_artiste() {
    	artistFilterButton.click();
    }
    
    public void filtrer_album() {
    	albumFilterButton.click();
    }
    
    public void modifier_langue() {
    	languageButton.click();
    }
    
    public void appliquer_langue(String langue) {
    	WebElementFacade rightLanguageButton = find(By.tagName("ul")).selectByValue(langue);
        rightLanguageButton.click();
    }
    
    public boolean etre_en_anglais() {
    	return englishCheck.getText() == "Hear what’s trending for free in the SoundCloud community";
    }

}