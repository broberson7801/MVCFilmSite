package com.skilldistillery.film.data;

import java.util.List;

public interface FilmDAO {
	String getFilmTitleById(int id);
	List<String> getFilmByKeyword(String keyword);
	List<Actor> actorBasedOnFilmName(String filmName);
	List<Film> filmBasedOnActorName(String actorName);
	Film addFilm(Film film);

}
