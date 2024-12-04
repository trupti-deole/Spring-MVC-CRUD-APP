package com.cjc.crud.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.model.Student;
import com.cjc.crud.repository.HomeRepository;
import com.cjc.crud.serviceI.HomeService;
//because of @Service annotation it create object (bean) of  HomeServiceImpl class
@Service
public class HomeServiceImpl implements HomeService{

	//by using @Autowired we are going to inject HomeRepositoryImpl bean 
	//otherwise we will get NullPointerException
	@Autowired 
	private HomeRepository repository;
	public void saveData(Student stu) {
		// TODO Auto-generated method stub
		System.out.println("In service stu:"+stu);

		repository.saveData(stu);
	}
	public List<Student> loginCheck(String uname, String pass) {
		// TODO Auto-generated method stub
		//send this data to repository & get list
//		List<Student> studList=repository.loginCheck(uname,pass);
//		return studList;
		return repository.loginCheck(uname,pass);
	}
	public List<Student> deleteData(int rollno) {
		// TODO Auto-generated method stub
		//List<Student> alist=repository.deleteData(rollno);
		//return alist;
		
		return repository.deleteData(rollno);
	}
	public Student updateData(int rollno) {
		// TODO Auto-generated method stub
//		Student student=repository.updateData(rollno);
//		return student;
		
		return repository.updateData(rollno);
		
	}
	public List<Student> editData(Student st) {
		// TODO Auto-generated method stub
		List<Student> studList=repository.editData(st);
		return studList ;
	}
	
	
}
