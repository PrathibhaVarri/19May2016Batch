package org.capstore.config;


	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.web.servlet.ViewResolver;
	import org.springframework.web.servlet.config.annotation.EnableWebMvc;
	import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
	import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
	import org.springframework.web.servlet.view.InternalResourceViewResolver;
	import org.springframework.web.servlet.view.JstlView;

	@Configuration
	@EnableWebMvc
	@ComponentScan("org.capstore")
	public class ApplicationConfiguaration extends WebMvcConfigurerAdapter{

		@Bean
		public ViewResolver setViewResolver(){
			InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
			viewResolver.setViewClass(JstlView.class);
			viewResolver.setPrefix("/WEB-INF/pages/");
			viewResolver.setSuffix(".jsp");
			return viewResolver;
		}
		
	/*	@Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/images/**").addResourceLocations("/images/");
	        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
	    }*/
		
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry){
			registry.addResourceHandler("/images/**").addResourceLocations("/images/");
			/*registry.addResourceHandler("/css/**").addResourceLocations("/css/");
			registry.addResourceHandler("/js/**").addResourceLocations("/js/");*/
			/*registry.addResourceHandler("/electronics/**").addResourceLocations("/electronics/");
			registry.addResourceHandler("/clothing/**").addResourceLocations("/clothing/");
			registry.addResourceHandler("/mobiles/**").addResourceLocations("/mobiles/");
			registry.addResourceHandler("/playstore/**").addResourceLocations("/playstore/");*/
			
		}
	}

