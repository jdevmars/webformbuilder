package br.dev.mpsilvestri.webform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ForwardedHeaderFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class CorsConfig {
	
	private static final Logger log = LoggerFactory.getLogger(CorsConfig.class);

	@Bean
	ForwardedHeaderFilter forwardedHeaderFilter() { return new ForwardedHeaderFilter(); }
	
	@Bean
    WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
		      @Override public void addCorsMappings(CorsRegistry r) {
		        r.addMapping("/api/**")
		         .allowedOriginPatterns(
		             "http://localhost:*",
		             "http://127.0.0.1:*",
		             "http://webformbuilder.mpsilvestri.com.br:*",
		             "https://webformbuilder.mpsilvestri.com.br"
		         )
		         .allowedMethods("GET","POST","OPTIONS")
		         .allowedHeaders("*")
		         .allowCredentials(false)
		         .maxAge(3600);
		      }
		    };
    }

}
