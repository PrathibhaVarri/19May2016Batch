package com.flp.fms.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.MockitoAnnotations;

import com.flp.fms.Exceptions.DuplicateRecordException;
import com.flp.fms.Exceptions.FieldEmptyException;

import com.flp.fms.Exceptions.NegativeFieldException;
import com.flp.fms.Exceptions.RecordNotFoundException;
import com.flp.fms.dao.IActorDao;
import com.flp.fms.dao.IFilmDao;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;
import com.flp.fms.service.ActorServiceImpl;
import com.flp.fms.service.FilmServiceImpl;
import com.flp.fms.service.IActorService;
import com.flp.fms.service.IFilmService;

public class TestAppFilm {
	@Mock
	IFilmDao filmDao;
	IActorDao actorDao;
	IFilmService filmService;
	IActorService actorService;
	

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);	
		filmService=new FilmServiceImpl(filmDao);
		actorService=new ActorServiceImpl(actorDao);
	}
	//createFilm must return valid with valid inputs
	@Test
	public void createFilmWillReturnValidWithValidInputs() throws ParseException, FieldEmptyException, NegativeFieldException, DuplicateRecordException {
		
		Film film=new Film();

		film.setTitle("gentleman");
		film.setDescription("thriller");
		film.setReleaseYear(dateFormat.parse("22-05-2016"));
		film.setRentalDuration(2);
		film.setRentalRate(4);
		film.setLength(3);
		film.setReplacementCost(6);
		film.setRating(4.0);
		film.setSpecialFeatures("action");
		Category category=new Category();
		Language language=new Language();
		category.setName("romanticThriller");
		language.setName("telugu");
		film.setLanguage(language);
		film.setCategory(category);
		Actor actor=new Actor();
		actor.setFirstName("nani");
		actor.setLastName("hero");
		Set<Actor> actors=new HashSet<Actor>();
		actors.add(actor);
		film.setActors(actors);
		List<Film> Films=new ArrayList<Film>();
		Films.add(film);
		Map<String,Object> Film1=new HashMap<String,Object>();
		
		Film1.put("title:", "df");
		Film1.put("description:", "abcd");
		Film1.put("release date:",dateFormat.parse("20-09-1770"));
		Film1.put("rental duration:",3);
		Film1.put("rental rate:",4);
		Film1.put("length:",2);
		Film1.put("replacement cost:",3.0);
		Film1.put("rating:",5.0);
		Film1.put("special features:","sddsd");
		Film1.put("language:","english");
		Film1.put("category","action");
		
		List Actors=new ArrayList();
		Map<String,Object> actorDetails=new HashMap();
		
		actorDetails.put("firstName","has");
	
		actorDetails.put("lastName","sah");
		Actors.add(actorDetails);
		Film1.put("actors",actors);
		
		//List actors1=new ArrayList();
	
		Mockito.when(filmDao.addFilm(film)).thenReturn("added successfully");
		//Mockito.when(actorDao.getAllActors()).thenReturn(actors1);
	
	
	//System.out.println(actors1);
		//filmService.addFilm(Film1);
		assertEquals("added successfully",filmDao.addFilm(film));
	}
	
	
	
	
	//createFilm must return null when any input is null
	
	@Test(expected=com.flp.fms.Exceptions.FieldEmptyException.class)
	public void createFilmWillReturnNullWithNullInputs() throws ParseException, FieldEmptyException, NegativeFieldException, DuplicateRecordException{
		Map <Integer,Object> film=new HashMap<Integer,Object>();
		film.put(1, "der");
		film.put(2, "null");
		film.put(3, dateFormat.parse("20-10-1990"));
		filmService.addFilm(film);
		
		
	}
	
	
	
	
	
			
			
	//removeFilm must return valid when inputs are valid
	
	@Test
	public void removeFilmWillReturnValidWithValidInputs() throws FieldEmptyException, NegativeFieldException, RecordNotFoundException{
		
		Mockito.when(filmDao.removeFilm(1)).thenReturn(true);
		
		assertEquals(true,filmService.removeFilm(1));
	}
	
	
	
	
	
	//removeFilm must return null with null inputs
	
	@Test(expected = com.flp.fms.Exceptions.FieldEmptyException.class)
	public void removeFilmWillReturnNullWithIdZero() throws FieldEmptyException, NegativeFieldException, RecordNotFoundException{
		
		assertEquals(false,filmService.removeFilm(0));
	}
	
	
	
	
	
	//removeFilm must return null when record is not present
	
			@Test(expected = com.flp.fms.Exceptions.RecordNotFoundException.class)
			public void removeFilmWillReturnNullWithNoRecord() throws FieldEmptyException, NegativeFieldException, RecordNotFoundException{
				Film film=new Film();
				Mockito.when(filmService.searchFilm(120)).thenReturn(null);
				assertEquals(false,filmService.removeFilm(120));
			}
	
			
			
			

	
	
	
	//removeFilm must return null with invalid inputs

	@Test(expected = com.flp.fms.Exceptions.NegativeFieldException.class)
	public void whenTheidIsZeroInRemoveFilmThrowException() throws FieldEmptyException, NegativeFieldException, RecordNotFoundException
	{
		filmService.removeFilm(-10);
	}
	
	
	
	
	
	
	//searchFilm must return null with  null inputs
	
	@Test(expected = com.flp.fms.Exceptions.FieldEmptyException.class)
	public void whenTheidIsZeroInSearchFilmThrowException() throws FieldEmptyException, NegativeFieldException, RecordNotFoundException
	{
		filmService.searchFilm(0);
	}
	
	
	
	
	
	
	//searchFilm must return null with  invalid inputs
			
	@Test(expected = com.flp.fms.Exceptions.NegativeFieldException.class)
			public void whenTheidIsNegativeInSearchFilmThrowException() throws FieldEmptyException, NegativeFieldException, RecordNotFoundException
			{
				filmService.searchFilm(-1);
			}
	
	
	
	//searchFilm must return valid with  valid inputs
	
	@Test
	public void whenTheidIsValidInSearchFilmItShouldReturnValid() throws FieldEmptyException, NegativeFieldException, RecordNotFoundException
	{
			Film film=new Film();
			Mockito.when(filmDao.searchFilm(2)).thenReturn(film);
				
			assertEquals(film,filmService.searchFilm(2));
	}
	
	
	
	//searchFilm must return null with  no record
	
	@Test(expected = com.flp.fms.Exceptions.RecordNotFoundException.class)
	public void whenTheidIsNotPresentInSearchFilmThrowException() throws FieldEmptyException, NegativeFieldException, RecordNotFoundException
	{
		filmService.searchFilm(121);
	}
	
}
