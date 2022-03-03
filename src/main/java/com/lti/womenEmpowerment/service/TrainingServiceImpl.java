package com.lti.womenEmpowerment.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.womenEmpowerment.beans.Courses;
import com.lti.womenEmpowerment.beans.Training;
import com.lti.womenEmpowerment.dao.TrainingDAO;

@Service("trainingService")  
public class TrainingServiceImpl implements TrainingService{
	
	@Autowired  // By Type injection.
	private TrainingDAO trainingDao;
	
	@Override
	public List<Training> getTrainingList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Courses getTrainingDtlsById(int id) {
		return trainingDao.getTrainingDtlsById(id);
	}

	@Override
	public Training saveTraining(Training training) {
		System.out.println("payment service " +training);
		Training t1=trainingDao.saveTraining(training);
		return t1;
	}

	@Override
	public String updateTraining(Training training) {
		// TODO Auto-generated method stub
		return null;
	}

}
