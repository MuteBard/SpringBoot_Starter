package com.example.springboot.dto;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class MangaPostInput {
    private String title;
    private Integer pages;
    private String author;
    private String publisher;
    private String url;
}



