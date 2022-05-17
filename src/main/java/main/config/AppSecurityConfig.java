package main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/goods/save").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/goods/delete").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/sales/save").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/sales/delete").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/warehouse1/save").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/warehouse1/delete").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/warehouse2/save").access("hasRole('ROLE_ADMIN')")
                .antMatchers("/warehouse2/delete").access("hasRole('ROLE_ADMIN')")
                .and().formLogin().defaultSuccessUrl("/", false);

    }
}