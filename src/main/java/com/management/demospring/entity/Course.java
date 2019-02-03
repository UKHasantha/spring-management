package com.management.demospring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Course")
public class Course {
	
	@Id
	@Column(name="Course_Id",length=10,nullable=false)
	private String courseid;
	public String getCourseid() {
		return courseid;
	}

	//many to many associate with subject
	@ManyToMany(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST, 
			CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="course_subject",
			joinColumns=@JoinColumn(name="Course_Cid"),
			inverseJoinColumns=@JoinColumn(name="subject_sbid")
			)
	private List<Subject> subjects;
	
	@Column(name="Course_Name",length=80)
	private String coursename;
	
	public String getCoursename() {
		return coursename;
	}

	// Map with CourseStudent Table
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="CourseStudent_Cs_Id")
	private CourseStudent courseStudent;
	public CourseStudent getCourseStudent() {
		return courseStudent;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public void setCourseStudent(CourseStudent courseStudent) {
		this.courseStudent = courseStudent;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", courseStudent=" + courseStudent + "]";
	}
	
}
