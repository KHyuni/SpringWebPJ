package com.web.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan(basePackages = {"com.web.spring"})
@EnableWebMvc
public class ServerConfig extends WebMvcConfigurationSupport{
	
	// <resources location="/resources/" mapping="/resources/**">에 해당됨.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/").setCachePeriod(31556926);
        registry.addResourceHandler("/WEB-INF/views/css/**").addResourceLocations("/WEB-INF/views/css/");
        registry.addResourceHandler("/WEB-INF/views/js/**").addResourceLocations("/WEB-INF/views/js/");
    }
 
    
    // <mvc:default-servlet-handler>에 해당됨.
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }  

	@Bean
	public InternalResourceViewResolver setInternalResourceViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	 @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/spring").setViewName("index");
	}

}