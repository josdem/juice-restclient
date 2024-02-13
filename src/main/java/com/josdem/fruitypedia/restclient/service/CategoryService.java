package com.josdem.fruitypedia.restclient.service;

import com.josdem.fruitypedia.restclient.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategoriesByLanguage(String en);
}
