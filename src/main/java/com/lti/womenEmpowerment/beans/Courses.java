package com.lti.womenEmpowerment.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WOMEN_EMP_TRAINING_DTL") 
public class Courses {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="course_name")
	private String coursename;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="course_fee")
	private int amount;
	
	@Column(name="ngo_id")
	private int ngoId;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getNgoId() {
		return ngoId;
	}

	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", coursename=" + coursename + ", duration=" + duration + ", amount="
				+ amount + ", ngoId=" + ngoId + "]";
	}

	public Courses(int courseId, String coursename, int duration, int amount, int ngoId) {
		super();
		this.courseId = courseId;
		this.coursename = coursename;
		this.duration = duration;
		this.amount = amount;
		this.ngoId = ngoId;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

}
