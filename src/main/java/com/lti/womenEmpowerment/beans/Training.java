package com.lti.womenEmpowerment.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WOMEN_EMP_REGISTRN_MST_TXN") //WOMEN_EMP_REGISTRN_MST_TXN
public class Training {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="reg_mst_id")
	private int regMstId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="ngo_id")
	private int ngoId;
	
	@Column(name="course_id")
	private int courseId;
	
	public int getRegMstId() {
		return regMstId;
	}
	public void setRegMstId(int regMstId) {
		this.regMstId = regMstId;
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
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Training [regMstId=" + regMstId + ", ngoId=" + ngoId + ", courseId=" + courseId + ", userId=" + userId
				+ "]";
	}
	public Training(int regMstId, int ngoId, int courseId, int userId) {
		super();
		this.regMstId = regMstId;
		this.ngoId = ngoId;
		this.courseId = courseId;
		this.userId = userId;
	}
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
