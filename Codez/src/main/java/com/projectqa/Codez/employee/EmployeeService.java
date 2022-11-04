package com.projectqa.Codez.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
	
	
	
	private List<Topic> employees = new ArrayList<>(Arrays.asList(
			new Topic("01", "James Bond ", "James01@gmail", "Senior Software Developer"),
			new Topic("02", "Rocky Balboa ", "Rocky02@gmail", "Software Developer"),
			new Topic("03", "Jack Sparrow", "Jack03@gmail", "Software Developer"),
			new Topic("04", "Marty Mcfly", "Marty04@gmail", "Software Developer"),
			new Topic("05", "Han Solo", "Solo05@gmail", "Software Associate")
			
			)) ;
	
	
	public List<Topic> getAllTopics() {
		return employees;
	}
	
	
	public Topic getTopic(String id) {
		return employees.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	
	}





	public void addTopic(Topic employee) {
		employees.add(employee);
		
	}


	public void updateTopic(String id, Topic employee) {
		for (int i = 0; i < employees.size(); i++) {
			Topic t = employees.get(i);
			if(t.getId().equals(id)) {
				
				employees.set(i, employee);
				return;
	
				
			}
		}
		
	}


	public void deleteTopic(String id) {
		employees.removeIf(t -> t.getId().equals(id));
		//if the get id is equals to the input id
	}
	
	

}
