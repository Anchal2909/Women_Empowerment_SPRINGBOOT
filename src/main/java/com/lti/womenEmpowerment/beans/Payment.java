package com.lti.womenEmpowerment.beans;
//
//import java.util.Date;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WOMEN_EMP_PAYMENT_DTL_TXN")
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="payment_Trn_Id")
	private int paymentTrnId;
	
	@Column(name="amount")
	private int amount;
	
	@Column(name="payment_dt")
	private Date paymentDate;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="ngo_id")
	private int ngoId;
	
	@Column(name="course_id")
	private int courseId;

	public int getPaymentTrnId() {
		return paymentTrnId;
	}

	public void setPaymentTrnId(int paymentTrnId) {
		this.paymentTrnId = paymentTrnId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getNgoId() {
		return ngoId;
	}

	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "Payment [paymentTrnId=" + paymentTrnId + ", amount=" + amount + ", paymentDate=" + paymentDate
				+ ", userId=" + userId + ", ngoId=" + ngoId + ", courseId=" + courseId + "]";
	}

	public Payment(int paymentTrnId, int amount, Date paymentDate, int userId, int ngoId, int courseId) {
		super();
		this.paymentTrnId = paymentTrnId;
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.userId = userId;
		this.ngoId = ngoId;
		this.courseId = courseId;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	   
		
	}

/*
 * create table Payments2
(
Payment_Id Number(5),
Amount number(8),
empNo Number(5)
);


insert into payments2 values(101,10000,102);
*/
