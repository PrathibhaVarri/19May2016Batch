
package com.flp.fms.view;

import java.text.ParseException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.flp.fms.Exceptions.DuplicateRecordException;
import com.flp.fms.Exceptions.FieldEmptyException;
import com.flp.fms.Exceptions.NegativeFieldException;
import com.flp.fms.Exceptions.RecordNotFoundException;

public class BootClass 
{
	static BootClass bc=new BootClass();
	static Scanner sc=new Scanner(System.in);

	UserInteraction ui=new UserInteraction();
	
	public static void main(String args[]) throws ParseException,FieldEmptyException,NegativeFieldException,RecordNotFoundException, DuplicateRecordException
	{	
		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.AddFilm"+"\n"+"2.ModifyFilm"+"\n"+"3.RemoveFilm"+"\n"+"4.SearchFilm"+"\n"+"5.getAllFilm"+"\n"+"6.AddActor"+"\n"+"7.ModifyActor"+"\n"+"8.RemoveActor"+"\n"+"9.SearchActor"+"\n"+"10.getAllActor"+"\n"+"11.Exit");
			System.out.println("-------------");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			bc.menuSelection(choice);
		}
	}
	
	private void menuSelection(int choice) throws ParseException,FieldEmptyException,NegativeFieldException,RecordNotFoundException, DuplicateRecordException
	{
		switch(choice)
		{
			case 1:ui.addFilm();
					break;
			case 2:ui.modifyFilm();
					break;
			case 3:ui.removeFilm();
					break;
			case 4:ui.searchFilm();
					break;
			case 5:ui.getAllFilm();
					break;
			case 6:ui.addActor();
					break;
			case 7:ui.modifyActor();
					break;
			case 8:ui.removeActor();
					break;
			case 9:ui.searchActor();
					break;
			case 10:ui.getAllActor();
					break;
			default:System.out.println("Inavalid Menu Selection");
					break;
			case 11:System.exit(0);
					break;
		}
	}
}
