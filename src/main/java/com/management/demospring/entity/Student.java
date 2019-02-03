package com.management.demospring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@Column(name="Student_Id", length=12, nullable=false)
	private String studentid;
	public String getStudentid() {
		return studentid;
	}
	// map with guardian
	@ManyToOne(cascade= {CascadeType.ALL, CascadeType.MERGE, 
			CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="Guardian_Guardian_Id")
	private Guardian guardian;
	public Guardian getGuardian() {
		return guardian;
	}

	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}

	@Column(name="Student_Name",length=50)
	private String studentname;
	public String getStudentname() {
		return studentname;
	}

	@Column(name="Student_Address",length=80)
	private String studentaddress;
	public String getStudentaddress() {
		return studentaddress;
	}

	@Column(name="Student_Contact",length=12)
	private String studentcontact;
	public String getStudentcontact() {
		return studentcontact;
	}

	@Column(name="Student_Guardian",length=50)
	private String studentguardian;
	public String getStudentguardian() {
		return studentguardian;
	}

	@Column(name="Guardian_Contact",length=12)
	private String guardiancontact;
	public String getGuardiancontact() {
		return guardiancontact;
	}

	// Map with CourseStudent Table
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="CourseStudent_Cs_Id")
	private CourseStudent courseStudent;
	public CourseStudent getCourseStudent() {
		return courseStudent;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}

	public void setStudentcontact(String studentcontact) {
		this.studentcontact = studentcontact;
	}

	public void setStudentguardian(String studentguardian) {
		this.studentguardian = studentguardian;
	}

	public void setGuardiancontact(String guardiancontact) {
		this.guardiancontact = guardiancontact;
	}

	public void setCourseStudent(CourseStudent courseStudent) {
		this.courseStudent = courseStudent;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentaddress=" + studentaddress
				+ ", studentcontact=" + studentcontact + ", studentguardian=" + studentguardian + ", guardiancontact="
				+ guardiancontact + ", courseStudent=" + courseStudent + "]";
	}


}
