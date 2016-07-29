package com.flp.fms.service;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Film;


public interface IFilmService 
{
	void addFilm(Map filmDetails) throws ParseException;
	String modifyFilm(Map<Integer, Object> filmList)throws ParseException;
	boolean removeFilm(int film_id);
	Film searchFilm(int film_id);
	List<Film> getAllFilm();
}

