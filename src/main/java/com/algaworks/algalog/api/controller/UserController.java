package com.algaworks.algalog.api.controller;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public List<Cliente> listUser() {
		
		Cliente Listuser = new Cliente();
		
		Listuser.setId(1L);
		Listuser.setNome("Airton");
		Listuser.setEmail("wwwwwwww@wwwww");
		Listuser.setTelefone("9999999999");
		
		return  Arrays.asList(Listuser);
	}
}
