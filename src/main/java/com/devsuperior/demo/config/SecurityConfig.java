package com.devsuperior.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Classe responsável por configurar as regras de segurança
 * da aplicação utilizando o Spring Security.
 *
 * @author DevSuperior
 */
@Configuration
public class SecurityConfig {

	 /**
     * Configura e disponibiliza a cadeia de filtros de segurança
     * utilizada pelo Spring Security para processar as requisições HTTP.
     *
     * @param http objeto utilizado para configurar a segurança HTTP
     * @return cadeia de filtros de segurança configurada
     * @throws Exception caso ocorra algum erro durante a configuração
     */
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	// Desabilita a proteção CSRF, conforme a configuração atual do curso.
		http.csrf(csrf -> csrf.disable());
		// Permite todas as requisições, sem exigir autenticação ou autorização.
		http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
		// Constrói e retorna a cadeia de filtros configurada.
		return http.build();
	}
}
