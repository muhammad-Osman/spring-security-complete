//package dev.usman.springsecurity.config;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityOld extends WebSecurityConfigurerAdapter {
//    /**
//     * /myAccount - Secured
//     * /myBalance - Secured
//     * /myLoans - Secured
//     * /myCards - Secured
//     * /notices - Not Secured
//     * /contact - Not Secured
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//          http .authorizeRequests() .antMatchers("/myAccount").authenticated()
//          .antMatchers("/myBalance")
//                  .authenticated()
//          .antMatchers("/myLoans")
//                  .authenticated()
//          .antMatchers("/myCards")
//                  .authenticated()
//          .antMatchers("/notices")
//                  .permitAll()
//          .antMatchers("/contact")
//                  .permitAll() .and()
//                  .formLogin().and()
//                  .httpBasic();
//
//    }
//}
