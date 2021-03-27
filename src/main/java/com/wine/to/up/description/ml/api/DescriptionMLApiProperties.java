package com.wine.to.up.description.ml.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SuppressWarnings("SpringPropertySource")
@PropertySource("classpath:application-description-ml-api-${spring.profiles.active:local}.properties")
@ConfigurationProperties(prefix = "description.ml.api")
@Setter
@Component
@Getter
public class DescriptionMLApiProperties {
    private String host;
}
