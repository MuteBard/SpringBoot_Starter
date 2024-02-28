package com.example.springboot;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Manga {
    private Integer id;
    private String title;
    private Integer pages;
    private String author;
    private String publisher;
    private String url;
}