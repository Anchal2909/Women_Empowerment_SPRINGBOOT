package com.lti.womenEmpowerment.dao;

import java.util.List;

import com.lti.womenEmpowerment.beans.Courses;
import com.lti.womenEmpowerment.beans.Training;

public interface TrainingDAO {
	
	public List<Training> getTrainingList() ; 	
	public Courses getTrainingDtlsById(int id) ;
	public Training saveTraining(Training training) ;
	public String updateTraining(Training training);
	
}
