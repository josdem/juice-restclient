package com.josdem.fruitypedia.restclient.service.impl;

import com.josdem.fruitypedia.restclient.model.Category;
import com.josdem.fruitypedia.restclient.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final RestClient juiceRestClient;

    @Override
    public List<Category> getCategoriesByLanguage(String en) {
        return juiceRestClient.get().uri("/categories/en/", en)
                .accept(APPLICATION_JSON)
                .retrieve().body(new ParameterizedTypeReference<>() {});
    }
}