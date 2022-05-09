package com.cunningbird.sfedu.practice.identity.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("spring.security.oauth2.authorizationserver")
data class AuthorizationServerConfig(
    var providerName: String? = null
)