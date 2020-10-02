package fr.doriandelaval.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * classe de configuration spring comprennant tous les beans necessaires au
 * fonctionnement de l'application
 * 
 * @author delaval
 *
 */
@Configuration // précise que la classe comprends des beans
@EnableWebMvc // permet de configurer le context mvc de spring
@ComponentScan(basePackages = "fr.doriandelaval") // permet de spécifier les classes ou l'on crée des beans ici le
													// package complet pour ne pas faire d'oubli
@ImportResource("classpath:resources/spring-data-access-config.xml") // permet d'importer le fichier xml de
																		// configuration pour hibernate et la datasource
																		// avec les annotations tx (transactional)
public class WebConfig implements WebMvcConfigurer {
	/**
	 * création du bean ViewResolser pour connaitre le chemin des vue .jsp
	 * 
	 * @return un viewresolveur avec les uri des view
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver irv = new InternalResourceViewResolver();
		irv.setPrefix("/WEB-INF/view/");
		irv.setSuffix(".jsp");
		return irv;
	}

	/**
	 * methode surchargé pour definir le dossiers de ressources externes
	 * utile pour les jsp avec le $pagecontent.request.contextPath pour avoir le chemin 
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

	}

}
