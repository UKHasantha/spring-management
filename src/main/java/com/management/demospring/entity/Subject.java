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
import javax.persistence.Table;


@Entity
@Table(name="Subject")
public class Subject {
	
	@Id
	@Column(name="Sb_Id",length=12,nullable=false)
	String sbid;
	public String getSbid() {
		return sbid;
	}

	@Column(name="Sb_Name",length=50)
	String sbname;
	public String getSbname() {
		return sbname;
	}

	//many to many associate with course
	@ManyToMany(fetch=FetchType.LAZY, cascade={CascadeType.PERSIST, 
			CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="course_subject",
			joinColumns=@JoinColumn(name="Subject_Sb_Id"),
			inverseJoinColumns=@JoinColumn(name="Course_Cid")
			)
	private List<Course> courses;
	public List<Course> getCourses() {
		return courses;
	}

	public void setSbid(String sbid) {
		this.sbid = sbid;
	}

	public void setSbname(String sbname) {
		this.sbname = sbname;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Subject [sbid=" + sbid + ", sbname=" + sbname + ", courses=" + courses + "]";
	}

}
