package dev.usman.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)
            throws Exception {
        http.csrf().disable();
        // permitAll all configuration
        return http.authorizeRequests(
                auth ->
                        auth.antMatchers("/myAccount", "/myBalance", "myLoans", "/myCards").authenticated()
                                .antMatchers("/notices", "/contact", "/api/v1/auth/**").permitAll()
        ).formLogin().and().httpBasic(Customizer.withDefaults())
                .build();

    }

//    @Bean
//    public InMemoryUserDetailsManager userDetailsManager() {
//
//         InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
//         UserDetails admin =
//                User
//                .withUsername("admin")
//                .password("12345")
//                .authorities("admin")
//                .build();
//         UserDetails user =
//                User
//                .withUsername("user")
//                .password("12345")
//                .authorities("read")
//                .build();
//
//         userDetailsManager.createUser(admin);
//         userDetailsManager.createUser(user);
//
//         return userDetailsManager;
//    }

//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource) {
//        return new JdbcUserDetailsManager(dataSource);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
