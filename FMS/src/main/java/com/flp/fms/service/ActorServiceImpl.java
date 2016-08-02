package com.flp.fms.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.flp.fms.Exceptions.FieldEmptyException;
import com.flp.fms.Exceptions.NegativeFieldException;
import com.flp.fms.Exceptions.RecordNotFoundException;
import com.flp.fms.dao.ActorDaoImplForDB;
import com.flp.fms.dao.IActorDao;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Film;

public class ActorServiceImpl implements IActorService
{
	IActorDao actorDao;
	
	public ActorServiceImpl(IActorDao actorDao) {
	
		this.actorDao=actorDao;
	}

	
	public ActorServiceImpl() {
		actorDao=new ActorDaoImplForDB();
		// TODO Auto-generated constructor stub
	}


	public Actor AddActor(String firstName,String lastName)throws FieldEmptyException
	{
		if(firstName==null || lastName==null)
		{
			throw new FieldEmptyException();
		}
		else{
		
		Actor actor=new Actor();
		actor.setFirstName(firstName);
		actor.setLastName(lastName);
		
		return actorDao.AddActor(actor);
		}
	}
	
	
	public Actor ModifyActor(int actorId,String firstName,String lastName) {
		Actor actor=actorDao.SearchActor(actorId);
		
		if(actor!=null)
		{
			actor.setFirstName(firstName);
			actor.setLastName(lastName);
			return actorDao.ModifyActor(actor);
		}
		return null;
		
	}

	
	public boolean RemoveActor(int actorId)throws FieldEmptyException, NegativeFieldException, RecordNotFoundException

	{
	if(actorId==0)
	{
		throw new FieldEmptyException();
	}
	else if(actorId<0)
	{
		throw new NegativeFieldException();
	}
	else if(actorDao.SearchActor(actorId)==null)
	{
		throw new RecordNotFoundException();
	}
	else
	
		
		return actorDao.RemoveActor(actorId);
	}

	
	public Actor SearchActor(int actorId)throws FieldEmptyException, NegativeFieldException, RecordNotFoundException {
		if(actorId==0)
		{
			throw new FieldEmptyException();
		}
		else if(actorId<0)
		{
			throw new NegativeFieldException();
		}
		else if(actorDao.SearchActor(actorId)==null)
		{
			throw new RecordNotFoundException();
		}
		else
		return actorDao.SearchActor(actorId);
	}

	
	public List<Actor> getAllActor() {
		return actorDao.getAllActor();
	}
}