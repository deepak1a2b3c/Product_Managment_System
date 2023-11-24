
package com.SpringMvc.Crud.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringMvc.Crud.Model.Student;
import java.util.*;

@Component
public class StudentDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List getAllStudents()
	{
		String query="select * from  success";
		List<Student> students=jdbcTemplate.query(query,new RowMapperImp());
		return students;
	}
	
	public int addStudent(Student student)
	{
		String query="insert into success(id,name,age,city,email) values(?,?,?,?,?)";
		
		int row=jdbcTemplate.update(query,student.getId(),student.getName(),student.getAge(),student.getCity(),student.getEmail());
		return row;
	}
	
	public int deleteStudent(int id)
	{
		String query="delete from  success where id=?";
		int row=jdbcTemplate.update(query,id);
		return row;
	}
	
	public Student getSingleStudent(int id)
	{
		String query="select * from  success where id=?";
		Student student=this.jdbcTemplate.queryForObject(query, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));
		return student;
	}
	
	public void updateStudentDetails(Student student)
	{
		String query="update  success set name=? ,age=? ,city=?,email=? where id=?";
		jdbcTemplate.update(query,student.getName(),student.getAge(),student.getCity(),student.getEmail(),student.getId());
	}
	
	public Student getSingleStudentByEmail(String email)
	{
		String query="select * from  success where email=?";
		Student student=this.jdbcTemplate.queryForObject(query, new Object[]{email},new BeanPropertyRowMapper<Student>(Student.class));
		return student;
	}
	
}
