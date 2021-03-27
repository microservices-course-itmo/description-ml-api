package com.wine.to.up.description.ml.api.service;

import java.util.List;

public interface WineRecommendationService {
    List<String> recommend(String id);

    List<String> recommend(String id, int k);
}
