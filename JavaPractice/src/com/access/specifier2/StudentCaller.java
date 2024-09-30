package com.access.specifier2;

import com.access.specifier1.Student;

public class StudentCaller extends Student{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentCaller c = new StudentCaller();
		c.age = 10;
		c.name = "gg";
		c.display();
	}

}
