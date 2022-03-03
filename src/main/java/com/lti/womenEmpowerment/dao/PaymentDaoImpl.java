package com.lti.womenEmpowerment.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.womenEmpowerment.beans.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao {
	
	@PersistenceContext
	EntityManager em1;

	@Override
	@Transactional
	public Payment payBill(Payment p) {
		System.out.println("Dao payment " +p);
//		em1.getTransaction().begin();
		em1.persist(p);
//		em1.getTransaction().commit();
		return p;
	}
	
}


/*how to add Payment object from postman :
  {
"paymentId":112,
"amount":10000,
"emp": {
    "empNo":103,
    "eName":"Ajay",
    "eSal":10000      
   }    
}
 */
