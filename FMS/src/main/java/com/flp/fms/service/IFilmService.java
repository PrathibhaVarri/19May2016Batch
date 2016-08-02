package com.flp.fms.service;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.flp.fms.Exceptions.DuplicateRecordException;
import com.flp.fms.Exceptions.FieldEmptyException;
import com.flp.fms.Exceptions.NegativeFieldException;
import com.flp.fms.Exceptions.RecordNotFoundException;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Film;


public interface IFilmService 
{
	String addFilm(Map filmDetails) throws ParseException, FieldEmptyException, NegativeFieldException, DuplicateRecordException;
	String modifyFilm(Map<Integer, Object> filmList)throws ParseException;
	boolean removeFilm(int film_id) throws NegativeFieldException, FieldEmptyException;
	Film searchFilm(int film_id) throws FieldEmptyException, NegativeFieldException, RecordNotFoundException;
	List<Film> getAllFilm();
}

