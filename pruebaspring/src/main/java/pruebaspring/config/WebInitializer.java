package pruebaspring.config;

import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.opensymphony.sitemesh.webapp.SiteMeshFilter;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	//Asignar Dispatcher a /
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] { WebConfig.class };
	}
}
