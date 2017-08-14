package com.Elliotts.Elliotts.configuration;

/**
 * Created by Jerry on 7/16/2017.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com")
public class viewResolver extends WebMvcConfigurerAdapter {
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        //The Prefix puts /WEB-INF-/jsp/ into our urls, so we only need to give it the jsp file name.
        //The suffix puts .jsp at the end of our urls, so we only need to give it the jsp file name.
        //Ex. localhost:8080/home will return us the home.jsp file if it's in /WEB-INF/jsp/
        //Furthermore, there needs to be a method in the controller that is looking for this link, or it will not work.
        bean.setPrefix("/WEB-INF/jsp/");
        bean.setSuffix(".jsp");
        return bean;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        configurer.enable();
    }
}
