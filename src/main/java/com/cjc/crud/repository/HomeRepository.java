package com.cjc.crud.repository;

import java.util.List;

import com.cjc.crud.model.Student;

public interface HomeRepository {

	void saveData(Student stu);

	List<Student> loginCheck(String uname, String pass);

	List<Student> deleteData(int rollno);

	Student updateData(int rollno);

	List<Student> editData(Student st);

}
