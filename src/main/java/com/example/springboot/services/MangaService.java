package com.example.springboot;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.springboot.Manga;
import com.example.springboot.dto.MangaPostInput;



@Service
public class MangaService {

	private List<Manga> fakeDatabase = new ArrayList<>();

    // public Manga getManga(Integer id) {
	// 	return findOne(id);
    // }


	public Manga createManga(MangaPostInput input){
		Manga manga = Manga.builder()
			.id(700)
			.title(input.getTitle())
			.pages(input.getPages())
			.author(input.getAuthor())
			.publisher(input.getPublisher())
			.url(input.getUrl())
			.build();

		// addOne(manga);

		return manga;
	}




	// private Manga findOne(Integer id){
	// 	return fakeDatabase
	// 	.stream()
	// 	.filter(manga -> manga.getId() == (id))
	// 	.collect(Collectors.toList())
	// 	.get(0);
	// }


	// private void addOne(Manga item){
	// 	fakeDatabase.add(item);
	// }
}