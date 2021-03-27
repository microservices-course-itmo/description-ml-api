package com.wine.to.up.description.ml.api.configuration;

import com.wine.to.up.description.ml.api.DescriptionMLApiProperties;
import com.wine.to.up.description.ml.api.feign.WineRecommendationServiceClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
@RequiredArgsConstructor
public class DescriptionMLFeignConfiguration {
    private final DescriptionMLApiProperties descriptionMLApiProperties;

    @Bean
    public WineRecommendationServiceClient wineRecommendationServiceClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .client(new OkHttpClient())
                .target(WineRecommendationServiceClient.class, "http://" + descriptionMLApiProperties.getHost());
    }
}
