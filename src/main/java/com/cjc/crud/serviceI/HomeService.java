package com.cjc.crud.serviceI;

import java.util.List;

import com.cjc.crud.model.Student;

public interface HomeService {

	void saveData(Student stu);

	List<Student> loginCheck(String uname, String pass);

	List<Student> deleteData(int rollno);

	Student updateData(int rollno);

	List<Student> editData(Student st);

}
