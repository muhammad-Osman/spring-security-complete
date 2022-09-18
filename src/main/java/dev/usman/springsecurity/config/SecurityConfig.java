package dev.usman.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)
            throws Exception {

       /* http.authorizeHttpRequests((auth) -> auth
                .antMatchers("/myAccount",
                        "/myBalance",
                        "/myLoans",
                        "/myCards").authenticated()
                .antMatchers("/notices",
                        "/contact").permitAll()
        ).httpBasic(Customizer.withDefaults());
        return http.build();*/

        // Deny All example
//        http.authorizeRequests(
//                auth ->
//                        auth
//                                .anyRequest()
//                                .denyAll())
//                .httpBasic(Customizer.withDefaults());
//
//        return http.build();

        // permitAll all configuration
        return http.authorizeRequests(
                auth ->
                        auth.anyRequest().permitAll()
        ).httpBasic(Customizer.withDefaults())
                .build();

    }


}
