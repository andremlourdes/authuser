package com.ead.authuser;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.ead.authuser.repositories")
public class AuthUserConfig {
}
