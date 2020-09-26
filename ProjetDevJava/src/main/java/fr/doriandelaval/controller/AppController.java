package fr.doriandelaval.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controleur principal de l'application
 * 
 * @author delaval
 *
 */
@Controller
@ComponentScan
@RequestMapping("/")
public class AppController {
	/**
	 * mapping principal sur la racine du projet Url ="ProjetDevJava/"
	 * 
	 * @return index.jsp la page d'index pricipale
	 */
	@GetMapping("/")
	public String accueil() {
		return ("index");
	}
	@GetMapping("/test")
	public String test() {
		return ("test");
	}
	
}
