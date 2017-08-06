package com.Elliotts.Elliotts.configuration;

/**
 * Created by Jerry on 7/16/2017.
 */
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.Elliotts.Elliotts.domain"})
@EnableJpaRepositories(basePackages = {"com.Elliotts.Elliotts.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
