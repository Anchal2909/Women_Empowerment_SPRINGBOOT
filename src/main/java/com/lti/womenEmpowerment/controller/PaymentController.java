package com.lti.womenEmpowerment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.womenEmpowerment.beans.Payment;
import com.lti.womenEmpowerment.service.PaymentService;

@CrossOrigin(origins = "*") // any url, any, port no, any server
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService payService;
	
	//http://localhost:8080/payment/payfee
	@PostMapping("/payfee")
	public Payment payBill(@RequestBody Payment p)
	{
		System.out.print("payment trnid:"+p.getPaymentTrnId());
		System.out.print("payment date:"+p.getPaymentDate());
		Payment p1=payService.payBill(p);
		return p1;
	}
}
