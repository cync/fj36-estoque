package br.com.caelum.estoque.main;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import br.com.caelum.estoque.rmi.EstoqueService;

public class RegistraERodaService {
	public static void main(String[] args) throws Exception {
		
		LocateRegistry.createRegistry(1099);
		Naming.bind("/estoque",new EstoqueService());
		System.out.println("Estoque registrado e rodando.");
		
	}

}
