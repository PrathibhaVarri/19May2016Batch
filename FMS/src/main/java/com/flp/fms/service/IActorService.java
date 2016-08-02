package com.flp.fms.service;

import java.util.List;

import com.flp.fms.Exceptions.FieldEmptyException;
import com.flp.fms.Exceptions.NegativeFieldException;
import com.flp.fms.Exceptions.RecordNotFoundException;
import com.flp.fms.domain.Actor;

public interface IActorService {

	Actor AddActor(String firstName,String lastName) throws FieldEmptyException;

	Actor ModifyActor(int actorId,String firstName,String lastName);

	boolean RemoveActor(int actorId) throws FieldEmptyException, NegativeFieldException, RecordNotFoundException;

	Actor SearchActor(int actorId) throws FieldEmptyException, NegativeFieldException, RecordNotFoundException;

	List<Actor> getAllActor();

}