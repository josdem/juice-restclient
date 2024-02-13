package com.josdem.fruitypedia.restclient.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Beverage {
    private Integer id;
    private String name;
    private String ingredients;
    private String recipe;
    private String image;
}
