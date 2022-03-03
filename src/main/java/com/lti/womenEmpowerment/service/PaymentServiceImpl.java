package com.lti.womenEmpowerment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.womenEmpowerment.beans.Payment;
import com.lti.womenEmpowerment.dao.PaymentDao;


@Service
public class PaymentServiceImpl implements PaymentService
{
	@Autowired
	PaymentDao paymentDao;

	public Payment payBill(Payment p) {
		System.out.println("payment service " +p);
		Payment p1=paymentDao.payBill(p);
		return p1;
			
	}
	
}