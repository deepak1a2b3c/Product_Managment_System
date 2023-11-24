package com.SpringMvc.Crud.Model;

public class Student 
{
	private int id;
	private String name;
	private int age;
	private String city;
	private String email;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", email=" + email + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int id, String name, int age, String city, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public Student() {
		super();
		
	}
}