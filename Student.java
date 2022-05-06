package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println(" Student name is RAM");
	}
	public void studentDept() {
		System.out.println("Student Dept is civil");
	}
	public void studentId() {
		System.out.println("student id is 12345");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student();
		obj1.collegeName();
		obj1.collegeCode();
		obj1.collegeRank();
		obj1.deptName();
		obj1.studentName();
		obj1.studentDept();
		obj1.studentId();

	}

}
