package learn.demo.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int roll;
	String name;
	int age;
	float cgpa;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, int age, float cgpa) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.cgpa = cgpa;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", cgpa=" + cgpa + "]";
	}
	
	
}
