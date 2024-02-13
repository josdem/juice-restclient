package com.josdem.fruitypedia.restclient.config;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
@RequiredArgsConstructor
public class RestClientConfiguration {

    private final ApplicationProperties applicationProperties;

    @Bean
    public RestClient juiceRestClient() {
        return RestClient.create(applicationProperties.getUrl());
    }

}
