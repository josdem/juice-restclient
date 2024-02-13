package com.josdem.fruitypedia.restclient;

import com.josdem.fruitypedia.restclient.model.Category;
import com.josdem.fruitypedia.restclient.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class CategoryServiceTest {

    private final CategoryService categoryService;

    @Test
    @DisplayName("it validates categories size")
    void shouldGetCategories(TestInfo testInfo) {
        log.info("Running: {}", testInfo.getDisplayName());
        List<Category> categories = categoryService.getCategoriesByLanguage("en");
        assertEquals(4, categories.size(), "should have four categories");
    }

}
