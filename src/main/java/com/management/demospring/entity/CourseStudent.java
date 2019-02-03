package com.management.demospring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CourseStudent")
public class CourseStudent {
	
	//This is a Student and Course ManytoMany Associate entity table
	
	@Id
	@Column(name="Cs_Id",nullable=false,length=10)
	private String csid;
	public String getCsid() {
		return csid;
	}

	public void setCsid(String csid) {
		this.csid = csid;
	}
	
//	@OneToMany(mappedBy=" course_student",cascade= {CascadeType.ALL, CascadeType.MERGE,
//			CascadeType.DETACH, CascadeType.REFRESH})
//	private List<Student> students;
//
//	@OneToMany(mappedBy=" course_student",cascade= {CascadeType.ALL, CascadeType.MERGE,
//			CascadeType.DETACH, CascadeType.REFRESH})
//	private List<Course> courses;
//	
	@Override
	public String toString() {
		return "CourseStudent [csid=" + csid + "]";
	}	
}
