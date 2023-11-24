package com.SpringMvc.Crud.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.SpringMvc.Crud.Model.Student;

public class RowMapperImp implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Student student =new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setAge(rs.getInt(3));
		student.setCity(rs.getString(4));
		student.setEmail(rs.getString(5));

		return student;
	}


}
