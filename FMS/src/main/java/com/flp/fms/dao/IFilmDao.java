package com.flp.fms.dao;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;

public interface IFilmDao
{
	String addFilm(Film film);
	String modifyFilm(Film film);
	boolean removeFilm(int film_id);
	Film searchFilm(int film_id);
	List<Film> getAllFilm();
	Language findLanguageByName(String language_name);
	Category findCategoryByName(String category_name);
	//Film searchFilmByDetails(String string, Date date, Double double1);
	Film searchFilmByDetails(String title,Date release_year,double rating);
}

