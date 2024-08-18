package com.example.demo.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Entity.student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentrepo;
	
	public String registerStudent(int rollno,String name,String course, MultipartFile file)
	{
		try
		{
			String uploadurl="src/main/resources/static/photos";
			String filename=System.currentTimeMillis()+file.getOriginalFilename();
			Path path=Paths.get(uploadurl+File.separator+filename);
			Files.copy(file.getInputStream(), path);
			student stu=new student();
			stu.setRollno(rollno);
			stu.setName(name);
			stu.setCourse(course);
			stu.setPhotoname(filename);
			studentrepo.save(stu);
			return "Student Registration Done";
		}catch (Exception e) {
			e.printStackTrace();
			return "Student Registration Not Done";
		}
	}
	
	public Iterable<student> showAll()
	{
		return studentrepo.findAll();
	}
}
