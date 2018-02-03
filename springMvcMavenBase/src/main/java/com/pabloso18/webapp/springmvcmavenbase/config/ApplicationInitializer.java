package com.pabloso18.webapp.springmvcmavenbase.config;

import javax.servlet.Filter;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
     * See {@link AbstractAnnotationConfigDispatcherServletInitializer}.
     */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { };
	}

	/**
     * Set the application context for the Spring MVC web tier.
     *
     * @See {@link AbstractAnnotationConfigDispatcherServletInitializer}
     */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		logger.info("WebApplicationInitializer: Configuring Spring Web Config Classes" );
		return new Class[] { ApplicationConfig.class };
	}
	
	/**
    * Map the Spring MVC servlet as the root.
    *
    * @See {@link AbstractAnnotationConfigDispatcherServletInitializer}
    */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@Override
	protected Filter[] getServletFilters() {
		logger.info("WebApplicationInitializer: Configuring Servlet Filters" );
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		
		return new Filter[] { characterEncodingFilter};
	}

}
