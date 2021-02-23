package com.example.test.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.test.demo.model.Employee;

@Repository
public class EmployRepo implements EmployeeDao {
	
	@Autowired
	 SessionFactory sessionFactory;
	
	public void getEmployee() {
		List<Employee> employees=null;
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Employee.class);
		employees=criteria.list();
		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}
	}

}
