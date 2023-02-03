package com.jsp.person.account;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPerson {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aniket");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		

		Person p = new Person();
		p.setName("aniket");
		p.setEmail("aniket@gmail.com");
		
		BankAccount b1 = new BankAccount();
		b1.setBank_name("HDFC");
		b1.setAcc_no(789654123);
		
		BankAccount b2 = new BankAccount();
		b2.setBank_name("SBI");
		b2.setAcc_no(457523456);
		
		BankAccount b3 = new BankAccount();
		b3.setBank_name("BOI");
		b3.setAcc_no(76454123);
		
		b1.setPerson(p);
		b2.setPerson(p);
		b3.setPerson(p);
		
		entityTransaction.begin();
		entityManager.persist(p);

		entityManager.persist(b1);
		entityManager.persist(b2);
		entityManager.persist(b3);

		entityTransaction.commit();
		System.out.println("all good");

	}

}
