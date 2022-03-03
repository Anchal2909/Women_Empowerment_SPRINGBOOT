package com.lti.womenEmpowerment.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.womenEmpowerment.beans.Courses;
import com.lti.womenEmpowerment.beans.Training;

@Repository
public class TrainingDaoImpl implements TrainingDAO{
	
	@PersistenceContext
	EntityManager em1;
	
	@Override
	public List<Training> getTrainingList() {
		return null;
		//String sql = "SELECT e FROM empRec e";
//				String sql = "SELECT t FROM Training t"; //-- just to reduce display
//				Query qry = em1.createQuery(sql);		
//				List<Training> trainingList = qry.getResultList();
//				return trainingList;		
	}

	@Override
	public Courses getTrainingDtlsById(int courseId) {
		System.out.println("Inside method getTrainingDtlsById...");
		Courses courseObj = em1.find(Courses.class, courseId);
        if (courseObj == null) {
            throw new EntityNotFoundException("Can't find Courses for ID " + courseId);
        }
        return courseObj;
	}
	
	@Override
	@Transactional
	public Training saveTraining(Training training) {
		System.out.println("Dao Training " +training);
//		em1.getTransaction().begin();
		em1.persist(training);
//		em1.getTransaction().commit();
		return training;
	}

	@Override
	public String updateTraining(Training training) {
		// TODO Auto-generated method stub
		return null;
	}

}
