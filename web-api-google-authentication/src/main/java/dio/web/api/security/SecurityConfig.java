package dio.web.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(
                        authorizeConfig -> {
                            authorizeConfig.antMatchers("/").permitAll();
                            authorizeConfig.antMatchers("/logout").permitAll();
                            authorizeConfig.antMatchers("/usuario").hasRole("USER");
                            authorizeConfig.antMatchers("/admin").hasRole("ADMIN");
                            authorizeConfig.anyRequest().authenticated();
                        })
                .formLogin(Customizer.withDefaults())
                .build();
    }

}
