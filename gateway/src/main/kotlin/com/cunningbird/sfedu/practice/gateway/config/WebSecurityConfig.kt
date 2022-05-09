package com.cunningbird.sfedu.practice.gateway.config

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.web.server.SecurityWebFilterChain

@EnableWebFluxSecurity
class WebSecurityConfig {

    @Bean
    fun securityWebFilterChain(http: ServerHttpSecurity): SecurityWebFilterChain {
        http.authorizeExchange { auth ->
            auth.anyExchange().hasAuthority("SCOPE_CLIENT")
        }.oauth2ResourceServer { oauth2 -> oauth2.jwt() }

        return http.build()
    }
}