package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;
import com.app.pojos.Student;

@Repository
public class CustomerDao {

	@Autowired
	private SessionFactory sf;

	public CustomerDao() {
		System.out.println("in dao constr");
	}
	
	public List<String> listname()
	{
		String jpql="Select c.name from Customer c";
		
		return sf.getCurrentSession().createQuery(jpql, String.class).getResultList();
		
		
	}
    public void updatename(Student s)
    {
    	sf.getCurrentSession().save(s);
    	
    	
    	
    }

}
