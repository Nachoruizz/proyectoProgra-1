package Dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import models.Cliente;

@Transactional
public interface ClienteDao {

	List<Cliente>  obtenerClientes();

}
