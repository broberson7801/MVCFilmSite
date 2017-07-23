package com.skilldistillery.film.data;

import java.util.List;

public interface FilmDAO {
	Film getFilmTitleById(int id);
	List<Film> getFilmByKeyword(String keyword);
	List<Actor> actorBasedOnFilmName(String filmName);
	List<Film> filmBasedOnActorName(String actorName);
	Film addFilm(Film film);
	boolean deleteFilm(Integer filmId);
	boolean updateFilm(Film film);

}
