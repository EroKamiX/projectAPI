package org.backend.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.backend"})
@PropertySource(value = {"classpath:db.properties"})
public class ApplicationConfig implements WebMvcConfigurer {
	
	@Autowired
	Environment environment;
	
	 @Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        String folder = "C:\\Users\\phatn\\eclipse-workspace\\projectAPI\\uploads";
//	        String folder = "/home/phat/Documents/projectAPI/uploads";
	        registry.addResourceHandler("/resource/**").addResourceLocations("/resources/");
	        registry.addResourceHandler("/backend/**").addResourceLocations("/backend/");
	        registry.addResourceHandler("/upload/**").addResourceLocations("file:///" + folder + "/");
//	        registry.addResourceHandler("/upload/**").addResourceLocations("/uploads/");
	 }
	 
	 @Bean
	 public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName(environment.getProperty("driver"));
	        dataSource.setUrl(environment.getProperty("url"));
	        dataSource.setUsername("root");
	        dataSource.setPassword(environment.getProperty("password"));
	        return dataSource;
	    }

	   	@Bean
	    public JdbcTemplate jdbcTemplate() {
	        return new JdbcTemplate(dataSource());
	    }
}
