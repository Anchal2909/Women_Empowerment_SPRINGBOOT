package com.lti.womenEmpowerment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.womenEmpowerment.beans.Courses;
import com.lti.womenEmpowerment.beans.Training;
import com.lti.womenEmpowerment.service.TrainingService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/training")
public class TrainingController {
	
	@Autowired
	TrainingService trainingService;
	
	//http://localhost:8080/training/hello

	@GetMapping("/hello")
	public String Welcome()
	{
		return "Hello training Controller....!!";
	}
	
	//http://localhost:8080/training/register
	@PostMapping("/register")
	public Training registerTraining(@RequestBody Training training)
	{
		System.out.print("register trnid:"+training.getRegMstId());
		Training t1=trainingService.saveTraining(training);
		return t1;
	}
	
	//http://localhost:8080/courses/id
	@GetMapping("/courses/{id}")
	public Courses getCourseDtlsById(@PathVariable(value = "id") int courseId) 
	{
		System.out.println("controller "+courseId);
		System.out.println(trainingService.getTrainingDtlsById(courseId));
		Courses c1 = trainingService.getTrainingDtlsById(courseId); 
		System.out.println("Inside method getCourseDtlsById of controller..."+c1.getCoursename()+":"+c1.getAmount()+":"+c1.getDuration());
		return c1 ;
	}

}
