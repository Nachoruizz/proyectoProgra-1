package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import models.Cliente;
@Repository

public class ClienteDaoimp implements ClienteDao {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	@Transactional
	public List<Cliente> obtenerClientes()	{
		
		String query="FROM Cliente";
		List<Cliente> resultado=entityManager.createQuery(query).getResultList();
		
				
		
		
		return resultado;
	}

}
