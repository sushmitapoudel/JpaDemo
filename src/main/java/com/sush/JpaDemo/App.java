package com.sush.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//saving
    	Student s=new Student();
    	s.setSid(7);
    	s.setSname("Sarita");
    	s.setTech("Oracle");
    	
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("abc");
    	EntityManager em=emf.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(s);
    	em.getTransaction().commit();
    	
    	//fetching
    	//Student s=em.find(Student.class,3); 
    	System.out.println(s);
    }
}