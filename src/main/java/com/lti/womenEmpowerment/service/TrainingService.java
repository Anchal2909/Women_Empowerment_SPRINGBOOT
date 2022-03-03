package com.lti.womenEmpowerment.service;

import java.util.List;

import com.lti.womenEmpowerment.beans.Courses;
import com.lti.womenEmpowerment.beans.Training;

public interface TrainingService {
	public List<Training> getTrainingList() ; 	
	public Courses getTrainingDtlsById(int id) ;
	public Training saveTraining(Training training) ;
	public String updateTraining(Training training);

}
