package br.gov.sp.cps.diadema.projetoestacionamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    @GetMapping("/")
    public String home(){
        return "Projeto IOC Estacionamento, Configuração sem o Spring initializr";
    }
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}