package br.com.zup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean
    public String applicationName(){
        return "Sistema de vendas";
    }
}
