package com.summary.summary.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class StartConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity config) throws Exception {
        config
                .authorizeRequests()
                .antMatchers("/start", "/update").permitAll();
    }

}
