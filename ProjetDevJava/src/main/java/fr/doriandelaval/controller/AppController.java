package fr.doriandelaval.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controleur principal de l'application: permet de faire le mapping entre les
 * URI de l'application et les vue associées
 * 
 * @author delaval
 *
 */
@Controller // determine que cette classe est un controller pour spring
@RequestMapping("/") // indique l'URI de base pour ce controlleur
public class AppController {
	/**
	 * association de la vue.jsp à la racine du projet Url ="ProjetDevJava/"
	 * 
	 * @return index.jsp la page d'index pricipale
	 */
	@GetMapping("/")
	public String accueil() {
		return ("index");
	}

	/**
	 * association de la vue test.jsp a lURL du projet ="ProjetDevJava/test"
	 * 
	 * @return index.jsp la page d'index pricipale
	 */
	@GetMapping("/test")
	public String test() {
		return ("test");
	}

}
