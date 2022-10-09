/**
*
*/
package com.ims.InterviewManagementSystem.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/**
* @author sharanya
*
*/
//# TODO:After Database Creation



@Entity
  @Table(name = "employees")

public class Employee {
    
      //# TODO:After Database Creation
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
     
    private long id;
    ////# TODO:After Database Creation
    
    @Column(name = "jobCode")
    private String jobCode;
    
    //# TODO:After Database Creation



   @Column(name = "customer")
    private String customer;
    
    //# TODO:After Database Creation
    
    @Column(name = "jobDescription")
    private String jobDescription;
    
    
    @Column(name = "primaryTechnology")
    private String primaryTechnology;
    
    @Column(name = "secondarySkills")
    private String secondarySkills;
    
    @Column(name = "mandatorySkills")
    private String mandatorySkills;
    
    @Column(name = "noofPositions")
    private int noofPositions;
    
    @Column(name = "dueDate")
    private String dueDate;
    
    @Column(name = " createdby")
    private String  createdby;
    
    @Column(name = "createddate")
    private String createddate;
    
    
    
    
    public Employee() {
        
    }
    
    public Employee(String jobCode, String customer, String jobDescription,String primaryTechnology,String mandatorySkills,int noofPositions,String dueDate,String createdby,String createddate) {
        super();
        this.jobCode = jobCode;
        this.customer = customer;
        this.jobDescription = jobDescription;
        this.primaryTechnology = primaryTechnology;
        this.secondarySkills = secondarySkills;
        this.mandatorySkills = mandatorySkills;
        this.noofPositions = noofPositions;
        this.dueDate = dueDate;
        this.createdby =  createdby;
        this.createddate = createddate;
        
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getPrimaryTechnology() {
		return primaryTechnology;
	}

	public void setPrimaryTechnology(String primaryTechnology) {
		this.primaryTechnology = primaryTechnology;
	}
    
	public String getSecondarySkills() {
		return secondarySkills;
	}

	public void setSecondaryTechnology(String primaryTechnology) {
		this.secondarySkills = primaryTechnology;
	}
	public String getMandatorySkills() {
		return mandatorySkills;
	}

	public void setMandatorySkills(String mandatorySkills) {
		this.mandatorySkills = mandatorySkills;
	}

	public int getNoofPositions() {
		return noofPositions;
	}

	public void setNoofPositions(int noofPositions) {
		this.noofPositions = noofPositions;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getCreateddate() {
		return createddate;
	}

	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}

	
    



}
    

