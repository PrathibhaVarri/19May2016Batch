package com.flp.fms.dao;

import java.text.ParseException;
import java.util.List;

import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;

public interface IFilmDao
{
	void addFilm(Film film);
	String modifyFilm(Film film);
	boolean removeFilm(int film_id);
	Film searchFilm(int film_id);
	List<Film> getAllFilm();
	Language findLanguageByName(String language_name);
	Category findCategoryByName(String category_name);
}

