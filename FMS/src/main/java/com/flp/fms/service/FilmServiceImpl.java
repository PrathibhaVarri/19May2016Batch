
package com.flp.fms.service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.flp.fms.Exceptions.DuplicateRecordException;
import com.flp.fms.Exceptions.FieldEmptyException;
import com.flp.fms.Exceptions.NegativeFieldException;
import com.flp.fms.Exceptions.RecordNotFoundException;
import com.flp.fms.dao.ActorDaoImplForDB;
import com.flp.fms.dao.FilmDaoImplForDB;
import com.flp.fms.dao.IActorDao;
import com.flp.fms.dao.IFilmDao;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;
import com.flp.fms.view.UserInteraction;

public class FilmServiceImpl implements IFilmService
{
	IFilmDao filmDao;
	IActorDao actorDao;
	public FilmServiceImpl() 
	{
		filmDao=new FilmDaoImplForDB();
		actorDao=new ActorDaoImplForDB();
	}
	
	public FilmServiceImpl(IFilmDao filmDao2) {
		// TODO Auto-generated constructor stub
	}

	public String addFilm(Map filmDetails) throws ParseException, FieldEmptyException, NegativeFieldException, DuplicateRecordException
	{
		if(filmDetails.get("title:")==null ||filmDetails.get("description:")==null || filmDetails.get("special features:")==null || filmDetails.get("rental duration:")==null || filmDetails.get("rental rate:")==null || filmDetails.get("length:")==null || filmDetails.get("replacement cost:")==null || filmDetails.get("rating:")==null  ){
			throw new FieldEmptyException();
		}
		else{
		Film film=new Film();
		film.setTitle((String) filmDetails.get("title:"));
		film.setDescription((String) filmDetails.get("description:"));
		film.setReleaseYear((Date) filmDetails.get("release date:"));
		film.setRentalDuration( (Integer) filmDetails.get("rental duration:"));
		film.setRentalRate((Double) filmDetails.get("rental rate:"));
		film.setLength((Integer) filmDetails.get("length:"));
		film.setReplacementCost((Double) filmDetails.get("replacement cost:"));
		film.setRating((Double) filmDetails.get("rating:"));
		film.setSpecialFeatures((String) filmDetails.get("special features:"));
		
		/*Language language=(Language)filmDao.findLanguageByName((String)filmDetails.get("language:"));
		if(language!=null)
		{
			film.setLanguage(language);
			
		}
		else{
			Language lang=new Language();
			lang.setName((String)filmDetails.get("language:"));
		    film.setLanguage(lang);
		}*/
		Language lang=new Language((String) filmDetails.get("language:"));
		film.setLanguage(lang);
		
		Category catg=new Category((String) filmDetails.get("category"));
		film.setCategory(catg);
		List<Actor> actors= actorDao.getAllActor();
		
			for(int i=0; i < ((List) filmDetails.get("actors")).size(); i++)
					{
						Actor actor=new Actor();
						actor.setFirstName((String) ((Map) ((List) filmDetails.get("actors")).get(i)).get("firstName"));
						actor.setLastName((String) ((Map) ((List) filmDetails.get("actors")).get(i)).get("lastName"));
						
						//if(actors == null || !actors.contains(actor))
						//{
							//film.getActors().add(actor);
						//}
						//else
						//{
							//film.getActors().add(actorDao.findActorByName(actor.getFirstName(),actor.getLastName()));
						//}
					}
					
					filmDao.addFilm(film);
					//return true;
					return null;
				}
	}
	
	public String modifyFilm(Map filmList)
	{
	Film film=filmDao.searchFilmByDetails(((String)filmList.get(1)),((Date) filmList.get(2)),((Double)filmList.get(3)));
	if(film!=null){
	    if(filmList.get(4)!=null){
	           film.setTitle((String)filmList.get(4));
	           return filmDao.modifyFilm(film);
	    }
	    else if(filmList.get(5)!=null){
	            film.setDescription((String)filmList.get(5));
	            return filmDao.modifyFilm(film);
	    }
	    else if(filmList.get(6)!=null){
	            Language language=new Language();
	            language.setName((String)filmList.get(6));
	            film.setLanguage(language);
	            return filmDao.modifyFilm(film);
	    }
	    else if(filmList.get(7)!=null){
	            film.setRentalDuration(((Integer)filmList.get(7)));
	            return filmDao.modifyFilm(film);
	    }
	    else if(filmList.get(8)!=null){
	            film.setRentalRate((double) filmList.get(8));
	            return filmDao.modifyFilm(film);
	    }
	    else if(filmList.get(9)!=null){
	            film.setLength((((Integer)filmList.get(9))));
	            return filmDao.modifyFilm(film);
	    }
	    else if(filmList.get(10)!=null){
	            film.setReplacementCost((((Double)filmList.get(10))));
	            return filmDao.modifyFilm(film);
	    }
	    else if(filmList.get(11)!=null){
	            film.setRating((Double)filmList.get(11));
	            return filmDao.modifyFilm(film);
	    }
	    else if(filmList.get(12)!=null){
	            film.setSpecialFeatures(((String)filmList.get(12)));
	            return filmDao.modifyFilm(film);
	    }
	    else if(filmList.get(13)!=null){
	            Category category=new Category();
	            category.setName((String)filmList.get(13));
	            film.setCategory(category);
	            return filmDao.modifyFilm(film);
	    }
	 else
	   return null;
	}
	return null;
	}
		
	

	public boolean removeFilm(int filmId) throws NegativeFieldException, FieldEmptyException
	
	{
		if(filmId==0)
			throw new FieldEmptyException();
		else if(filmId<0)
			throw new NegativeFieldException();
		else 
		return filmDao.removeFilm(filmId);
	}

	public Film searchFilm(int filmId) throws FieldEmptyException, NegativeFieldException, RecordNotFoundException 
	{
		if(filmId==0)
			throw new FieldEmptyException();
		else if(filmId<0)
			throw new NegativeFieldException();
		else if(filmDao.searchFilm(filmId)!=null)
		return filmDao.searchFilm(filmId);
		else
			throw new RecordNotFoundException();
	}

	public List<Film> getAllFilm() 
	{
		return filmDao.getAllFilm();
	}
	
}

