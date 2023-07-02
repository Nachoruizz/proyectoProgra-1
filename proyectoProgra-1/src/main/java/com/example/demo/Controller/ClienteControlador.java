package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import Dao.ClienteDao;
import models.Cliente;



@RestController
public class ClienteControlador {
	
	@Autowired
	private ClienteDao clienteDao;
	
	
	
	@RequestMapping(value="Holamundo")	
	public String mensaje() {
		
		
		return "Holamundo";
		
	}
	
	@RequestMapping(value="cliente")
    public List<String> listarClientes(){
    	
    	return List.of("Nacho","Franco","Pepe");
    }
	
	 @RequestMapping(value="clientes")
	    public Cliente  listarCliente() {
	    	
	    	Cliente cliente=new Cliente();
	    	cliente.setNombre("Nacho");
	    	cliente.setApellido("Ruiz");
	    	cliente.setEmail("nacho@gmail.com");
	    	cliente.setTelefono("67348347648");
	    	
	    	return cliente;
	    	
	    }
	

	 @RequestMapping(value="cliente1/{id}")
	    public Cliente  getCliente(@PathVariable Long id) {
	    	
	    	Cliente cliente=new Cliente();
	    	cliente.setId(id);
	    	cliente.setNombre("Nacho");
	    	cliente.setApellido("Ruiz");
	    	cliente.setEmail("Nachitoruiz@gmail.com");
	    	cliente.setTelefono("2345455");
	    	
	    	return cliente;
	    	
	    }
	 
	 @RequestMapping(value="cliente/lista_cliente")
	    public List<Cliente>  listar_variosClientes() {
	    	
	    	List<Cliente> clientes=new ArrayList<>();
	    	
	    	Cliente cliente1=new Cliente();
	    	cliente1.setId(3L);
	    	cliente1.setNombre("Nacho");
	    	cliente1.setApellido("Ruiz");
	    	cliente1.setEmail("nacho@gmail.com");
	    	cliente1.setTelefono("6546546545");
	    	
	    	Cliente cliente2=new Cliente();
	    	cliente2.setId(4L);
	    	cliente2.setNombre("Agustin");
	    	cliente2.setApellido("Magallanes");
	    	cliente2.setEmail("agustinn@gmail.com");
	    	cliente2.setTelefono("675757567");
	    	
	    	Cliente cliente3=new Cliente();
	    	cliente3.setId(5L);
	    	cliente3.setNombre("Franco");
	    	cliente3.setApellido("Magallanes");
	    	cliente3.setEmail("franco@gmail.com");
	    	cliente3.setTelefono("754535467");
	    	
	    	
	    	
	    	
	    	clientes.add(cliente1);
	    	clientes.add(cliente2);
	    	clientes.add(cliente3);
	    	
	    	return clientes;
	    	
	    }
	 
	  @RequestMapping(value="api/clientes")
	    public List<Cliente>  getCliente() {
	    	
	    	List<Cliente> user=clienteDao.obtenerClientes();
	    	
	    	return user;
	    }
	    
	 
	 
	 
	 
	 
}



