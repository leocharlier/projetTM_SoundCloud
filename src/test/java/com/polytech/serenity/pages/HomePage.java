package com.polytech.serenity.pages;

import java.util.List;
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
    
    @FindBy(xpath="//*[@id=\"formControl_15001\"]")
    private WebElementFacade idField;
    
    @FindBy(xpath="//*[@id=\"overlay_14996\"]/div/div/form/div/div[1]/div/button")
    private WebElementFacade signInContinueButton;
    
    @FindBy(xpath="//*[@id=\"formControl_15013\"]")
    private WebElementFacade pwField;
    
    @FindBy(xpath="//*[@id=\"overlay_14996\"]/div/div/form/div/div[2]/div/button")
    private WebElementFacade signInSubmitButton;
    
    @FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div[2]/div[2]/ul/li[1]/div/div[1]/div[1]/a")
    private WebElementFacade playRandomButton;
    
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
    	WebElementFacade erreur_connexion = find(By.xpath("//*[@id=\"validation_351\"]"));
    	return erreur_connexion.getText() == message;
    }
    
    public void lancer_chanson_aleatoire() {
    	playRandomButton.click();
    }
    
    public void lancer_chanson(String titre) {
    	
    }

    public List<String> rechuperer_definitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }
}