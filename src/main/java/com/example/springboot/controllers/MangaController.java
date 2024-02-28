package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.MangaService;
import com.example.springboot.dto.MangaPostInput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MangaController {

	@Autowired
	private MangaService mangaService;


	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	// @GetMapping("/getManga")
	// public Manga getManga() {
	// 	return mangaService.getManga(700); 
	// }

	@PostMapping("/createManga")
	public Manga createManga(@RequestBody MangaPostInput postInput) {
		Manga result = mangaService.createManga(postInput);
		return result;
	}
	
}
