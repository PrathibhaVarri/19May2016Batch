package com.flp.fms.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;
import com.flp.fms.service.ActorServiceImpl;
import com.flp.fms.service.FilmServiceImpl;
import com.flp.fms.service.IActorService;
import com.flp.fms.service.IFilmService;

public class UserInteraction
{
	IFilmService filmService;
	IActorService actorService;
	Scanner sc=new Scanner(System.in);

	public UserInteraction()
	{
		filmService=new FilmServiceImpl();
		actorService=new ActorServiceImpl();
	}
	

	public void addFilm() throws ParseException, FieldEmptyException, NegativeFieldException, DuplicateRecordException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Map<String,Object> filmDetails=new HashMap();
		
		System.out.println("Enter title");
		filmDetails.put("title:",sc.next());
		System.out.println("Enter description");
		filmDetails.put("description:",sc.next());
		System.out.println("Enter release date");
		filmDetails.put("release date:",dateFormat.parse(sc.next()));
		System.out.println("Enter rental duration");
		filmDetails.put("rental duration:",sc.nextInt());
		System.out.println("Enter rental rate");
		filmDetails.put("rental rate:",sc.nextDouble());
		System.out.println("Enter length of the movie");
		filmDetails.put("length:",sc.nextInt());
		System.out.println("Enter replacement cost");
		filmDetails.put("replacement cost:",sc.nextDouble());
		System.out.println("Enter rating");
		filmDetails.put("rating:",sc.nextDouble());
		System.out.println("Enter special features");
		filmDetails.put("special features:",sc.next());
				
		
		System.out.println("Enter the language Name");
		filmDetails.put("language:",sc.next());

		System.out.println("Enter the category Name");
		filmDetails.put("category",sc.next());
	
		System.out.println("Enter the Number of actors");
		int numberOfActors=sc.nextInt();
		List actors=new ArrayList();
		
		for(int i=0;i < numberOfActors;i++)
		{
			Map<String,Object> actorDetails=new HashMap();
			System.out.println("Enter the actor first name");
			actorDetails.put("firstName",sc.next());
			System.out.println("Enter the actor last name");
			actorDetails.put("lastName",sc.next());
			actors.add(actorDetails);
			filmDetails.put("actors",actors);
		}
		
		filmService.addFilm(filmDetails);
	}
	
	public void modifyFilm() throws ParseException,IllegalArgumentException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Map<Integer,Object> newDetails=new HashMap();
		System.out.println("enter title,releaseyear and rating of the film to modify");
		String titlePrevious=sc.next();
		Date releaseYearp=dateFormat.parse(sc.next());
		Double ratingPrevious=sc.nextDouble();
		newDetails.put(1,titlePrevious);
		newDetails.put(2,releaseYearp);
		newDetails.put(3,ratingPrevious);
		System.out.println("enter choice to modify 1.title 2.description 3.language 4.rentalDuration 5.rentalRate 6.length 7.replacementCost 8.rating 9.specialFeatures 10.category");
		int choice=sc.nextInt();
		switch(choice){
		case 1:System.out.println("enter new title");
		       String title=sc.next();
		       newDetails.put(4, title);
		       System.out.println(filmService.modifyFilm(newDetails));
		       break;
		case 2:System.out.println("enter new description");
		       String description=sc.next();
		       newDetails.put(5, description);
		       System.out.println(filmService.modifyFilm(newDetails));
		       break;
		case 3:System.out.println("enter new language");
			   String language=sc.next();
			   newDetails.put(6, language);
			   System.out.println(filmService.modifyFilm(newDetails));
			   break;
		case 4:System.out.println("enter new rental_duration");
			   int rentalDuration=sc.nextInt();
			   newDetails.put(7, rentalDuration);
			   System.out.println(filmService.modifyFilm(newDetails));
			   break;
		case 5:System.out.println("enter new rental_rate");
			   Double rentalRate=sc.nextDouble();
			   newDetails.put(8, rentalRate);
			   System.out.println(filmService.modifyFilm(newDetails));
			   break;
		case 6:System.out.println("enter new length");
			   int length=sc.nextInt();
			   newDetails.put(9, length);
			   System.out.println(filmService.modifyFilm(newDetails));
			   break;
		case 7:System.out.println("enter new replacement cost");
			   Double replacementCost=sc.nextDouble();
			   newDetails.put(10, replacementCost);
			   System.out.println(filmService.modifyFilm(newDetails));
			   break;
		case 8:System.out.println("enter new rating");
			   Double rating=sc.nextDouble();
			   newDetails.put(11, rating);
			   System.out.println(filmService.modifyFilm(newDetails));
			   break;
		case 9:System.out.println("enter new special features");
			   String specialFeatures=sc.next();
			   newDetails.put(12, specialFeatures);
			   System.out.println(filmService.modifyFilm(newDetails));
			   break;
		case 10:System.out.println("enter new Category");
			    String category=sc.next();
			    newDetails.put(13, category);
			    System.out.println(filmService.modifyFilm(newDetails));
			    break;
		}
		}

	
	
	public void removeFilm() throws NegativeFieldException, FieldEmptyException
	{
		System.out.println("Enter the film id to remove");
		int filmId=sc.nextInt();
		if(filmService.removeFilm(filmId))
		{
			System.out.println("film Successfully removed");
		}
		else
		{
			System.out.println("film Not Found");
		}
	}
	
	public void searchFilm() throws FieldEmptyException, NegativeFieldException, RecordNotFoundException
	{
		System.out.println("Enter the film id to search");
		int filmId=sc.nextInt();
		Film film=filmService.searchFilm(filmId);
		if(film !=null)
		{
			System.out.println("Found "+film);
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	
	public void getAllFilm()
	{
		List<Film> films=filmService.getAllFilm();
		System.out.println("All films details are "+films);
	}
	
	public Actor addActor()throws FieldEmptyException
	{
		Actor actor=new Actor();
		System.out.println("Enter the actor first name");
		String firstName=sc.next();
		System.out.println("Enter the actor last name");
		String lastName=sc.next();
		System.out.println("Actor added successfully");
		return actorService.AddActor(firstName,lastName);
	}
	
	public void modifyActor()
	{
		System.out.println("Enter the actor id to modify");
		int actorId=sc.nextInt();
		
		System.out.println("Enter the actor first name");
		String firstName=sc.next();
		System.out.println("Enter the actor last name");
		String lastName=sc.next();
		System.out.println("Actor modified successfully ,details are"+actorService.ModifyActor(actorId,firstName,lastName));	
	}
	
	public void removeActor()throws FieldEmptyException, NegativeFieldException, RecordNotFoundException
	{
		System.out.println("Enter the actor id to remove");
		int actorId=sc.nextInt();
		if(actorService.RemoveActor(actorId))
		{
			System.out.println("Actor Successfully removed");
		}
		else
		{
			System.out.println("Actor Not Found");
		}
	}
	
	public void searchActor()throws FieldEmptyException, NegativeFieldException, RecordNotFoundException
	{
		System.out.println("Enter the actor id to search");
		int actorId=sc.nextInt();
		Actor actor=actorService.SearchActor(actorId);
		if(actor !=null)
		{
			System.out.println("Found "+actor);
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	
	public void getAllActor()
	{
		List<Actor> actors= actorService.getAllActor();
		System.out.println("All actors details are "+actors);
	}
}
