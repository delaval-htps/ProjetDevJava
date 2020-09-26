package fr.doriandelaval.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SpringMvcDispatcherServletInititalizer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// il n'y apas de class config pour hibernate 
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// retourne les class de configuration pour le dispatcherServlet
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
