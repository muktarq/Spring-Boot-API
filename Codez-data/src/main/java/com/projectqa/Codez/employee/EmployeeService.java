package com.projectqa.Codez.employee;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	
	
	
	public List<Topic> getAllTopics() {
		
		List<Topic> employees = new ArrayList<>();
		employeerepository.findAll()
		.forEach(employees::add);
		return employees;
	}
	
	
	public Topic getTopic(String id) {
		//return employees.stream().filter(t -> t.getId().equals(id)).findFirst().get();

		return employeerepository.findById(id).get();
		
	}

  

	public void addTopic(Topic employee) {
		//employees.add(employee);
		 employeerepository.save(employee);
		
		
	}


	public void updateTopic(String id, Topic employee) {
		employeerepository.save(employee);
	
				
			}
	
		



	public void deleteTopic(String id) {
		//employees.removeIf(t -> t.getId().equals(id));
		employeerepository.deleteById(id);
		
	}
	
	

}
