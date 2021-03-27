package com.wine.to.up.description.ml.api.feign;

import com.wine.to.up.description.ml.api.service.WineRecommendationService;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface WineRecommendationServiceClient extends WineRecommendationService {
    @Override
    @RequestLine(value = "GET /predict?id={id}")
    @Headers("Content-Type: application/json")
    List<String> recommend(@Param("id") String id);

    @Override
    @RequestLine(value = "GET /predict?id={id}&k={k}")
    @Headers("Content-Type: application/json")
    List<String> recommend(@Param("id") String id, @Param("k") int k);
}
