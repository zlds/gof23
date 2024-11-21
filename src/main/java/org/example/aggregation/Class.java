package org.example.aggregation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hanchaowei
 * @date 2024/10/29
 * @description:
 */

public class Class {
	// 聚合关系。部分可以离开整体单独存在。学生可以更换班级
	private List<Student> studentList;


	public Class (List<Student> students) {
		this.studentList = students;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		List<Student> students = new ArrayList<>();

		Student s = new Student();
		students.add(s);
		Student s1 = new Student();
		students.add(s1);


		Class c = new Class(students);
	}
}
