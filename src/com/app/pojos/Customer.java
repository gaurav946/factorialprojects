package com.app.pojos;
import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {
	
	private Integer id;
	private String name, email, pass;
	private double phoneNo;

	public Customer() {
		
		System.out.println("in customer constr");
	
	}

	public Customer(Integer id, String name, String email, String pass, double phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.phoneNo = phoneNo;
	}
	

	public Customer(String name, String email, String pass,double phoneNo) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.phoneNo = phoneNo;
	}
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length=20)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(length=20,unique=true)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(length=20)
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Column(length=10,name="phone_no")
	public double getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(double phoneNo) {
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass +", phoneNo=" +phoneNo;
	}

}
