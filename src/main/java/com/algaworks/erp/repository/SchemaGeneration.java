package com.algaworks.erp.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.erp.model.Empresa;

public class SchemaGeneration {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("AlgaWorksPU");
		
		EmtityManager em = emf.createEntityManager();
		
		List<Empresa> Lista em.createQuery("from Empresa", Empresa.class).getResultList();
		
		System.out.println(Lista);
		
		em.close();
		emf.close();
		
	}

}
