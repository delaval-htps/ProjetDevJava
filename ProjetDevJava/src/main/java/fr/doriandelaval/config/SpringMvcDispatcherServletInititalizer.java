package fr.doriandelaval.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * classe de configuration initale pour l'appplication.Permet de déclarer un
 * front controleur Dispatchler servlet Surcharge des methodes de sa classe
 * abstraite mere AbstractAnnotationConfigDispatcherServletInitializer
 * 
 * @author delaval
 *
 */
public class SpringMvcDispatcherServletInititalizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * methode permettant de déclarer la liste des classes de config autre que pour
	 * le Dispatcher Servlet du mvc
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// il n'y apas de class config pour hibernate
		return null;
	}

	/**
	 * methode permettant de lister les classes de configuration concernant le Front
	 * Controller
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// retourne les class de configuration pour le dispatcherServlet
		return new Class[] { WebConfig.class };
	}

	/**
	 * methode retourne la liste des URL d'écoute du front controller
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
