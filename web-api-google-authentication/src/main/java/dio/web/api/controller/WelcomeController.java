package dio.web.api.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }

    @GetMapping("/usuario")
    public String welcomeUser(@AuthenticationPrincipal OidcUser principal){
        return "Usuário Autenticado";
    }

    @GetMapping("/admin")
    public String welcomeAdm(){
        return "Administrador Autorizado";
    }

    
    
}
