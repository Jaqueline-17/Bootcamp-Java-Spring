package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }

    @GetMapping("/usuario")
    public String welcomeUser(){
        return "Usuário Autorizado";
    }

    @GetMapping("/admin")
    public String welcomeAdm(){
        return "Administrador Autorizado";
    }

    
    
}
