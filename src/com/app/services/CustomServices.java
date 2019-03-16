package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CustomerDao;
import com.app.pojos.Customer;
import com.app.pojos.Student;

@Service("dao_based_service")
@Transactional
public class CustomServices {

	@Autowired
	CustomerDao cd;
	
	public List<String> lname()
	{
		
		return cd.listname();
		
	}
	public void setName(Student s)
	{
		
		 cd.updatename(s);
		
	}
	
	
}
