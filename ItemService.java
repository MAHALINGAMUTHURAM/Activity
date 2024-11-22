package com.service;
import javax.persistence.*;

import com.model2.Item;
import com.model2.TurnOver;
public class ItemService {
	
	EntityManager e;
	
	public ItemService()
	{
	EntityManagerFactory f=Persistence.createEntityManagerFactory("PetPU");
	e=f.createEntityManager();
	}
	
	public void saveItem(TurnOver t1)
	{
		EntityTransaction t=e.getTransaction();
		t.begin();
		e.persist(t1);
		t.commit();
	}

}