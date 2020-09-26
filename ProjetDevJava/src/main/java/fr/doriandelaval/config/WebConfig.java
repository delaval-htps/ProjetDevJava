package fr.doriandelaval.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "fr.doriandelaval")

@ImportResource("classpath:resources/spring-data-access-config.xml")
public class WebConfig implements WebMvcConfigurer {
	/**
	 * injection de dépendance du WiewResolser pour connaitre le chemin des vue .jsp
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

}
