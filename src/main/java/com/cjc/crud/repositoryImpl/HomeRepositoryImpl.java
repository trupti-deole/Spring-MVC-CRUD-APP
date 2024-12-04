package com.cjc.crud.repositoryImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cjc.crud.model.Student;
import com.cjc.crud.repository.HomeRepository;

@Repository
public class HomeRepositoryImpl implements HomeRepository {

	List<Student> al = new ArrayList<Student>();

	public void saveData(Student stu) {
		// TODO Auto-generated method stub
		System.out.println("In repository:"+stu);

		al.add(stu);

	}
    public List<Student> loginCheck(String uname, String pass) {
		// TODO Auto-generated method stub
    	for(Student st:al)
    	{
    		if(uname.equalsIgnoreCase(st.getUname()) && pass.equals(st.getPass()))
    		{
    			return al;
    		}
    	}
		return null;
	}
	public List<Student> deleteData(int rollno) {
		// TODO Auto-generated method stub
		
		
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext())
		{
			Student st=itr.next();
			if(st.getRollno()==rollno)
			{
				itr.remove();
				
			}
		}
		return al;
	}
	public Student updateData(int rollno) {
		// TODO Auto-generated method stub
		Student stu=null;
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext())
		{
			Student s=itr.next();
			if(s.getRollno()==rollno)
			{
				stu=s;
			}
		}
		return stu;
	}
	public List<Student> editData(Student st) {
		// TODO Auto-generated method stub
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext())
		{
			Student s1=itr.next();
			if(s1.getRollno()==st.getRollno())
			{
				itr.remove();
				
			}
			
			
		}
		al.add(st);
		return al;
	}
}
