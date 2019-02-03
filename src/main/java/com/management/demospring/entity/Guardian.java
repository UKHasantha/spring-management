package com.management.demospring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Guardian")
public class Guardian {
	
	@Id
	@Column(name="Guardian_Id",length=12,nullable=false)
	private String guardianid;
	public String getGuardianid() {
		return guardianid;
	}

	@Column(name="Guardian_Name",length=50)
	private String guardianname;
	public String getGuardianname() {
		return guardianname;
	}


	@Column(name="Guardian_Contact",length=12)
	private String guardiancontact;
	public String getGuardiancontact() {
		return guardiancontact;
	}

	//map with student
	@OneToMany(mappedBy="guardian",cascade= {CascadeType.ALL, CascadeType.MERGE,
			CascadeType.DETACH, CascadeType.REFRESH})
	private List<Student> students;
	public List<Student> getStudents() {
		return students;
	}

	public void setGuardianid(String guardianid) {
		this.guardianid = guardianid;
	}

	public void setGuardianname(String guardianname) {
		this.guardianname = guardianname;
	}

	public void setGuardiancontact(String guardiancontact) {
		this.guardiancontact = guardiancontact;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Guardian [guardianid=" + guardianid + ", guardianname=" + guardianname + ", guardiancontact="
				+ guardiancontact + ", students=" + students + "]";
	}

}
