package com.SpringMvc.Crud.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringMvc.Crud.Dao.StudentDao;
import com.SpringMvc.Crud.Model.Student;

@Controller
public class MainController 
{
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping("/")
	public String home(Model m)
	{
		List<Student> students=studentDao.getAllStudents();
		m.addAttribute("students",students);
		return "index";
	}
	@RequestMapping("/add")
	public String addForm(Model m)
	{
		return "add_form";
	}
	
	@RequestMapping(value="add-student",method=RequestMethod.POST)
	public String addDetails(Student student,Model m)
	{
		
			System.out.println(student);
			int c=0;
			List<Student> studentss=studentDao.getAllStudents();
			for(Student s:studentss) 
			{
				if(s.getEmail().equals(student.getEmail()))
					{
						c++;
						break;
					}
			}
			if(c>0) 
			{
				
				m.addAttribute("msg","email is already exist");
				return "add_form";
			}
	        studentDao.addStudent(student);
	        List<Student> students=studentDao.getAllStudents();
			m.addAttribute("students",students);
			return "index";	
		}		
	
	@RequestMapping("/delete/{id}")
	public String deleteSingleStudent(@PathVariable ("id") int id,Model m)
	{
		studentDao.deleteStudent(id);
		List<Student> students=studentDao.getAllStudents();
		m.addAttribute("students",students);
		return "index";
	}
	
	@RequestMapping("/update/{id}")
	public String updateStudent(@PathVariable ("id") int id,Model m)
	{
		Student student=studentDao.getSingleStudent(id);
		m.addAttribute("student",student);	
		return "update";
	}
	
	@RequestMapping(value="update-details",method=RequestMethod.POST)
	public String updateDetails(Student student,Model m)
	{
		this.studentDao.updateStudentDetails(student);
		List<Student> students=studentDao.getAllStudents();
		m.addAttribute("students",students);
		return "index";
	}
	@RequestMapping("/search") 
	  public String searchStudentByName(@RequestParam ("name") String name,Model m) 
	  {
		  int count=0; 
		  List<Student> students=studentDao.getAllStudents();
		  List<Student> list=new ArrayList<Student>();
		  
		  for(Student s:students)
		  {
			  if(s.getName().equals(name)) 
			  {
				  
				  list.add(s);
				  count++;
			  } 
		  }	  
			  if(count>0)
			  { 
		          m.addAttribute("students",list);
		          return "index";
		      }
			 m.addAttribute("students",students);
			
		     return "index"; 

	  }

	}	