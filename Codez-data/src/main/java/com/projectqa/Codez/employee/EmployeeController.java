package com.projectqa.Codez.employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@RequestMapping("/employees")
	public List<Topic> getAllTopics() {
		return employeeService.getAllTopics();
		
		
	}
	
	@RequestMapping("/employees/{id}")
	public Topic getTopic(@PathVariable String id) {
		return employeeService.getTopic(id);
		
		
	}
	
@RequestMapping(method=RequestMethod.POST, value="/employees") 	
public void addTopic(@RequestBody Topic employee) {
	employeeService.addTopic(employee);
	
}

@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}") 	
public void updateTopic(@RequestBody Topic employee, @PathVariable String id) {
	employeeService.updateTopic(id, employee);
	
}


@RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
public void deleteTopic(@PathVariable String id) {
	 employeeService.deleteTopic(id);
	
}




}


