package com.josdem.fruitypedia.restclient.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Beverage {
    private Integer id;
    private String name;
    private String ingredients;
    private String recipe;
    private String image;
}
